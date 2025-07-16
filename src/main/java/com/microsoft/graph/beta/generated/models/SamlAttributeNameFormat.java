package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum SamlAttributeNameFormat implements ValuedEnum {
    Unspecified("unspecified"),
    Uri("uri"),
    Basic("basic"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    SamlAttributeNameFormat(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static SamlAttributeNameFormat forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unspecified": return Unspecified;
            case "uri": return Uri;
            case "basic": return Basic;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
