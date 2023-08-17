package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Describes the various states for an embedded SIM activation code.
 */
public enum EmbeddedSIMDeviceStateValue implements ValuedEnum {
    /** Designates that the embedded SIM activation code is free and available to be assigned to a device. */
    NotEvaluated("notEvaluated"),
    /** Designates that Intune Service failed to deliver this profile to a device. */
    Failed("failed"),
    /** Designates that the embedded SIM activation code has been assigned to a device and the device is installing the token. */
    Installing("installing"),
    /** Designates that the embedded SIM activation code has been successfully installed on the target device. */
    Installed("installed"),
    /** Designates that Intune Service is trying to delete the profile from the device. */
    Deleting("deleting"),
    /** Designates that there is error with this profile. */
    Error("error"),
    /** Designates that the profile is deleted from the device. */
    Deleted("deleted"),
    /** Designates that the profile is removed from the device by the user */
    RemovedByUser("removedByUser");
    public final String value;
    EmbeddedSIMDeviceStateValue(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static EmbeddedSIMDeviceStateValue forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notEvaluated": return NotEvaluated;
            case "failed": return Failed;
            case "installing": return Installing;
            case "installed": return Installed;
            case "deleting": return Deleting;
            case "error": return Error;
            case "deleted": return Deleted;
            case "removedByUser": return RemovedByUser;
            default: return null;
        }
    }
}
