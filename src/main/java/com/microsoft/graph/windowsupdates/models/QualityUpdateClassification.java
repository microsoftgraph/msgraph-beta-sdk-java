// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.windowsupdates.models;


/**
 * The Enum Quality Update Classification.
*/
public enum QualityUpdateClassification
{
    /**
    * all
    */
    ALL,
    /**
    * security
    */
    SECURITY,
    /**
    * non Security
    */
    NON_SECURITY,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For QualityUpdateClassification values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
