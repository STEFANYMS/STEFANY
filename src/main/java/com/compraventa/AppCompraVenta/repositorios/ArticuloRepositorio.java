/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.compraventa.AppCompraVenta.repositorios;

import com.compraventa.AppCompraVenta.entidades.Articulo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface ArticuloRepositorio extends JpaRepository<Articulo , String> {

     public boolean existsByIdArticulo(Long articulo);
     
   
}