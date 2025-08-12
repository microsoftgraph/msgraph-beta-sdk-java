package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum CloudPcCloudAppStatus implements ValuedEnum {
    Preparing("preparing"),
    Ready("ready"),
    Publishing("publishing"),
    Published("published"),
    Unpublishing("unpublishing"),
    Failed("failed"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    CloudPcCloudAppStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static CloudPcCloudAppStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "preparing": return Preparing;
            case "ready": return Ready;
            case "publishing": return Publishing;
            case "published": return Published;
            case "unpublishing": return Unpublishing;
            case "failed": return Failed;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
