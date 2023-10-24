// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Gcp Access Type.
*/
public enum GcpAccessType
{
    /**
    * public
    */
    PUBLIC,
    /**
    * subject To Object Acls
    */
    SUBJECT_TO_OBJECT_ACLS,
    /**
    * private
    */
    PRIVATE,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For GcpAccessType values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
