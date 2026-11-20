package com.microsoft.graph.beta.models.security.contentmanagement;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Azure scope kind for deployment stack provisioning.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum DeploymentScopeType implements ValuedEnum {
    /** Azure resource group. */
    ResourceGroup("resourceGroup"),
    /** Azure management group. */
    ManagementGroup("managementGroup"),
    /** A marker value for members added after the release of this API. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    DeploymentScopeType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static DeploymentScopeType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "resourceGroup": return ResourceGroup;
            case "managementGroup": return ManagementGroup;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
