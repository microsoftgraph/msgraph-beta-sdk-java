// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.security.models;


/**
 * The Enum Isolation Type.
*/
public enum IsolationType
{
    /**
    * full
    */
    FULL,
    /**
    * selective
    */
    SELECTIVE,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For IsolationType values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
