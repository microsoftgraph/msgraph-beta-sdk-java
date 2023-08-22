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
    * device Filter Include Rule Not Matched
    */
    DEVICE_FILTER_INCLUDE_RULE_NOT_MATCHED,
    /**
    * all Device States
    */
    ALL_DEVICE_STATES,
    /**
    * anonymized IPAddress
    */
    ANONYMIZED_IP_ADDRESS,
    /**
    * unfamiliar Features
    */
    UNFAMILIAR_FEATURES,
    /**
    * nation State IPAddress
    */
    NATION_STATE_IP_ADDRESS,
    /**
    * real Time Threat Intelligence
    */
    REAL_TIME_THREAT_INTELLIGENCE,
    /**
    * internal Guest
    */
    INTERNAL_GUEST,
    /**
    * b2b Collaboration Guest
    */
    B2B_COLLABORATION_GUEST,
    /**
    * b2b Collaboration Member
    */
    B2B_COLLABORATION_MEMBER,
    /**
    * b2b Direct Connect User
    */
    B2B_DIRECT_CONNECT_USER,
    /**
    * other External User
    */
    OTHER_EXTERNAL_USER,
    /**
    * service Provider
    */
    SERVICE_PROVIDER,
    /**
    * microsoft Admin Portals
    */
    MICROSOFT_ADMIN_PORTALS,
    /**
    * device Code Flow
    */
    DEVICE_CODE_FLOW,
    /**
    * authentication Transfer
    */
    AUTHENTICATION_TRANSFER,
    /**
    * insider Risk
    */
    INSIDER_RISK,
    /**
    * For ConditionalAccessRule values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
