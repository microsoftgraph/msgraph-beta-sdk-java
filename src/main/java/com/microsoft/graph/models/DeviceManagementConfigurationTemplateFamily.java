// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Device Management Configuration Template Family.
*/
public enum DeviceManagementConfigurationTemplateFamily
{
    /**
    * none
    */
    NONE,
    /**
    * endpoint Security Antivirus
    */
    ENDPOINT_SECURITY_ANTIVIRUS,
    /**
    * endpoint Security Disk Encryption
    */
    ENDPOINT_SECURITY_DISK_ENCRYPTION,
    /**
    * endpoint Security Firewall
    */
    ENDPOINT_SECURITY_FIREWALL,
    /**
    * endpoint Security Endpoint Detection And Response
    */
    ENDPOINT_SECURITY_ENDPOINT_DETECTION_AND_RESPONSE,
    /**
    * endpoint Security Attack Surface Reduction
    */
    ENDPOINT_SECURITY_ATTACK_SURFACE_REDUCTION,
    /**
    * endpoint Security Account Protection
    */
    ENDPOINT_SECURITY_ACCOUNT_PROTECTION,
    /**
    * endpoint Security Application Control
    */
    ENDPOINT_SECURITY_APPLICATION_CONTROL,
    /**
    * endpoint Security Endpoint Privilege Management
    */
    ENDPOINT_SECURITY_ENDPOINT_PRIVILEGE_MANAGEMENT,
    /**
    * enrollment Configuration
    */
    ENROLLMENT_CONFIGURATION,
    /**
    * app Quiet Time
    */
    APP_QUIET_TIME,
    /**
    * baseline
    */
    BASELINE,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * device Configuration Scripts
    */
    DEVICE_CONFIGURATION_SCRIPTS,
    /**
    * device Configuration Policies
    */
    DEVICE_CONFIGURATION_POLICIES,
    /**
    * For DeviceManagementConfigurationTemplateFamily values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
