package com.microsoft.graph.beta.models.networkaccess;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum IntentCategory implements ValuedEnum {
    InitialAccess("initialAccess"),
    Persistence("persistence"),
    PrivilegeEscalation("privilegeEscalation"),
    DefenseEvasion("defenseEvasion"),
    CredentialAccess("credentialAccess"),
    Discovery("discovery"),
    LateralMovement("lateralMovement"),
    Execution("execution"),
    Collection("collection"),
    Exfiltration("exfiltration"),
    CommandAndControl("commandAndControl"),
    Impact("impact"),
    ImpairProcessControl("impairProcessControl"),
    InhibitResponseFunction("inhibitResponseFunction"),
    Reconnaissance("reconnaissance"),
    ResourceDevelopment("resourceDevelopment"),
    Evasion("evasion"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    IntentCategory(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static IntentCategory forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "initialAccess": return InitialAccess;
            case "persistence": return Persistence;
            case "privilegeEscalation": return PrivilegeEscalation;
            case "defenseEvasion": return DefenseEvasion;
            case "credentialAccess": return CredentialAccess;
            case "discovery": return Discovery;
            case "lateralMovement": return LateralMovement;
            case "execution": return Execution;
            case "collection": return Collection;
            case "exfiltration": return Exfiltration;
            case "commandAndControl": return CommandAndControl;
            case "impact": return Impact;
            case "impairProcessControl": return ImpairProcessControl;
            case "inhibitResponseFunction": return InhibitResponseFunction;
            case "reconnaissance": return Reconnaissance;
            case "resourceDevelopment": return ResourceDevelopment;
            case "evasion": return Evasion;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
