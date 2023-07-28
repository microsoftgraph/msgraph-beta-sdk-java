// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.security.models;


/**
 * The Enum Mark User As Compromised Entity Identifier.
*/
public enum MarkUserAsCompromisedEntityIdentifier
{
    /**
    * account Object Id
    */
    ACCOUNT_OBJECT_ID,
    /**
    * initiating Process Account Object Id
    */
    INITIATING_PROCESS_ACCOUNT_OBJECT_ID,
    /**
    * service Principal Id
    */
    SERVICE_PRINCIPAL_ID,
    /**
    * recipient Object Id
    */
    RECIPIENT_OBJECT_ID,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For MarkUserAsCompromisedEntityIdentifier values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
