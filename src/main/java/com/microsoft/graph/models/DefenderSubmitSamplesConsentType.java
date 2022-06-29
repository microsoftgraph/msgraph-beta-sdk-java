package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceManagement singleton. */
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
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static DefenderSubmitSamplesConsentType forValue(@javax.annotation.Nonnull final String searchValue) {
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
