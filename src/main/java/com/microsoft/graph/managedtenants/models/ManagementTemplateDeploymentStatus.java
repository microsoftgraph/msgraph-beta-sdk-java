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
    * unknown
    */
    UNKNOWN,
    /**
    * in Progress
    */
    IN_PROGRESS,
    /**
    * completed
    */
    COMPLETED,
    /**
    * failed
    */
    FAILED,
    /**
    * ineligible
    */
    INELIGIBLE,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For ManagementTemplateDeploymentStatus values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
