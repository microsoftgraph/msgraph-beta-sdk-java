package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * A list of possible script lifecycle states.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum MobileAppContentScriptState implements ValuedEnum {
    /** Indicates that the script content is ready. */
    CommitSuccess("commitSuccess");
    public final String value;
    MobileAppContentScriptState(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static MobileAppContentScriptState forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "commitSuccess": return CommitSuccess;
            default: return null;
        }
    }
}
