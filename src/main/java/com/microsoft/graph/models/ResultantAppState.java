package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * A list of possible states for application status on an individual device. When devices contact the Intune service and find targeted application enforcement intent, the status of the enforcement is recorded and becomes accessible in the Graph API. Since the application status is identified during device interaction with the Intune service, status records do not immediately appear upon application group assignment; it is created only after the assignment is evaluated in the service and devices start receiving the policy during check-ins.
 */
public enum ResultantAppState implements ValuedEnum {
    /** The application is not applicable. */
    NotApplicable("notApplicable"),
    /** The application is installed with no errors. */
    Installed("installed"),
    /** The application failed to install. */
    Failed("failed"),
    /** The application is not installed. */
    NotInstalled("notInstalled"),
    /** The application failed to uninstall. */
    UninstallFailed("uninstallFailed"),
    /** The installation of the application is in progress. */
    PendingInstall("pendingInstall"),
    /** The status of the application is unknown. */
    Unknown("unknown");
    public final String value;
    ResultantAppState(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ResultantAppState forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notApplicable": return NotApplicable;
            case "installed": return Installed;
            case "failed": return Failed;
            case "notInstalled": return NotInstalled;
            case "uninstallFailed": return UninstallFailed;
            case "pendingInstall": return PendingInstall;
            case "unknown": return Unknown;
            default: return null;
        }
    }
}
