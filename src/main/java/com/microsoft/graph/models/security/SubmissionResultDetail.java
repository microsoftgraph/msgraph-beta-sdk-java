package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReviewDecision entities. */
public enum SubmissionResultDetail implements ValuedEnum {
    None("none"),
    UnderInvestigation("underInvestigation"),
    SimulatedThreat("simulatedThreat"),
    AllowedBySecOps("allowedBySecOps"),
    AllowedByThirdPartyFilters("allowedByThirdPartyFilters"),
    MessageNotFound("messageNotFound"),
    UrlFileShouldNotBeBlocked("urlFileShouldNotBeBlocked"),
    UrlFileShouldBeBlocked("urlFileShouldBeBlocked"),
    UrlFileCannotMakeDecision("urlFileCannotMakeDecision"),
    DomainImpersonation("domainImpersonation"),
    UserImpersonation("userImpersonation"),
    BrandImpersonation("brandImpersonation"),
    OutboundShouldNotBeBlocked("outboundShouldNotBeBlocked"),
    OutboundShouldBeBlocked("outboundShouldBeBlocked"),
    OutboundBulk("outboundBulk"),
    OutboundCannotMakeDecision("outboundCannotMakeDecision"),
    OutboundNotRescanned("outboundNotRescanned"),
    ZeroHourAutoPurgeAllowed("zeroHourAutoPurgeAllowed"),
    ZeroHourAutoPurgeBlocked("zeroHourAutoPurgeBlocked"),
    ZeroHourAutoPurgeQuarantineReleased("zeroHourAutoPurgeQuarantineReleased"),
    OnPremisesSkip("onPremisesSkip"),
    AllowedByTenantAllowBlockList("allowedByTenantAllowBlockList"),
    BlockedByTenantAllowBlockList("blockedByTenantAllowBlockList"),
    AllowedUrlByTenantAllowBlockList("allowedUrlByTenantAllowBlockList"),
    AllowedFileByTenantAllowBlockList("allowedFileByTenantAllowBlockList"),
    AllowedSenderByTenantAllowBlockList("allowedSenderByTenantAllowBlockList"),
    AllowedRecipientByTenantAllowBlockList("allowedRecipientByTenantAllowBlockList"),
    BlockedUrlByTenantAllowBlockList("blockedUrlByTenantAllowBlockList"),
    BlockedFileByTenantAllowBlockList("blockedFileByTenantAllowBlockList"),
    BlockedSenderByTenantAllowBlockList("blockedSenderByTenantAllowBlockList"),
    BlockedRecipientByTenantAllowBlockList("blockedRecipientByTenantAllowBlockList"),
    AllowedByConnection("allowedByConnection"),
    BlockedByConnection("blockedByConnection"),
    AllowedByExchangeTransportRule("allowedByExchangeTransportRule"),
    BlockedByExchangeTransportRule("blockedByExchangeTransportRule"),
    QuarantineReleased("quarantineReleased"),
    QuarantineReleasedThenBlocked("quarantineReleasedThenBlocked"),
    JunkMailRuleDisabled("junkMailRuleDisabled"),
    AllowedByUserSetting("allowedByUserSetting"),
    BlockedByUserSetting("blockedByUserSetting"),
    AllowedByTenant("allowedByTenant"),
    BlockedByTenant("blockedByTenant"),
    InvalidFalsePositive("invalidFalsePositive"),
    InvalidFalseNegative("invalidFalseNegative"),
    SpoofBlocked("spoofBlocked"),
    GoodReclassifiedAsBad("goodReclassifiedAsBad"),
    GoodReclassifiedAsBulk("goodReclassifiedAsBulk"),
    GoodReclassifiedAsGood("goodReclassifiedAsGood"),
    GoodReclassifiedAsCannotMakeDecision("goodReclassifiedAsCannotMakeDecision"),
    BadReclassifiedAsGood("badReclassifiedAsGood"),
    BadReclassifiedAsBulk("badReclassifiedAsBulk"),
    BadReclassifiedAsBad("badReclassifiedAsBad"),
    BadReclassifiedAsCannotMakeDecision("badReclassifiedAsCannotMakeDecision"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    SubmissionResultDetail(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static SubmissionResultDetail forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "underInvestigation": return UnderInvestigation;
            case "simulatedThreat": return SimulatedThreat;
            case "allowedBySecOps": return AllowedBySecOps;
            case "allowedByThirdPartyFilters": return AllowedByThirdPartyFilters;
            case "messageNotFound": return MessageNotFound;
            case "urlFileShouldNotBeBlocked": return UrlFileShouldNotBeBlocked;
            case "urlFileShouldBeBlocked": return UrlFileShouldBeBlocked;
            case "urlFileCannotMakeDecision": return UrlFileCannotMakeDecision;
            case "domainImpersonation": return DomainImpersonation;
            case "userImpersonation": return UserImpersonation;
            case "brandImpersonation": return BrandImpersonation;
            case "outboundShouldNotBeBlocked": return OutboundShouldNotBeBlocked;
            case "outboundShouldBeBlocked": return OutboundShouldBeBlocked;
            case "outboundBulk": return OutboundBulk;
            case "outboundCannotMakeDecision": return OutboundCannotMakeDecision;
            case "outboundNotRescanned": return OutboundNotRescanned;
            case "zeroHourAutoPurgeAllowed": return ZeroHourAutoPurgeAllowed;
            case "zeroHourAutoPurgeBlocked": return ZeroHourAutoPurgeBlocked;
            case "zeroHourAutoPurgeQuarantineReleased": return ZeroHourAutoPurgeQuarantineReleased;
            case "onPremisesSkip": return OnPremisesSkip;
            case "allowedByTenantAllowBlockList": return AllowedByTenantAllowBlockList;
            case "blockedByTenantAllowBlockList": return BlockedByTenantAllowBlockList;
            case "allowedUrlByTenantAllowBlockList": return AllowedUrlByTenantAllowBlockList;
            case "allowedFileByTenantAllowBlockList": return AllowedFileByTenantAllowBlockList;
            case "allowedSenderByTenantAllowBlockList": return AllowedSenderByTenantAllowBlockList;
            case "allowedRecipientByTenantAllowBlockList": return AllowedRecipientByTenantAllowBlockList;
            case "blockedUrlByTenantAllowBlockList": return BlockedUrlByTenantAllowBlockList;
            case "blockedFileByTenantAllowBlockList": return BlockedFileByTenantAllowBlockList;
            case "blockedSenderByTenantAllowBlockList": return BlockedSenderByTenantAllowBlockList;
            case "blockedRecipientByTenantAllowBlockList": return BlockedRecipientByTenantAllowBlockList;
            case "allowedByConnection": return AllowedByConnection;
            case "blockedByConnection": return BlockedByConnection;
            case "allowedByExchangeTransportRule": return AllowedByExchangeTransportRule;
            case "blockedByExchangeTransportRule": return BlockedByExchangeTransportRule;
            case "quarantineReleased": return QuarantineReleased;
            case "quarantineReleasedThenBlocked": return QuarantineReleasedThenBlocked;
            case "junkMailRuleDisabled": return JunkMailRuleDisabled;
            case "allowedByUserSetting": return AllowedByUserSetting;
            case "blockedByUserSetting": return BlockedByUserSetting;
            case "allowedByTenant": return AllowedByTenant;
            case "blockedByTenant": return BlockedByTenant;
            case "invalidFalsePositive": return InvalidFalsePositive;
            case "invalidFalseNegative": return InvalidFalseNegative;
            case "spoofBlocked": return SpoofBlocked;
            case "goodReclassifiedAsBad": return GoodReclassifiedAsBad;
            case "goodReclassifiedAsBulk": return GoodReclassifiedAsBulk;
            case "goodReclassifiedAsGood": return GoodReclassifiedAsGood;
            case "goodReclassifiedAsCannotMakeDecision": return GoodReclassifiedAsCannotMakeDecision;
            case "badReclassifiedAsGood": return BadReclassifiedAsGood;
            case "badReclassifiedAsBulk": return BadReclassifiedAsBulk;
            case "badReclassifiedAsBad": return BadReclassifiedAsBad;
            case "badReclassifiedAsCannotMakeDecision": return BadReclassifiedAsCannotMakeDecision;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
