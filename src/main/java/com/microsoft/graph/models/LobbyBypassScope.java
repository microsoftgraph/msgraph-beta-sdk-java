// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Lobby Bypass Scope.
*/
public enum LobbyBypassScope
{
    /**
    * organizer
    */
    ORGANIZER,
    /**
    * organization
    */
    ORGANIZATION,
    /**
    * organization And Federated
    */
    ORGANIZATION_AND_FEDERATED,
    /**
    * everyone
    */
    EVERYONE,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * invited
    */
    INVITED,
    /**
    * organization Excluding Guests
    */
    ORGANIZATION_EXCLUDING_GUESTS,
    /**
    * For LobbyBypassScope values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
