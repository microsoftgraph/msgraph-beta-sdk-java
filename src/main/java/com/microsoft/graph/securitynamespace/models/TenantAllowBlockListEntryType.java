// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.security.models;


/**
 * The Enum Tenant Allow Block List Entry Type.
*/
public enum TenantAllowBlockListEntryType
{
    /**
    * url
    */
    URL,
    /**
    * file Hash
    */
    FILE_HASH,
    /**
    * sender
    */
    SENDER,
    /**
    * recipient
    */
    RECIPIENT,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For TenantAllowBlockListEntryType values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
