package com.microsoft.graph.beta.models.identitygovernance;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum LifecyclePolicyImpactActionType implements ValuedEnum {
    ObjectCoveredByPolicy("objectCoveredByPolicy"),
    AttestationNeededWarning("attestationNeededWarning"),
    AttestationNeededNotificationSent("attestationNeededNotificationSent"),
    DisabledDueToAttestationNonCompliance("disabledDueToAttestationNonCompliance"),
    DeletedDueToAttestationNonCompliance("deletedDueToAttestationNonCompliance"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    LifecyclePolicyImpactActionType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static LifecyclePolicyImpactActionType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "objectCoveredByPolicy": return ObjectCoveredByPolicy;
            case "attestationNeededWarning": return AttestationNeededWarning;
            case "attestationNeededNotificationSent": return AttestationNeededNotificationSent;
            case "disabledDueToAttestationNonCompliance": return DisabledDueToAttestationNonCompliance;
            case "deletedDueToAttestationNonCompliance": return DeletedDueToAttestationNonCompliance;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
