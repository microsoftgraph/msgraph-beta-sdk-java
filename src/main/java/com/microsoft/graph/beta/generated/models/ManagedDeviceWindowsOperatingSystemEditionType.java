package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Windows Operating System is available in different editions, which have a specific set of features available. This enum type defines the corresponding edition.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ManagedDeviceWindowsOperatingSystemEditionType implements ValuedEnum {
    /** Default. Indicates Professional Operating System edition used for the managed device. */
    Professional("professional"),
    /** Indicates Professional N Operating System edition used for the managed device. */
    ProfessionalN("professionalN"),
    /** Indicates Enterprise Operating System edition used for the managed device. */
    Enterprise("enterprise"),
    /** Indicates Enterprise N Operating System edition used for the managed device. */
    EnterpriseN("enterpriseN"),
    /** Indicates Education Operating System edition used for the managed device. */
    Education("education"),
    /** Indicates Education N Operating System edition used for the managed device. */
    EducationN("educationN"),
    /** Indicates Pro Education Operating System edition used for the managed device. */
    ProEducation("proEducation"),
    /** Indicates Pro Education N Operating System edition used for the managed device. */
    ProEducationN("proEducationN"),
    /** Indicates Pro Workstation Operating System edition used for the managed device. */
    ProWorkstation("proWorkstation"),
    /** Indicates Pro Workstation N Operating System edition used for the managed device. */
    ProWorkstationN("proWorkstationN"),
    /** Evolvable enumeration sentinel value. Do not use. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ManagedDeviceWindowsOperatingSystemEditionType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ManagedDeviceWindowsOperatingSystemEditionType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "professional": return Professional;
            case "professionalN": return ProfessionalN;
            case "enterprise": return Enterprise;
            case "enterpriseN": return EnterpriseN;
            case "education": return Education;
            case "educationN": return EducationN;
            case "proEducation": return ProEducation;
            case "proEducationN": return ProEducationN;
            case "proWorkstation": return ProWorkstation;
            case "proWorkstationN": return ProWorkstationN;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
