package com.vendordetails.vendor.repository;

import com.vendordetails.vendor.model.CloudVendor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CloudVendorRepository extends JpaRepository<CloudVendor, Long> {
    List<CloudVendor> findByVendorId(Long vendorId);
}
