// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Incoming Token Type.
*/
public enum IncomingTokenType
{
    /**
    * none
    */
    NONE,
    /**
    * primary Refresh Token
    */
    PRIMARY_REFRESH_TOKEN,
    /**
    * saml11
    */
    SAML11,
    /**
    * saml20
    */
    SAML20,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For IncomingTokenType values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
