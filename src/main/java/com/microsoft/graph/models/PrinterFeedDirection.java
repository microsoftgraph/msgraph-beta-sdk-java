// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Printer Feed Direction.
 * @deprecated The printerFeedDirection enum type is deprecated and will stop returning data on July 31, 2023. Please use the printerFeedOrientation enum type instead of this.
*/
@Deprecated
public enum PrinterFeedDirection
{
    /**
    * long Edge First
    */
    LONG_EDGE_FIRST,
    /**
    * short Edge First
    */
    SHORT_EDGE_FIRST,
    /**
    * For PrinterFeedDirection values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
