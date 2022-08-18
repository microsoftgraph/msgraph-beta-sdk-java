package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReviewDecision entities. */
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
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static NonEapAuthenticationMethodForEapTtlsType forValue(@javax.annotation.Nonnull final String searchValue) {
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
