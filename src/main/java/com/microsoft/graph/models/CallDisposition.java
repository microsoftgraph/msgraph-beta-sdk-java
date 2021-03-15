// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Call Disposition.
*/
public enum CallDisposition
{
    /**
    * default
    */
    DEFAULT,
    /**
    * simultaneous Ring
    */
    SIMULTANEOUS_RING,
    /**
    * forward
    */
    FORWARD,
    /**
    * For CallDisposition values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
