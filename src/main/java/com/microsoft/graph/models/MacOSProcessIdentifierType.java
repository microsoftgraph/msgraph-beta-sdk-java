package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReview entities. */
public enum MacOSProcessIdentifierType implements ValuedEnum {
    /** Indicates an app with a bundle ID. */
    BundleID("bundleID"),
    /** Indicates a file path for a process. */
    Path("path");
    public final String value;
    MacOSProcessIdentifierType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static MacOSProcessIdentifierType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "bundleID": return BundleID;
            case "path": return Path;
            default: return null;
        }
    }
}
