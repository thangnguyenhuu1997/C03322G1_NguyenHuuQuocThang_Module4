package com.demo.service.impl;

import org.springframework.stereotype.Service;
import com.demo.service.IMoneyService;

@Service
public class MoneyService implements IMoneyService {
    @Override
    public double resultExchange(double usd) {
        return usd *2300;
    }
}
