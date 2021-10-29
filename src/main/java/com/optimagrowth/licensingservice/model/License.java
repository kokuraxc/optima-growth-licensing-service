package com.optimagrowth.licensingservice.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class License {
    private int id;
    private String licenseId;
    private String description;
    private String organizationId;
    private String productName;
    private String licenseType;

    public License(int id, String licenseId, String description, String organizationId, String productName,
            String licenseType) {
        this.id = id;
        this.licenseId = licenseId;
        this.description = description;
        this.organizationId = organizationId;
        this.productName = productName;
        this.licenseType = licenseType;
    }
}
