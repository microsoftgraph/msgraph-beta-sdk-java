// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.windowsupdates.models;


/**
 * The Enum Requested Deployment State Value.
*/
public enum RequestedDeploymentStateValue
{
    /**
    * none
    */
    NONE,
    /**
    * paused
    */
    PAUSED,
    /**
    * archived
    */
    ARCHIVED,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For RequestedDeploymentStateValue values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
