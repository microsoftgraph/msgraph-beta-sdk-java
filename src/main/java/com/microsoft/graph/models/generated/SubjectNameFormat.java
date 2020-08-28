// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.generated;


/**
 * The Enum Subject Name Format.
*/
public enum SubjectNameFormat
{
    /**
    * common Name
    */
    COMMON_NAME,
    /**
    * common Name Including Email
    */
    COMMON_NAME_INCLUDING_EMAIL,
    /**
    * common Name As Email
    */
    COMMON_NAME_AS_EMAIL,
    /**
    * custom
    */
    CUSTOM,
    /**
    * common Name As IMEI
    */
    COMMON_NAME_AS_IMEI,
    /**
    * common Name As Serial Number
    */
    COMMON_NAME_AS_SERIAL_NUMBER,
    /**
    * common Name As Aad Device Id
    */
    COMMON_NAME_AS_AAD_DEVICE_ID,
    /**
    * common Name As Intune Device Id
    */
    COMMON_NAME_AS_INTUNE_DEVICE_ID,
    /**
    * common Name As Durable Device Id
    */
    COMMON_NAME_AS_DURABLE_DEVICE_ID,
    /**
    * For SubjectNameFormat values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
