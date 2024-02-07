package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum CloudPcManagementService implements ValuedEnum {
    Windows365("windows365"),
    DevBox("devBox"),
    UnknownFutureValue("unknownFutureValue"),
    RpaBox("rpaBox");
    public final String value;
    CloudPcManagementService(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static CloudPcManagementService forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "windows365": return Windows365;
            case "devBox": return DevBox;
            case "unknownFutureValue": return UnknownFutureValue;
            case "rpaBox": return RpaBox;
            default: return null;
        }
    }
}
