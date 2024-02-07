package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Data can be transferred from/to these classes of apps
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum WindowsManagedAppDataTransferLevel implements ValuedEnum {
    /** All apps. */
    AllApps("allApps"),
    /** No apps. */
    None("none");
    public final String value;
    WindowsManagedAppDataTransferLevel(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static WindowsManagedAppDataTransferLevel forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "allApps": return AllApps;
            case "none": return None;
            default: return null;
        }
    }
}
