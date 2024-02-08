package com.vendordetails.vendor.service;

import com.vendordetails.vendor.model.CloudVendor;

import java.util.List;

public interface CloudVendorService {
    public String createCloudVendor(CloudVendor cloudVendor);
    public String updateCloudVendor(CloudVendor cloudVendor);
    public String deleteCloudVendor(Long cloudVendorId);
    public CloudVendor getCloudVendor(Long cloudVendorId);
    public List<CloudVendor> getAllCloudVendors();
    public List<CloudVendor> getByVendorById(Long vendorId);
}
