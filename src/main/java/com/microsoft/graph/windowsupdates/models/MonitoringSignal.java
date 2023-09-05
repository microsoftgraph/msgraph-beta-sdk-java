// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.windowsupdates.models;


/**
 * The Enum Monitoring Signal.
*/
public enum MonitoringSignal
{
    /**
    * rollback
    */
    ROLLBACK,
    /**
    * ineligible
    */
    INELIGIBLE,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For MonitoringSignal values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
