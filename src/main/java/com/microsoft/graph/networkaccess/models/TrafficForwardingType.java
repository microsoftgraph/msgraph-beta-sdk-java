// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.networkaccess.models;


/**
 * The Enum Traffic Forwarding Type.
*/
public enum TrafficForwardingType
{
    /**
    * m365
    */
    M365,
    /**
    * internet
    */
    INTERNET,
    /**
    * private
    */
    PRIVATE,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For TrafficForwardingType values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
