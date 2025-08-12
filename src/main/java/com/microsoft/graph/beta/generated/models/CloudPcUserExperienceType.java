package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum CloudPcUserExperienceType implements ValuedEnum {
    CloudPc("cloudPc"),
    CloudApp("cloudApp"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    CloudPcUserExperienceType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static CloudPcUserExperienceType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "cloudPc": return CloudPc;
            case "cloudApp": return CloudApp;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
