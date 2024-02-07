package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * MacOS Software Update Category
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum MacOSSoftwareUpdateCategory implements ValuedEnum {
    /** A critical update */
    Critical("critical"),
    /** A configuration data file update */
    ConfigurationDataFile("configurationDataFile"),
    /** A firmware update */
    Firmware("firmware"),
    /** All other update types */
    Other("other");
    public final String value;
    MacOSSoftwareUpdateCategory(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static MacOSSoftwareUpdateCategory forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "critical": return Critical;
            case "configurationDataFile": return ConfigurationDataFile;
            case "firmware": return Firmware;
            case "other": return Other;
            default: return null;
        }
    }
}
