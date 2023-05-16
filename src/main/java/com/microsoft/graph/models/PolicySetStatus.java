package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** The enum to specify the status of PolicySet. */
public enum PolicySetStatus implements ValuedEnum {
    /** Default Value. */
    Unknown("unknown"),
    /** All PolicySet items are now validating for corresponding settings of workloads. */
    Validating("validating"),
    /** Post process complete for all PolicySet items but there are failures. */
    PartialSuccess("partialSuccess"),
    /** All PolicySet items are deployed. Doesnt mean that all deployment succeeded.  */
    Success("success"),
    /** PolicySet processing completely failed. */
    Error("error"),
    /** PolicySet/PolicySetItem is not assigned to any group. */
    NotAssigned("notAssigned");
    public final String value;
    PolicySetStatus(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static PolicySetStatus forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "validating": return Validating;
            case "partialSuccess": return PartialSuccess;
            case "success": return Success;
            case "error": return Error;
            case "notAssigned": return NotAssigned;
            default: return null;
        }
    }
}
