package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Represents the level to which the device's clipboard may be shared between apps
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum WindowsManagedAppClipboardSharingLevel implements ValuedEnum {
    /** Org users can paste data from and cut/copy data to any account, document, location or application. */
    AnyDestinationAnySource("anyDestinationAnySource"),
    /** Org users cannot cut, copy or paste data to or from external accounts, documents, locations or applications from or into the org context. */
    None("none");
    public final String value;
    WindowsManagedAppClipboardSharingLevel(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static WindowsManagedAppClipboardSharingLevel forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "anyDestinationAnySource": return AnyDestinationAnySource;
            case "none": return None;
            default: return null;
        }
    }
}
