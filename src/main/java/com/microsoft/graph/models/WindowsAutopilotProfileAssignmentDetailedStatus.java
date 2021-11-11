// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Windows Autopilot Profile Assignment Detailed Status.
*/
public enum WindowsAutopilotProfileAssignmentDetailedStatus
{
    /**
    * none
    */
    NONE,
    /**
    * hardware Requirements Not Met
    */
    HARDWARE_REQUIREMENTS_NOT_MET,
    /**
    * surface Hub Profile Not Supported
    */
    SURFACE_HUB_PROFILE_NOT_SUPPORTED,
    /**
    * holo Lens Profile Not Supported
    */
    HOLO_LENS_PROFILE_NOT_SUPPORTED,
    /**
    * windows Pc Profile Not Supported
    */
    WINDOWS_PC_PROFILE_NOT_SUPPORTED,
    /**
    * surface Hub2SProfile Not Supported
    */
    SURFACE_HUB2_S_PROFILE_NOT_SUPPORTED,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For WindowsAutopilotProfileAssignmentDetailedStatus values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
