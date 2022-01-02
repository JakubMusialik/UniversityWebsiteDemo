package com.example.demo.service.address;

import com.example.demo.model.Address;


import java.util.List;
import java.util.Optional;

public interface AddressService {

    Address addAddress(Address address);

    void deleteAddress(long id);

    List<Address> getAddresses();

    void updateAddress(Address address);

    Optional<Address> getAddress(long id);
}
