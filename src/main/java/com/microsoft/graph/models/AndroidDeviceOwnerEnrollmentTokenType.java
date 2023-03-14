package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** The enrollment token type for an enrollment profile. */
public enum AndroidDeviceOwnerEnrollmentTokenType implements ValuedEnum {
    /** Default token type. */
    DefaultEscaped("defaultEscaped"),
    /** Token type for Azure AD shared dedicated device enrollment. It applies to CorporateOwnedDedicatedDevice enrollment mode only. */
    CorporateOwnedDedicatedDeviceWithAzureADSharedMode("corporateOwnedDedicatedDeviceWithAzureADSharedMode");
    public final String value;
    AndroidDeviceOwnerEnrollmentTokenType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static AndroidDeviceOwnerEnrollmentTokenType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "default": return DefaultEscaped;
            case "corporateOwnedDedicatedDeviceWithAzureADSharedMode": return CorporateOwnedDedicatedDeviceWithAzureADSharedMode;
            default: return null;
        }
    }
}
