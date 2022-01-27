// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Planner Context State.
*/
public enum PlannerContextState
{
    /**
    * active
    */
    ACTIVE,
    /**
    * delinked
    */
    DELINKED,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For PlannerContextState values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
