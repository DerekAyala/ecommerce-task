package com.example.ecommerce.service;

import com.example.ecommerce.model.ShippingAddress;
import com.example.ecommerce.repository.ShippingAddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShippingAddressService {

    @Autowired
    private ShippingAddressRepository shippingAddressRepository;

    public List<ShippingAddress> getAllShippingAddresses() {
        return shippingAddressRepository.findAll();
    }

    public ShippingAddress getShippingAddressById(Long id) {
        return shippingAddressRepository.findById(id).orElse(null);
    }

    public ShippingAddress saveShippingAddress(ShippingAddress shippingAddress) {
        return shippingAddressRepository.save(shippingAddress);
    }

    public void deleteShippingAddress(Long id) {
        shippingAddressRepository.deleteById(id);
    }
}
