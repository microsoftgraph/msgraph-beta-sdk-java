package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Represents various schedule modes for Zebra FOTA deployment.
 */
public enum ZebraFotaScheduleMode implements ValuedEnum {
    /** Instructs the device to install the update as soon as it is received. */
    InstallNow("installNow"),
    /** Schedule an update to be installed at a specified date and time. */
    Scheduled("scheduled"),
    /** Unknown future enum value. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ZebraFotaScheduleMode(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ZebraFotaScheduleMode forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "installNow": return InstallNow;
            case "scheduled": return Scheduled;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
