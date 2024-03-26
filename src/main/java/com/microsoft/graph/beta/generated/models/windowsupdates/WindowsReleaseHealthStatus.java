package com.microsoft.graph.beta.models.windowsupdates;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum WindowsReleaseHealthStatus implements ValuedEnum {
    Resolved("resolved"),
    MitigatedExternal("mitigatedExternal"),
    Mitigated("mitigated"),
    ResolvedExternal("resolvedExternal"),
    Confirmed("confirmed"),
    Reported("reported"),
    Investigating("investigating"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    WindowsReleaseHealthStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static WindowsReleaseHealthStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "resolved": return Resolved;
            case "mitigatedExternal": return MitigatedExternal;
            case "mitigated": return Mitigated;
            case "resolvedExternal": return ResolvedExternal;
            case "confirmed": return Confirmed;
            case "reported": return Reported;
            case "investigating": return Investigating;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
