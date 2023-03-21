package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum PageLayoutType implements ValuedEnum {
    MicrosoftReserved("microsoftReserved"),
    Article("article"),
    Home("home"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    PageLayoutType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static PageLayoutType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "microsoftReserved": return MicrosoftReserved;
            case "article": return Article;
            case "home": return Home;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
