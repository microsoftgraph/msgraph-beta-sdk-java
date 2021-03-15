// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Group Policy Operation Status.
*/
public enum GroupPolicyOperationStatus
{
    /**
    * unknown
    */
    UNKNOWN,
    /**
    * in Progress
    */
    IN_PROGRESS,
    /**
    * success
    */
    SUCCESS,
    /**
    * failed
    */
    FAILED,
    /**
    * For GroupPolicyOperationStatus values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
