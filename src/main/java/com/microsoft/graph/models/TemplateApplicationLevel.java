package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum TemplateApplicationLevel implements ValuedEnum {
    None("none"),
    NewPartners("newPartners"),
    ExistingPartners("existingPartners"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    TemplateApplicationLevel(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static TemplateApplicationLevel forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "newPartners": return NewPartners;
            case "existingPartners": return ExistingPartners;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
