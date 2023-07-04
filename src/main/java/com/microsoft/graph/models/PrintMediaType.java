// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Print Media Type.
 * @deprecated The printMediaType enum type is deprecated and will stop returning data on July 31, 2023. This enum type properties are replaced with string type properties.
*/
@Deprecated
public enum PrintMediaType
{
    /**
    * stationery
    */
    STATIONERY,
    /**
    * transparency
    */
    TRANSPARENCY,
    /**
    * envelope
    */
    ENVELOPE,
    /**
    * envelope Plain
    */
    ENVELOPE_PLAIN,
    /**
    * continuous
    */
    CONTINUOUS,
    /**
    * screen
    */
    SCREEN,
    /**
    * screen Paged
    */
    SCREEN_PAGED,
    /**
    * continuous Long
    */
    CONTINUOUS_LONG,
    /**
    * continuous Short
    */
    CONTINUOUS_SHORT,
    /**
    * envelope Window
    */
    ENVELOPE_WINDOW,
    /**
    * multi Part Form
    */
    MULTI_PART_FORM,
    /**
    * multi Layer
    */
    MULTI_LAYER,
    /**
    * labels
    */
    LABELS,
    /**
    * For PrintMediaType values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
