// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Azure Encryption.
*/
public enum AzureEncryption
{
    /**
    * microsoft Storage
    */
    MICROSOFT_STORAGE,
    /**
    * microsoft Key Vault
    */
    MICROSOFT_KEY_VAULT,
    /**
    * customer
    */
    CUSTOMER,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For AzureEncryption values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
