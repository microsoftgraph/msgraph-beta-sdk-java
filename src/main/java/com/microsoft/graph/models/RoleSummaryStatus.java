package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum RoleSummaryStatus implements ValuedEnum {
    Ok("ok"),
    Bad("bad");
    public final String value;
    RoleSummaryStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static RoleSummaryStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "ok": return Ok;
            case "bad": return Bad;
            default: return null;
        }
    }
}
