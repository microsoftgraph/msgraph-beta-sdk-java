package microsoft.graph.models.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReview entities. */
public enum SubmissionResultCategory implements ValuedEnum {
    NotJunk("notJunk"),
    Spam("spam"),
    Phishing("phishing"),
    Malware("malware"),
    AllowedByPolicy("allowedByPolicy"),
    BlockedByPolicy("blockedByPolicy"),
    Spoof("spoof"),
    Unknown("unknown"),
    NoResultAvailable("noResultAvailable"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    SubmissionResultCategory(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static SubmissionResultCategory forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notJunk": return NotJunk;
            case "spam": return Spam;
            case "phishing": return Phishing;
            case "malware": return Malware;
            case "allowedByPolicy": return AllowedByPolicy;
            case "blockedByPolicy": return BlockedByPolicy;
            case "spoof": return Spoof;
            case "unknown": return Unknown;
            case "noResultAvailable": return NoResultAvailable;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
