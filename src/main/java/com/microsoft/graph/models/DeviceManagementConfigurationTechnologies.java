// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Device Management Configuration Technologies.
*/
public enum DeviceManagementConfigurationTechnologies
{
    /**
    * none
    */
    NONE,
    /**
    * mdm
    */
    MDM,
    /**
    * windows10XManagement
    */
    WINDOWS10_X_MANAGEMENT,
    /**
    * config Manager
    */
    CONFIG_MANAGER,
    /**
    * apple Remote Management
    */
    APPLE_REMOTE_MANAGEMENT,
    /**
    * microsoft Sense
    */
    MICROSOFT_SENSE,
    /**
    * exchange Online
    */
    EXCHANGE_ONLINE,
    /**
    * linux Mdm
    */
    LINUX_MDM,
    /**
    * enrollment
    */
    ENROLLMENT,
    /**
    * endpoint Privilege Management
    */
    ENDPOINT_PRIVILEGE_MANAGEMENT,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For DeviceManagementConfigurationTechnologies values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
