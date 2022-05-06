// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.security.models;


/**
 * The Enum Policy Status.
*/
public enum PolicyStatus
{
    /**
    * pending
    */
    PENDING,
    /**
    * error
    */
    ERROR,
    /**
    * success
    */
    SUCCESS,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For PolicyStatus values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
