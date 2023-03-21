package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Determine the access level to specific Windows privacy data category. */
public enum WindowsPrivacyDataAccessLevel implements ValuedEnum {
    /** No access level specified, no intents. Device may behave either as in UserInControl or ForceAllow. It may depend on the privacy data been accessed, Windows versions and other factors. */
    NotConfigured("notConfigured"),
    /** Apps will be allowed to access the specified privacy data. */
    ForceAllow("forceAllow"),
    /** Apps will be denied to access specified privacy data. */
    ForceDeny("forceDeny"),
    /** Users will be prompted when apps try to access specified privacy data. */
    UserInControl("userInControl");
    public final String value;
    WindowsPrivacyDataAccessLevel(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static WindowsPrivacyDataAccessLevel forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notConfigured": return NotConfigured;
            case "forceAllow": return ForceAllow;
            case "forceDeny": return ForceDeny;
            case "userInControl": return UserInControl;
            default: return null;
        }
    }
}
