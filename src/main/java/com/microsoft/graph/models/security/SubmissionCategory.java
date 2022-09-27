package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of activityStatistics entities. */
public enum SubmissionCategory implements ValuedEnum {
    NotJunk("notJunk"),
    Spam("spam"),
    Phishing("phishing"),
    Malware("malware"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    SubmissionCategory(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static SubmissionCategory forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notJunk": return NotJunk;
            case "spam": return Spam;
            case "phishing": return Phishing;
            case "malware": return Malware;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
