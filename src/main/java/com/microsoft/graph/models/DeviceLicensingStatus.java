package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReviewDecision entities. */
public enum DeviceLicensingStatus implements ValuedEnum {
    /** Default. Set to unknown when status cannot be determined. */
    Unknown("unknown"),
    /** This status is set when the license refresh is started. */
    LicenseRefreshStarted("licenseRefreshStarted"),
    /** This status is set when the license refresh is pending. */
    LicenseRefreshPending("licenseRefreshPending"),
    /** This status is set when the device is not joined to Azure Active Directory. */
    DeviceIsNotAzureActiveDirectoryJoined("deviceIsNotAzureActiveDirectoryJoined"),
    /** This status is set when the Microsoft device identity is being verified. */
    VerifyingMicrosoftDeviceIdentity("verifyingMicrosoftDeviceIdentity"),
    /** This status is set when the Microsoft device identity verification fails. */
    DeviceIdentityVerificationFailed("deviceIdentityVerificationFailed"),
    /** This status is set when the Microsoft account identity is being verified. */
    VerifyingMirosoftAccountIdentity("verifyingMirosoftAccountIdentity"),
    /** This status is set when the Microsoft account identity verification fails. */
    MirosoftAccountVerificationFailed("mirosoftAccountVerificationFailed"),
    /** This status is set when the device license is being acquired. */
    AcquiringDeviceLicense("acquiringDeviceLicense"),
    /** This status is set when the device license is being refreshed. */
    RefreshingDeviceLicense("refreshingDeviceLicense"),
    /** This status is set when the device license refresh succeeds. */
    DeviceLicenseRefreshSucceed("deviceLicenseRefreshSucceed"),
    /** This status is set when the device license refresh fails. */
    DeviceLicenseRefreshFailed("deviceLicenseRefreshFailed"),
    /** This status is set when the device license is being removed. */
    RemovingDeviceLicense("removingDeviceLicense"),
    /** This status is set when the device license removing succeeds. */
    DeviceLicenseRemoveSucceed("deviceLicenseRemoveSucceed"),
    /** This status is set when the device license removing fails. */
    DeviceLicenseRemoveFailed("deviceLicenseRemoveFailed"),
    /** This is put here as a place holder for future extension. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    DeviceLicensingStatus(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static DeviceLicensingStatus forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "licenseRefreshStarted": return LicenseRefreshStarted;
            case "licenseRefreshPending": return LicenseRefreshPending;
            case "deviceIsNotAzureActiveDirectoryJoined": return DeviceIsNotAzureActiveDirectoryJoined;
            case "verifyingMicrosoftDeviceIdentity": return VerifyingMicrosoftDeviceIdentity;
            case "deviceIdentityVerificationFailed": return DeviceIdentityVerificationFailed;
            case "verifyingMirosoftAccountIdentity": return VerifyingMirosoftAccountIdentity;
            case "mirosoftAccountVerificationFailed": return MirosoftAccountVerificationFailed;
            case "acquiringDeviceLicense": return AcquiringDeviceLicense;
            case "refreshingDeviceLicense": return RefreshingDeviceLicense;
            case "deviceLicenseRefreshSucceed": return DeviceLicenseRefreshSucceed;
            case "deviceLicenseRefreshFailed": return DeviceLicenseRefreshFailed;
            case "removingDeviceLicense": return RemovingDeviceLicense;
            case "deviceLicenseRemoveSucceed": return DeviceLicenseRemoveSucceed;
            case "deviceLicenseRemoveFailed": return DeviceLicenseRemoveFailed;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
