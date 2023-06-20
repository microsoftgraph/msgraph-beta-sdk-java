// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.networkaccess.models;


/**
 * The Enum Ike Integrity.
*/
public enum IkeIntegrity
{
    /**
    * sha256
    */
    SHA256,
    /**
    * sha384
    */
    SHA384,
    /**
    * gcm Aes128
    */
    GCM_AES128,
    /**
    * gcm Aes256
    */
    GCM_AES256,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For IkeIntegrity values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
