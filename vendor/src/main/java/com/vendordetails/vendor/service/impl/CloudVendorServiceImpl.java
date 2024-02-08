package com.vendordetails.vendor.service.impl;

import com.vendordetails.vendor.Exception.CloudVendorNotFoundException;
import com.vendordetails.vendor.model.CloudVendor;
import com.vendordetails.vendor.repository.CloudVendorRepository;
import com.vendordetails.vendor.service.CloudVendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CloudVendorServiceImpl implements CloudVendorService {
    @Autowired
    CloudVendorRepository cloudVendorRepository;
    public CloudVendorServiceImpl(CloudVendorRepository cloudVendorRepository) {
        this.cloudVendorRepository = cloudVendorRepository;
    }

    @Override
    public String createCloudVendor(CloudVendor cloudVendor) {
        // More Business Logic
        cloudVendorRepository.save(cloudVendor);
        return "Success";
    }

    @Override
    public String updateCloudVendor(CloudVendor cloudVendor) {
        cloudVendorRepository.save(cloudVendor);
        return "Success";
    }

    @Override
    public String deleteCloudVendor(Long cloudVendorId) {
        // More Business Logic
        cloudVendorRepository.deleteById(cloudVendorId);
        return "Success";
    }

@Override
    public CloudVendor getCloudVendor(Long cloudVendorId) {
        // More Business Logic
        if (cloudVendorRepository.findById(cloudVendorId).isEmpty())
            throw new CloudVendorNotFoundException("Requested vendor is not Exist");
        return cloudVendorRepository.findById(cloudVendorId).get();
    }

    @Override
    public List<CloudVendor> getAllCloudVendors() {
        // More Business Logic
        return cloudVendorRepository.findAll();
    }

    @Override
    public List<CloudVendor> getByVendorById(Long vendorId)
    {
        return cloudVendorRepository.findByVendorId(vendorId);
    }

}
