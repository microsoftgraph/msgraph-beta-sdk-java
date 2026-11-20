package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AppManagementAuditLogPolicyType implements ValuedEnum {
    DefaultEntraId("defaultEntraId"),
    Tenant("tenant"),
    App("app"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    AppManagementAuditLogPolicyType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AppManagementAuditLogPolicyType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "defaultEntraId": return DefaultEntraId;
            case "tenant": return Tenant;
            case "app": return App;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
