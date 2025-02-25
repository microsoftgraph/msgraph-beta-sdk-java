package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * An enum representing possible values for delegated app scope.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AndroidDeviceOwnerDelegatedAppScopeType implements ValuedEnum {
    /** Unspecified; this value defaults to DELEGATED_SCOPE_UNSPECIFIED. */
    Unspecified("unspecified"),
    /** Specifies that the admin has given app permission to install and manage certificates on device. */
    CertificateInstall("certificateInstall"),
    /** Specifies that the admin has given app permission to capture network activity logs on device. More info on Network activity logs: https://developer.android.com/work/dpc/logging  */
    CaptureNetworkActivityLog("captureNetworkActivityLog"),
    /** Specified that the admin has given permission to capture security logs on device. More info on Security logs: https://developer.android.com/work/dpc/security#log_enterprise_device_activity */
    CaptureSecurityLog("captureSecurityLog"),
    /** Evolvable enumeration sentinel value. Do not use. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    AndroidDeviceOwnerDelegatedAppScopeType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AndroidDeviceOwnerDelegatedAppScopeType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unspecified": return Unspecified;
            case "certificateInstall": return CertificateInstall;
            case "captureNetworkActivityLog": return CaptureNetworkActivityLog;
            case "captureSecurityLog": return CaptureSecurityLog;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
