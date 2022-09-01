package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReviewDecision entities. */
public enum ComanagementEligibleType implements ValuedEnum {
    Comanaged("comanaged"),
    Eligible("eligible"),
    EligibleButNotAzureAdJoined("eligibleButNotAzureAdJoined"),
    NeedsOsUpdate("needsOsUpdate"),
    Ineligible("ineligible"),
    /** Devices scheduled for Co-Management enrollment */
    ScheduledForEnrollment("scheduledForEnrollment");
    public final String value;
    ComanagementEligibleType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ComanagementEligibleType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "comanaged": return Comanaged;
            case "eligible": return Eligible;
            case "eligibleButNotAzureAdJoined": return EligibleButNotAzureAdJoined;
            case "needsOsUpdate": return NeedsOsUpdate;
            case "ineligible": return Ineligible;
            case "scheduledForEnrollment": return ScheduledForEnrollment;
            default: return null;
        }
    }
}
