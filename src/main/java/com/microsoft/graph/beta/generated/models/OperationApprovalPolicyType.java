package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * The set of available policy types that can be configured for approval. There is no default value for this enum, indicating that the policy type must always be chosen.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum OperationApprovalPolicyType implements ValuedEnum {
    /** Indicates that the configured policy type is for a Device Action. */
    DeviceAction("deviceAction"),
    /** Indicates that the configured policy type is for a Device Wipe Action. */
    DeviceWipe("deviceWipe"),
    /** Indicates that the configured policy type is for a Device Retire Action. */
    DeviceRetire("deviceRetire"),
    /** Indicates that the configured policy type is for a Retire Non-Compliant Devices Action. */
    DeviceRetireNonCompliant("deviceRetireNonCompliant"),
    /** Indicates that the configured policy type is for a Device Delete Action. */
    DeviceDelete("deviceDelete"),
    /** Indicates that the configured policy type is for a Device Lock Action. */
    DeviceLock("deviceLock"),
    /** Indicates that the configured policy type is for a Device Erase Action. */
    DeviceErase("deviceErase"),
    /** Indicates that the configured policy type is for a Device Disable Activation Lock Action. */
    DeviceDisableActivationLock("deviceDisableActivationLock"),
    /** Indicates that the configured policy type is for a Windows Enrollment. */
    WindowsEnrollment("windowsEnrollment"),
    /** Indicates that the configured policy type is for a Compliance Policy. */
    CompliancePolicy("compliancePolicy"),
    /** Indicates that the configured policy type is for a Configuration Policy. */
    ConfigurationPolicy("configurationPolicy"),
    /** Indicates that the configured policy type is for an App Protection Policy. */
    AppProtectionPolicy("appProtectionPolicy"),
    /** Indicates that the configured policy type is for a Policy Set. */
    PolicySet("policySet"),
    /** Indicates that the configured policy type is for a Filter. */
    Filter("filter"),
    /** Indicates that the configured policy type is for an Endpoint Security Policy. */
    EndpointSecurityPolicy("endpointSecurityPolicy"),
    /** Indicates that the configured policy type is an application type, such as mobile apps or built-in apps. */
    App("app"),
    /** Indicates that the configured policy type is a script type, such as Powershell scripts or remediation scripts. */
    Scripts("scripts"),
    /** Indicates that the configured policy type is for a Role. */
    Role("role"),
    /** Indicates that the configured policy type is for a Device Reset Passcode Action. */
    DeviceResetPasscode("deviceResetPasscode"),
    /** Indicates that the configured policy type is for a Custom Organizational Message. */
    CustomOrganizationalMessage("customOrganizationalMessage"),
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
            case "deviceAction": return DeviceAction;
            case "deviceWipe": return DeviceWipe;
            case "deviceRetire": return DeviceRetire;
            case "deviceRetireNonCompliant": return DeviceRetireNonCompliant;
            case "deviceDelete": return DeviceDelete;
            case "deviceLock": return DeviceLock;
            case "deviceErase": return DeviceErase;
            case "deviceDisableActivationLock": return DeviceDisableActivationLock;
            case "windowsEnrollment": return WindowsEnrollment;
            case "compliancePolicy": return CompliancePolicy;
            case "configurationPolicy": return ConfigurationPolicy;
            case "appProtectionPolicy": return AppProtectionPolicy;
            case "policySet": return PolicySet;
            case "filter": return Filter;
            case "endpointSecurityPolicy": return EndpointSecurityPolicy;
            case "app": return App;
            case "scripts": return Scripts;
            case "role": return Role;
            case "deviceResetPasscode": return DeviceResetPasscode;
            case "customOrganizationalMessage": return CustomOrganizationalMessage;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
