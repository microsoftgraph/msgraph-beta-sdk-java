// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Vpn Integrity Algorithm Type.
*/
public enum VpnIntegrityAlgorithmType
{
    /**
    * sha2_256
    */
    SHA2_256,
    /**
    * sha1_96
    */
    SHA1_96,
    /**
    * sha1_160
    */
    SHA1_160,
    /**
    * sha2_384
    */
    SHA2_384,
    /**
    * sha2_512
    */
    SHA2_512,
    /**
    * md5
    */
    MD5,
    /**
    * For VpnIntegrityAlgorithmType values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
