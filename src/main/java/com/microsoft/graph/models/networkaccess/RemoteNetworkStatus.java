package com.microsoft.graph.models.networkaccess;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum RemoteNetworkStatus implements ValuedEnum {
    TunnelDisconnected("tunnelDisconnected"),
    TunnelConnected("tunnelConnected"),
    BgpDisconnected("bgpDisconnected"),
    BgpConnected("bgpConnected"),
    RemoteNetworkAlive("remoteNetworkAlive"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    RemoteNetworkStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static RemoteNetworkStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "tunnelDisconnected": return TunnelDisconnected;
            case "tunnelConnected": return TunnelConnected;
            case "bgpDisconnected": return BgpDisconnected;
            case "bgpConnected": return BgpConnected;
            case "remoteNetworkAlive": return RemoteNetworkAlive;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
