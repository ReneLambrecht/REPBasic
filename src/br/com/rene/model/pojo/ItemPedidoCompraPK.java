package br.com.rene.model.pojo;

import java.io.Serializable;
import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

/**
 *
 * @author Rene
 */

@Embeddable
public class ItemPedidoCompraPK implements Serializable {

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "cod_item")
    @Cascade(CascadeType.ALL)
    private Item item;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "cod_ped_comrpa")
    @Cascade(CascadeType.ALL)
    private PedidoCompra pedidoComrpa;

}