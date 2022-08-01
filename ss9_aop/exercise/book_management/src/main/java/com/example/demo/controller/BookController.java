package com.example.demo.controller;

import com.example.demo.model.Book;
import com.example.demo.model.OrderBook;
import com.example.demo.service.IBookService;
import com.example.demo.service.IOrderBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
@RequestMapping("/books")
public class BookController {

    @Autowired
    private IBookService iBookService;

    @Autowired
    private IOrderBookService iOrderBookService;

    @GetMapping("")
    public String showListBook(Model model) {
        model.addAttribute("bookList", iBookService.findAll());
        model.addAttribute("order", new OrderBook());
        return "/list";
    }

    @GetMapping("/hire/{id}")
    public String edit(@PathVariable Integer id, Model model) {
        model.addAttribute("book", iBookService.findById(id));
        return "/detail";
    }

    @PostMapping("/confirm")
    public String update(@Valid @ModelAttribute Book book, RedirectAttributes redirectAttributes, Model model) {
        if (book.getQuantity() == 0) {
            redirectAttributes.addFlashAttribute("message", "Không còn sách để thuê");
            return "redirect:/books";
        } else {
            Integer code = (int) Math.floor((Math.random() * 89999) + 10000);
            OrderBook orderBook = new OrderBook(code, book);
            iBookService.update(book);
            iOrderBookService.save(orderBook);
            redirectAttributes.addFlashAttribute("message", "Mã thuê sách của bạn là: " + code);
            return "redirect:/books";
        }
    }

    @GetMapping("/give")
    public String returnBook(OrderBook order, RedirectAttributes redirectAttributes) {
        OrderBook orderBook = iOrderBookService.findByOrderBookCode(order.getOrderBookCode());
        if (orderBook != null) {
            Book book = orderBook.getBook();
            book.setQuantity(book.getQuantity() + 1);
            iBookService.giveBack(book);
            iOrderBookService.delete(orderBook);
            redirectAttributes.addFlashAttribute("message", "Trả sách thành công");
            return "redirect:/books";
        } else {
            redirectAttributes.addFlashAttribute("message", "Mã trả sách sai");
            return "redirect:/books";
        }
    }
    @GetMapping("/create")
    public String createForm(Model model) {
        model.addAttribute("book", new Book());
        System.out.println("here");
        return "/create";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute("book") Book book) {
        iBookService.save(book);
        return "redirect:/books";
    }


    @ExceptionHandler(Exception.class)
    public String handleException() {
        return "error";
    }
}
