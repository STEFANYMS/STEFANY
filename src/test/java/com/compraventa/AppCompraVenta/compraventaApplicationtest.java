/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.compraventa.AppCompraVenta;

import com.compraventa.AppCompraVenta.entidades.Usuario;
import com.compraventa.AppCompraVenta.services.UsuarioServices;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("test")
public class compraventaApplicationtest {

    @Autowired
    UsuarioServices usuarioService;
    
   @Test
   public void testearVerificarUsuario(){
       Usuario usuario = new Usuario();
       usuario.setCedula(10);
       usuario.setClave("1234");
       
       Boolean check = usuarioService.verificar(usuario.getCedula());
       assertTrue(check);
   }
    
    
}
