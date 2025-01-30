package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Setting RiskLevel
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum DeviceManagementConfigurationSettingRiskLevel implements ValuedEnum {
    /** Default. Low Risk Setting */
    Low("low"),
    /** Medium Risk Setting */
    Medium("medium"),
    /** High Risk Setting */
    High("high");
    public final String value;
    DeviceManagementConfigurationSettingRiskLevel(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static DeviceManagementConfigurationSettingRiskLevel forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "low": return Low;
            case "medium": return Medium;
            case "high": return High;
            default: return null;
        }
    }
}
