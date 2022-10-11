package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReview entities. */
public enum RestrictionTrigger implements ValuedEnum {
    CopyPaste("copyPaste"),
    CopyToNetworkShare("copyToNetworkShare"),
    CopyToRemovableMedia("copyToRemovableMedia"),
    ScreenCapture("screenCapture"),
    Print("print"),
    CloudEgress("cloudEgress"),
    UnallowedApps("unallowedApps");
    public final String value;
    RestrictionTrigger(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static RestrictionTrigger forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "copyPaste": return CopyPaste;
            case "copyToNetworkShare": return CopyToNetworkShare;
            case "copyToRemovableMedia": return CopyToRemovableMedia;
            case "screenCapture": return ScreenCapture;
            case "print": return Print;
            case "cloudEgress": return CloudEgress;
            case "unallowedApps": return UnallowedApps;
            default: return null;
        }
    }
}
