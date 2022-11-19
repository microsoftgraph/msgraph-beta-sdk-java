package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReviewDecision entities. */
public enum RoleSummaryStatus implements ValuedEnum {
    Ok("ok"),
    Bad("bad");
    public final String value;
    RoleSummaryStatus(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static RoleSummaryStatus forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "ok": return Ok;
            case "bad": return Bad;
            default: return null;
        }
    }
}
