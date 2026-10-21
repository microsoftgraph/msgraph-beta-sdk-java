package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AppManagementAuditLogRestrictionState implements ValuedEnum {
    Enabled("enabled"),
    Disabled("disabled"),
    Audit("audit"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    AppManagementAuditLogRestrictionState(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AppManagementAuditLogRestrictionState forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "enabled": return Enabled;
            case "disabled": return Disabled;
            case "audit": return Audit;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
