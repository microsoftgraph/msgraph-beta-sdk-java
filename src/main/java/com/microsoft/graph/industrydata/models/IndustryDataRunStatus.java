// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.industrydata.models;


/**
 * The Enum Industry Data Run Status.
*/
public enum IndustryDataRunStatus
{
    /**
    * running
    */
    RUNNING,
    /**
    * failed
    */
    FAILED,
    /**
    * completed
    */
    COMPLETED,
    /**
    * completed With Errors
    */
    COMPLETED_WITH_ERRORS,
    /**
    * completed With Warnings
    */
    COMPLETED_WITH_WARNINGS,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For IndustryDataRunStatus values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
