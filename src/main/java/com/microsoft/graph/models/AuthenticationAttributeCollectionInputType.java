package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum AuthenticationAttributeCollectionInputType implements ValuedEnum {
    Text("text"),
    RadioSingleSelect("radioSingleSelect"),
    CheckboxMultiSelect("checkboxMultiSelect"),
    BooleanEscaped("boolean"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    AuthenticationAttributeCollectionInputType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static AuthenticationAttributeCollectionInputType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "text": return Text;
            case "radioSingleSelect": return RadioSingleSelect;
            case "checkboxMultiSelect": return CheckboxMultiSelect;
            case "boolean": return BooleanEscaped;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
