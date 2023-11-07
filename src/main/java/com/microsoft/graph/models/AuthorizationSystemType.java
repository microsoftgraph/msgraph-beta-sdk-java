// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Authorization System Type.
*/
public enum AuthorizationSystemType
{
    /**
    * azure
    */
    AZURE,
    /**
    * gcp
    */
    GCP,
    /**
    * aws
    */
    AWS,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For AuthorizationSystemType values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
