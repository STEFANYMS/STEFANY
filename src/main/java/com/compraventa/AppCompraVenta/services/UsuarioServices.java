/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.compraventa.AppCompraVenta.services;

import com.compraventa.AppCompraVenta.repositorios.UsuarioRepositorio;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author NATALIA MS
 */
@Service
@Log4j2
public class UsuarioServices {
    
    @PersistenceContext
    private EntityManager entityManager;
    
    @Autowired
    UsuarioRepositorio usuarioRepositorio;

    public boolean verificar(int cedula) {
       usuarioRepositorio.existsByCedula(cedula);
       return true;
    }
    
}
