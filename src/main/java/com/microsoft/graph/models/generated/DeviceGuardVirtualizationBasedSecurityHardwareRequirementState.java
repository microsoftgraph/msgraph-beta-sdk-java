// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.generated;


/**
 * The Enum Device Guard Virtualization Based Security Hardware Requirement State.
*/
public enum DeviceGuardVirtualizationBasedSecurityHardwareRequirementState
{
    /**
    * meet Hardware Requirements
    */
    MEET_HARDWARE_REQUIREMENTS,
    /**
    * secure Boot Required
    */
    SECURE_BOOT_REQUIRED,
    /**
    * dma Protection Required
    */
    DMA_PROTECTION_REQUIRED,
    /**
    * hyper VNot Supported For Guest VM
    */
    HYPER_V_NOT_SUPPORTED_FOR_GUEST_VM,
    /**
    * hyper VNot Available
    */
    HYPER_V_NOT_AVAILABLE,
    /**
    * For DeviceGuardVirtualizationBasedSecurityHardwareRequirementState values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
