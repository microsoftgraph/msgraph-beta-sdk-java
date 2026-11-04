package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum EvaluationErrorType implements ValuedEnum {
    UnsupportedFile("unsupportedFile"),
    PasswordProtectedFile("passwordProtectedFile"),
    MissingOrInvalidConfiguration("missingOrInvalidConfiguration"),
    AgentFailure("agentFailure"),
    EnforcementTimeout("enforcementTimeout"),
    OsOverride("osOverride"),
    ProcessNonExistent("processNonExistent"),
    Other("other"),
    ServiceTimeout("serviceTimeout"),
    ServiceError("serviceError"),
    ServiceUnavailable("serviceUnavailable"),
    ContentTooLarge("contentTooLarge"),
    PartiallyScanned("partiallyScanned"),
    Unscannable("unscannable"),
    BillingNotSetup("billingNotSetup"),
    AuthenticationOrAuthorizationFailed("authenticationOrAuthorizationFailed"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    EvaluationErrorType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static EvaluationErrorType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unsupportedFile": return UnsupportedFile;
            case "passwordProtectedFile": return PasswordProtectedFile;
            case "missingOrInvalidConfiguration": return MissingOrInvalidConfiguration;
            case "agentFailure": return AgentFailure;
            case "enforcementTimeout": return EnforcementTimeout;
            case "osOverride": return OsOverride;
            case "processNonExistent": return ProcessNonExistent;
            case "other": return Other;
            case "serviceTimeout": return ServiceTimeout;
            case "serviceError": return ServiceError;
            case "serviceUnavailable": return ServiceUnavailable;
            case "contentTooLarge": return ContentTooLarge;
            case "partiallyScanned": return PartiallyScanned;
            case "unscannable": return Unscannable;
            case "billingNotSetup": return BillingNotSetup;
            case "authenticationOrAuthorizationFailed": return AuthenticationOrAuthorizationFailed;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
