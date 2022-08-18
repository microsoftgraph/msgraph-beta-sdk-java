package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReviewDecision entities. */
public enum DomainNameSource implements ValuedEnum {
    /** Full domain name. */
    FullDomainName("fullDomainName"),
    /** net bios domain name. */
    NetBiosDomainName("netBiosDomainName");
    public final String value;
    DomainNameSource(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static DomainNameSource forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "fullDomainName": return FullDomainName;
            case "netBiosDomainName": return NetBiosDomainName;
            default: return null;
        }
    }
}
