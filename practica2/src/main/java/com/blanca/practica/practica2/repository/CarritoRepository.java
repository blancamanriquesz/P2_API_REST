package com.blanca.practica.practica2.repository;



import com.blanca.practica.practica2.model.Carrito;
import org.springframework.stereotype.Repository;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

@Repository
public class CarritoRepository {

    private final Map<Long, Carrito> data = new ConcurrentHashMap<>();

    public List<Carrito> findAll() {
        return new ArrayList<>(data.values());
    }

    public Optional<Carrito> findById(Long idCarrito) {
        return Optional.ofNullable(data.get(idCarrito));
    }

    public Carrito save(Carrito carrito) {
        data.put(carrito.getIdCarrito(), carrito);
        return carrito;
    }

    public boolean existsById(Long idCarrito) {
        return data.containsKey(idCarrito);
    }

    public void deleteById(Long idCarrito) {
        data.remove(idCarrito);
    }
}
