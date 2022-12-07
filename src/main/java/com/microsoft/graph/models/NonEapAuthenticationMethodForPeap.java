package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of activityStatistics entities. */
public enum NonEapAuthenticationMethodForPeap implements ValuedEnum {
    /** None. */
    None("none"),
    /** Microsoft CHAP Version 2 (MS-CHAP v2). */
    MicrosoftChapVersionTwo("microsoftChapVersionTwo");
    public final String value;
    NonEapAuthenticationMethodForPeap(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static NonEapAuthenticationMethodForPeap forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "microsoftChapVersionTwo": return MicrosoftChapVersionTwo;
            default: return null;
        }
    }
}
