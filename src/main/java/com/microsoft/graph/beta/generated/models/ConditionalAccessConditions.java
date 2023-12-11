package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ConditionalAccessConditions implements ValuedEnum {
    None("none"),
    Application("application"),
    Users("users"),
    DevicePlatform("devicePlatform"),
    Location("location"),
    ClientType("clientType"),
    SignInRisk("signInRisk"),
    UserRisk("userRisk"),
    Time("time"),
    DeviceState("deviceState"),
    Client("client"),
    IpAddressSeenByAzureAD("ipAddressSeenByAzureAD"),
    IpAddressSeenByResourceProvider("ipAddressSeenByResourceProvider"),
    UnknownFutureValue("unknownFutureValue"),
    ServicePrincipals("servicePrincipals"),
    ServicePrincipalRisk("servicePrincipalRisk"),
    AuthenticationFlows("authenticationFlows"),
    InsiderRisk("insiderRisk");
    public final String value;
    ConditionalAccessConditions(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ConditionalAccessConditions forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "application": return Application;
            case "users": return Users;
            case "devicePlatform": return DevicePlatform;
            case "location": return Location;
            case "clientType": return ClientType;
            case "signInRisk": return SignInRisk;
            case "userRisk": return UserRisk;
            case "time": return Time;
            case "deviceState": return DeviceState;
            case "client": return Client;
            case "ipAddressSeenByAzureAD": return IpAddressSeenByAzureAD;
            case "ipAddressSeenByResourceProvider": return IpAddressSeenByResourceProvider;
            case "unknownFutureValue": return UnknownFutureValue;
            case "servicePrincipals": return ServicePrincipals;
            case "servicePrincipalRisk": return ServicePrincipalRisk;
            case "authenticationFlows": return AuthenticationFlows;
            case "insiderRisk": return InsiderRisk;
            default: return null;
        }
    }
}
