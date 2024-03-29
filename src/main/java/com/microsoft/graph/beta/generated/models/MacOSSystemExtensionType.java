package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Flag enum representing the allowed macOS system extension types.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum MacOSSystemExtensionType implements ValuedEnum {
    /** Enables driver extensions. */
    DriverExtensionsAllowed("driverExtensionsAllowed"),
    /** Enables network extensions. */
    NetworkExtensionsAllowed("networkExtensionsAllowed"),
    /** Enables endpoint security extensions. */
    EndpointSecurityExtensionsAllowed("endpointSecurityExtensionsAllowed");
    public final String value;
    MacOSSystemExtensionType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static MacOSSystemExtensionType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "driverExtensionsAllowed": return DriverExtensionsAllowed;
            case "networkExtensionsAllowed": return NetworkExtensionsAllowed;
            case "endpointSecurityExtensionsAllowed": return EndpointSecurityExtensionsAllowed;
            default: return null;
        }
    }
}
