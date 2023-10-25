// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.security.models;


/**
 * The Enum Additional Options.
*/
public enum AdditionalOptions
{
    /**
    * none
    */
    NONE,
    /**
    * teams And Yammer Conversations
    */
    TEAMS_AND_YAMMER_CONVERSATIONS,
    /**
    * cloud Attachments
    */
    CLOUD_ATTACHMENTS,
    /**
    * all Document Versions
    */
    ALL_DOCUMENT_VERSIONS,
    /**
    * subfolder Contents
    */
    SUBFOLDER_CONTENTS,
    /**
    * list Attachments
    */
    LIST_ATTACHMENTS,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For AdditionalOptions values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
