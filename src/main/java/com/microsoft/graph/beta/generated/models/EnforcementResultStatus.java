package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum EnforcementResultStatus implements ValuedEnum {
    Success("success"),
    MissingOrInvalidConfiguration("missingOrInvalidConfiguration"),
    UserOverride("userOverride"),
    AgentFailure("agentFailure"),
    EnforcementTimeout("enforcementTimeout"),
    OSOverride("oSOverride"),
    ProcessNonExistent("processNonExistent"),
    Other("other"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    EnforcementResultStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static EnforcementResultStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "success": return Success;
            case "missingOrInvalidConfiguration": return MissingOrInvalidConfiguration;
            case "userOverride": return UserOverride;
            case "agentFailure": return AgentFailure;
            case "enforcementTimeout": return EnforcementTimeout;
            case "oSOverride": return OSOverride;
            case "processNonExistent": return ProcessNonExistent;
            case "other": return Other;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
