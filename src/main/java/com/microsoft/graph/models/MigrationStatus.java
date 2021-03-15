// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Migration Status.
*/
public enum MigrationStatus
{
    /**
    * ready
    */
    READY,
    /**
    * needs Review
    */
    NEEDS_REVIEW,
    /**
    * additional Steps Required
    */
    ADDITIONAL_STEPS_REQUIRED,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For MigrationStatus values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
