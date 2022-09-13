// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.devicemanagement.models;


/**
 * The Enum Operator Type.
*/
public enum OperatorType
{
    /**
    * greater Or Equal
    */
    GREATER_OR_EQUAL,
    /**
    * equal
    */
    EQUAL,
    /**
    * greater
    */
    GREATER,
    /**
    * less
    */
    LESS,
    /**
    * less Or Equal
    */
    LESS_OR_EQUAL,
    /**
    * not Equal
    */
    NOT_EQUAL,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For OperatorType values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
