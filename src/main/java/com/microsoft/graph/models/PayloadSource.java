// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Payload Source.
*/
public enum PayloadSource
{
    /**
    * unknown
    */
    UNKNOWN,
    /**
    * global
    */
    GLOBAL,
    /**
    * tenant
    */
    TENANT,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For PayloadSource values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
