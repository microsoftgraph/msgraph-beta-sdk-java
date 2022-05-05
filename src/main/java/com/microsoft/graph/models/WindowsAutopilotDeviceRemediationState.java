// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Windows Autopilot Device Remediation State.
*/
public enum WindowsAutopilotDeviceRemediationState
{
    /**
    * unknown
    */
    UNKNOWN,
    /**
    * no Remediation Required
    */
    NO_REMEDIATION_REQUIRED,
    /**
    * automatic Remediation Required
    */
    AUTOMATIC_REMEDIATION_REQUIRED,
    /**
    * manual Remediation Required
    */
    MANUAL_REMEDIATION_REQUIRED,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For WindowsAutopilotDeviceRemediationState values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
