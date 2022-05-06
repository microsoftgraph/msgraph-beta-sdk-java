package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to call the validateComplianceScript method.  */
public enum DeviceComplianceScriptRulOperator implements ValuedEnum {
    None("none"),
    And("and"),
    Or("or"),
    IsEquals("isEquals"),
    NotEquals("notEquals"),
    GreaterThan("greaterThan"),
    LessThan("lessThan"),
    Between("between"),
    NotBetween("notBetween"),
    GreaterEquals("greaterEquals"),
    LessEquals("lessEquals"),
    DayTimeBetween("dayTimeBetween"),
    BeginsWith("beginsWith"),
    NotBeginsWith("notBeginsWith"),
    EndsWith("endsWith"),
    NotEndsWith("notEndsWith"),
    Contains("contains"),
    NotContains("notContains"),
    AllOf("allOf"),
    OneOf("oneOf"),
    NoneOf("noneOf"),
    SetEquals("setEquals"),
    OrderedSetEquals("orderedSetEquals"),
    SubsetOf("subsetOf"),
    ExcludesAll("excludesAll");
    public final String value;
    DeviceComplianceScriptRulOperator(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static DeviceComplianceScriptRulOperator forValue(@javax.annotation.Nonnull final String searchValue) {
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
