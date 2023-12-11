package com.microsoft.graph.beta.models.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum MailboxAssetIdentifier implements ValuedEnum {
    AccountUpn("accountUpn"),
    FileOwnerUpn("fileOwnerUpn"),
    InitiatingProcessAccountUpn("initiatingProcessAccountUpn"),
    LastModifyingAccountUpn("lastModifyingAccountUpn"),
    TargetAccountUpn("targetAccountUpn"),
    SenderFromAddress("senderFromAddress"),
    SenderDisplayName("senderDisplayName"),
    RecipientEmailAddress("recipientEmailAddress"),
    SenderMailFromAddress("senderMailFromAddress"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    MailboxAssetIdentifier(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static MailboxAssetIdentifier forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "accountUpn": return AccountUpn;
            case "fileOwnerUpn": return FileOwnerUpn;
            case "initiatingProcessAccountUpn": return InitiatingProcessAccountUpn;
            case "lastModifyingAccountUpn": return LastModifyingAccountUpn;
            case "targetAccountUpn": return TargetAccountUpn;
            case "senderFromAddress": return SenderFromAddress;
            case "senderDisplayName": return SenderDisplayName;
            case "recipientEmailAddress": return RecipientEmailAddress;
            case "senderMailFromAddress": return SenderMailFromAddress;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
