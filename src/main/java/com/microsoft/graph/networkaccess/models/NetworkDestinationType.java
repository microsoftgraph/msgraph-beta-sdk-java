// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.networkaccess.models;


/**
 * The Enum Network Destination Type.
*/
public enum NetworkDestinationType
{
    /**
    * url
    */
    URL,
    /**
    * fqdn
    */
    FQDN,
    /**
    * ip Address
    */
    IP_ADDRESS,
    /**
    * ip Range
    */
    IP_RANGE,
    /**
    * ip Subnet
    */
    IP_SUBNET,
    /**
    * web Category
    */
    WEB_CATEGORY,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For NetworkDestinationType values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
