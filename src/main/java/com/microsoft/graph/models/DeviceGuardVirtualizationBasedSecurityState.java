// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Device Guard Virtualization Based Security State.
*/
public enum DeviceGuardVirtualizationBasedSecurityState
{
    /**
    * running
    */
    RUNNING,
    /**
    * reboot Required
    */
    REBOOT_REQUIRED,
    /**
    * require64Bit Architecture
    */
    REQUIRE64_BIT_ARCHITECTURE,
    /**
    * not Licensed
    */
    NOT_LICENSED,
    /**
    * not Configured
    */
    NOT_CONFIGURED,
    /**
    * does Not Meet Hardware Requirements
    */
    DOES_NOT_MEET_HARDWARE_REQUIREMENTS,
    /**
    * other
    */
    OTHER,
    /**
    * For DeviceGuardVirtualizationBasedSecurityState values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
