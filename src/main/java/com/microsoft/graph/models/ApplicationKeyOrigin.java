// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Application Key Origin.
*/
public enum ApplicationKeyOrigin
{
    /**
    * application
    */
    APPLICATION,
    /**
    * service Principal
    */
    SERVICE_PRINCIPAL,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For ApplicationKeyOrigin values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
