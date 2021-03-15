// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Device Management Autopilot Policy Compliance Status.
*/
public enum DeviceManagementAutopilotPolicyComplianceStatus
{
    /**
    * unknown
    */
    UNKNOWN,
    /**
    * compliant
    */
    COMPLIANT,
    /**
    * installed
    */
    INSTALLED,
    /**
    * not Compliant
    */
    NOT_COMPLIANT,
    /**
    * not Installed
    */
    NOT_INSTALLED,
    /**
    * error
    */
    ERROR,
    /**
    * For DeviceManagementAutopilotPolicyComplianceStatus values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
