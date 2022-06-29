package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceManagement singleton. */
public enum MacOSContentCachingClientPolicy implements ValuedEnum {
    /** Defaults to clients in local network. */
    NotConfigured("notConfigured"),
    /** Content caches will provide content to devices only in their immediate local network. */
    ClientsInLocalNetwork("clientsInLocalNetwork"),
    /** Content caches will provide content to devices that share the same public IP address. */
    ClientsWithSamePublicIpAddress("clientsWithSamePublicIpAddress"),
    /** Content caches will provide content to devices in contentCachingClientListenRanges. */
    ClientsInCustomLocalNetworks("clientsInCustomLocalNetworks"),
    /** Content caches will provide content to devices in contentCachingClientListenRanges, contentCachingPeerListenRanges, and contentCachingParents. */
    ClientsInCustomLocalNetworksWithFallback("clientsInCustomLocalNetworksWithFallback");
    public final String value;
    MacOSContentCachingClientPolicy(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static MacOSContentCachingClientPolicy forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notConfigured": return NotConfigured;
            case "clientsInLocalNetwork": return ClientsInLocalNetwork;
            case "clientsWithSamePublicIpAddress": return ClientsWithSamePublicIpAddress;
            case "clientsInCustomLocalNetworks": return ClientsInCustomLocalNetworks;
            case "clientsInCustomLocalNetworksWithFallback": return ClientsInCustomLocalNetworksWithFallback;
            default: return null;
        }
    }
}
