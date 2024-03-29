package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Domainname source.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum DomainNameSource implements ValuedEnum {
    /** Full domain name. */
    FullDomainName("fullDomainName"),
    /** net bios domain name. */
    NetBiosDomainName("netBiosDomainName");
    public final String value;
    DomainNameSource(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static DomainNameSource forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "fullDomainName": return FullDomainName;
            case "netBiosDomainName": return NetBiosDomainName;
            default: return null;
        }
    }
}
