package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Represents the mode used by the service to evaluate an assignment filter.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AssignmentFilterEvaluationMode implements ValuedEnum {
    /** The filter is evaluated when the device checks in. */
    CheckinTimeEvaluation("checkinTimeEvaluation"),
    /** The filter is evaluated from inventory-backed device properties. */
    InventoryEvaluation("inventoryEvaluation"),
    /** The filter requires both check-in-time and inventory-backed device properties. */
    MixedEvaluation("mixedEvaluation"),
    /** Inventory-based evaluation is disabled for the requesting account. */
    Disabled("disabled"),
    /** Evolvable enumeration sentinel value. Do not use. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    AssignmentFilterEvaluationMode(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AssignmentFilterEvaluationMode forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "checkinTimeEvaluation": return CheckinTimeEvaluation;
            case "inventoryEvaluation": return InventoryEvaluation;
            case "mixedEvaluation": return MixedEvaluation;
            case "disabled": return Disabled;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
