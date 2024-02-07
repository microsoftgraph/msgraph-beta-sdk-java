package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Possible values of the DmaGuardDeviceEnumerationPolicy.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum DmaGuardDeviceEnumerationPolicyType implements ValuedEnum {
    /** Default value. Devices with DMA remapping incompatible drivers will only be enumerated after the user unlocks the screen. */
    DeviceDefault("deviceDefault"),
    /** Devices with DMA remapping incompatible drivers will never be allowed to start and perform DMA at any time. */
    BlockAll("blockAll"),
    /** All external DMA capable PCIe devices will be enumerated at any time. */
    AllowAll("allowAll");
    public final String value;
    DmaGuardDeviceEnumerationPolicyType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static DmaGuardDeviceEnumerationPolicyType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "deviceDefault": return DeviceDefault;
            case "blockAll": return BlockAll;
            case "allowAll": return AllowAll;
            default: return null;
        }
    }
}
