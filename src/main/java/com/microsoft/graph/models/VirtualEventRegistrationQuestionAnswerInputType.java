package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum VirtualEventRegistrationQuestionAnswerInputType implements ValuedEnum {
    Text("text"),
    MultilineText("multilineText"),
    SingleChoice("singleChoice"),
    MultiChoice("multiChoice"),
    BooleanEscaped("boolean"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    VirtualEventRegistrationQuestionAnswerInputType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static VirtualEventRegistrationQuestionAnswerInputType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "text": return Text;
            case "multilineText": return MultilineText;
            case "singleChoice": return SingleChoice;
            case "multiChoice": return MultiChoice;
            case "boolean": return BooleanEscaped;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
