// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.managedtenants.models;


/**
 * The Enum Management Parameter Value Type.
*/
public enum ManagementParameterValueType
{
    /**
    * string
    */
    STRING,
    /**
    * integer
    */
    INTEGER,
    /**
    * boolean
    */
    BOOLEAN,
    /**
    * guid
    */
    GUID,
    /**
    * string Collection
    */
    STRING_COLLECTION,
    /**
    * integer Collection
    */
    INTEGER_COLLECTION,
    /**
    * boolean Collection
    */
    BOOLEAN_COLLECTION,
    /**
    * guid Collection
    */
    GUID_COLLECTION,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For ManagementParameterValueType values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
