package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of activityStatistics entities. */
public enum AndroidDeviceOwnerCertificateAccessType implements ValuedEnum {
    /** Require user approval for all apps */
    UserApproval("userApproval"),
    /** Pre-grant certificate access for specific apps (require user approval for other apps). */
    SpecificApps("specificApps"),
    /** Unknown future value for evolvable enum patterns. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    AndroidDeviceOwnerCertificateAccessType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static AndroidDeviceOwnerCertificateAccessType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "userApproval": return UserApproval;
            case "specificApps": return SpecificApps;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
