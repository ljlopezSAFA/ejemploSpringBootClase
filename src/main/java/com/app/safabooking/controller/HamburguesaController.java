package com.app.safabooking.controller;

import com.app.safabooking.model.Hamburguesa;
import com.app.safabooking.service.HamburguesaService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
public class HamburguesaController {

    @Autowired
    private HamburguesaService burguerService;

    @RequestMapping("/burguers")
    public List<Hamburguesa> getHamburguesas(){
        return burguerService.getAll() ;
    }

    @RequestMapping("/listBurguers")
    public ModelAndView listHamburguesas(){
        List<Hamburguesa> listHamburguesa = burguerService.getAll();
        ModelAndView model = new ModelAndView("listHamburguesa");
        model.addObject("listHamburguesa", listHamburguesa);
        return model ;
    }


    @PostMapping("/burgues/save")
    public void guardarHamburguesa(@RequestBody Hamburguesa hamburguesa){
        Hamburguesa burguer = burguerService.getById(hamburguesa.getId());

    }
}
