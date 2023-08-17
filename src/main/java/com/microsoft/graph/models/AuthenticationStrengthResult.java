package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum AuthenticationStrengthResult implements ValuedEnum {
    NotSet("notSet"),
    SkippedForProofUp("skippedForProofUp"),
    Satisfied("satisfied"),
    SingleChallengeRequired("singleChallengeRequired"),
    MultipleChallengesRequired("multipleChallengesRequired"),
    SingleRegistrationRequired("singleRegistrationRequired"),
    MultipleRegistrationsRequired("multipleRegistrationsRequired"),
    CannotSatisfyDueToCombinationConfiguration("cannotSatisfyDueToCombinationConfiguration"),
    CannotSatisfy("cannotSatisfy"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    AuthenticationStrengthResult(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AuthenticationStrengthResult forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notSet": return NotSet;
            case "skippedForProofUp": return SkippedForProofUp;
            case "satisfied": return Satisfied;
            case "singleChallengeRequired": return SingleChallengeRequired;
            case "multipleChallengesRequired": return MultipleChallengesRequired;
            case "singleRegistrationRequired": return SingleRegistrationRequired;
            case "multipleRegistrationsRequired": return MultipleRegistrationsRequired;
            case "cannotSatisfyDueToCombinationConfiguration": return CannotSatisfyDueToCombinationConfiguration;
            case "cannotSatisfy": return CannotSatisfy;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
