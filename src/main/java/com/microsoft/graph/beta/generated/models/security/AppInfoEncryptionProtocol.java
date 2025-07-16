package com.microsoft.graph.beta.models.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AppInfoEncryptionProtocol implements ValuedEnum {
    Tls1_0("tls1_0"),
    Tls1_1("tls1_1"),
    Tls1_2("tls1_2"),
    Tls1_3("tls1_3"),
    NotApplicable("notApplicable"),
    NotSupported("notSupported"),
    Unknown("unknown"),
    UnknownFutureValue("unknownFutureValue"),
    Ssl3("ssl3");
    public final String value;
    AppInfoEncryptionProtocol(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AppInfoEncryptionProtocol forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "tls1_0": return Tls1_0;
            case "tls1_1": return Tls1_1;
            case "tls1_2": return Tls1_2;
            case "tls1_3": return Tls1_3;
            case "notApplicable": return NotApplicable;
            case "notSupported": return NotSupported;
            case "unknown": return Unknown;
            case "unknownFutureValue": return UnknownFutureValue;
            case "ssl3": return Ssl3;
            default: return null;
        }
    }
}
