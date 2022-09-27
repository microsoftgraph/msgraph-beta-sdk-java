package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of activityStatistics entities. */
public enum SignInAccessType implements ValuedEnum {
    None("none"),
    B2bCollaboration("b2bCollaboration"),
    B2bDirectConnect("b2bDirectConnect"),
    MicrosoftSupport("microsoftSupport"),
    ServiceProvider("serviceProvider"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    SignInAccessType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static SignInAccessType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "b2bCollaboration": return B2bCollaboration;
            case "b2bDirectConnect": return B2bDirectConnect;
            case "microsoftSupport": return MicrosoftSupport;
            case "serviceProvider": return ServiceProvider;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
