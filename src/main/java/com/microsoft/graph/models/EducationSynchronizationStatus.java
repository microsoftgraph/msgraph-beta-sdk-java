package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of activityStatistics entities. */
public enum EducationSynchronizationStatus implements ValuedEnum {
    Paused("paused"),
    InProgress("inProgress"),
    Success("success"),
    Error("error"),
    ValidationError("validationError"),
    Quarantined("quarantined"),
    UnknownFutureValue("unknownFutureValue"),
    Extracting("extracting"),
    Validating("validating");
    public final String value;
    EducationSynchronizationStatus(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static EducationSynchronizationStatus forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "paused": return Paused;
            case "inProgress": return InProgress;
            case "success": return Success;
            case "error": return Error;
            case "validationError": return ValidationError;
            case "quarantined": return Quarantined;
            case "unknownFutureValue": return UnknownFutureValue;
            case "extracting": return Extracting;
            case "validating": return Validating;
            default: return null;
        }
    }
}
