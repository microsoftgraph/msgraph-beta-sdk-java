package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * A list of possible device assignment item types to execute this action on the managed device. Device assignment item represents existing assigned Intune resource such as application or configuration. Currently supported device assignment item types are Application, DeviceConfiguration, DeviceManagementConfigurationPolicy and MobileAppConfiguration
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum DeviceAssignmentItemType implements ValuedEnum {
    /** Default. Indicates that the device assignment item type for the action is graph.mobileApp. Application is uninstalled on removal and installed back on restoration */
    Application("application"),
    /** Indicates that the device assignment item type for the action is graph.deviceConfiguration. DeviceConfiguration associated settings are removed on removal and added back on restoration */
    DeviceConfiguration("deviceConfiguration"),
    /** Indicates that the device assignment item type for the action is graph.deviceManagementConfigurationPolicy. DeviceManagementConfigurationPolicy associated settings are removed on removal and added back on restoration */
    DeviceManagementConfigurationPolicy("deviceManagementConfigurationPolicy"),
    /** Indicates that the device assignment item type for the action is `graph.managedDeviceMobileAppConfiguration`. MobileAppConfiguration associated settings are removed on removal and added back on restoration */
    MobileAppConfiguration("mobileAppConfiguration"),
    /** Evolvable enumeration sentinel value. Do not use. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    DeviceAssignmentItemType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static DeviceAssignmentItemType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "application": return Application;
            case "deviceConfiguration": return DeviceConfiguration;
            case "deviceManagementConfigurationPolicy": return DeviceManagementConfigurationPolicy;
            case "mobileAppConfiguration": return MobileAppConfiguration;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
