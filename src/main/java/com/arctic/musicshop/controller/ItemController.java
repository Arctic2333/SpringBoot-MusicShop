package com.arctic.musicshop.controller;

import com.arctic.musicshop.pojo.CD;
import com.arctic.musicshop.service.CDService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ItemController {

    @Autowired
    private CDService cdService;

    @RequestMapping("/item/{album}")
    public String getItem(Model model,@PathVariable("album") String album){
        CD cd = cdService.getCDByAlbum(album);
        model.addAttribute("cd",cd);
        System.out.println(cd);
        return "item";
    }
}
