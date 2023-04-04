// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Zebra Fota Error Code.
*/
public enum ZebraFotaErrorCode
{
    /**
    * success
    */
    SUCCESS,
    /**
    * no Devices Found In Selected Aad Groups
    */
    NO_DEVICES_FOUND_IN_SELECTED_AAD_GROUPS,
    /**
    * no Intune Devices Found In Selected Aad Groups
    */
    NO_INTUNE_DEVICES_FOUND_IN_SELECTED_AAD_GROUPS,
    /**
    * no Zebra Fota Enrolled Devices Found For Current Tenant
    */
    NO_ZEBRA_FOTA_ENROLLED_DEVICES_FOUND_FOR_CURRENT_TENANT,
    /**
    * no Zebra Fota Enrolled Devices Found In Selected Aad Groups
    */
    NO_ZEBRA_FOTA_ENROLLED_DEVICES_FOUND_IN_SELECTED_AAD_GROUPS,
    /**
    * no Zebra Fota Devices Found For Selected Device Model
    */
    NO_ZEBRA_FOTA_DEVICES_FOUND_FOR_SELECTED_DEVICE_MODEL,
    /**
    * zebra Fota Create Deployment Request Failure
    */
    ZEBRA_FOTA_CREATE_DEPLOYMENT_REQUEST_FAILURE,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For ZebraFotaErrorCode values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
