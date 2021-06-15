// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.managedtenants.models;


/**
 * The Enum Workload Action Status.
*/
public enum WorkloadActionStatus
{
    /**
    * to Address
    */
    TO_ADDRESS,
    /**
    * completed
    */
    COMPLETED,
    /**
    * error
    */
    ERROR,
    /**
    * time Out
    */
    TIME_OUT,
    /**
    * in Progress
    */
    IN_PROGRESS,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For WorkloadActionStatus values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
