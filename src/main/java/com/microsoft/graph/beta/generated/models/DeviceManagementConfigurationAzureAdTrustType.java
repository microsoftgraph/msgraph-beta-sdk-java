package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Required AAD Trust Type
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum DeviceManagementConfigurationAzureAdTrustType implements ValuedEnum {
    /** No AAD Trust Type specified */
    None("none"),
    /** AAD Joined Trust Type */
    AzureAdJoined("azureAdJoined"),
    /** AddWorkAccount */
    AddWorkAccount("addWorkAccount"),
    /** MDM only */
    MdmOnly("mdmOnly");
    public final String value;
    DeviceManagementConfigurationAzureAdTrustType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static DeviceManagementConfigurationAzureAdTrustType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "azureAdJoined": return AzureAdJoined;
            case "addWorkAccount": return AddWorkAccount;
            case "mdmOnly": return MdmOnly;
            default: return null;
        }
    }
}
