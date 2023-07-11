package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum PagePromotionType implements ValuedEnum {
    MicrosoftReserved("microsoftReserved"),
    Page("page"),
    NewsPost("newsPost"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    PagePromotionType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static PagePromotionType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "microsoftReserved": return MicrosoftReserved;
            case "page": return Page;
            case "newsPost": return NewsPost;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
