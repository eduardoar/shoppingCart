package com.rosales.carritocompras.service;

import com.rosales.carritocompras.entity.Address;

import java.util.List;

public interface AddressService {

    List<Address> listAllAddress();

    Address findAddress(Long id);

    Address createAddress(Address address);

    Address updateAddress(Address address);

    void deleteAddress(Long id);

}
