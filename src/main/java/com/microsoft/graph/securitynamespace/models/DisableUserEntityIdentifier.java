// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.security.models;


/**
 * The Enum Disable User Entity Identifier.
*/
public enum DisableUserEntityIdentifier
{
    /**
    * account Sid
    */
    ACCOUNT_SID,
    /**
    * initiating Process Account Sid
    */
    INITIATING_PROCESS_ACCOUNT_SID,
    /**
    * request Account Sid
    */
    REQUEST_ACCOUNT_SID,
    /**
    * on Prem Sid
    */
    ON_PREM_SID,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For DisableUserEntityIdentifier values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
