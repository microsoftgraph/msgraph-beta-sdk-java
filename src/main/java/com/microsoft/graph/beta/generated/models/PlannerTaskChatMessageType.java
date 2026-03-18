package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum PlannerTaskChatMessageType implements ValuedEnum {
    RichTextHtml("richTextHtml"),
    PlainText("plainText"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    PlannerTaskChatMessageType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static PlannerTaskChatMessageType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "richTextHtml": return RichTextHtml;
            case "plainText": return PlainText;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
