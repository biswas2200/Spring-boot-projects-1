package com.vendordetails.vendor.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "cloud_vendor_info")
public class CloudVendor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long vendorId;
    private String vendorFirstName;
    private String vendorLastName;
    private String vendorEmail;
    private String vendorPassword;
    @OneToMany(targetEntity = VendorAddress.class , mappedBy = "cloudVendor",fetch = FetchType.EAGER)
    private List<VendorAddress> vendorAddress;
    private String VendorPhoneNumber;
}
