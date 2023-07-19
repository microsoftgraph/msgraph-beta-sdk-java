package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Supported values for the derived credential issuer.
 */
public enum DeviceManagementDerivedCredentialIssuer implements ValuedEnum {
    /** Intercede */
    Intercede("intercede"),
    /** Entrust */
    EntrustDatacard("entrustDatacard"),
    /** Purebred */
    Purebred("purebred"),
    /** XTec */
    XTec("xTec");
    public final String value;
    DeviceManagementDerivedCredentialIssuer(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static DeviceManagementDerivedCredentialIssuer forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "intercede": return Intercede;
            case "entrustDatacard": return EntrustDatacard;
            case "purebred": return Purebred;
            case "xTec": return XTec;
            default: return null;
        }
    }
}
