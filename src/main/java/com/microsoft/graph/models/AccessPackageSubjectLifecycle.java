package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReviewDecision entities. */
public enum AccessPackageSubjectLifecycle implements ValuedEnum {
    NotDefined("notDefined"),
    NotGoverned("notGoverned"),
    Governed("governed"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    AccessPackageSubjectLifecycle(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static AccessPackageSubjectLifecycle forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notDefined": return NotDefined;
            case "notGoverned": return NotGoverned;
            case "governed": return Governed;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
