package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReview entities. */
public enum DefenderRealtimeScanDirection implements ValuedEnum {
    /** 0 (default) – Monitor all files(bi-directional) */
    MonitorAllFiles("monitorAllFiles"),
    /** Monitor incoming files only. */
    MonitorIncomingFilesOnly("monitorIncomingFilesOnly"),
    /** Monitor outgoing files only. */
    MonitorOutgoingFilesOnly("monitorOutgoingFilesOnly");
    public final String value;
    DefenderRealtimeScanDirection(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static DefenderRealtimeScanDirection forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "monitorAllFiles": return MonitorAllFiles;
            case "monitorIncomingFilesOnly": return MonitorIncomingFilesOnly;
            case "monitorOutgoingFilesOnly": return MonitorOutgoingFilesOnly;
            default: return null;
        }
    }
}
