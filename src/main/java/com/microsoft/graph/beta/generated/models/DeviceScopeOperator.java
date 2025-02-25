package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Device scope configuration query operator. Possible values are: equals, notEquals, contains, notContains, greaterThan, lessThan. Default value: equals.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum DeviceScopeOperator implements ValuedEnum {
    /** No operator set for the device scope configuration. */
    None("none"),
    /** Operator for the device configuration query to be used (Equals). */
    Equals("equals"),
    /** Evolvable enumeration sentinel value. Do not use. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    DeviceScopeOperator(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static DeviceScopeOperator forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "equals": return Equals;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
