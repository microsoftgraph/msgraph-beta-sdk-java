package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum GroupTypeEnum implements ValuedEnum {
    IsCloudGroup("isCloudGroup"),
    IsOnPremiseGroup("isOnPremiseGroup"),
    IsSoftDeletedGroup("isSoftDeletedGroup");
    public final String value;
    GroupTypeEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static GroupTypeEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "isCloudGroup": return IsCloudGroup;
            case "isOnPremiseGroup": return IsOnPremiseGroup;
            case "isSoftDeletedGroup": return IsSoftDeletedGroup;
            default: return null;
        }
    }
}
