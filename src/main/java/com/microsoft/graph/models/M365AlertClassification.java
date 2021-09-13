// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum M365Alert Classification.
*/
public enum M365AlertClassification
{
    /**
    * unknown
    */
    UNKNOWN,
    /**
    * false Positive
    */
    FALSE_POSITIVE,
    /**
    * true Positive
    */
    TRUE_POSITIVE,
    /**
    * benign Positive
    */
    BENIGN_POSITIVE,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For M365AlertClassification values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
