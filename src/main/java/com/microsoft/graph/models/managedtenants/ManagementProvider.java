package com.microsoft.graph.models.managedtenants;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ManagementProvider implements ValuedEnum {
    Microsoft("microsoft"),
    Community("community"),
    IndirectProvider("indirectProvider"),
    Self("self"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ManagementProvider(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ManagementProvider forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "microsoft": return Microsoft;
            case "community": return Community;
            case "indirectProvider": return IndirectProvider;
            case "self": return Self;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
