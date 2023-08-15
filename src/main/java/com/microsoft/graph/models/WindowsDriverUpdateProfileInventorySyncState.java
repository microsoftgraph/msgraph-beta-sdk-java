package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Windows DnF update inventory sync state.
 */
public enum WindowsDriverUpdateProfileInventorySyncState implements ValuedEnum {
    /** Pending sync. */
    Pending("pending"),
    /** Successful sync. */
    Success("success"),
    /** Failed sync. */
    Failure("failure");
    public final String value;
    WindowsDriverUpdateProfileInventorySyncState(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static WindowsDriverUpdateProfileInventorySyncState forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "pending": return Pending;
            case "success": return Success;
            case "failure": return Failure;
            default: return null;
        }
    }
}
