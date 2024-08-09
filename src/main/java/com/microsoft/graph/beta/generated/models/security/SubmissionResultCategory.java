package com.microsoft.graph.beta.models.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum SubmissionResultCategory implements ValuedEnum {
    NotJunk("notJunk"),
    Spam("spam"),
    Phishing("phishing"),
    Malware("malware"),
    AllowedByPolicy("allowedByPolicy"),
    BlockedByPolicy("blockedByPolicy"),
    Spoof("spoof"),
    Unknown("unknown"),
    NoResultAvailable("noResultAvailable"),
    UnknownFutureValue("unknownFutureValue"),
    BeingAnalyzed("beingAnalyzed"),
    NotSubmittedToMicrosoft("notSubmittedToMicrosoft"),
    PhishingSimulation("phishingSimulation"),
    AllowedDueToOrganizationOverride("allowedDueToOrganizationOverride"),
    BlockedDueToOrganizationOverride("blockedDueToOrganizationOverride"),
    AllowedDueToUserOverride("allowedDueToUserOverride"),
    BlockedDueToUserOverride("blockedDueToUserOverride"),
    ItemNotfound("itemNotfound"),
    ThreatsFound("threatsFound"),
    NoThreatsFound("noThreatsFound"),
    DomainImpersonation("domainImpersonation"),
    UserImpersonation("userImpersonation"),
    BrandImpersonation("brandImpersonation"),
    AuthenticationFailure("authenticationFailure"),
    SpoofedBlocked("spoofedBlocked"),
    SpoofedAllowed("spoofedAllowed"),
    ReasonLostInTransit("reasonLostInTransit"),
    Bulk("bulk");
    public final String value;
    SubmissionResultCategory(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static SubmissionResultCategory forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notJunk": return NotJunk;
            case "spam": return Spam;
            case "phishing": return Phishing;
            case "malware": return Malware;
            case "allowedByPolicy": return AllowedByPolicy;
            case "blockedByPolicy": return BlockedByPolicy;
            case "spoof": return Spoof;
            case "unknown": return Unknown;
            case "noResultAvailable": return NoResultAvailable;
            case "unknownFutureValue": return UnknownFutureValue;
            case "beingAnalyzed": return BeingAnalyzed;
            case "notSubmittedToMicrosoft": return NotSubmittedToMicrosoft;
            case "phishingSimulation": return PhishingSimulation;
            case "allowedDueToOrganizationOverride": return AllowedDueToOrganizationOverride;
            case "blockedDueToOrganizationOverride": return BlockedDueToOrganizationOverride;
            case "allowedDueToUserOverride": return AllowedDueToUserOverride;
            case "blockedDueToUserOverride": return BlockedDueToUserOverride;
            case "itemNotfound": return ItemNotfound;
            case "threatsFound": return ThreatsFound;
            case "noThreatsFound": return NoThreatsFound;
            case "domainImpersonation": return DomainImpersonation;
            case "userImpersonation": return UserImpersonation;
            case "brandImpersonation": return BrandImpersonation;
            case "authenticationFailure": return AuthenticationFailure;
            case "spoofedBlocked": return SpoofedBlocked;
            case "spoofedAllowed": return SpoofedAllowed;
            case "reasonLostInTransit": return ReasonLostInTransit;
            case "bulk": return Bulk;
            default: return null;
        }
    }
}
