// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Assignment Filter Operator.
*/
public enum AssignmentFilterOperator
{
    /**
    * not Set
    */
    NOT_SET,
    /**
    * equals
    */
    EQUALS,
    /**
    * not Equals
    */
    NOT_EQUALS,
    /**
    * starts With
    */
    STARTS_WITH,
    /**
    * not Starts With
    */
    NOT_STARTS_WITH,
    /**
    * contains
    */
    CONTAINS,
    /**
    * not Contains
    */
    NOT_CONTAINS,
    /**
    * in
    */
    IN,
    /**
    * not In
    */
    NOT_IN,
    /**
    * ends With
    */
    ENDS_WITH,
    /**
    * not Ends With
    */
    NOT_ENDS_WITH,
    /**
    * For AssignmentFilterOperator values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
