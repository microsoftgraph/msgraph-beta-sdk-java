// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Device Licensing Status.
*/
public enum DeviceLicensingStatus
{
    /**
    * unknown
    */
    UNKNOWN,
    /**
    * license Refresh Started
    */
    LICENSE_REFRESH_STARTED,
    /**
    * license Refresh Pending
    */
    LICENSE_REFRESH_PENDING,
    /**
    * device Is Not Azure Active Directory Joined
    */
    DEVICE_IS_NOT_AZURE_ACTIVE_DIRECTORY_JOINED,
    /**
    * verifying Microsoft Device Identity
    */
    VERIFYING_MICROSOFT_DEVICE_IDENTITY,
    /**
    * device Identity Verification Failed
    */
    DEVICE_IDENTITY_VERIFICATION_FAILED,
    /**
    * verifying Mirosoft Account Identity
    */
    VERIFYING_MIROSOFT_ACCOUNT_IDENTITY,
    /**
    * mirosoft Account Verification Failed
    */
    MIROSOFT_ACCOUNT_VERIFICATION_FAILED,
    /**
    * acquiring Device License
    */
    ACQUIRING_DEVICE_LICENSE,
    /**
    * refreshing Device License
    */
    REFRESHING_DEVICE_LICENSE,
    /**
    * device License Refresh Succeed
    */
    DEVICE_LICENSE_REFRESH_SUCCEED,
    /**
    * device License Refresh Failed
    */
    DEVICE_LICENSE_REFRESH_FAILED,
    /**
    * removing Device License
    */
    REMOVING_DEVICE_LICENSE,
    /**
    * device License Remove Succeed
    */
    DEVICE_LICENSE_REMOVE_SUCCEED,
    /**
    * device License Remove Failed
    */
    DEVICE_LICENSE_REMOVE_FAILED,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For DeviceLicensingStatus values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
