// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Shift Work Cloud Pc Access State.
 * @deprecated The shiftWorkCloudPcAccessState enum is deprecated and will stop returning data on Dec 31, 2023. Please use the new FrontlineCloudPcAccessState enum
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
