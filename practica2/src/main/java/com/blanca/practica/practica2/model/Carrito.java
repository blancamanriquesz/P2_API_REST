package com.blanca.practica.practica2.model;


public class Carrito {
    private Long idCarrito;
    private Long idArticulo;
    private String descripcion;
    private Integer unidades;
    private Double precioFinal;

    public Carrito() {}

    public Carrito(Long idCarrito, Long idArticulo, String descripcion, Integer unidades, Double precioFinal) {
        this.idCarrito = idCarrito;
        this.idArticulo = idArticulo;
        this.descripcion = descripcion;
        this.unidades = unidades;
        this.precioFinal = precioFinal;
    }

    public Long getIdCarrito() { return idCarrito; }
    public void setIdCarrito(Long idCarrito) { this.idCarrito = idCarrito; }

    public Long getIdArticulo() { return idArticulo; }
    public void setIdArticulo(Long idArticulo) { this.idArticulo = idArticulo; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    public Integer getUnidades() { return unidades; }
    public void setUnidades(Integer unidades) { this.unidades = unidades; }

    public Double getPrecioFinal() { return precioFinal; }
    public void setPrecioFinal(Double precioFinal) { this.precioFinal = precioFinal; }
}
