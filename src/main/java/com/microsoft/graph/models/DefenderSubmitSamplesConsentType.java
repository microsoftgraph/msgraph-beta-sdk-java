package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Possible values for DefenderSubmitSamplesConsentType
 */
public enum DefenderSubmitSamplesConsentType implements ValuedEnum {
    /** Send safe samples automatically */
    SendSafeSamplesAutomatically("sendSafeSamplesAutomatically"),
    /** Always prompt */
    AlwaysPrompt("alwaysPrompt"),
    /** Never send */
    NeverSend("neverSend"),
    /** Send all samples automatically */
    SendAllSamplesAutomatically("sendAllSamplesAutomatically");
    public final String value;
    DefenderSubmitSamplesConsentType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static DefenderSubmitSamplesConsentType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "sendSafeSamplesAutomatically": return SendSafeSamplesAutomatically;
            case "alwaysPrompt": return AlwaysPrompt;
            case "neverSend": return NeverSend;
            case "sendAllSamplesAutomatically": return SendAllSamplesAutomatically;
            default: return null;
        }
    }
}
