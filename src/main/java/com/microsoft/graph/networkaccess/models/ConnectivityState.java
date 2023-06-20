// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.networkaccess.models;


/**
 * The Enum Connectivity State.
*/
public enum ConnectivityState
{
    /**
    * pending
    */
    PENDING,
    /**
    * connected
    */
    CONNECTED,
    /**
    * inactive
    */
    INACTIVE,
    /**
    * error
    */
    ERROR,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For ConnectivityState values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
