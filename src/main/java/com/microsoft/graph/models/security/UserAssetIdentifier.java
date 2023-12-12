package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum UserAssetIdentifier implements ValuedEnum {
    AccountObjectId("accountObjectId"),
    AccountSid("accountSid"),
    AccountUpn("accountUpn"),
    AccountName("accountName"),
    AccountDomain("accountDomain"),
    AccountId("accountId"),
    RequestAccountSid("requestAccountSid"),
    RequestAccountName("requestAccountName"),
    RequestAccountDomain("requestAccountDomain"),
    RecipientObjectId("recipientObjectId"),
    ProcessAccountObjectId("processAccountObjectId"),
    InitiatingAccountSid("initiatingAccountSid"),
    InitiatingProcessAccountUpn("initiatingProcessAccountUpn"),
    InitiatingAccountName("initiatingAccountName"),
    InitiatingAccountDomain("initiatingAccountDomain"),
    ServicePrincipalId("servicePrincipalId"),
    ServicePrincipalName("servicePrincipalName"),
    TargetAccountUpn("targetAccountUpn"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    UserAssetIdentifier(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static UserAssetIdentifier forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "accountObjectId": return AccountObjectId;
            case "accountSid": return AccountSid;
            case "accountUpn": return AccountUpn;
            case "accountName": return AccountName;
            case "accountDomain": return AccountDomain;
            case "accountId": return AccountId;
            case "requestAccountSid": return RequestAccountSid;
            case "requestAccountName": return RequestAccountName;
            case "requestAccountDomain": return RequestAccountDomain;
            case "recipientObjectId": return RecipientObjectId;
            case "processAccountObjectId": return ProcessAccountObjectId;
            case "initiatingAccountSid": return InitiatingAccountSid;
            case "initiatingProcessAccountUpn": return InitiatingProcessAccountUpn;
            case "initiatingAccountName": return InitiatingAccountName;
            case "initiatingAccountDomain": return InitiatingAccountDomain;
            case "servicePrincipalId": return ServicePrincipalId;
            case "servicePrincipalName": return ServicePrincipalName;
            case "targetAccountUpn": return TargetAccountUpn;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
