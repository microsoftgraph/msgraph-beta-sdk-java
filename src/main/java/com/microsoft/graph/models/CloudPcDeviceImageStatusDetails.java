// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Cloud Pc Device Image Status Details.
*/
public enum CloudPcDeviceImageStatusDetails
{
    /**
    * internal Server Error
    */
    INTERNAL_SERVER_ERROR,
    /**
    * source Image Not Found
    */
    SOURCE_IMAGE_NOT_FOUND,
    /**
    * os Version Not Supported
    */
    OS_VERSION_NOT_SUPPORTED,
    /**
    * source Image Invalid
    */
    SOURCE_IMAGE_INVALID,
    /**
    * source Image Not Generalized
    */
    SOURCE_IMAGE_NOT_GENERALIZED,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For CloudPcDeviceImageStatusDetails values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
