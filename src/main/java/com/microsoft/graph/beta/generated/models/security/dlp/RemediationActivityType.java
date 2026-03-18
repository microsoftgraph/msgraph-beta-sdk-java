package com.microsoft.graph.beta.models.security.dlp;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum RemediationActivityType implements ValuedEnum {
    Unknown("unknown"),
    TemplateTriggered("templateTriggered"),
    IwUnableToTakeAction("iwUnableToTakeAction"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    RemediationActivityType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static RemediationActivityType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "templateTriggered": return TemplateTriggered;
            case "iwUnableToTakeAction": return IwUnableToTakeAction;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
