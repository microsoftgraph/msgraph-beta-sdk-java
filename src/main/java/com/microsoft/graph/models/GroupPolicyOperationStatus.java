package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Type of Group Policy operation status.
 */
public enum GroupPolicyOperationStatus implements ValuedEnum {
    /** Group Policy unknown operation status. */
    Unknown("unknown"),
    /** Group Policy in progress operation status. */
    InProgress("inProgress"),
    /** Group Policy successful operation status. */
    Success("success"),
    /** Group Policy failed operation status. */
    Failed("failed");
    public final String value;
    GroupPolicyOperationStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static GroupPolicyOperationStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "inProgress": return InProgress;
            case "success": return Success;
            case "failed": return Failed;
            default: return null;
        }
    }
}
