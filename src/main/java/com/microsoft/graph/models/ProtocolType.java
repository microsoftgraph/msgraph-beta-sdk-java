package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReviewDecision entities. */
public enum ProtocolType implements ValuedEnum {
    None("none"),
    OAuth2("oAuth2"),
    Ropc("ropc"),
    WsFederation("wsFederation"),
    Saml20("saml20"),
    DeviceCode("deviceCode"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ProtocolType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ProtocolType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "oAuth2": return OAuth2;
            case "ropc": return Ropc;
            case "wsFederation": return WsFederation;
            case "saml20": return Saml20;
            case "deviceCode": return DeviceCode;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
