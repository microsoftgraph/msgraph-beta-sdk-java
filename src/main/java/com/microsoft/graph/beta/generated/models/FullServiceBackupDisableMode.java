package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum FullServiceBackupDisableMode implements ValuedEnum {
    None("none"),
    EnableAll("enableAll"),
    DisableAll("disableAll"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    FullServiceBackupDisableMode(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static FullServiceBackupDisableMode forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "enableAll": return EnableAll;
            case "disableAll": return DisableAll;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
