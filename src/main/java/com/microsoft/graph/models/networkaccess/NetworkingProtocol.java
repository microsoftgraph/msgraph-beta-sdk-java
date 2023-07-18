package com.microsoft.graph.models.networkaccess;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum NetworkingProtocol implements ValuedEnum {
    Ip("ip"),
    Icmp("icmp"),
    Igmp("igmp"),
    Ggp("ggp"),
    Ipv4("ipv4"),
    Tcp("tcp"),
    Pup("pup"),
    Udp("udp"),
    Idp("idp"),
    Ipv6("ipv6"),
    Ipv6RoutingHeader("ipv6RoutingHeader"),
    Ipv6FragmentHeader("ipv6FragmentHeader"),
    IpSecEncapsulatingSecurityPayload("ipSecEncapsulatingSecurityPayload"),
    IpSecAuthenticationHeader("ipSecAuthenticationHeader"),
    IcmpV6("icmpV6"),
    Ipv6NoNextHeader("ipv6NoNextHeader"),
    Ipv6DestinationOptions("ipv6DestinationOptions"),
    Nd("nd"),
    Ipx("ipx"),
    Raw("raw"),
    Spx("spx"),
    SpxII("spxII"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    NetworkingProtocol(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static NetworkingProtocol forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "ip": return Ip;
            case "icmp": return Icmp;
            case "igmp": return Igmp;
            case "ggp": return Ggp;
            case "ipv4": return Ipv4;
            case "tcp": return Tcp;
            case "pup": return Pup;
            case "udp": return Udp;
            case "idp": return Idp;
            case "ipv6": return Ipv6;
            case "ipv6RoutingHeader": return Ipv6RoutingHeader;
            case "ipv6FragmentHeader": return Ipv6FragmentHeader;
            case "ipSecEncapsulatingSecurityPayload": return IpSecEncapsulatingSecurityPayload;
            case "ipSecAuthenticationHeader": return IpSecAuthenticationHeader;
            case "icmpV6": return IcmpV6;
            case "ipv6NoNextHeader": return Ipv6NoNextHeader;
            case "ipv6DestinationOptions": return Ipv6DestinationOptions;
            case "nd": return Nd;
            case "ipx": return Ipx;
            case "raw": return Raw;
            case "spx": return Spx;
            case "spxII": return SpxII;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
