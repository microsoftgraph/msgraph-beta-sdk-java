package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** The maxium threat level allowed for an app to be compliant. */
public enum ManagedAppDeviceThreatLevel implements ValuedEnum {
    /** Value not configured */
    NotConfigured("notConfigured"),
    /** Device needs to have no threat */
    Secured("secured"),
    /** Device needs to have a low threat. */
    Low("low"),
    /** Device needs to have not more than medium threat. */
    Medium("medium"),
    /** Device needs to have not more than high threat */
    High("high");
    public final String value;
    ManagedAppDeviceThreatLevel(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ManagedAppDeviceThreatLevel forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notConfigured": return NotConfigured;
            case "secured": return Secured;
            case "low": return Low;
            case "medium": return Medium;
            case "high": return High;
            default: return null;
        }
    }
}
