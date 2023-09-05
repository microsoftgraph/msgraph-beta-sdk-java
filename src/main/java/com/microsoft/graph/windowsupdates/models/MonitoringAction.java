// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.windowsupdates.models;


/**
 * The Enum Monitoring Action.
*/
public enum MonitoringAction
{
    /**
    * alert Error
    */
    ALERT_ERROR,
    /**
    * offer Fallback
    */
    OFFER_FALLBACK,
    /**
    * pause Deployment
    */
    PAUSE_DEPLOYMENT,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For MonitoringAction values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
