package com.microsoft.graph.beta.models.windowsupdates;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum QualityUpdateClassification implements ValuedEnum {
    All("all"),
    Security("security"),
    NonSecurity("nonSecurity"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    QualityUpdateClassification(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static QualityUpdateClassification forValue(@jakarta.annotation.Nonnull final String searchValue) {
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
