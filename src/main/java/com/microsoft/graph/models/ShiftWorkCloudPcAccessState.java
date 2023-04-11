// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Shift Work Cloud Pc Access State.
 * @deprecated The waitlisted value is deprecated and will stop returning on May 17, 2023.
*/
@Deprecated
public enum ShiftWorkCloudPcAccessState
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
    * waitlisted
    */
    WAITLISTED,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * standby Mode
    */
    STANDBY_MODE,
    /**
    * For ShiftWorkCloudPcAccessState values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
