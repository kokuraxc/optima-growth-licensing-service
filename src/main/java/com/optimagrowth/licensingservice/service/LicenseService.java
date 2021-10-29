package com.optimagrowth.licensingservice.service;

import java.util.Random;

import com.optimagrowth.licensingservice.model.License;

public class LicenseService {
    public License getLicense(String licenseId, String organizationId) {
        License license = new License();
        license.setId(new Random().nextInt(1000));
    }
}
