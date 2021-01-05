// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.generated;


/**
 * The Enum Mac OSContent Caching Client Policy.
*/
public enum MacOSContentCachingClientPolicy
{
    /**
    * not Configured
    */
    NOT_CONFIGURED,
    /**
    * clients In Local Network
    */
    CLIENTS_IN_LOCAL_NETWORK,
    /**
    * clients With Same Public Ip Address
    */
    CLIENTS_WITH_SAME_PUBLIC_IP_ADDRESS,
    /**
    * clients In Custom Local Networks
    */
    CLIENTS_IN_CUSTOM_LOCAL_NETWORKS,
    /**
    * clients In Custom Local Networks With Fallback
    */
    CLIENTS_IN_CUSTOM_LOCAL_NETWORKS_WITH_FALLBACK,
    /**
    * For MacOSContentCachingClientPolicy values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
