// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Android For Work Sync Status.
*/
public enum AndroidForWorkSyncStatus
{
    /**
    * success
    */
    SUCCESS,
    /**
    * credentials Not Valid
    */
    CREDENTIALS_NOT_VALID,
    /**
    * android For Work Api Error
    */
    ANDROID_FOR_WORK_API_ERROR,
    /**
    * management Service Error
    */
    MANAGEMENT_SERVICE_ERROR,
    /**
    * unknown Error
    */
    UNKNOWN_ERROR,
    /**
    * none
    */
    NONE,
    /**
    * For AndroidForWorkSyncStatus values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
