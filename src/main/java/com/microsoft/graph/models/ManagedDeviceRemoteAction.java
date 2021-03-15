// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Managed Device Remote Action.
*/
public enum ManagedDeviceRemoteAction
{
    /**
    * retire
    */
    RETIRE,
    /**
    * delete
    */
    DELETE,
    /**
    * full Scan
    */
    FULL_SCAN,
    /**
    * quick Scan
    */
    QUICK_SCAN,
    /**
    * signature Update
    */
    SIGNATURE_UPDATE,
    /**
    * wipe
    */
    WIPE,
    /**
    * custom Text Notification
    */
    CUSTOM_TEXT_NOTIFICATION,
    /**
    * reboot Now
    */
    REBOOT_NOW,
    /**
    * set Device Name
    */
    SET_DEVICE_NAME,
    /**
    * sync Device
    */
    SYNC_DEVICE,
    /**
    * For ManagedDeviceRemoteAction values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
