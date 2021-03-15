// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Office Update Channel.
*/
public enum OfficeUpdateChannel
{
    /**
    * none
    */
    NONE,
    /**
    * current
    */
    CURRENT,
    /**
    * deferred
    */
    DEFERRED,
    /**
    * first Release Current
    */
    FIRST_RELEASE_CURRENT,
    /**
    * first Release Deferred
    */
    FIRST_RELEASE_DEFERRED,
    /**
    * monthly Enterprise
    */
    MONTHLY_ENTERPRISE,
    /**
    * For OfficeUpdateChannel values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
