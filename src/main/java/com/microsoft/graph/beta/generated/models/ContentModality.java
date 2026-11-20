package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ContentModality implements ValuedEnum {
    Audio("audio"),
    Video("video"),
    Image("image"),
    Text("text"),
    Multimodal("multimodal"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ContentModality(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ContentModality forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "audio": return Audio;
            case "video": return Video;
            case "image": return Image;
            case "text": return Text;
            case "multimodal": return Multimodal;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
