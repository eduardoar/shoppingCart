package com.rosales.carritocompras.controller;

import com.rosales.carritocompras.entity.Address;
import com.rosales.carritocompras.service.AddressService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/addresses")
@Tag(name = "Address")
public class AddressController {

    private final AddressService addressService;

    @Operation(summary = "Return List of all Addresses")
    @GetMapping
    public ResponseEntity<List<Address>> listAllAddress() {
        return new ResponseEntity<>(addressService.listAllAddress(), HttpStatus.OK);
    }

    @Operation(summary = "Return Address by Id")
    @GetMapping("/{id}")
    public ResponseEntity<Address> findAddress(@PathVariable Long id) {
        return new ResponseEntity<>(addressService.findAddress(id), HttpStatus.OK);
    }

    @Operation(summary = "Create new Address")
    @PostMapping
    public ResponseEntity<Address> createAddress(@RequestBody Address address) {
        return new ResponseEntity<>(addressService.createAddress(address), HttpStatus.CREATED);
    }

    @Operation(summary = "Update Address")
    @PutMapping
    public ResponseEntity<Address> updateAddress(@RequestBody Address address) {
        return new ResponseEntity<>(addressService.updateAddress(address), HttpStatus.OK);
    }

    @Operation(summary = "Delete Address")
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAddress(@PathVariable Long id) {
        addressService.deleteAddress(id);
        return ResponseEntity.ok().build();
    }

}
