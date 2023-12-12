package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * The enrollment token type for an enrollment profile.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AndroidDeviceOwnerEnrollmentTokenType implements ValuedEnum {
    /** Default token type. */
    Default("default"),
    /** Token type for Azure AD shared dedicated device enrollment. It applies to CorporateOwnedDedicatedDevice enrollment mode only. */
    CorporateOwnedDedicatedDeviceWithAzureADSharedMode("corporateOwnedDedicatedDeviceWithAzureADSharedMode"),
    /** Token type for Android Device Staging enrollment type. It applies to CorporateOwnedFullyManaged and CorporateOwnedWorkProfile only. */
    DeviceStaging("deviceStaging");
    public final String value;
    AndroidDeviceOwnerEnrollmentTokenType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AndroidDeviceOwnerEnrollmentTokenType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "default": return Default;
            case "corporateOwnedDedicatedDeviceWithAzureADSharedMode": return CorporateOwnedDedicatedDeviceWithAzureADSharedMode;
            case "deviceStaging": return DeviceStaging;
            default: return null;
        }
    }
}
