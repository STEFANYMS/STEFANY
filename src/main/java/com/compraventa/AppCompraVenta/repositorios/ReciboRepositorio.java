/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.compraventa.AppCompraVenta.repositorios;

import com.compraventa.AppCompraVenta.entidades.Recibo;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ReciboRepositorio extends JpaRepository<Recibo, String> {
   
    public boolean existsById(String recibo);
}

