// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Assignment Filter Evaluation Result.
*/
public enum AssignmentFilterEvaluationResult
{
    /**
    * unknown
    */
    UNKNOWN,
    /**
    * match
    */
    MATCH,
    /**
    * not Match
    */
    NOT_MATCH,
    /**
    * inconclusive
    */
    INCONCLUSIVE,
    /**
    * failure
    */
    FAILURE,
    /**
    * not Evaluated
    */
    NOT_EVALUATED,
    /**
    * For AssignmentFilterEvaluationResult values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
