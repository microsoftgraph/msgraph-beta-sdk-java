// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.networkaccess.models;


/**
 * The Enum Remote Network Status.
*/
public enum RemoteNetworkStatus
{
    /**
    * tunnel Disconnected
    */
    TUNNEL_DISCONNECTED,
    /**
    * tunnel Connected
    */
    TUNNEL_CONNECTED,
    /**
    * bgp Disconnected
    */
    BGP_DISCONNECTED,
    /**
    * bgp Connected
    */
    BGP_CONNECTED,
    /**
    * remote Network Alive
    */
    REMOTE_NETWORK_ALIVE,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For RemoteNetworkStatus values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
