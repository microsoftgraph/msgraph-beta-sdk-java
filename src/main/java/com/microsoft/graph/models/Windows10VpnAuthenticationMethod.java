// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Windows10Vpn Authentication Method.
*/
public enum Windows10VpnAuthenticationMethod
{
    /**
    * certificate
    */
    CERTIFICATE,
    /**
    * username And Password
    */
    USERNAME_AND_PASSWORD,
    /**
    * custom Eap Xml
    */
    CUSTOM_EAP_XML,
    /**
    * derived Credential
    */
    DERIVED_CREDENTIAL,
    /**
    * For Windows10VpnAuthenticationMethod values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
