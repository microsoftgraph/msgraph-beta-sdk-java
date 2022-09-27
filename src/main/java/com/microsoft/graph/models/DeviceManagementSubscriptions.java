package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of activityStatistics entities. */
public enum DeviceManagementSubscriptions implements ValuedEnum {
    /** None */
    None("none"),
    /** Microsoft Intune Subscription */
    Intune("intune"),
    /** Office365 Subscription */
    Office365("office365"),
    /** Microsoft Intune Premium Subscription */
    IntunePremium("intunePremium"),
    /** Microsoft Intune for Education Subscription */
    Intune_EDU("intune_EDU"),
    /** Microsoft Intune for Small Businesses Subscription */
    Intune_SMB("intune_SMB");
    public final String value;
    DeviceManagementSubscriptions(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static DeviceManagementSubscriptions forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "intune": return Intune;
            case "office365": return Office365;
            case "intunePremium": return IntunePremium;
            case "intune_EDU": return Intune_EDU;
            case "intune_SMB": return Intune_SMB;
            default: return null;
        }
    }
}
