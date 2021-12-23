package com.gretrozh.market.persistence.mapper;

import com.gretrozh.market.domain.PurchaseItem;
import com.gretrozh.market.persistence.entity.ComprasProducto;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

//toca colocar ProductMapper asi lo estemos ignorando
@Mapper(componentModel = "spring" , uses = {ProductMapper.class})
public interface PurchaseItemMapper {

    //total se llama igual en target y el source no hay necesidad de mapearlo
    @Mappings({
            @Mapping(source = "id.idProducto",target = "productId"),
            @Mapping(source = "cantidad",target = "quantity"),
            @Mapping(source = "estado",target = "active")
    })
    PurchaseItem toPurchaseItem(ComprasProducto producto);

    //Ignorar los atributos que no mapiamos en toPurchaseItem
    @InheritInverseConfiguration
    @Mappings({
            @Mapping(target = "compra",ignore = true),
            @Mapping(target = "producto",ignore = true),
            @Mapping(target = "id.idCompra",ignore = true),

    })
    ComprasProducto toComprasProducto(PurchaseItem item);
}
