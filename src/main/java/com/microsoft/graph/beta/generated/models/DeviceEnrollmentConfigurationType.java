package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Describes the TemplateFamily for the Template entity
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum DeviceEnrollmentConfigurationType implements ValuedEnum {
    /** Default. Set to unknown if the configuration type cannot be determined. */
    Unknown("unknown"),
    /** Indicates that configuration is of type limit which refers to number of devices a user is allowed to enroll. */
    Limit("limit"),
    /** Indicates that configuration is of type platform restriction which refers to types of devices a user is allowed to enroll. */
    PlatformRestrictions("platformRestrictions"),
    /** Indicates that configuration is of type Windows Hello which refers to authentication method devices would use. */
    WindowsHelloForBusiness("windowsHelloForBusiness"),
    /** Indicates that configuration is of type default limit which refers to types of devices a user is allowed to enroll by default. */
    DefaultLimit("defaultLimit"),
    /** Indicates that configuration is of type default platform restriction which refers to types of devices a user is allowed to enroll by default. */
    DefaultPlatformRestrictions("defaultPlatformRestrictions"),
    /** Indicates that configuration is of type default Windows Hello which refers to authentication method devices would use by default. */
    DefaultWindowsHelloForBusiness("defaultWindowsHelloForBusiness"),
    /** Indicates that configuration is of type default Enrollment status page which refers to startup page displayed during OOBE in Autopilot devices by default. */
    DefaultWindows10EnrollmentCompletionPageConfiguration("defaultWindows10EnrollmentCompletionPageConfiguration"),
    /** Indicates that configuration is of type Enrollment status page which refers to startup page displayed during OOBE in Autopilot devices. */
    Windows10EnrollmentCompletionPageConfiguration("windows10EnrollmentCompletionPageConfiguration"),
    /** Indicates that configuration is of type Comanagement Authority which refers to policies applied to Co-Managed devices. */
    DeviceComanagementAuthorityConfiguration("deviceComanagementAuthorityConfiguration"),
    /** Indicates that configuration is of type single platform restriction which refers to types of devices a user is allowed to enroll. */
    SinglePlatformRestriction("singlePlatformRestriction"),
    /** Evolvable enumeration sentinel value. Do not use. */
    UnknownFutureValue("unknownFutureValue"),
    /** Indicates that configuration is of type Enrollment Notification which refers to types of notification a user receives during enrollment. */
    EnrollmentNotificationsConfiguration("enrollmentNotificationsConfiguration"),
    /** Indicates the configuration is of type Windows Restore which refers to the tenant level Windows Backup and Restore settings a user receives during out-of-box experience (OOBE) Windows enrollment */
    WindowsRestore("windowsRestore");
    public final String value;
    DeviceEnrollmentConfigurationType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static DeviceEnrollmentConfigurationType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "limit": return Limit;
            case "platformRestrictions": return PlatformRestrictions;
            case "windowsHelloForBusiness": return WindowsHelloForBusiness;
            case "defaultLimit": return DefaultLimit;
            case "defaultPlatformRestrictions": return DefaultPlatformRestrictions;
            case "defaultWindowsHelloForBusiness": return DefaultWindowsHelloForBusiness;
            case "defaultWindows10EnrollmentCompletionPageConfiguration": return DefaultWindows10EnrollmentCompletionPageConfiguration;
            case "windows10EnrollmentCompletionPageConfiguration": return Windows10EnrollmentCompletionPageConfiguration;
            case "deviceComanagementAuthorityConfiguration": return DeviceComanagementAuthorityConfiguration;
            case "singlePlatformRestriction": return SinglePlatformRestriction;
            case "unknownFutureValue": return UnknownFutureValue;
            case "enrollmentNotificationsConfiguration": return EnrollmentNotificationsConfiguration;
            case "windowsRestore": return WindowsRestore;
            default: return null;
        }
    }
}
