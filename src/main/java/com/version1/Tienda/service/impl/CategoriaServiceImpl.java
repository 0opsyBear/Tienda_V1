
package com.version1.Tienda.service.impl;

import com.version1.Tienda.dao.CategoriaDao;
import com.version1.Tienda.domain.Categoria;
import com.version1.Tienda.service.CategoriaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


//Esta clase se trae la informacion de CategoriaService (TablaService) para hacer modificaciones de la capa de datos
//La progra con la info fuera del CRUD
@Service
public class CategoriaServiceImpl implements CategoriaService{
    
    @Autowired //Crea un unico objeto mientras se ejecuta la aplicacion 
    private CategoriaDao categoriaDao;
    public List<Categoria> getCategorias(boolean activos){
        var lista=categoriaDao.findAll(); //encontrar todos los datos que tenga la lista
        
        if(activos){
            lista.removeIf(e->!e.isActivo()); //permite sabe si el objeto esta activo 
        }
        return lista;
    }
}
