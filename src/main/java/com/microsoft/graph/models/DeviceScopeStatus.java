// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Device Scope Status.
*/
public enum DeviceScopeStatus
{
    /**
    * none
    */
    NONE,
    /**
    * computing
    */
    COMPUTING,
    /**
    * insufficient Data
    */
    INSUFFICIENT_DATA,
    /**
    * completed
    */
    COMPLETED,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For DeviceScopeStatus values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
