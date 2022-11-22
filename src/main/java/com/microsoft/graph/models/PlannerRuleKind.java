// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Planner Rule Kind.
*/
public enum PlannerRuleKind
{
    /**
    * task Rule
    */
    TASK_RULE,
    /**
    * bucket Rule
    */
    BUCKET_RULE,
    /**
    * plan Rule
    */
    PLAN_RULE,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For PlannerRuleKind values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
