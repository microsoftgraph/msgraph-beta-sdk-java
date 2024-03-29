package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum EducationExternalSource implements ValuedEnum {
    Sis("sis"),
    Manual("manual"),
    UnknownFutureValue("unknownFutureValue"),
    Lms("lms");
    public final String value;
    EducationExternalSource(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static EducationExternalSource forValue(@jakarta.annotation.Nonnull final String searchValue) {
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
