package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum AuthenticationAppAdminConfiguration implements ValuedEnum {
    NotApplicable("notApplicable"),
    Enabled("enabled"),
    Disabled("disabled"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    AuthenticationAppAdminConfiguration(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AuthenticationAppAdminConfiguration forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notApplicable": return NotApplicable;
            case "enabled": return Enabled;
            case "disabled": return Disabled;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
