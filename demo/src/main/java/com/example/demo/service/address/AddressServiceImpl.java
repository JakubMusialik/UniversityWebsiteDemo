package com.example.demo.service.address;



import com.example.demo.model.Address;
import com.example.demo.repository.AddressRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AddressServiceImpl implements AddressService {

    private final AddressRepository addressRepository;

    @Override
    public Address addAddress(Address address) {
        return addressRepository.save(address);
    }

    @Override
    public void deleteAddress(long id) {
        addressRepository.deleteById(id);
    }

    @Override
    public List<Address> getAddresses() {
        return addressRepository.findAll();
    }

    @Override
    public void updateAddress(Address address) {
        addressRepository.save(address);
    }

    @Override
    public Optional<Address> getAddress(long id) {
        return addressRepository.findById(id);
    }
}
