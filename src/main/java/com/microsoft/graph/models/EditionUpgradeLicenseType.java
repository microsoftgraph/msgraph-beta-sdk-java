package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Edition Upgrade License type
 */
public enum EditionUpgradeLicenseType implements ValuedEnum {
    /** Product Key Type */
    ProductKey("productKey"),
    /** License File Type */
    LicenseFile("licenseFile"),
    /** NotConfigured */
    NotConfigured("notConfigured");
    public final String value;
    EditionUpgradeLicenseType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static EditionUpgradeLicenseType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "productKey": return ProductKey;
            case "licenseFile": return LicenseFile;
            case "notConfigured": return NotConfigured;
            default: return null;
        }
    }
}
