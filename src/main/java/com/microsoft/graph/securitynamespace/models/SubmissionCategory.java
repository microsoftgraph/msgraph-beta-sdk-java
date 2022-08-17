// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.security.models;


/**
 * The Enum Submission Category.
*/
public enum SubmissionCategory
{
    /**
    * not Junk
    */
    NOT_JUNK,
    /**
    * spam
    */
    SPAM,
    /**
    * phishing
    */
    PHISHING,
    /**
    * malware
    */
    MALWARE,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For SubmissionCategory values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
