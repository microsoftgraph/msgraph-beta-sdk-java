// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Education Synchronization Profile State.
*/
public enum EducationSynchronizationProfileState
{
    /**
    * deleting
    */
    DELETING,
    /**
    * deletion Failed
    */
    DELETION_FAILED,
    /**
    * provisioning Failed
    */
    PROVISIONING_FAILED,
    /**
    * provisioned
    */
    PROVISIONED,
    /**
    * provisioning
    */
    PROVISIONING,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For EducationSynchronizationProfileState values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
