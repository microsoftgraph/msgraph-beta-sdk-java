// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Remote Action.
*/
public enum RemoteAction
{
    /**
    * unknown
    */
    UNKNOWN,
    /**
    * factory Reset
    */
    FACTORY_RESET,
    /**
    * remove Company Data
    */
    REMOVE_COMPANY_DATA,
    /**
    * reset Passcode
    */
    RESET_PASSCODE,
    /**
    * remote Lock
    */
    REMOTE_LOCK,
    /**
    * enable Lost Mode
    */
    ENABLE_LOST_MODE,
    /**
    * disable Lost Mode
    */
    DISABLE_LOST_MODE,
    /**
    * locate Device
    */
    LOCATE_DEVICE,
    /**
    * reboot Now
    */
    REBOOT_NOW,
    /**
    * recover Passcode
    */
    RECOVER_PASSCODE,
    /**
    * clean Windows Device
    */
    CLEAN_WINDOWS_DEVICE,
    /**
    * logout Shared Apple Device Active User
    */
    LOGOUT_SHARED_APPLE_DEVICE_ACTIVE_USER,
    /**
    * quick Scan
    */
    QUICK_SCAN,
    /**
    * full Scan
    */
    FULL_SCAN,
    /**
    * windows Defender Update Signatures
    */
    WINDOWS_DEFENDER_UPDATE_SIGNATURES,
    /**
    * factory Reset Keep Enrollment Data
    */
    FACTORY_RESET_KEEP_ENROLLMENT_DATA,
    /**
    * update Device Account
    */
    UPDATE_DEVICE_ACCOUNT,
    /**
    * automatic Redeployment
    */
    AUTOMATIC_REDEPLOYMENT,
    /**
    * shut Down
    */
    SHUT_DOWN,
    /**
    * rotate Bit Locker Keys
    */
    ROTATE_BIT_LOCKER_KEYS,
    /**
    * rotate File Vault Key
    */
    ROTATE_FILE_VAULT_KEY,
    /**
    * get File Vault Key
    */
    GET_FILE_VAULT_KEY,
    /**
    * set Device Name
    */
    SET_DEVICE_NAME,
    /**
    * activate Device Esim
    */
    ACTIVATE_DEVICE_ESIM,
    /**
    * deprovision
    */
    DEPROVISION,
    /**
    * disable
    */
    DISABLE,
    /**
    * reenable
    */
    REENABLE,
    /**
    * move Device To Organizational Unit
    */
    MOVE_DEVICE_TO_ORGANIZATIONAL_UNIT,
    /**
    * initiate Mobile Device Management Key Recovery
    */
    INITIATE_MOBILE_DEVICE_MANAGEMENT_KEY_RECOVERY,
    /**
    * initiate On Demand Proactive Remediation
    */
    INITIATE_ON_DEMAND_PROACTIVE_REMEDIATION,
    /**
    * For RemoteAction values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
