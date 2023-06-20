// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.networkaccess.models;


/**
 * The Enum Ip Sec Integrity.
*/
public enum IpSecIntegrity
{
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
    * sha256
    */
    SHA256,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For IpSecIntegrity values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
