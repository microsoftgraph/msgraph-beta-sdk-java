// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Organizational Message Status.
*/
public enum OrganizationalMessageStatus
{
    /**
    * scheduled
    */
    SCHEDULED,
    /**
    * active
    */
    ACTIVE,
    /**
    * completed
    */
    COMPLETED,
    /**
    * cancelled
    */
    CANCELLED,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For OrganizationalMessageStatus values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
