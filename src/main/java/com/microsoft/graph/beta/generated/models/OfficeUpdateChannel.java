package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * The Enum to specify the Office365 Updates Channel.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum OfficeUpdateChannel implements ValuedEnum {
    None("none"),
    Current("current"),
    Deferred("deferred"),
    FirstReleaseCurrent("firstReleaseCurrent"),
    FirstReleaseDeferred("firstReleaseDeferred"),
    MonthlyEnterprise("monthlyEnterprise");
    public final String value;
    OfficeUpdateChannel(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static OfficeUpdateChannel forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "current": return Current;
            case "deferred": return Deferred;
            case "firstReleaseCurrent": return FirstReleaseCurrent;
            case "firstReleaseDeferred": return FirstReleaseDeferred;
            case "monthlyEnterprise": return MonthlyEnterprise;
            default: return null;
        }
    }
}
