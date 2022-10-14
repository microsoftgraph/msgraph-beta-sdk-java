package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the commsApplication singleton. */
public enum MeetingCapabilities implements ValuedEnum {
    QuestionAndAnswer("questionAndAnswer"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    MeetingCapabilities(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static MeetingCapabilities forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "questionAndAnswer": return QuestionAndAnswer;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
