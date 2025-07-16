package com.microsoft.graph.beta.models.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AppInfoDataAtRestEncryptionMethod implements ValuedEnum {
    Aes("aes"),
    BitLocker("bitLocker"),
    Blowfish("blowfish"),
    Des3("des3"),
    Des("des"),
    Rc4("rc4"),
    RsA("rsA"),
    NotSupported("notSupported"),
    Unknown("unknown"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    AppInfoDataAtRestEncryptionMethod(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AppInfoDataAtRestEncryptionMethod forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "aes": return Aes;
            case "bitLocker": return BitLocker;
            case "blowfish": return Blowfish;
            case "des3": return Des3;
            case "des": return Des;
            case "rc4": return Rc4;
            case "rsA": return RsA;
            case "notSupported": return NotSupported;
            case "unknown": return Unknown;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
