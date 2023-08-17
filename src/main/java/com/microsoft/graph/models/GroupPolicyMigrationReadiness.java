package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Indicates if the Group Policy Object file is covered and ready for Intune migration.
 */
public enum GroupPolicyMigrationReadiness implements ValuedEnum {
    /** No Intune coverage */
    None("none"),
    /** Partial Intune coverage */
    Partial("partial"),
    /** Complete Intune coverage */
    Complete("complete"),
    /** Error when analyzing coverage */
    Error("error"),
    /** No Group Policy settings in GPO */
    NotApplicable("notApplicable");
    public final String value;
    GroupPolicyMigrationReadiness(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static GroupPolicyMigrationReadiness forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "partial": return Partial;
            case "complete": return Complete;
            case "error": return Error;
            case "notApplicable": return NotApplicable;
            default: return null;
        }
    }
}
