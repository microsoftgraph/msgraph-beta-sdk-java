// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Policy Set Status.
*/
public enum PolicySetStatus
{
    /**
    * unknown
    */
    UNKNOWN,
    /**
    * validating
    */
    VALIDATING,
    /**
    * partial Success
    */
    PARTIAL_SUCCESS,
    /**
    * success
    */
    SUCCESS,
    /**
    * error
    */
    ERROR,
    /**
    * not Assigned
    */
    NOT_ASSIGNED,
    /**
    * For PolicySetStatus values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
