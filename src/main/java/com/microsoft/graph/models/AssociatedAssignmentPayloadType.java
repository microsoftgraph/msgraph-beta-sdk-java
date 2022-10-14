// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Associated Assignment Payload Type.
*/
public enum AssociatedAssignmentPayloadType
{
    /**
    * unknown
    */
    UNKNOWN,
    /**
    * device Configuration And Compliance
    */
    DEVICE_CONFIGURATION_AND_COMPLIANCE,
    /**
    * application
    */
    APPLICATION,
    /**
    * android Enterprise App
    */
    ANDROID_ENTERPRISE_APP,
    /**
    * enrollment Configuration
    */
    ENROLLMENT_CONFIGURATION,
    /**
    * group Policy Configuration
    */
    GROUP_POLICY_CONFIGURATION,
    /**
    * zero Touch Deployment Device Config Profile
    */
    ZERO_TOUCH_DEPLOYMENT_DEVICE_CONFIG_PROFILE,
    /**
    * android Enterprise Configuration
    */
    ANDROID_ENTERPRISE_CONFIGURATION,
    /**
    * device Firmware Configuration Interface Policy
    */
    DEVICE_FIRMWARE_CONFIGURATION_INTERFACE_POLICY,
    /**
    * resource Access Policy
    */
    RESOURCE_ACCESS_POLICY,
    /**
    * win32app
    */
    WIN32APP,
    /**
    * device Managment Configuration And Compliance Policy
    */
    DEVICE_MANAGMENT_CONFIGURATION_AND_COMPLIANCE_POLICY,
    /**
    * For AssociatedAssignmentPayloadType values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
