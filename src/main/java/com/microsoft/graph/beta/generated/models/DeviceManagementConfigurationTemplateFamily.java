package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Describes the TemplateFamily for the Template entity
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum DeviceManagementConfigurationTemplateFamily implements ValuedEnum {
    /** Default for Template Family when Policy is not linked to a Template */
    None("none"),
    /** Template Family for EndpointSecurityAntivirus that manages the discrete group of antivirus settings for managed devices */
    EndpointSecurityAntivirus("endpointSecurityAntivirus"),
    /** Template Family for EndpointSecurityDiskEncryption that provides settings that are relevant for a devices built-in encryption  method, like FileVault or BitLocker */
    EndpointSecurityDiskEncryption("endpointSecurityDiskEncryption"),
    /** Template Family for EndpointSecurityFirewall that helps configure a devices built-in firewall for device that run macOS and Windows 10 */
    EndpointSecurityFirewall("endpointSecurityFirewall"),
    /** Template Family for EndpointSecurityEndpointDetectionAndResponse that facilitates management of the EDR settings and onboard devices to Microsoft Defender for Endpoint */
    EndpointSecurityEndpointDetectionAndResponse("endpointSecurityEndpointDetectionAndResponse"),
    /** Template Family for EndpointSecurityAttackSurfaceReduction that help reduce your attack surfaces, by minimizing the places where your organization is vulnerable to cyberthreats and attacks */
    EndpointSecurityAttackSurfaceReduction("endpointSecurityAttackSurfaceReduction"),
    /** Template Family for EndpointSecurityAccountProtection that facilitates protecting the identity and accounts of users */
    EndpointSecurityAccountProtection("endpointSecurityAccountProtection"),
    /** Template Family for ApplicationControl that helps mitigate security threats by restricting the applications that users can run and the code that runs in the System Core (kernel) */
    EndpointSecurityApplicationControl("endpointSecurityApplicationControl"),
    /** Template Family for EPM Elevation Rules */
    EndpointSecurityEndpointPrivilegeManagement("endpointSecurityEndpointPrivilegeManagement"),
    /** Template Family for EnrollmentConfiguration */
    EnrollmentConfiguration("enrollmentConfiguration"),
    /** Template Family for QuietTimeIndicates Template Family for all the Apps QuietTime policies and templates */
    AppQuietTime("appQuietTime"),
    /** Template Family for Baseline */
    Baseline("baseline"),
    /** Evolvable enumeration sentinel value. Do not use. */
    UnknownFutureValue("unknownFutureValue"),
    /** Template Family for device configuration scripts */
    DeviceConfigurationScripts("deviceConfigurationScripts"),
    /** Template Family for device configuration policies */
    DeviceConfigurationPolicies("deviceConfigurationPolicies"),
    /** Template Family for windowsOsRecovery that can be applied during a Windows operating system recovery */
    WindowsOsRecoveryPolicies("windowsOsRecoveryPolicies"),
    /** Template Family for Company Portal settings */
    CompanyPortal("companyPortal");
    public final String value;
    DeviceManagementConfigurationTemplateFamily(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static DeviceManagementConfigurationTemplateFamily forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "endpointSecurityAntivirus": return EndpointSecurityAntivirus;
            case "endpointSecurityDiskEncryption": return EndpointSecurityDiskEncryption;
            case "endpointSecurityFirewall": return EndpointSecurityFirewall;
            case "endpointSecurityEndpointDetectionAndResponse": return EndpointSecurityEndpointDetectionAndResponse;
            case "endpointSecurityAttackSurfaceReduction": return EndpointSecurityAttackSurfaceReduction;
            case "endpointSecurityAccountProtection": return EndpointSecurityAccountProtection;
            case "endpointSecurityApplicationControl": return EndpointSecurityApplicationControl;
            case "endpointSecurityEndpointPrivilegeManagement": return EndpointSecurityEndpointPrivilegeManagement;
            case "enrollmentConfiguration": return EnrollmentConfiguration;
            case "appQuietTime": return AppQuietTime;
            case "baseline": return Baseline;
            case "unknownFutureValue": return UnknownFutureValue;
            case "deviceConfigurationScripts": return DeviceConfigurationScripts;
            case "deviceConfigurationPolicies": return DeviceConfigurationPolicies;
            case "windowsOsRecoveryPolicies": return WindowsOsRecoveryPolicies;
            case "companyPortal": return CompanyPortal;
            default: return null;
        }
    }
}
