package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Represents the Validation error of the device membership target.The API will validate the device membership targets specified by the admin to ensure that they exist, that they are of the proper type, and any other target requirements are met such as that the Intune Device Provisioning First Party App is an owner of the target.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum EnrollmentTimeDeviceMembershipTargetValidationErrorCode implements ValuedEnum {
    /** Default. Indicates the status of device membership target is not specified. Do not use. */
    Unknown("unknown"),
    /** Indicates device membership target cannot be found. */
    SecurityGroupNotFound("securityGroupNotFound"),
    /** Indicates device membership target is not a security group. */
    NotSecurityGroup("notSecurityGroup"),
    /** Indicates device membership target which is security group but not a static one. */
    NotStaticSecurityGroup("notStaticSecurityGroup"),
    /** Indicates required first party app not the owner of that device membership target. */
    FirstPartyAppNotAnOwner("firstPartyAppNotAnOwner"),
    /** Indicates that device membership target of type security group is not in the RBAC scope of the caller. */
    SecurityGroupNotInCallerScope("securityGroupNotInCallerScope"),
    /** Evolvable enumeration sentinel value. Do not use. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    EnrollmentTimeDeviceMembershipTargetValidationErrorCode(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static EnrollmentTimeDeviceMembershipTargetValidationErrorCode forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "securityGroupNotFound": return SecurityGroupNotFound;
            case "notSecurityGroup": return NotSecurityGroup;
            case "notStaticSecurityGroup": return NotStaticSecurityGroup;
            case "firstPartyAppNotAnOwner": return FirstPartyAppNotAnOwner;
            case "securityGroupNotInCallerScope": return SecurityGroupNotInCallerScope;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
