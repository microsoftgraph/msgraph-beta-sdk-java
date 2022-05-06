package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceManagement singleton.  */
public enum DeviceEnrollmentConfigurationType implements ValuedEnum {
    Unknown("unknown"),
    Limit("limit"),
    PlatformRestrictions("platformRestrictions"),
    WindowsHelloForBusiness("windowsHelloForBusiness"),
    DefaultLimit("defaultLimit"),
    DefaultPlatformRestrictions("defaultPlatformRestrictions"),
    DefaultWindowsHelloForBusiness("defaultWindowsHelloForBusiness"),
    DefaultWindows10EnrollmentCompletionPageConfiguration("defaultWindows10EnrollmentCompletionPageConfiguration"),
    Windows10EnrollmentCompletionPageConfiguration("windows10EnrollmentCompletionPageConfiguration"),
    DeviceComanagementAuthorityConfiguration("deviceComanagementAuthorityConfiguration"),
    SinglePlatformRestriction("singlePlatformRestriction"),
    UnknownFutureValue("unknownFutureValue"),
    EnrollmentNotificationsConfiguration("enrollmentNotificationsConfiguration");
    public final String value;
    DeviceEnrollmentConfigurationType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static DeviceEnrollmentConfigurationType forValue(@javax.annotation.Nonnull final String searchValue) {
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
            default: return null;
        }
    }
}
