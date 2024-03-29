package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum SetupStatus implements ValuedEnum {
    Unknown("unknown"),
    NotRegisteredYet("notRegisteredYet"),
    RegisteredSetupNotStarted("registeredSetupNotStarted"),
    RegisteredSetupInProgress("registeredSetupInProgress"),
    RegistrationAndSetupCompleted("registrationAndSetupCompleted"),
    RegistrationFailed("registrationFailed"),
    RegistrationTimedOut("registrationTimedOut"),
    Disabled("disabled");
    public final String value;
    SetupStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static SetupStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "notRegisteredYet": return NotRegisteredYet;
            case "registeredSetupNotStarted": return RegisteredSetupNotStarted;
            case "registeredSetupInProgress": return RegisteredSetupInProgress;
            case "registrationAndSetupCompleted": return RegistrationAndSetupCompleted;
            case "registrationFailed": return RegistrationFailed;
            case "registrationTimedOut": return RegistrationTimedOut;
            case "disabled": return Disabled;
            default: return null;
        }
    }
}
