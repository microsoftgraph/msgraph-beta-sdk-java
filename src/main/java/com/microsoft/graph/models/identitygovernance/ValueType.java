package com.microsoft.graph.models.identitygovernance;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of activityStatistics entities. */
public enum ValueType implements ValuedEnum {
    Enum_escaped("enum_escaped"),
    String("string"),
    Int_escaped("int_escaped"),
    Bool("bool"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ValueType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ValueType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "enum": return Enum_escaped;
            case "string": return String;
            case "int": return Int_escaped;
            case "bool": return Bool;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
