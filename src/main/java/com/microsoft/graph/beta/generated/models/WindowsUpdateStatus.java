package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Windows update for business configuration device states
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum WindowsUpdateStatus implements ValuedEnum {
    /** There are no pending updates, no pending reboot updates and no failed updates. */
    UpToDate("upToDate"),
    /** There are updates thats pending installation which includes updates that are not approved. There are no Pending reboot updates, no failed updates. */
    PendingInstallation("pendingInstallation"),
    /** There are updates that requires reboot. There are not failed updates. */
    PendingReboot("pendingReboot"),
    /** There are updates failed to install on the device. */
    Failed("failed");
    public final String value;
    WindowsUpdateStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static WindowsUpdateStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
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
