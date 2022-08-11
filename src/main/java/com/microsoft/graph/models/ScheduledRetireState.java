// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Scheduled Retire State.
*/
public enum ScheduledRetireState
{
    /**
    * cancel Retire
    */
    CANCEL_RETIRE,
    /**
    * confirm Retire
    */
    CONFIRM_RETIRE,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For ScheduledRetireState values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
