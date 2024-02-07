package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * The Enum to specify the level of display for the Installation Progress Setup UI on the Device.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum OfficeSuiteInstallProgressDisplayLevel implements ValuedEnum {
    None("none"),
    Full("full");
    public final String value;
    OfficeSuiteInstallProgressDisplayLevel(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static OfficeSuiteInstallProgressDisplayLevel forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "full": return Full;
            default: return null;
        }
    }
}
