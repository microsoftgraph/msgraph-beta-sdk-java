package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReview entities. */
public enum CertificateIssuanceStates implements ValuedEnum {
    Unknown("unknown"),
    ChallengeIssued("challengeIssued"),
    ChallengeIssueFailed("challengeIssueFailed"),
    RequestCreationFailed("requestCreationFailed"),
    RequestSubmitFailed("requestSubmitFailed"),
    ChallengeValidationSucceeded("challengeValidationSucceeded"),
    ChallengeValidationFailed("challengeValidationFailed"),
    IssueFailed("issueFailed"),
    IssuePending("issuePending"),
    Issued("issued"),
    ResponseProcessingFailed("responseProcessingFailed"),
    ResponsePending("responsePending"),
    EnrollmentSucceeded("enrollmentSucceeded"),
    EnrollmentNotNeeded("enrollmentNotNeeded"),
    Revoked("revoked"),
    RemovedFromCollection("removedFromCollection"),
    RenewVerified("renewVerified"),
    InstallFailed("installFailed"),
    Installed("installed"),
    DeleteFailed("deleteFailed"),
    Deleted("deleted"),
    RenewalRequested("renewalRequested"),
    Requested("requested");
    public final String value;
    CertificateIssuanceStates(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static CertificateIssuanceStates forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "challengeIssued": return ChallengeIssued;
            case "challengeIssueFailed": return ChallengeIssueFailed;
            case "requestCreationFailed": return RequestCreationFailed;
            case "requestSubmitFailed": return RequestSubmitFailed;
            case "challengeValidationSucceeded": return ChallengeValidationSucceeded;
            case "challengeValidationFailed": return ChallengeValidationFailed;
            case "issueFailed": return IssueFailed;
            case "issuePending": return IssuePending;
            case "issued": return Issued;
            case "responseProcessingFailed": return ResponseProcessingFailed;
            case "responsePending": return ResponsePending;
            case "enrollmentSucceeded": return EnrollmentSucceeded;
            case "enrollmentNotNeeded": return EnrollmentNotNeeded;
            case "revoked": return Revoked;
            case "removedFromCollection": return RemovedFromCollection;
            case "renewVerified": return RenewVerified;
            case "installFailed": return InstallFailed;
            case "installed": return Installed;
            case "deleteFailed": return DeleteFailed;
            case "deleted": return Deleted;
            case "renewalRequested": return RenewalRequested;
            case "requested": return Requested;
            default: return null;
        }
    }
}
