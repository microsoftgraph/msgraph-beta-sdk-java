package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of activityStatistics entities. */
public enum AppleSubjectNameFormat implements ValuedEnum {
    /** Common name. */
    CommonName("commonName"),
    /** Common name as email. */
    CommonNameAsEmail("commonNameAsEmail"),
    /** Custom subject name format. */
    Custom("custom"),
    /** Common Name Including Email. */
    CommonNameIncludingEmail("commonNameIncludingEmail"),
    /** Common Name As IMEI. */
    CommonNameAsIMEI("commonNameAsIMEI"),
    /** Common Name As Serial Number. */
    CommonNameAsSerialNumber("commonNameAsSerialNumber");
    public final String value;
    AppleSubjectNameFormat(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static AppleSubjectNameFormat forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "commonName": return CommonName;
            case "commonNameAsEmail": return CommonNameAsEmail;
            case "custom": return Custom;
            case "commonNameIncludingEmail": return CommonNameIncludingEmail;
            case "commonNameAsIMEI": return CommonNameAsIMEI;
            case "commonNameAsSerialNumber": return CommonNameAsSerialNumber;
            default: return null;
        }
    }
}
