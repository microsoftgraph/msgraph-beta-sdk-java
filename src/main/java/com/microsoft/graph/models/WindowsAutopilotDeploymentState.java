// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Windows Autopilot Deployment State.
*/
public enum WindowsAutopilotDeploymentState
{
    /**
    * unknown
    */
    UNKNOWN,
    /**
    * success
    */
    SUCCESS,
    /**
    * in Progress
    */
    IN_PROGRESS,
    /**
    * failure
    */
    FAILURE,
    /**
    * success With Timeout
    */
    SUCCESS_WITH_TIMEOUT,
    /**
    * not Attempted
    */
    NOT_ATTEMPTED,
    /**
    * disabled
    */
    DISABLED,
    /**
    * success On Retry
    */
    SUCCESS_ON_RETRY,
    /**
    * For WindowsAutopilotDeploymentState values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
