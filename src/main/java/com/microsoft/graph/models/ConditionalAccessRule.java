// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Conditional Access Rule.
*/
public enum ConditionalAccessRule
{
    /**
    * all Apps
    */
    ALL_APPS,
    /**
    * first Party Apps
    */
    FIRST_PARTY_APPS,
    /**
    * office365
    */
    OFFICE365,
    /**
    * app Id
    */
    APP_ID,
    /**
    * acr
    */
    ACR,
    /**
    * app Filter
    */
    APP_FILTER,
    /**
    * all Users
    */
    ALL_USERS,
    /**
    * guest
    */
    GUEST,
    /**
    * group Id
    */
    GROUP_ID,
    /**
    * role Id
    */
    ROLE_ID,
    /**
    * user Id
    */
    USER_ID,
    /**
    * all Device Platforms
    */
    ALL_DEVICE_PLATFORMS,
    /**
    * device Platform
    */
    DEVICE_PLATFORM,
    /**
    * all Locations
    */
    ALL_LOCATIONS,
    /**
    * inside Corpnet
    */
    INSIDE_CORPNET,
    /**
    * all Trusted Locations
    */
    ALL_TRUSTED_LOCATIONS,
    /**
    * location Id
    */
    LOCATION_ID,
    /**
    * all Devices
    */
    ALL_DEVICES,
    /**
    * device Filter
    */
    DEVICE_FILTER,
    /**
    * device State
    */
    DEVICE_STATE,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For ConditionalAccessRule values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
