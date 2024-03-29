package com.microsoft.graph.beta.models.networkaccess;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum DhGroup implements ValuedEnum {
    DhGroup14("dhGroup14"),
    DhGroup24("dhGroup24"),
    DhGroup2048("dhGroup2048"),
    Ecp256("ecp256"),
    Ecp384("ecp384"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    DhGroup(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static DhGroup forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "dhGroup14": return DhGroup14;
            case "dhGroup24": return DhGroup24;
            case "dhGroup2048": return DhGroup2048;
            case "ecp256": return Ecp256;
            case "ecp384": return Ecp384;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
