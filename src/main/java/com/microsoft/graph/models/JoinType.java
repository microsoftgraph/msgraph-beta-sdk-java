package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Device enrollment join type. */
public enum JoinType implements ValuedEnum {
    /** Unknown enrollment join type. */
    Unknown("unknown"),
    /** The device is joined by Azure AD. */
    AzureADJoined("azureADJoined"),
    /** The device is registered by Azure AD. */
    AzureADRegistered("azureADRegistered"),
    /** The device is joined by hybrid Azure AD. */
    HybridAzureADJoined("hybridAzureADJoined");
    public final String value;
    JoinType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static JoinType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "azureADJoined": return AzureADJoined;
            case "azureADRegistered": return AzureADRegistered;
            case "hybridAzureADJoined": return HybridAzureADJoined;
            default: return null;
        }
    }
}
