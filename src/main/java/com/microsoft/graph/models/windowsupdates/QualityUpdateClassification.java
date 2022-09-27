package com.microsoft.graph.models.windowsupdates;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReview entities. */
public enum QualityUpdateClassification implements ValuedEnum {
    All("all"),
    Security("security"),
    NonSecurity("nonSecurity"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    QualityUpdateClassification(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static QualityUpdateClassification forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "all": return All;
            case "security": return Security;
            case "nonSecurity": return NonSecurity;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
