// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Intended Purpose.
*/
public enum IntendedPurpose
{
    /**
    * unassigned
    */
    UNASSIGNED,
    /**
    * smime Encryption
    */
    SMIME_ENCRYPTION,
    /**
    * smime Signing
    */
    SMIME_SIGNING,
    /**
    * vpn
    */
    VPN,
    /**
    * wifi
    */
    WIFI,
    /**
    * For IntendedPurpose values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
