package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * The set of available platforms for the OperationApprovalPolicy. Allows configuration of a policy to specific platform(s) for approval. If no specific platform is required or applicable, the platform is `notApplicable`.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum OperationApprovalPolicyPlatform implements ValuedEnum {
    /** Default. Indicates that a policy platform is not required for a chosen policy type. */
    NotApplicable("notApplicable"),
    /** Indicates that the configured policy platform is for Android Device Administrator. */
    AndroidDeviceAdministrator("androidDeviceAdministrator"),
    /** Indicates that the configured policy platform is for Android Enterprise. */
    AndroidEnterprise("androidEnterprise"),
    /** Indicates that the configured policy platform is for iOS/iPadOS. */
    IOSiPadOS("iOSiPadOS"),
    /** Indicates that the configured policy platform is for macOS. */
    MacOS("macOS"),
    /** Indicates that the configured policy platform is for Windows 10 and later. */
    Windows10AndLater("windows10AndLater"),
    /** Indicates that the configured policy platform is for Windows 8.1 and later. */
    Windows81AndLater("windows81AndLater"),
    /** Indicates that the configured policy platform is for Windows 10X. */
    Windows10X("windows10X"),
    /** Evolvable enumeration sentinel value. Do not use. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    OperationApprovalPolicyPlatform(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static OperationApprovalPolicyPlatform forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notApplicable": return NotApplicable;
            case "androidDeviceAdministrator": return AndroidDeviceAdministrator;
            case "androidEnterprise": return AndroidEnterprise;
            case "iOSiPadOS": return IOSiPadOS;
            case "macOS": return MacOS;
            case "windows10AndLater": return Windows10AndLater;
            case "windows81AndLater": return Windows81AndLater;
            case "windows10X": return Windows10X;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
