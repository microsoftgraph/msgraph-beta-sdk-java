// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.networkaccess.models;


/**
 * The Enum Traffic Type.
*/
public enum TrafficType
{
    /**
    * internet
    */
    INTERNET,
    /**
    * private
    */
    PRIVATE,
    /**
    * microsoft365
    */
    MICROSOFT365,
    /**
    * all
    */
    ALL,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For TrafficType values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
