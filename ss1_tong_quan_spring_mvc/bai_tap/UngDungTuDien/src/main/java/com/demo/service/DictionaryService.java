package com.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
@Service
public class DictionaryService implements IDictionaryService {
    static Map<String, String> dictionary = new HashMap<>();

    static {
        dictionary.put("Hot", "Nong");
        dictionary.put("Cold", "Lanh");
        dictionary.put("Run", "Chay");
    }

    @Override
    public String translate(String word) {
        String result = dictionary.get(word);
        if (result == null) {
            return "khong tim thay";
        }
        return result;
    }
}
