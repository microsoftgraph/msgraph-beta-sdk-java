// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Device Event Level.
*/
public enum DeviceEventLevel
{
    /**
    * none
    */
    NONE,
    /**
    * verbose
    */
    VERBOSE,
    /**
    * information
    */
    INFORMATION,
    /**
    * warning
    */
    WARNING,
    /**
    * error
    */
    ERROR,
    /**
    * critical
    */
    CRITICAL,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For DeviceEventLevel values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
