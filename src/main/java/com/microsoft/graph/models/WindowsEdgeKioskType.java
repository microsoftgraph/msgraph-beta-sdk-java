package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of activityStatistics entities. */
public enum WindowsEdgeKioskType implements ValuedEnum {
    /** public-browsing */
    PublicBrowsing("publicBrowsing"),
    /** fullscreen */
    FullScreen("fullScreen");
    public final String value;
    WindowsEdgeKioskType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static WindowsEdgeKioskType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "publicBrowsing": return PublicBrowsing;
            case "fullScreen": return FullScreen;
            default: return null;
        }
    }
}
