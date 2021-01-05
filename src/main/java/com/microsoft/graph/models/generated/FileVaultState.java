// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.generated;


/**
 * The Enum File Vault State.
*/
public enum FileVaultState
{
    /**
    * success
    */
    SUCCESS,
    /**
    * drive Encrypted By User
    */
    DRIVE_ENCRYPTED_BY_USER,
    /**
    * user Deferred Encryption
    */
    USER_DEFERRED_ENCRYPTION,
    /**
    * escrow Not Enabled
    */
    ESCROW_NOT_ENABLED,
    /**
    * For FileVaultState values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
