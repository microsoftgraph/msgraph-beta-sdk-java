// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Sign In Access Type.
*/
public enum SignInAccessType
{
    /**
    * none
    */
    NONE,
    /**
    * b2b Collaboration
    */
    B2B_COLLABORATION,
    /**
    * b2b Direct Connect
    */
    B2B_DIRECT_CONNECT,
    /**
    * microsoft Support
    */
    MICROSOFT_SUPPORT,
    /**
    * service Provider
    */
    SERVICE_PROVIDER,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For SignInAccessType values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
