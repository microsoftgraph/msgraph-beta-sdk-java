// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Device Enrollment Configuration Type.
*/
public enum DeviceEnrollmentConfigurationType
{
    /**
    * unknown
    */
    UNKNOWN,
    /**
    * limit
    */
    LIMIT,
    /**
    * platform Restrictions
    */
    PLATFORM_RESTRICTIONS,
    /**
    * windows Hello For Business
    */
    WINDOWS_HELLO_FOR_BUSINESS,
    /**
    * default Limit
    */
    DEFAULT_LIMIT,
    /**
    * default Platform Restrictions
    */
    DEFAULT_PLATFORM_RESTRICTIONS,
    /**
    * default Windows Hello For Business
    */
    DEFAULT_WINDOWS_HELLO_FOR_BUSINESS,
    /**
    * default Windows10Enrollment Completion Page Configuration
    */
    DEFAULT_WINDOWS10_ENROLLMENT_COMPLETION_PAGE_CONFIGURATION,
    /**
    * windows10Enrollment Completion Page Configuration
    */
    WINDOWS10_ENROLLMENT_COMPLETION_PAGE_CONFIGURATION,
    /**
    * device Comanagement Authority Configuration
    */
    DEVICE_COMANAGEMENT_AUTHORITY_CONFIGURATION,
    /**
    * single Platform Restriction
    */
    SINGLE_PLATFORM_RESTRICTION,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * enrollment Notifications Configuration
    */
    ENROLLMENT_NOTIFICATIONS_CONFIGURATION,
    /**
    * For DeviceEnrollmentConfigurationType values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
