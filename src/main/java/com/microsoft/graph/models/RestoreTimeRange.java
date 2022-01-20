// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Restore Time Range.
*/
public enum RestoreTimeRange
{
    /**
    * before
    */
    BEFORE,
    /**
    * after
    */
    AFTER,
    /**
    * before Or After
    */
    BEFORE_OR_AFTER,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For RestoreTimeRange values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
