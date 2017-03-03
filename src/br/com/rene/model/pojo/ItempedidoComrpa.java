package br.com.rene.model.pojo;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author Rene
 */

@Entity
@Table(name = "item_ped_comrpa")
public class ItempedidoComrpa implements Serializable {
  
    @EmbeddedId
    private ItemPedidoCompraPK itemPedidoComrpaPK;
    
}
