package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum MfaType implements ValuedEnum {
    Eotp("eotp"),
    OneWaySms("oneWaySms"),
    TwoWaySms("twoWaySms"),
    TwoWaySmsOtherMobile("twoWaySmsOtherMobile"),
    PhoneAppNotification("phoneAppNotification"),
    PhoneAppOtp("phoneAppOtp"),
    TwoWayVoiceMobile("twoWayVoiceMobile"),
    TwoWayVoiceOffice("twoWayVoiceOffice"),
    TwoWayVoiceOtherMobile("twoWayVoiceOtherMobile"),
    Fido("fido"),
    Certificate("certificate"),
    Other("other"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    MfaType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static MfaType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "eotp": return Eotp;
            case "oneWaySms": return OneWaySms;
            case "twoWaySms": return TwoWaySms;
            case "twoWaySmsOtherMobile": return TwoWaySmsOtherMobile;
            case "phoneAppNotification": return PhoneAppNotification;
            case "phoneAppOtp": return PhoneAppOtp;
            case "twoWayVoiceMobile": return TwoWayVoiceMobile;
            case "twoWayVoiceOffice": return TwoWayVoiceOffice;
            case "twoWayVoiceOtherMobile": return TwoWayVoiceOtherMobile;
            case "fido": return Fido;
            case "certificate": return Certificate;
            case "other": return Other;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
