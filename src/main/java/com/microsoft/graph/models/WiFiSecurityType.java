// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Wi Fi Security Type.
*/
public enum WiFiSecurityType
{
    /**
    * open
    */
    OPEN,
    /**
    * wpa Personal
    */
    WPA_PERSONAL,
    /**
    * wpa Enterprise
    */
    WPA_ENTERPRISE,
    /**
    * wep
    */
    WEP,
    /**
    * wpa2Personal
    */
    WPA2_PERSONAL,
    /**
    * wpa2Enterprise
    */
    WPA2_ENTERPRISE,
    /**
    * For WiFiSecurityType values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
