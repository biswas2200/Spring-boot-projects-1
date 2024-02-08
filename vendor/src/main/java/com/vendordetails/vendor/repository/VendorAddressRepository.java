package com.vendordetails.vendor.repository;

import com.vendordetails.vendor.model.VendorAddress;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VendorAddressRepository extends JpaRepository<VendorAddress, Long> {
}
