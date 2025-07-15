package com.microsoft.graph.beta.models.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum IncidentTaskActionType implements ValuedEnum {
    Text("text"),
    IsolateDevice("isolateDevice"),
    StopAndQuarantineFile("stopAndQuarantineFile"),
    RunAntiVirusScan("runAntiVirusScan"),
    CollectInvestigationPackage("collectInvestigationPackage"),
    RestrictAppExecution("restrictAppExecution"),
    SubmitIocRule("submitIocRule"),
    ForceUserPasswordReset("forceUserPasswordReset"),
    DisableUser("disableUser"),
    MarkUserAsCompromised("markUserAsCompromised"),
    RequireSignIn("requireSignIn"),
    HardDeleteEmail("hardDeleteEmail"),
    SoftDeleteEmail("softDeleteEmail"),
    UnIsolateDevice("unIsolateDevice"),
    UnRestrictAppExecution("unRestrictAppExecution"),
    EnableUser("enableUser"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    IncidentTaskActionType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static IncidentTaskActionType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "text": return Text;
            case "isolateDevice": return IsolateDevice;
            case "stopAndQuarantineFile": return StopAndQuarantineFile;
            case "runAntiVirusScan": return RunAntiVirusScan;
            case "collectInvestigationPackage": return CollectInvestigationPackage;
            case "restrictAppExecution": return RestrictAppExecution;
            case "submitIocRule": return SubmitIocRule;
            case "forceUserPasswordReset": return ForceUserPasswordReset;
            case "disableUser": return DisableUser;
            case "markUserAsCompromised": return MarkUserAsCompromised;
            case "requireSignIn": return RequireSignIn;
            case "hardDeleteEmail": return HardDeleteEmail;
            case "softDeleteEmail": return SoftDeleteEmail;
            case "unIsolateDevice": return UnIsolateDevice;
            case "unRestrictAppExecution": return UnRestrictAppExecution;
            case "enableUser": return EnableUser;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
