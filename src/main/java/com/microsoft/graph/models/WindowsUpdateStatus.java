package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReview entities. */
public enum WindowsUpdateStatus implements ValuedEnum {
    /** There are no pending updates, no pending reboot updates and no failed updates. */
    UpToDate("upToDate"),
    /** There are updates that’s pending installation which includes updates that are not approved. There are no Pending reboot updates, no failed updates. */
    PendingInstallation("pendingInstallation"),
    /** There are updates that requires reboot. There are not failed updates. */
    PendingReboot("pendingReboot"),
    /** There are updates failed to install on the device. */
    Failed("failed");
    public final String value;
    WindowsUpdateStatus(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static WindowsUpdateStatus forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "upToDate": return UpToDate;
            case "pendingInstallation": return PendingInstallation;
            case "pendingReboot": return PendingReboot;
            case "failed": return Failed;
            default: return null;
        }
    }
}
