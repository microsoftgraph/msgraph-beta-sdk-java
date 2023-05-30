// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Virtual Event Registration Question Answer Input Type.
*/
public enum VirtualEventRegistrationQuestionAnswerInputType
{
    /**
    * text
    */
    TEXT,
    /**
    * multiline Text
    */
    MULTILINE_TEXT,
    /**
    * single Choice
    */
    SINGLE_CHOICE,
    /**
    * multi Choice
    */
    MULTI_CHOICE,
    /**
    * boolean
    */
    BOOLEAN,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For VirtualEventRegistrationQuestionAnswerInputType values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
