package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Management levels for apps
 */
public enum AppManagementLevel implements ValuedEnum {
    /** Unspecified */
    Unspecified("unspecified"),
    /** Unmanaged */
    Unmanaged("unmanaged"),
    /** MDM */
    Mdm("mdm"),
    /** Android Enterprise */
    AndroidEnterprise("androidEnterprise"),
    /** Android Enterprise dedicated devices with Azure AD Shared mode */
    AndroidEnterpriseDedicatedDevicesWithAzureAdSharedMode("androidEnterpriseDedicatedDevicesWithAzureAdSharedMode"),
    /** Android Open Source Project (AOSP) devices */
    AndroidOpenSourceProjectUserAssociated("androidOpenSourceProjectUserAssociated"),
    /** Android Open Source Project (AOSP) userless devices */
    AndroidOpenSourceProjectUserless("androidOpenSourceProjectUserless"),
    /** Place holder for evolvable enum */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    AppManagementLevel(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AppManagementLevel forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unspecified": return Unspecified;
            case "unmanaged": return Unmanaged;
            case "mdm": return Mdm;
            case "androidEnterprise": return AndroidEnterprise;
            case "androidEnterpriseDedicatedDevicesWithAzureAdSharedMode": return AndroidEnterpriseDedicatedDevicesWithAzureAdSharedMode;
            case "androidOpenSourceProjectUserAssociated": return AndroidOpenSourceProjectUserAssociated;
            case "androidOpenSourceProjectUserless": return AndroidOpenSourceProjectUserless;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
