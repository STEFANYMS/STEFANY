/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.compraventa.AppCompraVenta.repositorios;

import com.compraventa.AppCompraVenta.entidades.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author NATALIA MS
 */
@Repository
public interface UsuarioRepositorio extends JpaRepository<Usuario, Integer> {
    
    public boolean existsByCedula(int cedula);
}
