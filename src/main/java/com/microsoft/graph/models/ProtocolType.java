// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Protocol Type.
*/
public enum ProtocolType
{
    /**
    * none
    */
    NONE,
    /**
    * o Auth2
    */
    O_AUTH2,
    /**
    * ropc
    */
    ROPC,
    /**
    * ws Federation
    */
    WS_FEDERATION,
    /**
    * saml20
    */
    SAML20,
    /**
    * device Code
    */
    DEVICE_CODE,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For ProtocolType values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
