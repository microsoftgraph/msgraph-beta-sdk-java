package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum UserDefaultAuthenticationMethodType implements ValuedEnum {
    Push("push"),
    Oath("oath"),
    VoiceMobile("voiceMobile"),
    VoiceAlternateMobile("voiceAlternateMobile"),
    VoiceOffice("voiceOffice"),
    Sms("sms"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    UserDefaultAuthenticationMethodType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static UserDefaultAuthenticationMethodType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "push": return Push;
            case "oath": return Oath;
            case "voiceMobile": return VoiceMobile;
            case "voiceAlternateMobile": return VoiceAlternateMobile;
            case "voiceOffice": return VoiceOffice;
            case "sms": return Sms;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
