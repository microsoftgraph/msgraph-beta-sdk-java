// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Recommendation Status.
*/
public enum RecommendationStatus
{
    /**
    * active
    */
    ACTIVE,
    /**
    * completed By System
    */
    COMPLETED_BY_SYSTEM,
    /**
    * completed By User
    */
    COMPLETED_BY_USER,
    /**
    * dismissed
    */
    DISMISSED,
    /**
    * postponed
    */
    POSTPONED,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For RecommendationStatus values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
