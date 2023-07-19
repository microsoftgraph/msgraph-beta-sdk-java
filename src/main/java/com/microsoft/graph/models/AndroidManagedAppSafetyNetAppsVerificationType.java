package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * An admin enforced Android SafetyNet Device Attestation requirement on a managed app.
 */
public enum AndroidManagedAppSafetyNetAppsVerificationType implements ValuedEnum {
    /** no requirement set */
    None("none"),
    /** require that Android device has SafetyNet Apps Verification enabled */
    Enabled("enabled");
    public final String value;
    AndroidManagedAppSafetyNetAppsVerificationType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static AndroidManagedAppSafetyNetAppsVerificationType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "enabled": return Enabled;
            default: return null;
        }
    }
}
