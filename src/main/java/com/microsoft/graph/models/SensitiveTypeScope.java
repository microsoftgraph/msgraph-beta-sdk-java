// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Sensitive Type Scope.
*/
public enum SensitiveTypeScope
{
    /**
    * full Document
    */
    FULL_DOCUMENT,
    /**
    * partial Document
    */
    PARTIAL_DOCUMENT,
    /**
    * For SensitiveTypeScope values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
