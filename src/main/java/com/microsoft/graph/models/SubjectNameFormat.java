package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Subject Name Format Options.
 */
public enum SubjectNameFormat implements ValuedEnum {
    /** Common name. */
    CommonName("commonName"),
    /** Common Name Including Email. */
    CommonNameIncludingEmail("commonNameIncludingEmail"),
    /** Common Name As Email. */
    CommonNameAsEmail("commonNameAsEmail"),
    /** Custom subject name format. */
    Custom("custom"),
    /** Common Name As IMEI. */
    CommonNameAsIMEI("commonNameAsIMEI"),
    /** Common Name As Serial Number. */
    CommonNameAsSerialNumber("commonNameAsSerialNumber"),
    /** Common Name As Serial Number. */
    CommonNameAsAadDeviceId("commonNameAsAadDeviceId"),
    /** Common Name As Serial Number. */
    CommonNameAsIntuneDeviceId("commonNameAsIntuneDeviceId"),
    /** Common Name As Serial Number. */
    CommonNameAsDurableDeviceId("commonNameAsDurableDeviceId");
    public final String value;
    SubjectNameFormat(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static SubjectNameFormat forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "commonName": return CommonName;
            case "commonNameIncludingEmail": return CommonNameIncludingEmail;
            case "commonNameAsEmail": return CommonNameAsEmail;
            case "custom": return Custom;
            case "commonNameAsIMEI": return CommonNameAsIMEI;
            case "commonNameAsSerialNumber": return CommonNameAsSerialNumber;
            case "commonNameAsAadDeviceId": return CommonNameAsAadDeviceId;
            case "commonNameAsIntuneDeviceId": return CommonNameAsIntuneDeviceId;
            case "commonNameAsDurableDeviceId": return CommonNameAsDurableDeviceId;
            default: return null;
        }
    }
}
