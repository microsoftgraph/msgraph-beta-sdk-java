package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * This enum represents associated assignment payload type
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AssociatedAssignmentPayloadType implements ValuedEnum {
    /** Invalid payload type */
    Unknown("unknown"),
    /** Indicates that this filter is associated with a configuration or compliance policy payload type */
    DeviceConfigurationAndCompliance("deviceConfigurationAndCompliance"),
    /** Indicates that this assignment filter is associated with an application payload type */
    Application("application"),
    /** Indicates that this filter is associated with a Android Enterprise application payload type */
    AndroidEnterpriseApp("androidEnterpriseApp"),
    /** Indicates that this filter is associated with an enrollment restriction or enrollment status page policy payload type */
    EnrollmentConfiguration("enrollmentConfiguration"),
    /** Indicates that this filter is associated with an Administrative Template policy payload type */
    GroupPolicyConfiguration("groupPolicyConfiguration"),
    /** Indicates that this assignment filter is associated with Zero touch deployment Device Configuration Profile payload type */
    ZeroTouchDeploymentDeviceConfigProfile("zeroTouchDeploymentDeviceConfigProfile"),
    /** Indicates that this filter is associated with an Android Enterprise Configuration policy payload type */
    AndroidEnterpriseConfiguration("androidEnterpriseConfiguration"),
    /** Indicates that this assignment filter is associated with Device Firmware Configuration Interface(DCFI) payload type */
    DeviceFirmwareConfigurationInterfacePolicy("deviceFirmwareConfigurationInterfacePolicy"),
    /** Indicates that this filter is associated with a resource access policy (Wifi, VPN, Certificate) payload type */
    ResourceAccessPolicy("resourceAccessPolicy"),
    /** Indicates that this filter is associated with a Win32 app payload type */
    Win32app("win32app"),
    /** Indicates that this filter is associated with a configuration or compliance policy on Device Configuration v2 Infrastructure payload type */
    DeviceManagmentConfigurationAndCompliancePolicy("deviceManagmentConfigurationAndCompliancePolicy"),
    /** Indicates that this filter is associated with Bios Configurations And Other Settings payload type */
    HardwareConfiguration("hardwareConfiguration");
    public final String value;
    AssociatedAssignmentPayloadType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AssociatedAssignmentPayloadType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "deviceConfigurationAndCompliance": return DeviceConfigurationAndCompliance;
            case "application": return Application;
            case "androidEnterpriseApp": return AndroidEnterpriseApp;
            case "enrollmentConfiguration": return EnrollmentConfiguration;
            case "groupPolicyConfiguration": return GroupPolicyConfiguration;
            case "zeroTouchDeploymentDeviceConfigProfile": return ZeroTouchDeploymentDeviceConfigProfile;
            case "androidEnterpriseConfiguration": return AndroidEnterpriseConfiguration;
            case "deviceFirmwareConfigurationInterfacePolicy": return DeviceFirmwareConfigurationInterfacePolicy;
            case "resourceAccessPolicy": return ResourceAccessPolicy;
            case "win32app": return Win32app;
            case "deviceManagmentConfigurationAndCompliancePolicy": return DeviceManagmentConfigurationAndCompliancePolicy;
            case "hardwareConfiguration": return HardwareConfiguration;
            default: return null;
        }
    }
}
