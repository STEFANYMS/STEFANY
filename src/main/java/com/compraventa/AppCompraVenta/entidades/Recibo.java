/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.compraventa.AppCompraVenta.entidades;

import java.io.Serializable;
import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Recibo implements Serializable {

    //Atributos
    @Id
    private String recibofinal;
    
    private int usuario;
    private int articulo;
    private Date fechaingreso;
    private Date fechadesalida;
    private int precio;

}
