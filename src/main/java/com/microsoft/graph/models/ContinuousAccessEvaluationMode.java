// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Continuous Access Evaluation Mode.
*/
public enum ContinuousAccessEvaluationMode
{
    /**
    * strict Enforcement
    */
    STRICT_ENFORCEMENT,
    /**
    * disabled
    */
    DISABLED,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * strict Location
    */
    STRICT_LOCATION,
    /**
    * For ContinuousAccessEvaluationMode values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
