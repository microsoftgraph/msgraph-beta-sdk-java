package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Process identifier types for MacOS Privacy Preferences
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum MacOSProcessIdentifierType implements ValuedEnum {
    /** Indicates an app with a bundle ID. */
    BundleID("bundleID"),
    /** Indicates a file path for a process. */
    Path("path");
    public final String value;
    MacOSProcessIdentifierType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static MacOSProcessIdentifierType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "bundleID": return BundleID;
            case "path": return Path;
            default: return null;
        }
    }
}
