// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Delivery Optimization Group Id Options Type.
*/
public enum DeliveryOptimizationGroupIdOptionsType
{
    /**
    * not Configured
    */
    NOT_CONFIGURED,
    /**
    * ad Site
    */
    AD_SITE,
    /**
    * authenticated Domain Sid
    */
    AUTHENTICATED_DOMAIN_SID,
    /**
    * dhcp User Option
    */
    DHCP_USER_OPTION,
    /**
    * dns Suffix
    */
    DNS_SUFFIX,
    /**
    * For DeliveryOptimizationGroupIdOptionsType values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
