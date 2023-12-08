package com.microsoft.graph.beta.models.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum TenantAllowBlockListEntryType implements ValuedEnum {
    Url("url"),
    FileHash("fileHash"),
    Sender("sender"),
    Recipient("recipient"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    TenantAllowBlockListEntryType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static TenantAllowBlockListEntryType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "url": return Url;
            case "fileHash": return FileHash;
            case "sender": return Sender;
            case "recipient": return Recipient;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
