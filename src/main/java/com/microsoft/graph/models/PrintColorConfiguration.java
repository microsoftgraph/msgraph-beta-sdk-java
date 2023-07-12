// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Print Color Configuration.
 * @deprecated The printColorConfiguration enum type is deprecated and will stop returning data on July 31, 2023. Please use the printColorMode enum type instead of this.
*/
@Deprecated
public enum PrintColorConfiguration
{
    /**
    * black And White
    */
    BLACK_AND_WHITE,
    /**
    * grayscale
    */
    GRAYSCALE,
    /**
    * color
    */
    COLOR,
    /**
    * auto
    */
    AUTO,
    /**
    * For PrintColorConfiguration values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
