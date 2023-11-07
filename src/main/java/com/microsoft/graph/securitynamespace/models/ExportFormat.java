// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.security.models;


/**
 * The Enum Export Format.
*/
public enum ExportFormat
{
    /**
    * pst
    */
    PST,
    /**
    * msg
    */
    MSG,
    /**
    * eml
    */
    EML,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For ExportFormat values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
