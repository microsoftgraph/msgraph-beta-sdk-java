// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Remediation State.
*/
public enum RemediationState
{
    /**
    * unknown
    */
    UNKNOWN,
    /**
    * skipped
    */
    SKIPPED,
    /**
    * success
    */
    SUCCESS,
    /**
    * remediation Failed
    */
    REMEDIATION_FAILED,
    /**
    * script Error
    */
    SCRIPT_ERROR,
    /**
    * For RemediationState values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
