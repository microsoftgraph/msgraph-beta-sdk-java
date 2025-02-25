package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Prioritization for automatic updates of Android Managed Store apps set on assignment.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AndroidManagedStoreAutoUpdateMode implements ValuedEnum {
    /** Default update behavior (device must be connected to Wifi, charging and not actively used). */
    Default("default"),
    /** Updates are postponed for a maximum of 90 days after the app becomes out of date. */
    Postponed("postponed"),
    /** The app is updated as soon as possible by the developer. If device is online, it will be updated within minutes. */
    Priority("priority"),
    /** Evolvable enumeration sentinel value. Do not use. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    AndroidManagedStoreAutoUpdateMode(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AndroidManagedStoreAutoUpdateMode forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "default": return Default;
            case "postponed": return Postponed;
            case "priority": return Priority;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
