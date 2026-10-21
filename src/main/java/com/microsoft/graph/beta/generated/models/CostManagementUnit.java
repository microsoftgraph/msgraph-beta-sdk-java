package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Unit in which consumption quantities are expressed. Values are consumption units, not currency.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum CostManagementUnit implements ValuedEnum {
    /** The current Copilot Credits consumption unit. */
    CopilotCredit("copilotCredit"),
    /** A marker value for members added after the release of this API. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    CostManagementUnit(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static CostManagementUnit forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "copilotCredit": return CopilotCredit;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
