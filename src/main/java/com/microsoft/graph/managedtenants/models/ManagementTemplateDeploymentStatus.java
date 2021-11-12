// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.managedtenants.models;


/**
 * The Enum Management Template Deployment Status.
*/
public enum ManagementTemplateDeploymentStatus
{
    /**
    * to Address
    */
    TO_ADDRESS,
    /**
    * completed
    */
    COMPLETED,
    /**
    * error
    */
    ERROR,
    /**
    * time Out
    */
    TIME_OUT,
    /**
    * in Progress
    */
    IN_PROGRESS,
    /**
    * planned
    */
    PLANNED,
    /**
    * resolved By3rd Party
    */
    RESOLVED_BY3RD_PARTY,
    /**
    * resolved Through Alternate Mitigation
    */
    RESOLVED_THROUGH_ALTERNATE_MITIGATION,
    /**
    * risk Accepted
    */
    RISK_ACCEPTED,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For ManagementTemplateDeploymentStatus values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
