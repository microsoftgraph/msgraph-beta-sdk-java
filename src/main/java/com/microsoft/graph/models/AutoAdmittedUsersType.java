package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReviewDecision entities. */
public enum AutoAdmittedUsersType implements ValuedEnum {
    EveryoneInCompany("everyoneInCompany"),
    Everyone("everyone");
    public final String value;
    AutoAdmittedUsersType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static AutoAdmittedUsersType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "everyoneInCompany": return EveryoneInCompany;
            case "everyone": return Everyone;
            default: return null;
        }
    }
}
