// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Client Credential Type.
*/
public enum ClientCredentialType
{
    /**
    * none
    */
    NONE,
    /**
    * client Secret
    */
    CLIENT_SECRET,
    /**
    * client Assertion
    */
    CLIENT_ASSERTION,
    /**
    * federated Identity Credential
    */
    FEDERATED_IDENTITY_CREDENTIAL,
    /**
    * managed Identity
    */
    MANAGED_IDENTITY,
    /**
    * certificate
    */
    CERTIFICATE,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For ClientCredentialType values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
