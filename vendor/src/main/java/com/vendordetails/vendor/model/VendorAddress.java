package com.vendordetails.vendor.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "vendorAddress")
public class VendorAddress {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long vendorAddressId;
    private String city;
    private String State;
    private String description;
    private String vendor_longitude_and_latitude;

    @ManyToOne
    @JoinColumn(name="vendorId")
    private CloudVendor cloudVendor;
}
