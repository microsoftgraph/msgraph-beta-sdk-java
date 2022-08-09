// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.security.models;


/**
 * The Enum Submission Result Category.
*/
public enum SubmissionResultCategory
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
    * allowed By Policy
    */
    ALLOWED_BY_POLICY,
    /**
    * blocked By Policy
    */
    BLOCKED_BY_POLICY,
    /**
    * spoof
    */
    SPOOF,
    /**
    * unknown
    */
    UNKNOWN,
    /**
    * no Result Available
    */
    NO_RESULT_AVAILABLE,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For SubmissionResultCategory values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
