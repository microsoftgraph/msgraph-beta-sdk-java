// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Single Sign On Mode.
*/
public enum SingleSignOnMode
{
    /**
    * none
    */
    NONE,
    /**
    * on Premises Kerberos
    */
    ON_PREMISES_KERBEROS,
    /**
    * saml
    */
    SAML,
    /**
    * ping Header Based
    */
    PING_HEADER_BASED,
    /**
    * aad Header Based
    */
    AAD_HEADER_BASED,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For SingleSignOnMode values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
