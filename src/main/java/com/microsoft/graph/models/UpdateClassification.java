package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of activityStatistics entities. */
public enum UpdateClassification implements ValuedEnum {
    /** User Defined, default value, no intent. */
    UserDefined("userDefined"),
    /** Recommended and important. */
    RecommendedAndImportant("recommendedAndImportant"),
    /** Important. */
    Important("important"),
    /** None. */
    None("none");
    public final String value;
    UpdateClassification(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static UpdateClassification forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "userDefined": return UserDefined;
            case "recommendedAndImportant": return RecommendedAndImportant;
            case "important": return Important;
            case "none": return None;
            default: return null;
        }
    }
}
