// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.generated;


/**
 * The Enum Cloud Pc On Premises Connection Health Check Error Type.
*/
public enum CloudPcOnPremisesConnectionHealthCheckErrorType
{
    /**
    * dns Check Fqdn Not Found
    */
    DNS_CHECK_FQDN_NOT_FOUND,
    /**
    * dns Check Unknown Error
    */
    DNS_CHECK_UNKNOWN_ERROR,
    /**
    * ad Join Check Fqdn Not Found
    */
    AD_JOIN_CHECK_FQDN_NOT_FOUND,
    /**
    * ad Join Check Incorrect Credentials
    */
    AD_JOIN_CHECK_INCORRECT_CREDENTIALS,
    /**
    * ad Join Check Organizational Unit Not Found
    */
    AD_JOIN_CHECK_ORGANIZATIONAL_UNIT_NOT_FOUND,
    /**
    * ad Join Check Organizational Unit Incorrect Format
    */
    AD_JOIN_CHECK_ORGANIZATIONAL_UNIT_INCORRECT_FORMAT,
    /**
    * ad Join Check Unknown Error
    */
    AD_JOIN_CHECK_UNKNOWN_ERROR,
    /**
    * endpoint Connectivity Check Url Not Whitelisted
    */
    ENDPOINT_CONNECTIVITY_CHECK_URL_NOT_WHITELISTED,
    /**
    * endpoint Connectivity Check Unknown Error
    */
    ENDPOINT_CONNECTIVITY_CHECK_UNKNOWN_ERROR,
    /**
    * aad Connectivity Check Unknown Error
    */
    AAD_CONNECTIVITY_CHECK_UNKNOWN_ERROR,
    /**
    * resource Availability Check No Subnet IP
    */
    RESOURCE_AVAILABILITY_CHECK_NO_SUBNET_IP,
    /**
    * resource Availability Check Unknown Error
    */
    RESOURCE_AVAILABILITY_CHECK_UNKNOWN_ERROR,
    /**
    * internal Server Unknown Error
    */
    INTERNAL_SERVER_UNKNOWN_ERROR,
    /**
    * For CloudPcOnPremisesConnectionHealthCheckErrorType values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
