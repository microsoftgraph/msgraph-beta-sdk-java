package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * An enum representing possible values for cross profile data sharing.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AndroidDeviceOwnerCrossProfileDataSharing implements ValuedEnum {
    /** Not configured; this value defaults to CROSS_PROFILE_DATA_SHARING_UNSPECIFIED. */
    NotConfigured("notConfigured"),
    /** Data cannot be shared from both the personal profile to work profile and the work profile to the personal profile. */
    CrossProfileDataSharingBlocked("crossProfileDataSharingBlocked"),
    /** Prevents users from sharing data from the work profile to apps in the personal profile. Personal data can be shared with work apps. */
    DataSharingFromWorkToPersonalBlocked("dataSharingFromWorkToPersonalBlocked"),
    /** Data from either profile can be shared with the other profile. */
    CrossProfileDataSharingAllowed("crossProfileDataSharingAllowed"),
    /** Unknown future value (reserved, not used right now) */
    UnkownFutureValue("unkownFutureValue");
    public final String value;
    AndroidDeviceOwnerCrossProfileDataSharing(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AndroidDeviceOwnerCrossProfileDataSharing forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notConfigured": return NotConfigured;
            case "crossProfileDataSharingBlocked": return CrossProfileDataSharingBlocked;
            case "dataSharingFromWorkToPersonalBlocked": return DataSharingFromWorkToPersonalBlocked;
            case "crossProfileDataSharingAllowed": return CrossProfileDataSharingAllowed;
            case "unkownFutureValue": return UnkownFutureValue;
            default: return null;
        }
    }
}
