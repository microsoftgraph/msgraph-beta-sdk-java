// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Planner Plan Access Level.
*/
public enum PlannerPlanAccessLevel
{
    /**
    * read Access
    */
    READ_ACCESS,
    /**
    * read Write Access
    */
    READ_WRITE_ACCESS,
    /**
    * full Access
    */
    FULL_ACCESS,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For PlannerPlanAccessLevel values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
