package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum CustomFieldValueType implements ValuedEnum {
    Text("text"),
    Date("date"),
    UtcDateTime("utcDateTime"),
    Number("number"),
    Decimal("decimal"),
    Flag("flag"),
    SingleChoiceText("singleChoiceText"),
    MultipleChoiceText("multipleChoiceText"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    CustomFieldValueType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static CustomFieldValueType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "text": return Text;
            case "date": return Date;
            case "utcDateTime": return UtcDateTime;
            case "number": return Number;
            case "decimal": return Decimal;
            case "flag": return Flag;
            case "singleChoiceText": return SingleChoiceText;
            case "multipleChoiceText": return MultipleChoiceText;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
