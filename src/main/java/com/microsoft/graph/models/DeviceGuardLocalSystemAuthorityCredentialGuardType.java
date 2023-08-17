package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Possible values of Credential Guard settings.
 */
public enum DeviceGuardLocalSystemAuthorityCredentialGuardType implements ValuedEnum {
    /** Turns off Credential Guard remotely if configured previously without UEFI Lock. */
    NotConfigured("notConfigured"),
    /** Turns on Credential Guard with UEFI lock. */
    EnableWithUEFILock("enableWithUEFILock"),
    /** Turns on Credential Guard without UEFI lock. */
    EnableWithoutUEFILock("enableWithoutUEFILock"),
    /** Disables Credential Guard. This is the default OS value. */
    Disable("disable");
    public final String value;
    DeviceGuardLocalSystemAuthorityCredentialGuardType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static DeviceGuardLocalSystemAuthorityCredentialGuardType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notConfigured": return NotConfigured;
            case "enableWithUEFILock": return EnableWithUEFILock;
            case "enableWithoutUEFILock": return EnableWithoutUEFILock;
            case "disable": return Disable;
            default: return null;
        }
    }
}
