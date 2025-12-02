package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum SharePointIdentityMappingGroupType implements ValuedEnum {
    None("none"),
    RegularGroup("regularGroup"),
    M365Group("m365Group"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    SharePointIdentityMappingGroupType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static SharePointIdentityMappingGroupType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "regularGroup": return RegularGroup;
            case "m365Group": return M365Group;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
