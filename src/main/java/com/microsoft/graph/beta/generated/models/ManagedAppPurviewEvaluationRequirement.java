package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Specifies whether Microsoft Purview Data Loss Prevention (DLP) content evaluation is required before data sharing.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ManagedAppPurviewEvaluationRequirement implements ValuedEnum {
    /** Microsoft Purview Data Loss Prevention (DLP) content evaluation is not required. */
    NotRequired("notRequired"),
    /** Microsoft Purview Data Loss Prevention (DLP) content evaluation is required when online; sharing is allowed if the service is unreachable. */
    RequiredWhenOnline("requiredWhenOnline"),
    /** Microsoft Purview Data Loss Prevention (DLP) content evaluation is always required; sharing is blocked if the service is unreachable. */
    Required("required"),
    /** Evolvable enumeration sentinel value. Do not use. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ManagedAppPurviewEvaluationRequirement(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ManagedAppPurviewEvaluationRequirement forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notRequired": return NotRequired;
            case "requiredWhenOnline": return RequiredWhenOnline;
            case "required": return Required;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
