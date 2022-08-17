// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Ingestion Source.
*/
public enum IngestionSource
{
    /**
    * unknown
    */
    UNKNOWN,
    /**
    * custom
    */
    CUSTOM,
    /**
    * built In
    */
    BUILT_IN,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For IngestionSource values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
