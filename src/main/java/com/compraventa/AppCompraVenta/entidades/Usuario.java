/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.compraventa.AppCompraVenta.entidades;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public  class Usuario implements Serializable{
 
	
        @Id
        private int cedula;
        
	private String nombre;
	private String articulo;
        private String formapago;
        private String clave;
        private int celular;
        private String recibo;
	
        


}