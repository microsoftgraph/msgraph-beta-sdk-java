package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReviewDecision entities. */
public enum RegistrationStatusType implements ValuedEnum {
    Registered("registered"),
    Enabled("enabled"),
    Capable("capable"),
    MfaRegistered("mfaRegistered"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    RegistrationStatusType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static RegistrationStatusType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "registered": return Registered;
            case "enabled": return Enabled;
            case "capable": return Capable;
            case "mfaRegistered": return MfaRegistered;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
