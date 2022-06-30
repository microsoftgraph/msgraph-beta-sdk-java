// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.security.models;


/**
 * The Enum Action After Retention Period.
*/
public enum ActionAfterRetentionPeriod
{
    /**
    * none
    */
    NONE,
    /**
    * delete
    */
    DELETE,
    /**
    * start Disposition Review
    */
    START_DISPOSITION_REVIEW,
    /**
    * relabel
    */
    RELABEL,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For ActionAfterRetentionPeriod values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
