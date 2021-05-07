// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Conditional Access Conditions.
*/
public enum ConditionalAccessConditions
{
    /**
    * none
    */
    NONE,
    /**
    * application
    */
    APPLICATION,
    /**
    * users
    */
    USERS,
    /**
    * device Platform
    */
    DEVICE_PLATFORM,
    /**
    * location
    */
    LOCATION,
    /**
    * client Type
    */
    CLIENT_TYPE,
    /**
    * sign In Risk
    */
    SIGN_IN_RISK,
    /**
    * user Risk
    */
    USER_RISK,
    /**
    * time
    */
    TIME,
    /**
    * device State
    */
    DEVICE_STATE,
    /**
    * client
    */
    CLIENT,
    /**
    * ip Address Seen By Azure AD
    */
    IP_ADDRESS_SEEN_BY_AZURE_AD,
    /**
    * ip Address Seen By Resource Provider
    */
    IP_ADDRESS_SEEN_BY_RESOURCE_PROVIDER,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For ConditionalAccessConditions values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
