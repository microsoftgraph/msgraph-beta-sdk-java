package com.microsoft.graph.beta.models.security.casemanagement;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AttachmentOriginType implements ValuedEnum {
    Case("case"),
    Comment("comment"),
    Task("task"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    AttachmentOriginType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AttachmentOriginType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "case": return Case;
            case "comment": return Comment;
            case "task": return Task;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
