// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Private Network Destination Type.
*/
public enum PrivateNetworkDestinationType
{
    /**
    * ip Address
    */
    IP_ADDRESS,
    /**
    * ip Range
    */
    IP_RANGE,
    /**
    * ip Range Cidr
    */
    IP_RANGE_CIDR,
    /**
    * fqdn
    */
    FQDN,
    /**
    * dns Suffix
    */
    DNS_SUFFIX,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For PrivateNetworkDestinationType values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
