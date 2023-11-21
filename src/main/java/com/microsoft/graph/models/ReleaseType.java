// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Release Type.
*/
public enum ReleaseType
{
    /**
    * preview
    */
    PREVIEW,
    /**
    * generally Available
    */
    GENERALLY_AVAILABLE,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For ReleaseType values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
