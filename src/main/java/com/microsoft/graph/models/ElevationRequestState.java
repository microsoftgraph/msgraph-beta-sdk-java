// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Elevation Request State.
*/
public enum ElevationRequestState
{
    /**
    * none
    */
    NONE,
    /**
    * pending
    */
    PENDING,
    /**
    * approved
    */
    APPROVED,
    /**
    * denied
    */
    DENIED,
    /**
    * expired
    */
    EXPIRED,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For ElevationRequestState values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
