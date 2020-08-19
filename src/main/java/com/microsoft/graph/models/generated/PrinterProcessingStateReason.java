// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.generated;


/**
 * The Enum Printer Processing State Reason.
*/
public enum PrinterProcessingStateReason
{
    /**
    * paused
    */
    PAUSED,
    /**
    * disconnected
    */
    DISCONNECTED,
    /**
    * media Jam
    */
    MEDIA_JAM,
    /**
    * media Needed
    */
    MEDIA_NEEDED,
    /**
    * media Low
    */
    MEDIA_LOW,
    /**
    * media Empty
    */
    MEDIA_EMPTY,
    /**
    * cover Open
    */
    COVER_OPEN,
    /**
    * interlock Open
    */
    INTERLOCK_OPEN,
    /**
    * queue Full
    */
    QUEUE_FULL,
    /**
    * output Tray Missing
    */
    OUTPUT_TRAY_MISSING,
    /**
    * output Area Full
    */
    OUTPUT_AREA_FULL,
    /**
    * marker Supply Low
    */
    MARKER_SUPPLY_LOW,
    /**
    * marker Supply Empty
    */
    MARKER_SUPPLY_EMPTY,
    /**
    * input Tray Missing
    */
    INPUT_TRAY_MISSING,
    /**
    * output Almost Full
    */
    OUTPUT_ALMOST_FULL,
    /**
    * marker Waste Almost Full
    */
    MARKER_WASTE_ALMOST_FULL,
    /**
    * marker Waste Full
    */
    MARKER_WASTE_FULL,
    /**
    * fuser Over Temp
    */
    FUSER_OVER_TEMP,
    /**
    * fuser Under Temp
    */
    FUSER_UNDER_TEMP,
    /**
    * other
    */
    OTHER,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For PrinterProcessingStateReason values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
