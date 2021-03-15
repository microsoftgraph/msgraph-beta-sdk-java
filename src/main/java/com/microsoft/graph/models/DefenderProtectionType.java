// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Defender Protection Type.
*/
public enum DefenderProtectionType
{
    /**
    * user Defined
    */
    USER_DEFINED,
    /**
    * enable
    */
    ENABLE,
    /**
    * audit Mode
    */
    AUDIT_MODE,
    /**
    * warn
    */
    WARN,
    /**
    * not Configured
    */
    NOT_CONFIGURED,
    /**
    * For DefenderProtectionType values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
