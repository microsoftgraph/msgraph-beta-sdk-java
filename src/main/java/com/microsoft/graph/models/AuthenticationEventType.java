// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Authentication Event Type.
*/
public enum AuthenticationEventType
{
    /**
    * token Issuance Start
    */
    TOKEN_ISSUANCE_START,
    /**
    * page Render Start
    */
    PAGE_RENDER_START,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For AuthenticationEventType values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
