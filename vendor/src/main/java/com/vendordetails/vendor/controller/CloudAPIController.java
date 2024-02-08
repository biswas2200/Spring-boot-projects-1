package com.vendordetails.vendor.controller;

import com.vendordetails.vendor.model.CloudVendor;
import com.vendordetails.vendor.response.ResponseHandler;
import com.vendordetails.vendor.service.CloudVendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cloudvendor")
public class CloudAPIController {

    @Autowired
    CloudVendorService cloudVendorService;
    @GetMapping("{vendorId}")
    public ResponseEntity<Object> getCloudVendorDetails(@PathVariable("vendorId") Long vendorId)
    {
        return ResponseHandler.responseBuilder("Requested Vendor Details are given here",
                HttpStatus.OK, cloudVendorService.getCloudVendor(vendorId));
    }
    @GetMapping("/")
    public List<CloudVendor> getAllCloudVendorDetails()
    {
        return cloudVendorService.getAllCloudVendors();
    }
    @PostMapping("/")
    public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor)
    {
        cloudVendorService.createCloudVendor(cloudVendor);
        return "Cloud Vendor Created Successfully";
    }

    @PutMapping("/")
    public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor)
    {
        cloudVendorService.updateCloudVendor(cloudVendor);
        return "Cloud Vendor Updated Successfully";
    }

    @DeleteMapping("/{vendorId}")
    public String deleteCloudVendorDetails(@PathVariable("vendorId") Long vendorId)
    {
        cloudVendorService.deleteCloudVendor(vendorId);
        return "Cloud Vendor Deleted Successfully";
    }
    }
