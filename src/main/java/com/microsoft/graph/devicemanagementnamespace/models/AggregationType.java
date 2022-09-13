// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.devicemanagement.models;


/**
 * The Enum Aggregation Type.
*/
public enum AggregationType
{
    /**
    * count
    */
    COUNT,
    /**
    * percentage
    */
    PERCENTAGE,
    /**
    * affected Cloud Pc Count
    */
    AFFECTED_CLOUD_PC_COUNT,
    /**
    * affected Cloud Pc Percentage
    */
    AFFECTED_CLOUD_PC_PERCENTAGE,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For AggregationType values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
