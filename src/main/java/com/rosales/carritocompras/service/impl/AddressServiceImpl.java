package com.rosales.carritocompras.service.impl;

import com.rosales.carritocompras.entity.Address;
import com.rosales.carritocompras.repository.AddressRepository;
import com.rosales.carritocompras.service.AddressService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class AddressServiceImpl implements AddressService {

    private final AddressRepository addressRepository;

    @Override
    public List<Address> listAllAddress() {
        return addressRepository.findAll();
    }

    @Override
    public Address findAddress(Long id) {
        return addressRepository.findById(id).orElseThrow(() -> new RuntimeException("Address Not Found"));
    }

    @Override
    public Address createAddress(Address address) {
        return addressRepository.save(address);
    }

    @Override
    public Address updateAddress(Address address) {
        return addressRepository.save(address);
    }

    @Override
    public void deleteAddress(Long id) {
        addressRepository.deleteById(id);
    }

}
