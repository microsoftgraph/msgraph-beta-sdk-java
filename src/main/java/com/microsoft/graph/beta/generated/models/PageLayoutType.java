package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum PageLayoutType implements ValuedEnum {
    MicrosoftReserved("microsoftReserved"),
    Article("article"),
    Home("home"),
    UnknownFutureValue("unknownFutureValue"),
    NewsLink("newsLink"),
    VideoNewsLink("videoNewsLink");
    public final String value;
    PageLayoutType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static PageLayoutType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "microsoftReserved": return MicrosoftReserved;
            case "article": return Article;
            case "home": return Home;
            case "unknownFutureValue": return UnknownFutureValue;
            case "newsLink": return NewsLink;
            case "videoNewsLink": return VideoNewsLink;
            default: return null;
        }
    }
}
