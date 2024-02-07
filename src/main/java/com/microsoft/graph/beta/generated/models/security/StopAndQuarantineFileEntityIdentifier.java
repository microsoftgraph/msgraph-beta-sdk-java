package com.microsoft.graph.beta.models.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum StopAndQuarantineFileEntityIdentifier implements ValuedEnum {
    DeviceId("deviceId"),
    Sha1("sha1"),
    InitiatingProcessSHA1("initiatingProcessSHA1"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    StopAndQuarantineFileEntityIdentifier(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static StopAndQuarantineFileEntityIdentifier forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "deviceId": return DeviceId;
            case "sha1": return Sha1;
            case "initiatingProcessSHA1": return InitiatingProcessSHA1;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
