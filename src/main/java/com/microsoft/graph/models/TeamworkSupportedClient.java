// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Teamwork Supported Client.
*/
public enum TeamworkSupportedClient
{
    /**
    * unknown
    */
    UNKNOWN,
    /**
    * skype Default And Teams
    */
    SKYPE_DEFAULT_AND_TEAMS,
    /**
    * teams Default And Skype
    */
    TEAMS_DEFAULT_AND_SKYPE,
    /**
    * skype Only
    */
    SKYPE_ONLY,
    /**
    * teams Only
    */
    TEAMS_ONLY,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For TeamworkSupportedClient values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
