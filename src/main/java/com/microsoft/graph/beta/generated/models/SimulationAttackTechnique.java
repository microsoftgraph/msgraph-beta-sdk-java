package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum SimulationAttackTechnique implements ValuedEnum {
    Unknown("unknown"),
    CredentialHarvesting("credentialHarvesting"),
    AttachmentMalware("attachmentMalware"),
    DriveByUrl("driveByUrl"),
    LinkInAttachment("linkInAttachment"),
    LinkToMalwareFile("linkToMalwareFile"),
    UnknownFutureValue("unknownFutureValue"),
    OAuthConsentGrant("oAuthConsentGrant");
    public final String value;
    SimulationAttackTechnique(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static SimulationAttackTechnique forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "credentialHarvesting": return CredentialHarvesting;
            case "attachmentMalware": return AttachmentMalware;
            case "driveByUrl": return DriveByUrl;
            case "linkInAttachment": return LinkInAttachment;
            case "linkToMalwareFile": return LinkToMalwareFile;
            case "unknownFutureValue": return UnknownFutureValue;
            case "oAuthConsentGrant": return OAuthConsentGrant;
            default: return null;
        }
    }
}
