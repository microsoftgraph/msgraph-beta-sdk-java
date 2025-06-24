package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum NotificationRecipientsType implements ValuedEnum {
    None("none"),
    GlobalAdmins("globalAdmins"),
    BackupAdmins("backupAdmins"),
    Custom("custom"),
    AllAdmins("allAdmins"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    NotificationRecipientsType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static NotificationRecipientsType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "globalAdmins": return GlobalAdmins;
            case "backupAdmins": return BackupAdmins;
            case "custom": return Custom;
            case "allAdmins": return AllAdmins;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
