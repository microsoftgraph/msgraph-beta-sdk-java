// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Planner Relationship User Roles.
*/
public enum PlannerRelationshipUserRoles
{
    /**
    * default Rules
    */
    DEFAULT_RULES,
    /**
    * group Owners
    */
    GROUP_OWNERS,
    /**
    * group Members
    */
    GROUP_MEMBERS,
    /**
    * task Assignees
    */
    TASK_ASSIGNEES,
    /**
    * applications
    */
    APPLICATIONS,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For PlannerRelationshipUserRoles values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
