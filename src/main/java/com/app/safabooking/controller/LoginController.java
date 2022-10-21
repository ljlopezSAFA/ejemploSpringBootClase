package com.app.safabooking.controller;

import com.app.safabooking.model.Usuario;
import com.app.safabooking.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;

@RestController
public class LoginController {

    @Autowired
    private UsuarioService usuarioService;


    @PostMapping("/login")
    private ModelAndView iniciarSesion(@RequestBody @ModelAttribute("usuario") Usuario usuario,
                                       RedirectAttributes redirectAttributes,
                                       HttpSession session){
        boolean valido = usuarioService.validar(usuario);
        if(valido){
            redirectAttributes.addAttribute("usuario", usuario);
            session.setAttribute("user", usuario);
            return new ModelAndView("redirect:/listBurguers");
        }else{
            redirectAttributes.addAttribute("error","No se ha encontrado ningún usuario con estos datos de acceso");
            return new ModelAndView("redirect:/login");
        }

    }

    @GetMapping("/login")
    private ModelAndView login(@RequestParam(name = "error", required = false) String error){
        ModelAndView modelAndView = new ModelAndView("login");
        modelAndView.addObject("error", error == null ? "" : error);
        return modelAndView;
    }

    private Usuario getUsuario(HttpSession session) {
       Usuario usuario = (Usuario) session.getAttribute("usuario");
        return usuario;
    }


}
