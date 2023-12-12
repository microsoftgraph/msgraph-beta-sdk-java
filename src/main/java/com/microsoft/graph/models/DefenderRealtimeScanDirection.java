package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Possible values for monitoring file activity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum DefenderRealtimeScanDirection implements ValuedEnum {
    /** 0 (default)  Monitor all files(bi-directional) */
    MonitorAllFiles("monitorAllFiles"),
    /** Monitor incoming files only. */
    MonitorIncomingFilesOnly("monitorIncomingFilesOnly"),
    /** Monitor outgoing files only. */
    MonitorOutgoingFilesOnly("monitorOutgoingFilesOnly");
    public final String value;
    DefenderRealtimeScanDirection(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static DefenderRealtimeScanDirection forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "monitorAllFiles": return MonitorAllFiles;
            case "monitorIncomingFilesOnly": return MonitorIncomingFilesOnly;
            case "monitorOutgoingFilesOnly": return MonitorOutgoingFilesOnly;
            default: return null;
        }
    }
}
