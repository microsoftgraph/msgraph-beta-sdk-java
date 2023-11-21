// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Firmware Protection Type.
*/
public enum FirmwareProtectionType
{
    /**
    * not Applicable
    */
    NOT_APPLICABLE,
    /**
    * system Guard Secure Launch
    */
    SYSTEM_GUARD_SECURE_LAUNCH,
    /**
    * firmware Attack Surface Reduction
    */
    FIRMWARE_ATTACK_SURFACE_REDUCTION,
    /**
    * disabled
    */
    DISABLED,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For FirmwareProtectionType values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
