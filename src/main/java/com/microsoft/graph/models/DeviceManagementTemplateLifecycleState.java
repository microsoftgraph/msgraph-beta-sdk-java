// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Device Management Template Lifecycle State.
*/
public enum DeviceManagementTemplateLifecycleState
{
    /**
    * invalid
    */
    INVALID,
    /**
    * draft
    */
    DRAFT,
    /**
    * active
    */
    ACTIVE,
    /**
    * superseded
    */
    SUPERSEDED,
    /**
    * deprecated
    */
    DEPRECATED,
    /**
    * retired
    */
    RETIRED,
    /**
    * For DeviceManagementTemplateLifecycleState values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
