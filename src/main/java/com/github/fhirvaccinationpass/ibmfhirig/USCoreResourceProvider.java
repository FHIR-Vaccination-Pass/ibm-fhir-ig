package com.github.fhirvaccinationpass.ibmfhirig;

import com.ibm.fhir.registry.util.PackageRegistryResourceProvider;

public class USCoreResourceProvider extends PackageRegistryResourceProvider {
    @Override
    public String getPackageId() {
        return "hl7.fhir.us.core";
    }
}
