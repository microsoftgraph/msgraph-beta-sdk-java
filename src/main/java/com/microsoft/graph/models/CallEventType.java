// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Call Event Type.
*/
public enum CallEventType
{
    /**
    * call Started
    */
    CALL_STARTED,
    /**
    * call Ended
    */
    CALL_ENDED,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For CallEventType values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
