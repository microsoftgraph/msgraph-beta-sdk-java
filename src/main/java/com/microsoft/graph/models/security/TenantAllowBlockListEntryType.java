package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

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
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static TenantAllowBlockListEntryType forValue(@javax.annotation.Nonnull final String searchValue) {
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
