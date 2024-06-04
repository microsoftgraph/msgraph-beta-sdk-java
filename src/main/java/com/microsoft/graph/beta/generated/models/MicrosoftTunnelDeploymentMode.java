package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * The available deployment modes for a managed Tunnel server. The deployment mode is determined during the deployment depending on the Tunnel containers, namely standalone or as part of a pod, and whether the containers are running in rootful or rootless mode.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum MicrosoftTunnelDeploymentMode implements ValuedEnum {
    /** Default. Indicates that the Tunnel containers are deployed standalone and in rootful mode. */
    StandaloneRootful("standaloneRootful"),
    /** Indicates that the Tunnel containers are deployed standalone and in rootless mode. */
    StandaloneRootless("standaloneRootless"),
    /** Indicates that the Tunnel containers are deployed as part of a pod and in rootful mode. */
    PodRootful("podRootful"),
    /** Indicates that the Tunnel containers are deployed as part of a pod and in rootless mode. */
    PodRootless("podRootless"),
    /** Evolvable enumeration sentinel value. Do not use. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    MicrosoftTunnelDeploymentMode(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static MicrosoftTunnelDeploymentMode forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "standaloneRootful": return StandaloneRootful;
            case "standaloneRootless": return StandaloneRootless;
            case "podRootful": return PodRootful;
            case "podRootless": return PodRootless;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
