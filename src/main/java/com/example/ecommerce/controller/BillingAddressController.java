package com.example.ecommerce.controller;


import com.example.ecommerce.model.BillingAddress;
import com.example.ecommerce.service.BillingAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/billing-addresses")
public class BillingAddressController {

    @Autowired
    private BillingAddressService billingAddressService;

    @GetMapping("/")
    public List<BillingAddress> getAllBillingAddresses() {
        return billingAddressService.getAllBillingAddresses();
    }

    @GetMapping("/{id}")
    public BillingAddress getBillingAddressById(@PathVariable Long id) {
        return billingAddressService.getBillingAddressById(id);
    }

    @PostMapping("/")
    public BillingAddress createBillingAddress(@RequestBody BillingAddress billingAddress) {
        return billingAddressService.saveBillingAddress(billingAddress);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteBillingAddress(@PathVariable Long id) {
        billingAddressService.deleteBillingAddress(id);
        return ResponseEntity.ok().build();
    }
}
