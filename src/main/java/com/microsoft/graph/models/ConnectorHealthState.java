// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Connector Health State.
*/
public enum ConnectorHealthState
{
    /**
    * healthy
    */
    HEALTHY,
    /**
    * warning
    */
    WARNING,
    /**
    * unhealthy
    */
    UNHEALTHY,
    /**
    * unknown
    */
    UNKNOWN,
    /**
    * For ConnectorHealthState values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
