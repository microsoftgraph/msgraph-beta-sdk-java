// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.networkaccess.models;


/**
 * The Enum Ike Encryption.
*/
public enum IkeEncryption
{
    /**
    * aes128
    */
    AES128,
    /**
    * aes192
    */
    AES192,
    /**
    * aes256
    */
    AES256,
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
    * For IkeEncryption values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
