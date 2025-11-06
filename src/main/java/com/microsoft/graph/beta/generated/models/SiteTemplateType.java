package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum SiteTemplateType implements ValuedEnum {
    Sitepagepublishing("sitepagepublishing"),
    Group("group"),
    Sts("sts"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    SiteTemplateType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static SiteTemplateType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "sitepagepublishing": return Sitepagepublishing;
            case "group": return Group;
            case "sts": return Sts;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
