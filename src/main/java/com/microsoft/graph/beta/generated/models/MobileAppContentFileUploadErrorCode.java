package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Optional error codes that can be provided when uploadState of mobileAppContentFile is indicating an error.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum MobileAppContentFileUploadErrorCode implements ValuedEnum {
    ApkIsInvalid("apkIsInvalid"),
    ApkIsMissingSignerCertificates("apkIsMissingSignerCertificates"),
    ApkHasInvalidPackageName("apkHasInvalidPackageName"),
    ApkPackageNameMismatch("apkPackageNameMismatch"),
    ApkHasInvalidVersionCode("apkHasInvalidVersionCode"),
    ApkHasVersionCodeMismatch("apkHasVersionCodeMismatch"),
    ApkHasInvalidMinSdk("apkHasInvalidMinSdk"),
    ApkMinSdkMismatch("apkMinSdkMismatch"),
    ApkVersionNameMismatch("apkVersionNameMismatch"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    MobileAppContentFileUploadErrorCode(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static MobileAppContentFileUploadErrorCode forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "apkIsInvalid": return ApkIsInvalid;
            case "apkIsMissingSignerCertificates": return ApkIsMissingSignerCertificates;
            case "apkHasInvalidPackageName": return ApkHasInvalidPackageName;
            case "apkPackageNameMismatch": return ApkPackageNameMismatch;
            case "apkHasInvalidVersionCode": return ApkHasInvalidVersionCode;
            case "apkHasVersionCodeMismatch": return ApkHasVersionCodeMismatch;
            case "apkHasInvalidMinSdk": return ApkHasInvalidMinSdk;
            case "apkMinSdkMismatch": return ApkMinSdkMismatch;
            case "apkVersionNameMismatch": return ApkVersionNameMismatch;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
