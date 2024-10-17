package com.microsoft.graph.beta.models.networkaccess;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum Algorithm implements ValuedEnum {
    Md5("md5"),
    Sha1("sha1"),
    Sha256("sha256"),
    Sha256ac("sha256ac"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    Algorithm(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static Algorithm forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "md5": return Md5;
            case "sha1": return Sha1;
            case "sha256": return Sha256;
            case "sha256ac": return Sha256ac;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
