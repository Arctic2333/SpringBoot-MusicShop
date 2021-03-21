package com.arctic.musicshop.controller;

import com.arctic.musicshop.pojo.CD;
import com.arctic.musicshop.service.CDService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ShopControl {

    @Autowired
    private CDService cdService;

    @RequestMapping("/shop.html")
    public String showCD(Model model) {
        List<CD> cds = cdService.getCD();
        model.addAttribute("cds", cds);
        return "shop";
    }
}
