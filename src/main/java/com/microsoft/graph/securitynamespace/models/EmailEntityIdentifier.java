// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.security.models;


/**
 * The Enum Email Entity Identifier.
*/
public enum EmailEntityIdentifier
{
    /**
    * network Message Id
    */
    NETWORK_MESSAGE_ID,
    /**
    * recipient Email Address
    */
    RECIPIENT_EMAIL_ADDRESS,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For EmailEntityIdentifier values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
