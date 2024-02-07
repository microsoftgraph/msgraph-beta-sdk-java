package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum RequirementProvider implements ValuedEnum {
    User("user"),
    Request("request"),
    ServicePrincipal("servicePrincipal"),
    V1ConditionalAccess("v1ConditionalAccess"),
    MultiConditionalAccess("multiConditionalAccess"),
    TenantSessionRiskPolicy("tenantSessionRiskPolicy"),
    AccountCompromisePolicies("accountCompromisePolicies"),
    V1ConditionalAccessDependency("v1ConditionalAccessDependency"),
    V1ConditionalAccessPolicyIdRequested("v1ConditionalAccessPolicyIdRequested"),
    MfaRegistrationRequiredByIdentityProtectionPolicy("mfaRegistrationRequiredByIdentityProtectionPolicy"),
    BaselineProtection("baselineProtection"),
    MfaRegistrationRequiredByBaselineProtection("mfaRegistrationRequiredByBaselineProtection"),
    MfaRegistrationRequiredByMultiConditionalAccess("mfaRegistrationRequiredByMultiConditionalAccess"),
    EnforcedForCspAdmins("enforcedForCspAdmins"),
    SecurityDefaults("securityDefaults"),
    MfaRegistrationRequiredBySecurityDefaults("mfaRegistrationRequiredBySecurityDefaults"),
    ProofUpCodeRequest("proofUpCodeRequest"),
    CrossTenantOutboundRule("crossTenantOutboundRule"),
    GpsLocationCondition("gpsLocationCondition"),
    RiskBasedPolicy("riskBasedPolicy"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    RequirementProvider(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static RequirementProvider forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "user": return User;
            case "request": return Request;
            case "servicePrincipal": return ServicePrincipal;
            case "v1ConditionalAccess": return V1ConditionalAccess;
            case "multiConditionalAccess": return MultiConditionalAccess;
            case "tenantSessionRiskPolicy": return TenantSessionRiskPolicy;
            case "accountCompromisePolicies": return AccountCompromisePolicies;
            case "v1ConditionalAccessDependency": return V1ConditionalAccessDependency;
            case "v1ConditionalAccessPolicyIdRequested": return V1ConditionalAccessPolicyIdRequested;
            case "mfaRegistrationRequiredByIdentityProtectionPolicy": return MfaRegistrationRequiredByIdentityProtectionPolicy;
            case "baselineProtection": return BaselineProtection;
            case "mfaRegistrationRequiredByBaselineProtection": return MfaRegistrationRequiredByBaselineProtection;
            case "mfaRegistrationRequiredByMultiConditionalAccess": return MfaRegistrationRequiredByMultiConditionalAccess;
            case "enforcedForCspAdmins": return EnforcedForCspAdmins;
            case "securityDefaults": return SecurityDefaults;
            case "mfaRegistrationRequiredBySecurityDefaults": return MfaRegistrationRequiredBySecurityDefaults;
            case "proofUpCodeRequest": return ProofUpCodeRequest;
            case "crossTenantOutboundRule": return CrossTenantOutboundRule;
            case "gpsLocationCondition": return GpsLocationCondition;
            case "riskBasedPolicy": return RiskBasedPolicy;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
