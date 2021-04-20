// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.windowsupdates.models;


/**
 * The Enum Deployment State Value.
*/
public enum DeploymentStateValue
{
    /**
    * scheduled
    */
    SCHEDULED,
    /**
    * offering
    */
    OFFERING,
    /**
    * paused
    */
    PAUSED,
    /**
    * faulted
    */
    FAULTED,
    /**
    * archived
    */
    ARCHIVED,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For DeploymentStateValue values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
