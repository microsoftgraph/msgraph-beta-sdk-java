// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum User New Message Restriction.
*/
public enum UserNewMessageRestriction
{
    /**
    * everyone
    */
    EVERYONE,
    /**
    * everyone Except Guests
    */
    EVERYONE_EXCEPT_GUESTS,
    /**
    * moderators
    */
    MODERATORS,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For UserNewMessageRestriction values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
