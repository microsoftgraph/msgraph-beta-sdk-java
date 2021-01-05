// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.generated;


/**
 * The Enum Key Storage Provider Option.
*/
public enum KeyStorageProviderOption
{
    /**
    * use Tpm Ksp Otherwise Use Software Ksp
    */
    USE_TPM_KSP_OTHERWISE_USE_SOFTWARE_KSP,
    /**
    * use Tpm Ksp Otherwise Fail
    */
    USE_TPM_KSP_OTHERWISE_FAIL,
    /**
    * use Passport For Work Ksp Otherwise Fail
    */
    USE_PASSPORT_FOR_WORK_KSP_OTHERWISE_FAIL,
    /**
    * use Software Ksp
    */
    USE_SOFTWARE_KSP,
    /**
    * For KeyStorageProviderOption values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
