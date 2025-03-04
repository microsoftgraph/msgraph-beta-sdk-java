package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Indicates the status of the Approval Request. The status of a request will change when an action is successfully performed on it, such as when it is `approved` or `rejected`, or when the request&apos;s expiration DateTime passes and the result is `expired`.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum OperationApprovalRequestStatus implements ValuedEnum {
    /** Default. Indicates that the request approval status is unknown, and that the status has not been assigned to the approval request. */
    Unknown("unknown"),
    /** Indicates that the approval request needs approval before the operation can be completed. */
    NeedsApproval("needsApproval"),
    /** Indicates that the approval request has been approved. The operation can now be completed. */
    Approved("approved"),
    /** Indicates that the approval request has been rejected. No further action can be taken to complete the operation or to modify the request. */
    Rejected("rejected"),
    /** Indicates that the approval request has been cancelled by the request&apos;s requestor. No further action can be taken to complete the operation or to modify the request. */
    Cancelled("cancelled"),
    /** Indicates that the approval request has been completed. This status is feature agnostic and does not indicate success or failure of the operation. No further action is necessary for the operation or to modify the request. */
    Completed("completed"),
    /** Indicates that the approval request has expired. No further action can be taken to complete the operation or to modify the request. A new approval request must be made and approved in order to complete the operation. */
    Expired("expired"),
    /** Evolvable enumeration sentinel value. Do not use. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    OperationApprovalRequestStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static OperationApprovalRequestStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "needsApproval": return NeedsApproval;
            case "approved": return Approved;
            case "rejected": return Rejected;
            case "cancelled": return Cancelled;
            case "completed": return Completed;
            case "expired": return Expired;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
