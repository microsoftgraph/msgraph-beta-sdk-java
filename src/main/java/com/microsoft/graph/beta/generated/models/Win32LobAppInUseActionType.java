package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Indicates whether app-in-use detection is enabled before app enforcement, and if enabled, the action to take when the app is detected to be in-use.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum Win32LobAppInUseActionType implements ValuedEnum {
    /** Default. Indicates that no in-use detection will be evaluated before an app enforcement. */
    NotEnabled("notEnabled"),
    /** Indicates that the in-use detection will occur immediately before app enforcement. Enforcement will not occur if the app is detected to be in-use, and an error status will be reported for the app. */
    Fail("fail"),
    /** Indicates that in-use detection will occur immediately before app enforcement. If the app is detected to be in-use, the processes specified in the corresponding process detection rules will be terminated, and app enforcement will commence. */
    TerminateWithoutUserInteraction("terminateWithoutUserInteraction"),
    /** Indicates that in-use detection will occur immediately before app enforcement. If the app is detected to be in-use, the end user will be prompted according to the configured deferral and countdown settings, and the processes specified in the corresponding process detection rules will be terminated before app enforcement is commenced. If any of the processes cannot be terminated, the app will not be enforced, and an error status will be reported for the app. */
    TerminateWithUserInteraction("terminateWithUserInteraction"),
    /** Evolvable enumeration sentinel value. Do not use. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    Win32LobAppInUseActionType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static Win32LobAppInUseActionType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notEnabled": return NotEnabled;
            case "fail": return Fail;
            case "terminateWithoutUserInteraction": return TerminateWithoutUserInteraction;
            case "terminateWithUserInteraction": return TerminateWithUserInteraction;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
