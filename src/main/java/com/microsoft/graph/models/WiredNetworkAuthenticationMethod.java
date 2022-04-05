// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Wired Network Authentication Method.
*/
public enum WiredNetworkAuthenticationMethod
{
    /**
    * certificate
    */
    CERTIFICATE,
    /**
    * username And Password
    */
    USERNAME_AND_PASSWORD,
    /**
    * derived Credential
    */
    DERIVED_CREDENTIAL,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For WiredNetworkAuthenticationMethod values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
