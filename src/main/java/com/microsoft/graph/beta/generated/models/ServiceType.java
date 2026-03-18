package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ServiceType implements ValuedEnum {
    Unknown("unknown"),
    Sharepoint("sharepoint"),
    Exchange("exchange"),
    OneDriveForBusiness("oneDriveForBusiness"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ServiceType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ServiceType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "sharepoint": return Sharepoint;
            case "exchange": return Exchange;
            case "oneDriveForBusiness": return OneDriveForBusiness;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
