package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * The supported authorization types for invoking the Agent2Agent server.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum A2aAuthorizationType implements ValuedEnum {
    None("none"),
    OAuthPluginVault("oAuthPluginVault"),
    ApiKeyPluginVault("apiKeyPluginVault"),
    DynamicClientRegistration("dynamicClientRegistration"),
    ConnectionVault("connectionVault"),
    /** A marker value for members added after the release of this API. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    A2aAuthorizationType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static A2aAuthorizationType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "oAuthPluginVault": return OAuthPluginVault;
            case "apiKeyPluginVault": return ApiKeyPluginVault;
            case "dynamicClientRegistration": return DynamicClientRegistration;
            case "connectionVault": return ConnectionVault;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
