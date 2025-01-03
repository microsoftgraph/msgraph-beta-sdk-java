package com.microsoft.graph.beta.models.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
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
    UnknownFutureValue("unknownFutureValue"),
    WillNotifyOnceDone("willNotifyOnceDone"),
    CheckUserReportedSettings("checkUserReportedSettings"),
    PartOfEducationCampaign("partOfEducationCampaign"),
    AllowedByAdvancedDelivery("allowedByAdvancedDelivery"),
    AllowedByEnhancedFiltering("allowedByEnhancedFiltering"),
    ItemDeleted("itemDeleted"),
    ItemFoundClean("itemFoundClean"),
    ItemFoundMalicious("itemFoundMalicious"),
    UnableToMakeDecision("unableToMakeDecision"),
    DomainResembledYourOrganization("domainResembledYourOrganization"),
    EndUserBeingImpersonated("endUserBeingImpersonated"),
    AssociatedWithBrand("associatedWithBrand"),
    SenderFailedAuthentication("senderFailedAuthentication"),
    EndUserBeingSpoofed("endUserBeingSpoofed"),
    ItemFoundBulk("itemFoundBulk"),
    ItemNotReceivedByService("itemNotReceivedByService"),
    ItemFoundSpam("itemFoundSpam");
    public final String value;
    SubmissionResultDetail(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static SubmissionResultDetail forValue(@jakarta.annotation.Nonnull final String searchValue) {
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
            case "willNotifyOnceDone": return WillNotifyOnceDone;
            case "checkUserReportedSettings": return CheckUserReportedSettings;
            case "partOfEducationCampaign": return PartOfEducationCampaign;
            case "allowedByAdvancedDelivery": return AllowedByAdvancedDelivery;
            case "allowedByEnhancedFiltering": return AllowedByEnhancedFiltering;
            case "itemDeleted": return ItemDeleted;
            case "itemFoundClean": return ItemFoundClean;
            case "itemFoundMalicious": return ItemFoundMalicious;
            case "unableToMakeDecision": return UnableToMakeDecision;
            case "domainResembledYourOrganization": return DomainResembledYourOrganization;
            case "endUserBeingImpersonated": return EndUserBeingImpersonated;
            case "associatedWithBrand": return AssociatedWithBrand;
            case "senderFailedAuthentication": return SenderFailedAuthentication;
            case "endUserBeingSpoofed": return EndUserBeingSpoofed;
            case "itemFoundBulk": return ItemFoundBulk;
            case "itemNotReceivedByService": return ItemNotReceivedByService;
            case "itemFoundSpam": return ItemFoundSpam;
            default: return null;
        }
    }
}
