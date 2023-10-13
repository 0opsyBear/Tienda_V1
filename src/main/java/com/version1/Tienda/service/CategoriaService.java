
package com.version1.Tienda.service;

import com.version1.Tienda.domain.Categoria;
import java.util.List;


public interface CategoriaService {
    //Se crea los objetos de Categoria (tabla) 
    //Se declara un metodo para obtener un arraylist de objetos categoria 
    //Objetos vienen de la DB. Se van a traer todos los registros 
    
    public List<Categoria> getCategorias(boolean activos);
    
    //Metodos para hacer el CRUD de categorias
}
