package com.microsoft.graph.beta.models.industrydata;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum FilterOptions implements ValuedEnum {
    OrgExternalId("orgExternalId"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    FilterOptions(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static FilterOptions forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "orgExternalId": return OrgExternalId;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
