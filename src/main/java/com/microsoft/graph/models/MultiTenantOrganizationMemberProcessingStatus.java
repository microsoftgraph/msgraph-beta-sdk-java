// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Multi Tenant Organization Member Processing Status.
*/
public enum MultiTenantOrganizationMemberProcessingStatus
{
    /**
    * not Started
    */
    NOT_STARTED,
    /**
    * running
    */
    RUNNING,
    /**
    * succeeded
    */
    SUCCEEDED,
    /**
    * failed
    */
    FAILED,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For MultiTenantOrganizationMemberProcessingStatus values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
