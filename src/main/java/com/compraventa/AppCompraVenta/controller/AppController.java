/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.compraventa.AppCompraVenta.controller;

import com.compraventa.AppCompraVenta.entidades.Articulo;
import com.compraventa.AppCompraVenta.entidades.Recibo;
import com.compraventa.AppCompraVenta.entidades.Usuario;
import com.compraventa.AppCompraVenta.services.UsuarioServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AppController {
    
    @Autowired
    UsuarioServices usuarioService;

    @GetMapping
    public String iniciar() {
        return "index";
    }

    @GetMapping("/")
    public String iniciarIndex() {
        return "index";
    }

    
    @PostMapping
    public String verificarUsuario(@ModelAttribute("usuario") Usuario usuarioDTO){
        if(usuarioDTO == null){
            return"redirect:/index";
        }
        if(usuarioDTO.getCedula() == 0 || usuarioDTO.getClave() == null){
            return"redirect:/index ";
        }
        if(!usuarioService.verificar(usuarioDTO.getCedula())){
            return"redirect:/index ";
        }
        return"redirect:/index";
    }
 


  //  @GetMapping("/Articulo")
  //  public String articulo (Model modelo){
  //      modelo.addAttribute("articulo", articulo.Articulo());
  //      return "listaClientes";
  //  }

    //@GetMapping("/usuarios")
  //  public String usuario(Model modelo){
  //      modelo.addAttribute("productosEmpeno", usuario.Usuario());
  //      return "listaProductosEmpeno";
  //  }

    //@GetMapping("/Recibo")
  //  public String Recibo (Model modelo){
  //      modelo.addAttribute("productosVenta", recibo.Recibo());
  //      return "listaProductosVenta";
  //    }
    
}


