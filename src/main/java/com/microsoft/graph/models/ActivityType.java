// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Activity Type.
*/
public enum ActivityType
{
    /**
    * signin
    */
    SIGNIN,
    /**
    * user
    */
    USER,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * service Principal
    */
    SERVICE_PRINCIPAL,
    /**
    * For ActivityType values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
