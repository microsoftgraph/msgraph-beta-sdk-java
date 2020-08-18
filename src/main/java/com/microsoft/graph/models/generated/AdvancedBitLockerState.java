// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.generated;


/**
 * The Enum Advanced Bit Locker State.
*/
public enum AdvancedBitLockerState
{
    /**
    * success
    */
    SUCCESS,
    /**
    * no User Consent
    */
    NO_USER_CONSENT,
    /**
    * os Volume Encryption Method Mismatch
    */
    OS_VOLUME_ENCRYPTION_METHOD_MISMATCH,
    /**
    * os Volume Tpm Required
    */
    OS_VOLUME_TPM_REQUIRED,
    /**
    * os Volume Tpm Only Required
    */
    OS_VOLUME_TPM_ONLY_REQUIRED,
    /**
    * os Volume Tpm Pin Required
    */
    OS_VOLUME_TPM_PIN_REQUIRED,
    /**
    * os Volume Tpm Startup Key Required
    */
    OS_VOLUME_TPM_STARTUP_KEY_REQUIRED,
    /**
    * os Volume Tpm Pin Startup Key Required
    */
    OS_VOLUME_TPM_PIN_STARTUP_KEY_REQUIRED,
    /**
    * os Volume Unprotected
    */
    OS_VOLUME_UNPROTECTED,
    /**
    * recovery Key Backup Failed
    */
    RECOVERY_KEY_BACKUP_FAILED,
    /**
    * fixed Drive Not Encrypted
    */
    FIXED_DRIVE_NOT_ENCRYPTED,
    /**
    * fixed Drive Encryption Method Mismatch
    */
    FIXED_DRIVE_ENCRYPTION_METHOD_MISMATCH,
    /**
    * logged On User Non Admin
    */
    LOGGED_ON_USER_NON_ADMIN,
    /**
    * windows Recovery Environment Not Configured
    */
    WINDOWS_RECOVERY_ENVIRONMENT_NOT_CONFIGURED,
    /**
    * tpm Not Available
    */
    TPM_NOT_AVAILABLE,
    /**
    * tpm Not Ready
    */
    TPM_NOT_READY,
    /**
    * network Error
    */
    NETWORK_ERROR,
    /**
    * For AdvancedBitLockerState values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
