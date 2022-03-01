// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Delegated Admin Relationship Operation Status.
*/
public enum DelegatedAdminRelationshipOperationStatus
{
    /**
    * not Started
    */
    NOT_STARTED,
    /**
    * running
    */
    RUNNING,
    /**
    * complete
    */
    COMPLETE,
    /**
    * failed
    */
    FAILED,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For DelegatedAdminRelationshipOperationStatus values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
