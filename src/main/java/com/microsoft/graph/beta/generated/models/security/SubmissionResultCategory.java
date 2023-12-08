package com.microsoft.graph.beta.models.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum SubmissionResultCategory implements ValuedEnum {
    NotJunk("notJunk"),
    Spam("spam"),
    Phishing("phishing"),
    Malware("malware"),
    AllowedByPolicy("allowedByPolicy"),
    BlockedByPolicy("blockedByPolicy"),
    Spoof("spoof"),
    Unknown("unknown"),
    NoResultAvailable("noResultAvailable"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    SubmissionResultCategory(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static SubmissionResultCategory forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notJunk": return NotJunk;
            case "spam": return Spam;
            case "phishing": return Phishing;
            case "malware": return Malware;
            case "allowedByPolicy": return AllowedByPolicy;
            case "blockedByPolicy": return BlockedByPolicy;
            case "spoof": return Spoof;
            case "unknown": return Unknown;
            case "noResultAvailable": return NoResultAvailable;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
