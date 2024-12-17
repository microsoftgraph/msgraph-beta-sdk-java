package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ChangeAnnouncementChangeType implements ValuedEnum {
    BreakingChange("breakingChange"),
    Deprecation("deprecation"),
    EndOfSupport("endOfSupport"),
    FeatureChange("featureChange"),
    Other("other"),
    Retirement("retirement"),
    SecurityIncident("securityIncident"),
    UxChange("uxChange"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ChangeAnnouncementChangeType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ChangeAnnouncementChangeType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "breakingChange": return BreakingChange;
            case "deprecation": return Deprecation;
            case "endOfSupport": return EndOfSupport;
            case "featureChange": return FeatureChange;
            case "other": return Other;
            case "retirement": return Retirement;
            case "securityIncident": return SecurityIncident;
            case "uxChange": return UxChange;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
