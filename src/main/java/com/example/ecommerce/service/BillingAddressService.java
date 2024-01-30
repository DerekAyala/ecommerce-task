package com.example.ecommerce.service;

import com.example.ecommerce.model.BillingAddress;
import com.example.ecommerce.repository.BillingAddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BillingAddressService {

    @Autowired
    private BillingAddressRepository billingAddressRepository;

    public List<BillingAddress> getAllBillingAddresses() {
        return billingAddressRepository.findAll();
    }

    public BillingAddress getBillingAddressById(Long id) {
        return billingAddressRepository.findById(id).orElse(null);
    }

    public BillingAddress saveBillingAddress(BillingAddress billingAddress) {
        return billingAddressRepository.save(billingAddress);
    }

    public void deleteBillingAddress(Long id) {
        billingAddressRepository.deleteById(id);
    }
}
