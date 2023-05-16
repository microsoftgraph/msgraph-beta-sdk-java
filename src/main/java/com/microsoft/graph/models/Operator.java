package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Operator for rules. */
public enum Operator implements ValuedEnum {
    /** None operator. */
    None("none"),
    /** And operator. */
    And("and"),
    /** Or operator. */
    Or("or"),
    /** IsEquals operator. */
    IsEquals("isEquals"),
    /** NotEquals operator. */
    NotEquals("notEquals"),
    /** GreaterThan operator. */
    GreaterThan("greaterThan"),
    /** LessThan operator. */
    LessThan("lessThan"),
    /** Between operator. */
    Between("between"),
    /** NotBetween operator. */
    NotBetween("notBetween"),
    /** GreaterEquals operator. */
    GreaterEquals("greaterEquals"),
    /** LessEquals operator. */
    LessEquals("lessEquals"),
    /** DayTimeBetween operator. */
    DayTimeBetween("dayTimeBetween"),
    /** BeginsWith operator. */
    BeginsWith("beginsWith"),
    /** NotBeginsWith operator. */
    NotBeginsWith("notBeginsWith"),
    /** EndsWith operator. */
    EndsWith("endsWith"),
    /** NotEndsWith operator. */
    NotEndsWith("notEndsWith"),
    /** Contains operator. */
    Contains("contains"),
    /** NotContains operator. */
    NotContains("notContains"),
    /** AllOf operator. */
    AllOf("allOf"),
    /** OneOf operator. */
    OneOf("oneOf"),
    /** NoneOf operator. */
    NoneOf("noneOf"),
    /** SetEquals operator. */
    SetEquals("setEquals"),
    /** OrderedSetEquals operator. */
    OrderedSetEquals("orderedSetEquals"),
    /** SubsetOf operator. */
    SubsetOf("subsetOf"),
    /** ExcludesAll operator. */
    ExcludesAll("excludesAll");
    public final String value;
    Operator(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static Operator forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "and": return And;
            case "or": return Or;
            case "isEquals": return IsEquals;
            case "notEquals": return NotEquals;
            case "greaterThan": return GreaterThan;
            case "lessThan": return LessThan;
            case "between": return Between;
            case "notBetween": return NotBetween;
            case "greaterEquals": return GreaterEquals;
            case "lessEquals": return LessEquals;
            case "dayTimeBetween": return DayTimeBetween;
            case "beginsWith": return BeginsWith;
            case "notBeginsWith": return NotBeginsWith;
            case "endsWith": return EndsWith;
            case "notEndsWith": return NotEndsWith;
            case "contains": return Contains;
            case "notContains": return NotContains;
            case "allOf": return AllOf;
            case "oneOf": return OneOf;
            case "noneOf": return NoneOf;
            case "setEquals": return SetEquals;
            case "orderedSetEquals": return OrderedSetEquals;
            case "subsetOf": return SubsetOf;
            case "excludesAll": return ExcludesAll;
            default: return null;
        }
    }
}
