// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Authentication Context Detail.
*/
public enum AuthenticationContextDetail
{
    /**
    * required
    */
    REQUIRED,
    /**
    * previously Satisfied
    */
    PREVIOUSLY_SATISFIED,
    /**
    * not Applicable
    */
    NOT_APPLICABLE,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For AuthenticationContextDetail values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
