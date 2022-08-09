// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Cloud Pc Connectivity Status.
*/
public enum CloudPcConnectivityStatus
{
    /**
    * unknown
    */
    UNKNOWN,
    /**
    * available
    */
    AVAILABLE,
    /**
    * available With Warning
    */
    AVAILABLE_WITH_WARNING,
    /**
    * unavailable
    */
    UNAVAILABLE,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For CloudPcConnectivityStatus values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
