package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * The set of available policy types that can be configured for approval. The policy type must always be defined in an OperationApprovalRequest.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum OperationApprovalPolicyType implements ValuedEnum {
    /** Default. Indicates that the configured policy type is unknown. Not a valid policy type in an OperationApprovalPolicy. */
    Unknown("unknown"),
    /** Indicates that the configured policy type is an application type, such as mobile apps or built-in apps. */
    App("app"),
    /** Indicates that the configured policy type is a script type, such as PowerShell scripts or remediation scripts. */
    Script("script"),
    /** Indicates that the configured policy type type is for Intune roles, such as application administrator or a custom role. */
    Role("role"),
    /** Evolvable enumeration sentinel value. Do not use. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    OperationApprovalPolicyType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static OperationApprovalPolicyType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "app": return App;
            case "script": return Script;
            case "role": return Role;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
