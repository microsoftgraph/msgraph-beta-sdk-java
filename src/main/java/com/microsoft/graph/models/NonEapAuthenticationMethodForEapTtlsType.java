package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Non-EAP methods for authentication.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum NonEapAuthenticationMethodForEapTtlsType implements ValuedEnum {
    /** Unencrypted password (PAP). */
    UnencryptedPassword("unencryptedPassword"),
    /** Challenge Handshake Authentication Protocol (CHAP). */
    ChallengeHandshakeAuthenticationProtocol("challengeHandshakeAuthenticationProtocol"),
    /**  Microsoft CHAP (MS-CHAP). */
    MicrosoftChap("microsoftChap"),
    /** Microsoft CHAP Version 2 (MS-CHAP v2). */
    MicrosoftChapVersionTwo("microsoftChapVersionTwo");
    public final String value;
    NonEapAuthenticationMethodForEapTtlsType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static NonEapAuthenticationMethodForEapTtlsType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unencryptedPassword": return UnencryptedPassword;
            case "challengeHandshakeAuthenticationProtocol": return ChallengeHandshakeAuthenticationProtocol;
            case "microsoftChap": return MicrosoftChap;
            case "microsoftChapVersionTwo": return MicrosoftChapVersionTwo;
            default: return null;
        }
    }
}
