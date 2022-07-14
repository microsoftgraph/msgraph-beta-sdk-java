package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReview entities. */
public enum CertificateRevocationStatus implements ValuedEnum {
    /** Not revoked. */
    None("none"),
    /** Revocation pending. */
    Pending("pending"),
    /** Revocation command issued. */
    Issued("issued"),
    /** Revocation failed. */
    Failed("failed"),
    /** Revoked. */
    Revoked("revoked");
    public final String value;
    CertificateRevocationStatus(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static CertificateRevocationStatus forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "pending": return Pending;
            case "issued": return Issued;
            case "failed": return Failed;
            case "revoked": return Revoked;
            default: return null;
        }
    }
}
