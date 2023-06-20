// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.networkaccess.models;


/**
 * The Enum Redundancy Tier.
*/
public enum RedundancyTier
{
    /**
    * no Redundancy
    */
    NO_REDUNDANCY,
    /**
    * zone Redundancy
    */
    ZONE_REDUNDANCY,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For RedundancyTier values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
