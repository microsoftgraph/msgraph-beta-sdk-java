// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.windowsupdates.models;


/**
 * The Enum Resource Connection State.
*/
public enum ResourceConnectionState
{
    /**
    * connected
    */
    CONNECTED,
    /**
    * not Authorized
    */
    NOT_AUTHORIZED,
    /**
    * not Found
    */
    NOT_FOUND,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For ResourceConnectionState values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
