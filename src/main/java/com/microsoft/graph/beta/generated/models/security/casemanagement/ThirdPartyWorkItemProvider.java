package com.microsoft.graph.beta.models.security.casemanagement;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ThirdPartyWorkItemProvider implements ValuedEnum {
    ServiceNow("serviceNow"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ThirdPartyWorkItemProvider(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ThirdPartyWorkItemProvider forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "serviceNow": return ServiceNow;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
