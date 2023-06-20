// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.networkaccess.models;


/**
 * The Enum Ip Sec Encryption.
*/
public enum IpSecEncryption
{
    /**
    * none
    */
    NONE,
    /**
    * gcm Aes128
    */
    GCM_AES128,
    /**
    * gcm Aes192
    */
    GCM_AES192,
    /**
    * gcm Aes256
    */
    GCM_AES256,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For IpSecEncryption values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
