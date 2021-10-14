// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.windowsupdates.models;


/**
 * The Enum Deployment State Reason Value.
*/
public enum DeploymentStateReasonValue
{
    /**
    * scheduled By Offer Window
    */
    SCHEDULED_BY_OFFER_WINDOW,
    /**
    * offering By Request
    */
    OFFERING_BY_REQUEST,
    /**
    * paused By Request
    */
    PAUSED_BY_REQUEST,
    /**
    * paused By Monitoring
    */
    PAUSED_BY_MONITORING,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * faulted By Content Outdated
    */
    FAULTED_BY_CONTENT_OUTDATED,
    /**
    * For DeploymentStateReasonValue values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
