package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum RecommendationType implements ValuedEnum {
    AdfsAppsMigration("adfsAppsMigration"),
    EnableDesktopSSO("enableDesktopSSO"),
    EnablePHS("enablePHS"),
    EnableProvisioning("enableProvisioning"),
    SwitchFromPerUserMFA("switchFromPerUserMFA"),
    TenantMFA("tenantMFA"),
    ThirdPartyApps("thirdPartyApps"),
    TurnOffPerUserMFA("turnOffPerUserMFA"),
    UseAuthenticatorApp("useAuthenticatorApp"),
    UseMyApps("useMyApps"),
    StaleApps("staleApps"),
    StaleAppCreds("staleAppCreds"),
    ApplicationCredentialExpiry("applicationCredentialExpiry"),
    ServicePrincipalKeyExpiry("servicePrincipalKeyExpiry"),
    AdminMFAV2("adminMFAV2"),
    BlockLegacyAuthentication("blockLegacyAuthentication"),
    IntegratedApps("integratedApps"),
    MfaRegistrationV2("mfaRegistrationV2"),
    PwagePolicyNew("pwagePolicyNew"),
    PasswordHashSync("passwordHashSync"),
    OneAdmin("oneAdmin"),
    RoleOverlap("roleOverlap"),
    SelfServicePasswordReset("selfServicePasswordReset"),
    SigninRiskPolicy("signinRiskPolicy"),
    UserRiskPolicy("userRiskPolicy"),
    VerifyAppPublisher("verifyAppPublisher"),
    PrivateLinkForAAD("privateLinkForAAD"),
    AppRoleAssignmentsGroups("appRoleAssignmentsGroups"),
    AppRoleAssignmentsUsers("appRoleAssignmentsUsers"),
    ManagedIdentity("managedIdentity"),
    OverprivilegedApps("overprivilegedApps"),
    UnknownFutureValue("unknownFutureValue"),
    LongLivedCredentials("longLivedCredentials"),
    AadConnectDeprecated("aadConnectDeprecated"),
    AdalToMsalMigration("adalToMsalMigration"),
    OwnerlessApps("ownerlessApps"),
    InactiveGuests("inactiveGuests");
    public final String value;
    RecommendationType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static RecommendationType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "adfsAppsMigration": return AdfsAppsMigration;
            case "enableDesktopSSO": return EnableDesktopSSO;
            case "enablePHS": return EnablePHS;
            case "enableProvisioning": return EnableProvisioning;
            case "switchFromPerUserMFA": return SwitchFromPerUserMFA;
            case "tenantMFA": return TenantMFA;
            case "thirdPartyApps": return ThirdPartyApps;
            case "turnOffPerUserMFA": return TurnOffPerUserMFA;
            case "useAuthenticatorApp": return UseAuthenticatorApp;
            case "useMyApps": return UseMyApps;
            case "staleApps": return StaleApps;
            case "staleAppCreds": return StaleAppCreds;
            case "applicationCredentialExpiry": return ApplicationCredentialExpiry;
            case "servicePrincipalKeyExpiry": return ServicePrincipalKeyExpiry;
            case "adminMFAV2": return AdminMFAV2;
            case "blockLegacyAuthentication": return BlockLegacyAuthentication;
            case "integratedApps": return IntegratedApps;
            case "mfaRegistrationV2": return MfaRegistrationV2;
            case "pwagePolicyNew": return PwagePolicyNew;
            case "passwordHashSync": return PasswordHashSync;
            case "oneAdmin": return OneAdmin;
            case "roleOverlap": return RoleOverlap;
            case "selfServicePasswordReset": return SelfServicePasswordReset;
            case "signinRiskPolicy": return SigninRiskPolicy;
            case "userRiskPolicy": return UserRiskPolicy;
            case "verifyAppPublisher": return VerifyAppPublisher;
            case "privateLinkForAAD": return PrivateLinkForAAD;
            case "appRoleAssignmentsGroups": return AppRoleAssignmentsGroups;
            case "appRoleAssignmentsUsers": return AppRoleAssignmentsUsers;
            case "managedIdentity": return ManagedIdentity;
            case "overprivilegedApps": return OverprivilegedApps;
            case "unknownFutureValue": return UnknownFutureValue;
            case "longLivedCredentials": return LongLivedCredentials;
            case "aadConnectDeprecated": return AadConnectDeprecated;
            case "adalToMsalMigration": return AdalToMsalMigration;
            case "ownerlessApps": return OwnerlessApps;
            case "inactiveGuests": return InactiveGuests;
            default: return null;
        }
    }
}
