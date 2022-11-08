package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of activityStatistics entities. */
public enum IntendedPurpose implements ValuedEnum {
    /** Unassigned */
    Unassigned("unassigned"),
    /** SmimeEncryption */
    SmimeEncryption("smimeEncryption"),
    /** SmimeSigning */
    SmimeSigning("smimeSigning"),
    /** VPN */
    Vpn("vpn"),
    /** Wifi */
    Wifi("wifi");
    public final String value;
    IntendedPurpose(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static IntendedPurpose forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unassigned": return Unassigned;
            case "smimeEncryption": return SmimeEncryption;
            case "smimeSigning": return SmimeSigning;
            case "vpn": return Vpn;
            case "wifi": return Wifi;
            default: return null;
        }
    }
}
