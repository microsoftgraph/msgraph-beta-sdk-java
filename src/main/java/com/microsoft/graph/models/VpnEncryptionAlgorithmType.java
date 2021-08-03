// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Vpn Encryption Algorithm Type.
*/
public enum VpnEncryptionAlgorithmType
{
    /**
    * aes256
    */
    AES256,
    /**
    * des
    */
    DES,
    /**
    * triple Des
    */
    TRIPLE_DES,
    /**
    * aes128
    */
    AES128,
    /**
    * aes128Gcm
    */
    AES128_GCM,
    /**
    * aes256Gcm
    */
    AES256_GCM,
    /**
    * aes192
    */
    AES192,
    /**
    * aes192Gcm
    */
    AES192_GCM,
    /**
    * cha Cha20Poly1305
    */
    CHA_CHA20_POLY1305,
    /**
    * For VpnEncryptionAlgorithmType values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
