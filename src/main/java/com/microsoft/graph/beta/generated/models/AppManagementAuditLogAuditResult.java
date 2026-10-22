package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AppManagementAuditLogAuditResult implements ValuedEnum {
    NotApplicable("notApplicable"),
    WouldHaveBeenAllowed("wouldHaveBeenAllowed"),
    WouldHaveBeenBlocked("wouldHaveBeenBlocked"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    AppManagementAuditLogAuditResult(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AppManagementAuditLogAuditResult forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notApplicable": return NotApplicable;
            case "wouldHaveBeenAllowed": return WouldHaveBeenAllowed;
            case "wouldHaveBeenBlocked": return WouldHaveBeenBlocked;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
