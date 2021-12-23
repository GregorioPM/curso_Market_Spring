package com.gretrozh.market.domain.service;

import com.gretrozh.market.domain.Purchase;
import com.gretrozh.market.domain.repository.PurchaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PurchaseService {

    @Autowired
    private PurchaseRepository purchaseRepository;

    public List<Purchase> getAll(){
        return  purchaseRepository.getAll();
    }

    public Optional<List<Purchase>> getByCliente(String clienteId){
        return purchaseRepository.getByClient(clienteId);
    }

    public Purchase save(Purchase purchase){
        return purchaseRepository.save(purchase);
    }


}
