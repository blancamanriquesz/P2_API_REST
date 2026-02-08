package com.blanca.practica.practica2.dto;

public class CarritoRequest {
    private Long idArticulo;
    private String descripcion;
    private Integer unidades;

    public CarritoRequest() {}

    public Long getIdArticulo() { return idArticulo; }
    public void setIdArticulo(Long idArticulo) { this.idArticulo = idArticulo; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    public Integer getUnidades() { return unidades; }
    public void setUnidades(Integer unidades) { this.unidades = unidades; }
}
