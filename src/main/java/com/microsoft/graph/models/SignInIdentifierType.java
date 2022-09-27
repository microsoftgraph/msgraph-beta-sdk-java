package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of activityStatistics entities. */
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
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static SignInIdentifierType forValue(@javax.annotation.Nonnull final String searchValue) {
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
