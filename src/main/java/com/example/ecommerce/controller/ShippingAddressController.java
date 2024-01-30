package com.example.ecommerce.controller;

import com.example.ecommerce.model.ShippingAddress;
import com.example.ecommerce.service.ShippingAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/shipping-addresses")
public class ShippingAddressController {

    @Autowired
    private ShippingAddressService shippingAddressService;

    @GetMapping("/")
    public List<ShippingAddress> getAllShippingAddresses() {
        return shippingAddressService.getAllShippingAddresses();
    }

    @GetMapping("/{id}")
    public ShippingAddress getShippingAddressById(@PathVariable Long id) {
        return shippingAddressService.getShippingAddressById(id);
    }

    @PostMapping("/")
    public ShippingAddress createShippingAddress(@RequestBody ShippingAddress shippingAddress) {
        return shippingAddressService.saveShippingAddress(shippingAddress);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteShippingAddress(@PathVariable Long id) {
        shippingAddressService.deleteShippingAddress(id);
        return ResponseEntity.ok().build();
    }
}
