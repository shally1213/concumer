package com.zb.concumer.controller.service;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class FeignHysticService implements  FeignService {
    @Override
    public String shopping() {
        return "sorry";
    }

    @Override
    public List<Map> search() {
        return null;
    }

    @Override
    public int del(int id) {
        return 0;
    }


}
