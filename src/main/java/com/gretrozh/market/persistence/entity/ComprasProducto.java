package com.gretrozh.market.persistence.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "compras_productos")
public class ComprasProducto {

    @EmbeddedId
    private  ComprasProductoPK id;

    private Integer cantidad;

    //private BigDecimal total;

    private Double total;

    private Boolean estado;

    @ManyToOne
    @JoinColumn(name = "id_compra",insertable = false,updatable = false)
    private Compra compra;

    @ManyToOne
    @JoinColumn(name = "id_prodcuto",insertable = false,updatable = false)
    private Producto producto;


}