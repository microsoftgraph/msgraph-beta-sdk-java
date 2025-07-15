package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum PolicyFileStatus implements ValuedEnum {
    Modified("modified"),
    NotModified("notModified"),
    NoContent("noContent"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    PolicyFileStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static PolicyFileStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "modified": return Modified;
            case "notModified": return NotModified;
            case "noContent": return NoContent;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
