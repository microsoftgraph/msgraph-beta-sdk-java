package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Subject Name Format Options for Apple devices.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
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
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AppleSubjectNameFormat forValue(@jakarta.annotation.Nonnull final String searchValue) {
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
