// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Apple Subject Name Format.
*/
public enum AppleSubjectNameFormat
{
    /**
    * common Name
    */
    COMMON_NAME,
    /**
    * common Name As Email
    */
    COMMON_NAME_AS_EMAIL,
    /**
    * custom
    */
    CUSTOM,
    /**
    * common Name Including Email
    */
    COMMON_NAME_INCLUDING_EMAIL,
    /**
    * common Name As IMEI
    */
    COMMON_NAME_AS_IMEI,
    /**
    * common Name As Serial Number
    */
    COMMON_NAME_AS_SERIAL_NUMBER,
    /**
    * For AppleSubjectNameFormat values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
