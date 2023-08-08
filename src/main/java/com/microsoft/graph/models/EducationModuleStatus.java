package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum EducationModuleStatus implements ValuedEnum {
    Draft("draft"),
    Published("published"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    EducationModuleStatus(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static EducationModuleStatus forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "draft": return Draft;
            case "published": return Published;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
