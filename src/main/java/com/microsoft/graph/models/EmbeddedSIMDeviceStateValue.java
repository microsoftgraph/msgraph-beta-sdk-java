// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Embedded SIMDevice State Value.
*/
public enum EmbeddedSIMDeviceStateValue
{
    /**
    * not Evaluated
    */
    NOT_EVALUATED,
    /**
    * failed
    */
    FAILED,
    /**
    * installing
    */
    INSTALLING,
    /**
    * installed
    */
    INSTALLED,
    /**
    * deleting
    */
    DELETING,
    /**
    * error
    */
    ERROR,
    /**
    * deleted
    */
    DELETED,
    /**
    * removed By User
    */
    REMOVED_BY_USER,
    /**
    * For EmbeddedSIMDeviceStateValue values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
