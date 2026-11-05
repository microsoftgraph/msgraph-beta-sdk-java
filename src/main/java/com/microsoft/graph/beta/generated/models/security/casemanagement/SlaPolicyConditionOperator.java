package com.microsoft.graph.beta.models.security.casemanagement;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum SlaPolicyConditionOperator implements ValuedEnum {
    Equals("equals"),
    NotEquals("notEquals"),
    Contains("contains"),
    DoesNotContain("doesNotContain"),
    IsEmpty("isEmpty"),
    IsNotEmpty("isNotEmpty"),
    Changed("changed"),
    ChangedTo("changedTo"),
    ChangedFrom("changedFrom"),
    IsBefore("isBefore"),
    IsAfter("isAfter"),
    GreaterThan("greaterThan"),
    LessThan("lessThan"),
    AnyOf("anyOf"),
    NoneOf("noneOf"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    SlaPolicyConditionOperator(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static SlaPolicyConditionOperator forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "equals": return Equals;
            case "notEquals": return NotEquals;
            case "contains": return Contains;
            case "doesNotContain": return DoesNotContain;
            case "isEmpty": return IsEmpty;
            case "isNotEmpty": return IsNotEmpty;
            case "changed": return Changed;
            case "changedTo": return ChangedTo;
            case "changedFrom": return ChangedFrom;
            case "isBefore": return IsBefore;
            case "isAfter": return IsAfter;
            case "greaterThan": return GreaterThan;
            case "lessThan": return LessThan;
            case "anyOf": return AnyOf;
            case "noneOf": return NoneOf;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
