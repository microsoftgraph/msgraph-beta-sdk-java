package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum SignInIdentifierType implements ValuedEnum {
    UserPrincipalName("userPrincipalName"),
    PhoneNumber("phoneNumber"),
    ProxyAddress("proxyAddress"),
    QrCode("qrCode"),
    OnPremisesUserPrincipalName("onPremisesUserPrincipalName"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    SignInIdentifierType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static SignInIdentifierType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "userPrincipalName": return UserPrincipalName;
            case "phoneNumber": return PhoneNumber;
            case "proxyAddress": return ProxyAddress;
            case "qrCode": return QrCode;
            case "onPremisesUserPrincipalName": return OnPremisesUserPrincipalName;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
