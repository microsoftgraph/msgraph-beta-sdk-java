// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Print Duplex Configuration.
 * @deprecated The duplexConfiguration enum type is deprecated and will stop returning data on July 31, 2023. Please use the printDuplexMode enum type instead of this.
*/
@Deprecated
public enum PrintDuplexConfiguration
{
    /**
    * two Sided Long Edge
    */
    TWO_SIDED_LONG_EDGE,
    /**
    * two Sided Short Edge
    */
    TWO_SIDED_SHORT_EDGE,
    /**
    * one Sided
    */
    ONE_SIDED,
    /**
    * For PrintDuplexConfiguration values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
