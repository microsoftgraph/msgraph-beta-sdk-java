// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Privilege Management Elevation Type.
*/
public enum PrivilegeManagementElevationType
{
    /**
    * undetermined
    */
    UNDETERMINED,
    /**
    * unmanaged Elevation
    */
    UNMANAGED_ELEVATION,
    /**
    * zero Touch Elevation
    */
    ZERO_TOUCH_ELEVATION,
    /**
    * user Confirmed Elevation
    */
    USER_CONFIRMED_ELEVATION,
    /**
    * support Approved Elevation
    */
    SUPPORT_APPROVED_ELEVATION,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For PrivilegeManagementElevationType values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
