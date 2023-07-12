// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.security.models;


/**
 * The Enum Export Options.
*/
public enum ExportOptions
{
    /**
    * original Files
    */
    ORIGINAL_FILES,
    /**
    * text
    */
    TEXT,
    /**
    * pdf Replacement
    */
    PDF_REPLACEMENT,
    /**
    * file Info
    * @deprecated The fileInfo will be deprecated on July 30, 2023.
    */
    @Deprecated
    FILE_INFO,
    /**
    * tags
    */
    TAGS,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For ExportOptions values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
