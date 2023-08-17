package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum ComanagementEligibleType implements ValuedEnum {
    Comanaged("comanaged"),
    Eligible("eligible"),
    EligibleButNotAzureAdJoined("eligibleButNotAzureAdJoined"),
    NeedsOsUpdate("needsOsUpdate"),
    Ineligible("ineligible"),
    /** Devices scheduled for Co-Management enrollment */
    ScheduledForEnrollment("scheduledForEnrollment"),
    /** Evolvable enumeration sentinel value. Do not use. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ComanagementEligibleType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ComanagementEligibleType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "comanaged": return Comanaged;
            case "eligible": return Eligible;
            case "eligibleButNotAzureAdJoined": return EligibleButNotAzureAdJoined;
            case "needsOsUpdate": return NeedsOsUpdate;
            case "ineligible": return Ineligible;
            case "scheduledForEnrollment": return ScheduledForEnrollment;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
