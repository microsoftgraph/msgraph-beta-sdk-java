package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Determines which content caches other content caches will peer with.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum MacOSContentCachingPeerPolicy implements ValuedEnum {
    /** Defaults to peers in local network. */
    NotConfigured("notConfigured"),
    /** Content caches will only peer with caches in their immediate local network. */
    PeersInLocalNetwork("peersInLocalNetwork"),
    /** Content caches will only peer with caches that share the same public IP address. */
    PeersWithSamePublicIpAddress("peersWithSamePublicIpAddress"),
    /** Content caches will use contentCachingPeerFilterRanges and contentCachingPeerListenRanges to determine which caches to peer with. */
    PeersInCustomLocalNetworks("peersInCustomLocalNetworks");
    public final String value;
    MacOSContentCachingPeerPolicy(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static MacOSContentCachingPeerPolicy forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notConfigured": return NotConfigured;
            case "peersInLocalNetwork": return PeersInLocalNetwork;
            case "peersWithSamePublicIpAddress": return PeersWithSamePublicIpAddress;
            case "peersInCustomLocalNetworks": return PeersInCustomLocalNetworks;
            default: return null;
        }
    }
}
