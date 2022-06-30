package com.rosales.carritocompras.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.List;

@NoArgsConstructor
@Data
@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idOrder;

    @ManyToOne
    @JoinColumn(name = "id_user", nullable = false, foreignKey = @ForeignKey(name = "FK_order_user"))
    private User user;

    @ManyToOne
    @JoinColumn(name = "id_payment_method", nullable = false, foreignKey = @ForeignKey(name = "FK_order_payment_method"))
    private PaymentMethod paymentMethod;

    private BigDecimal total;

    @ManyToOne
    @JoinColumn(name = "id_address", nullable = false, foreignKey = @ForeignKey(name = "FK_order_address"))
    private Address address;

    @OneToMany(mappedBy = "order", cascade = {CascadeType.ALL}, orphanRemoval = true)
    private List<OrderDetail> orderDetail;
}
