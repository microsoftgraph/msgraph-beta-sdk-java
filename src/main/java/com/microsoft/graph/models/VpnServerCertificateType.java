// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Vpn Server Certificate Type.
*/
public enum VpnServerCertificateType
{
    /**
    * rsa
    */
    RSA,
    /**
    * ecdsa256
    */
    ECDSA256,
    /**
    * ecdsa384
    */
    ECDSA384,
    /**
    * ecdsa521
    */
    ECDSA521,
    /**
    * For VpnServerCertificateType values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
