package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceAppManagement singleton. */
public enum AndroidManagedStoreAutoUpdateMode implements ValuedEnum {
    /** Default update behavior (device must be connected to Wifi, charging and not actively used). */
    Default_escaped("default_escaped"),
    /** Updates are postponed for a maximum of 90 days after the app becomes out of date. */
    Postponed("postponed"),
    /** The app is updated as soon as possible by the developer. If device is online, it will be updated within minutes. */
    Priority("priority"),
    /** Unknown future mode (reserved, not used right now). */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    AndroidManagedStoreAutoUpdateMode(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static AndroidManagedStoreAutoUpdateMode forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "default": return Default_escaped;
            case "postponed": return Postponed;
            case "priority": return Priority;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
