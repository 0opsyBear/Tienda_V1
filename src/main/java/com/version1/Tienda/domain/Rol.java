
package com.version1.Tienda.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.Data;

@Data //indica que va ser una clase de datos
@Entity //va tener una entidad en la base de datos que se va relacionar con la clase
@Table(name="rol") //se le indica el nombre de la tabla que se quiere obtener informacion 

public class Rol implements Serializable{
    //Serializable --> indica que la clase va guardar datos 
    
    //Se hace uso del serialVersionUID para autoincremento de la db
    private static final long serialVersionUID = 1L;
    
    @Id //se le indica que la tabla tiene un identificador que es ID
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Los valores generados que tipo de estrategia usan identico = sea igual en la DB y en la clase 
    @Column(name="id_rol") //Se le indica el nombre de la columna autoincremental 
    private long idRol;
    private String nombre;
    
    @Column(name="id_usuario") //Se le indica el nombre de la columna autoincremental 
    private long idUsuario;

         
}
