package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Tenant mobile device management subscriptions.
 */
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
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static DeviceManagementSubscriptions forValue(@jakarta.annotation.Nonnull final String searchValue) {
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
