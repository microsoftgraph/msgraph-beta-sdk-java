package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Source of the action on the approval request.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum OperationApprovalSource implements ValuedEnum {
    /** Default. Indicates the source of the action on the approval request is unknown. */
    Unknown("unknown"),
    /** Indicates the source of the action on the approval request is from an interactive session using the Intune Admin Console. */
    AdminConsole("adminConsole"),
    /** Indicates the source of the action on the approval request is from an email based form. */
    Email("email"),
    /** Evolvable enumeration sentinel value. Do not use. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    OperationApprovalSource(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static OperationApprovalSource forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "adminConsole": return AdminConsole;
            case "email": return Email;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
