package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReview entities. */
public enum UserMailboxSetting implements ValuedEnum {
    None("none"),
    JunkMailDeletion("junkMailDeletion"),
    IsFromAddressInAddressBook("isFromAddressInAddressBook"),
    IsFromAddressInAddressSafeList("isFromAddressInAddressSafeList"),
    IsFromAddressInAddressBlockList("isFromAddressInAddressBlockList"),
    IsFromAddressInAddressImplicitSafeList("isFromAddressInAddressImplicitSafeList"),
    IsFromAddressInAddressImplicitJunkList("isFromAddressInAddressImplicitJunkList"),
    IsFromDomainInDomainSafeList("isFromDomainInDomainSafeList"),
    IsFromDomainInDomainBlockList("isFromDomainInDomainBlockList"),
    IsRecipientInRecipientSafeList("isRecipientInRecipientSafeList"),
    CustomRule("customRule"),
    JunkMailRule("junkMailRule"),
    SenderPraPresent("senderPraPresent"),
    FromFirstTimeSender("fromFirstTimeSender"),
    Exclusive("exclusive"),
    PriorSeenPass("priorSeenPass"),
    SenderAuthenticationSucceeded("senderAuthenticationSucceeded"),
    IsJunkMailRuleEnabled("isJunkMailRuleEnabled"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    UserMailboxSetting(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static UserMailboxSetting forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "junkMailDeletion": return JunkMailDeletion;
            case "isFromAddressInAddressBook": return IsFromAddressInAddressBook;
            case "isFromAddressInAddressSafeList": return IsFromAddressInAddressSafeList;
            case "isFromAddressInAddressBlockList": return IsFromAddressInAddressBlockList;
            case "isFromAddressInAddressImplicitSafeList": return IsFromAddressInAddressImplicitSafeList;
            case "isFromAddressInAddressImplicitJunkList": return IsFromAddressInAddressImplicitJunkList;
            case "isFromDomainInDomainSafeList": return IsFromDomainInDomainSafeList;
            case "isFromDomainInDomainBlockList": return IsFromDomainInDomainBlockList;
            case "isRecipientInRecipientSafeList": return IsRecipientInRecipientSafeList;
            case "customRule": return CustomRule;
            case "junkMailRule": return JunkMailRule;
            case "senderPraPresent": return SenderPraPresent;
            case "fromFirstTimeSender": return FromFirstTimeSender;
            case "exclusive": return Exclusive;
            case "priorSeenPass": return PriorSeenPass;
            case "senderAuthenticationSucceeded": return SenderAuthenticationSucceeded;
            case "isJunkMailRuleEnabled": return IsJunkMailRuleEnabled;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
