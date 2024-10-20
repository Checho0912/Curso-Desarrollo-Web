package com.tienda.service;

import com.tienda.domain.Categoria;
import java.util.List;
import org.springframework.stereotype.Service;

public interface CategoriaService {
    public List<Categoria> getCategorias(boolean activos);
}
