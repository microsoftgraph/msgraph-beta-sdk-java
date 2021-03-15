// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Property Type.
*/
public enum PropertyType
{
    /**
    * String
    */
    STRING,
    /**
    * Int64
    */
    INT64,
    /**
    * Double
    */
    DOUBLE,
    /**
    * Date Time
    */
    DATE_TIME,
    /**
    * Boolean
    */
    BOOLEAN,
    /**
    * String Collection
    */
    STRING_COLLECTION,
    /**
    * Int64Collection
    */
    INT64_COLLECTION,
    /**
    * Double Collection
    */
    DOUBLE_COLLECTION,
    /**
    * Date Time Collection
    */
    DATE_TIME_COLLECTION,
    /**
    * For PropertyType values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
