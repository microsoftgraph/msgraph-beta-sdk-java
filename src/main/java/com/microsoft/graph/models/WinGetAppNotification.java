package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReviewDecision entities. */
public enum WinGetAppNotification implements ValuedEnum {
    /** Show all notifications. */
    ShowAll("showAll"),
    /** Only show restart notification and suppress other notifications. */
    ShowReboot("showReboot"),
    /** Hide all notifications. */
    HideAll("hideAll"),
    /** Unknown future value, reserved for future usage as expandable enum. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    WinGetAppNotification(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static WinGetAppNotification forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "showAll": return ShowAll;
            case "showReboot": return ShowReboot;
            case "hideAll": return HideAll;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
