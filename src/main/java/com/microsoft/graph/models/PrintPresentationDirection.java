// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Print Presentation Direction.
 * @deprecated The presentationDirection enum type is deprecated and will stop returning data on July 31, 2023. Please use the printMultipageLayout enum type instead of this.
*/
@Deprecated
public enum PrintPresentationDirection
{
    /**
    * clockwise From Top Left
    */
    CLOCKWISE_FROM_TOP_LEFT,
    /**
    * counter Clockwise From Top Left
    */
    COUNTER_CLOCKWISE_FROM_TOP_LEFT,
    /**
    * counter Clockwise From Top Right
    */
    COUNTER_CLOCKWISE_FROM_TOP_RIGHT,
    /**
    * clockwise From Top Right
    */
    CLOCKWISE_FROM_TOP_RIGHT,
    /**
    * counter Clockwise From Bottom Left
    */
    COUNTER_CLOCKWISE_FROM_BOTTOM_LEFT,
    /**
    * clockwise From Bottom Left
    */
    CLOCKWISE_FROM_BOTTOM_LEFT,
    /**
    * counter Clockwise From Bottom Right
    */
    COUNTER_CLOCKWISE_FROM_BOTTOM_RIGHT,
    /**
    * clockwise From Bottom Right
    */
    CLOCKWISE_FROM_BOTTOM_RIGHT,
    /**
    * For PrintPresentationDirection values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
