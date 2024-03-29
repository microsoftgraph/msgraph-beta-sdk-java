package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * An admin enforced Android SafetyNet Device Attestation requirement on a managed app.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AndroidManagedAppSafetyNetAppsVerificationType implements ValuedEnum {
    /** no requirement set */
    None("none"),
    /** require that Android device has SafetyNet Apps Verification enabled */
    Enabled("enabled");
    public final String value;
    AndroidManagedAppSafetyNetAppsVerificationType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AndroidManagedAppSafetyNetAppsVerificationType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "enabled": return Enabled;
            default: return null;
        }
    }
}
