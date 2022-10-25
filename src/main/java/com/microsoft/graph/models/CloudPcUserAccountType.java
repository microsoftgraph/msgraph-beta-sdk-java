package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReviewDecision entities. */
public enum CloudPcUserAccountType implements ValuedEnum {
    StandardUser("standardUser"),
    Administrator("administrator"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    CloudPcUserAccountType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static CloudPcUserAccountType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "standardUser": return StandardUser;
            case "administrator": return Administrator;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
