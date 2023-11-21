// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Frontline Cloud Pc Access State.
*/
public enum FrontlineCloudPcAccessState
{
    /**
    * unassigned
    */
    UNASSIGNED,
    /**
    * no Licenses Available
    */
    NO_LICENSES_AVAILABLE,
    /**
    * activation Failed
    */
    ACTIVATION_FAILED,
    /**
    * active
    */
    ACTIVE,
    /**
    * activating
    */
    ACTIVATING,
    /**
    * standby Mode
    */
    STANDBY_MODE,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For FrontlineCloudPcAccessState values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
