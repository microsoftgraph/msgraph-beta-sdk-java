package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of activityStatistics entities. */
public enum EducationExternalSource implements ValuedEnum {
    Sis("sis"),
    Manual("manual"),
    UnknownFutureValue("unknownFutureValue"),
    Lms("lms");
    public final String value;
    EducationExternalSource(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static EducationExternalSource forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "sis": return Sis;
            case "manual": return Manual;
            case "unknownFutureValue": return UnknownFutureValue;
            case "lms": return Lms;
            default: return null;
        }
    }
}
