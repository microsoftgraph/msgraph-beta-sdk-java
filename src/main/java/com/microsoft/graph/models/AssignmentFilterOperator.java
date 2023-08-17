package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Represents the different type of operators which can be used to craft the AssignmentFilter rule.
 */
public enum AssignmentFilterOperator implements ValuedEnum {
    /** NotSet. */
    NotSet("notSet"),
    /** Equals. */
    Equals("equals"),
    /** NotEquals. */
    NotEquals("notEquals"),
    /** StartsWith. */
    StartsWith("startsWith"),
    /** NotStartsWith. */
    NotStartsWith("notStartsWith"),
    /** Contains. */
    Contains("contains"),
    /** NotContains. */
    NotContains("notContains"),
    /** In. */
    In("in"),
    /** NotIn. */
    NotIn("notIn"),
    /** EndsWith. */
    EndsWith("endsWith"),
    /** NotEndsWith. */
    NotEndsWith("notEndsWith");
    public final String value;
    AssignmentFilterOperator(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AssignmentFilterOperator forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notSet": return NotSet;
            case "equals": return Equals;
            case "notEquals": return NotEquals;
            case "startsWith": return StartsWith;
            case "notStartsWith": return NotStartsWith;
            case "contains": return Contains;
            case "notContains": return NotContains;
            case "in": return In;
            case "notIn": return NotIn;
            case "endsWith": return EndsWith;
            case "notEndsWith": return NotEndsWith;
            default: return null;
        }
    }
}
