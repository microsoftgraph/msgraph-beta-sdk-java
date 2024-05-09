package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum SamlNameIDFormat implements ValuedEnum {
    Default("default"),
    Unspecified("unspecified"),
    EmailAddress("emailAddress"),
    WindowsDomainQualifiedName("windowsDomainQualifiedName"),
    Persistent("persistent"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    SamlNameIDFormat(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static SamlNameIDFormat forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "default": return Default;
            case "unspecified": return Unspecified;
            case "emailAddress": return EmailAddress;
            case "windowsDomainQualifiedName": return WindowsDomainQualifiedName;
            case "persistent": return Persistent;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
