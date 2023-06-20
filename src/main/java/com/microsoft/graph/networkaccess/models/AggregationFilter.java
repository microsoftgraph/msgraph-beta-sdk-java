// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.networkaccess.models;


/**
 * The Enum Aggregation Filter.
*/
public enum AggregationFilter
{
    /**
    * transactions
    */
    TRANSACTIONS,
    /**
    * users
    */
    USERS,
    /**
    * devices
    */
    DEVICES,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For AggregationFilter values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
