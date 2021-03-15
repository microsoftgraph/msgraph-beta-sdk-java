// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Routing Policy.
*/
public enum RoutingPolicy
{
    /**
    * none
    */
    NONE,
    /**
    * no Missed Call
    */
    NO_MISSED_CALL,
    /**
    * disable Forwarding Except Phone
    */
    DISABLE_FORWARDING_EXCEPT_PHONE,
    /**
    * disable Forwarding
    */
    DISABLE_FORWARDING,
    /**
    * prefer Skype For Business
    */
    PREFER_SKYPE_FOR_BUSINESS,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For RoutingPolicy values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
