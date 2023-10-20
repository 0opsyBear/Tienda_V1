package com.version1.Tienda.dao;

import com.version1.Tienda.domain.Producto;
import org.springframework.data.jpa.repository.JpaRepository;


//Se envia toda la informacion de Producto (o la tabla que se use) a la interfaz ProductoDao
public interface ProductoDao extends JpaRepository <Producto, Long> {
    
}
