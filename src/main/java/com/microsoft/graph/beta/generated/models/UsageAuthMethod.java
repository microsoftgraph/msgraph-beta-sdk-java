package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum UsageAuthMethod implements ValuedEnum {
    Email("email"),
    MobileSMS("mobileSMS"),
    MobileCall("mobileCall"),
    OfficePhone("officePhone"),
    SecurityQuestion("securityQuestion"),
    AppNotification("appNotification"),
    AppCode("appCode"),
    AlternateMobileCall("alternateMobileCall"),
    Fido("fido"),
    AppPassword("appPassword"),
    UnknownFutureValue("unknownFutureValue"),
    ExternalAuthMethod("externalAuthMethod"),
    HardwareOneTimePasscode("hardwareOneTimePasscode"),
    WindowsHelloForBusiness("windowsHelloForBusiness"),
    MicrosoftAuthenticatorPasswordless("microsoftAuthenticatorPasswordless"),
    TemporaryAccessPass("temporaryAccessPass"),
    MacOsSecureEnclaveKey("macOsSecureEnclaveKey"),
    PassKeyDeviceBound("passKeyDeviceBound"),
    PassKeyDeviceBoundAuthenticator("passKeyDeviceBoundAuthenticator"),
    PassKeyDeviceBoundWindowsHello("passKeyDeviceBoundWindowsHello"),
    SoftwareOneTimePasscode("softwareOneTimePasscode"),
    MicrosoftAuthenticatorPush("microsoftAuthenticatorPush"),
    MobilePhone("mobilePhone"),
    Sms("sms"),
    AlternateMobilePhone("alternateMobilePhone"),
    Fido2SecurityKey("fido2SecurityKey"),
    OneTimePasscode("oneTimePasscode"),
    PassKeySynced("passKeySynced");
    public final String value;
    UsageAuthMethod(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static UsageAuthMethod forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "email": return Email;
            case "mobileSMS": return MobileSMS;
            case "mobileCall": return MobileCall;
            case "officePhone": return OfficePhone;
            case "securityQuestion": return SecurityQuestion;
            case "appNotification": return AppNotification;
            case "appCode": return AppCode;
            case "alternateMobileCall": return AlternateMobileCall;
            case "fido": return Fido;
            case "appPassword": return AppPassword;
            case "unknownFutureValue": return UnknownFutureValue;
            case "externalAuthMethod": return ExternalAuthMethod;
            case "hardwareOneTimePasscode": return HardwareOneTimePasscode;
            case "windowsHelloForBusiness": return WindowsHelloForBusiness;
            case "microsoftAuthenticatorPasswordless": return MicrosoftAuthenticatorPasswordless;
            case "temporaryAccessPass": return TemporaryAccessPass;
            case "macOsSecureEnclaveKey": return MacOsSecureEnclaveKey;
            case "passKeyDeviceBound": return PassKeyDeviceBound;
            case "passKeyDeviceBoundAuthenticator": return PassKeyDeviceBoundAuthenticator;
            case "passKeyDeviceBoundWindowsHello": return PassKeyDeviceBoundWindowsHello;
            case "softwareOneTimePasscode": return SoftwareOneTimePasscode;
            case "microsoftAuthenticatorPush": return MicrosoftAuthenticatorPush;
            case "mobilePhone": return MobilePhone;
            case "sms": return Sms;
            case "alternateMobilePhone": return AlternateMobilePhone;
            case "fido2SecurityKey": return Fido2SecurityKey;
            case "oneTimePasscode": return OneTimePasscode;
            case "passKeySynced": return PassKeySynced;
            default: return null;
        }
    }
}
