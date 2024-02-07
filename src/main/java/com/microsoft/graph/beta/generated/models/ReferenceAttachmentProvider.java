package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ReferenceAttachmentProvider implements ValuedEnum {
    Other("other"),
    OneDriveBusiness("oneDriveBusiness"),
    OneDriveConsumer("oneDriveConsumer"),
    Dropbox("dropbox");
    public final String value;
    ReferenceAttachmentProvider(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ReferenceAttachmentProvider forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "other": return Other;
            case "oneDriveBusiness": return OneDriveBusiness;
            case "oneDriveConsumer": return OneDriveConsumer;
            case "dropbox": return Dropbox;
            default: return null;
        }
    }
}
