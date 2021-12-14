// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


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
    * dns Check Name With Invalid Character
    */
    DNS_CHECK_NAME_WITH_INVALID_CHARACTER,
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
    * ad Join Check Computer Object Already Exists
    */
    AD_JOIN_CHECK_COMPUTER_OBJECT_ALREADY_EXISTS,
    /**
    * ad Join Check Access Denied
    */
    AD_JOIN_CHECK_ACCESS_DENIED,
    /**
    * ad Join Check Credentials Expired
    */
    AD_JOIN_CHECK_CREDENTIALS_EXPIRED,
    /**
    * ad Join Check Account Locked Or Disabled
    */
    AD_JOIN_CHECK_ACCOUNT_LOCKED_OR_DISABLED,
    /**
    * ad Join Check Account Quota Exceeded
    */
    AD_JOIN_CHECK_ACCOUNT_QUOTA_EXCEEDED,
    /**
    * ad Join Check Unknown Error
    */
    AD_JOIN_CHECK_UNKNOWN_ERROR,
    /**
    * endpoint Connectivity Check Cloud Pc Url Not Allow Listed
    */
    ENDPOINT_CONNECTIVITY_CHECK_CLOUD_PC_URL_NOT_ALLOW_LISTED,
    /**
    * endpoint Connectivity Check WVDUrl Not Allow Listed
    */
    ENDPOINT_CONNECTIVITY_CHECK_WVD_URL_NOT_ALLOW_LISTED,
    /**
    * endpoint Connectivity Check Intune Url Not Allow Listed
    */
    ENDPOINT_CONNECTIVITY_CHECK_INTUNE_URL_NOT_ALLOW_LISTED,
    /**
    * endpoint Connectivity Check Unknown Error
    */
    ENDPOINT_CONNECTIVITY_CHECK_UNKNOWN_ERROR,
    /**
    * azure Ad Device Sync Check Device Not Found
    */
    AZURE_AD_DEVICE_SYNC_CHECK_DEVICE_NOT_FOUND,
    /**
    * azure Ad Device Sync Check Long Sync Circle
    */
    AZURE_AD_DEVICE_SYNC_CHECK_LONG_SYNC_CIRCLE,
    /**
    * azure Ad Device Sync Check Connect Disabled
    */
    AZURE_AD_DEVICE_SYNC_CHECK_CONNECT_DISABLED,
    /**
    * azure Ad Device Sync Check Duration Exceeded
    */
    AZURE_AD_DEVICE_SYNC_CHECK_DURATION_EXCEEDED,
    /**
    * azure Ad Device Sync Check Scp Not Configured
    */
    AZURE_AD_DEVICE_SYNC_CHECK_SCP_NOT_CONFIGURED,
    /**
    * azure Ad Device Sync Check Transient Service Error
    */
    AZURE_AD_DEVICE_SYNC_CHECK_TRANSIENT_SERVICE_ERROR,
    /**
    * azure Ad Device Sync Check Unknown Error
    */
    AZURE_AD_DEVICE_SYNC_CHECK_UNKNOWN_ERROR,
    /**
    * resource Availability Check No Subnet IP
    */
    RESOURCE_AVAILABILITY_CHECK_NO_SUBNET_IP,
    /**
    * resource Availability Check Subscription Disabled
    */
    RESOURCE_AVAILABILITY_CHECK_SUBSCRIPTION_DISABLED,
    /**
    * resource Availability Check Azure Policy Violation
    */
    RESOURCE_AVAILABILITY_CHECK_AZURE_POLICY_VIOLATION,
    /**
    * resource Availability Check Subscription Not Found
    */
    RESOURCE_AVAILABILITY_CHECK_SUBSCRIPTION_NOT_FOUND,
    /**
    * resource Availability Check Subscription Transferred
    */
    RESOURCE_AVAILABILITY_CHECK_SUBSCRIPTION_TRANSFERRED,
    /**
    * resource Availability Check General Subscription Error
    */
    RESOURCE_AVAILABILITY_CHECK_GENERAL_SUBSCRIPTION_ERROR,
    /**
    * resource Availability Check Unsupported VNet Region
    */
    RESOURCE_AVAILABILITY_CHECK_UNSUPPORTED_V_NET_REGION,
    /**
    * resource Availability Check Resource Group Invalid
    */
    RESOURCE_AVAILABILITY_CHECK_RESOURCE_GROUP_INVALID,
    /**
    * resource Availability Check VNet Invalid
    */
    RESOURCE_AVAILABILITY_CHECK_V_NET_INVALID,
    /**
    * resource Availability Check Subnet Invalid
    */
    RESOURCE_AVAILABILITY_CHECK_SUBNET_INVALID,
    /**
    * resource Availability Check Resource Group Being Deleted
    */
    RESOURCE_AVAILABILITY_CHECK_RESOURCE_GROUP_BEING_DELETED,
    /**
    * resource Availability Check VNet Being Moved
    */
    RESOURCE_AVAILABILITY_CHECK_V_NET_BEING_MOVED,
    /**
    * resource Availability Check Subnet Delegation Failed
    */
    RESOURCE_AVAILABILITY_CHECK_SUBNET_DELEGATION_FAILED,
    /**
    * resource Availability Check Subnet With External Resources
    */
    RESOURCE_AVAILABILITY_CHECK_SUBNET_WITH_EXTERNAL_RESOURCES,
    /**
    * resource Availability Check Resource Group Locked For Readonly
    */
    RESOURCE_AVAILABILITY_CHECK_RESOURCE_GROUP_LOCKED_FOR_READONLY,
    /**
    * resource Availability Check Resource Group Locked For Delete
    */
    RESOURCE_AVAILABILITY_CHECK_RESOURCE_GROUP_LOCKED_FOR_DELETE,
    /**
    * resource Availability Check Transient Service Error
    */
    RESOURCE_AVAILABILITY_CHECK_TRANSIENT_SERVICE_ERROR,
    /**
    * resource Availability Check Unknown Error
    */
    RESOURCE_AVAILABILITY_CHECK_UNKNOWN_ERROR,
    /**
    * permission Check No Subscription Reader Role
    */
    PERMISSION_CHECK_NO_SUBSCRIPTION_READER_ROLE,
    /**
    * permission Check No Resource Group Owner Role
    */
    PERMISSION_CHECK_NO_RESOURCE_GROUP_OWNER_ROLE,
    /**
    * permission Check No VNet Contributor Role
    */
    PERMISSION_CHECK_NO_V_NET_CONTRIBUTOR_ROLE,
    /**
    * permission Check No Resource Group Network Contributor Role
    */
    PERMISSION_CHECK_NO_RESOURCE_GROUP_NETWORK_CONTRIBUTOR_ROLE,
    /**
    * permission Check Transient Service Error
    */
    PERMISSION_CHECK_TRANSIENT_SERVICE_ERROR,
    /**
    * permission Check Unknown Error
    */
    PERMISSION_CHECK_UNKNOWN_ERROR,
    /**
    * internal Server Error Deployment Canceled
    */
    INTERNAL_SERVER_ERROR_DEPLOYMENT_CANCELED,
    /**
    * internal Server Error Allocate Resource Failed
    */
    INTERNAL_SERVER_ERROR_ALLOCATE_RESOURCE_FAILED,
    /**
    * internal Server Error VMDeployment Timeout
    */
    INTERNAL_SERVER_ERROR_VM_DEPLOYMENT_TIMEOUT,
    /**
    * internal Server Error Unable To Run Dsc Script
    */
    INTERNAL_SERVER_ERROR_UNABLE_TO_RUN_DSC_SCRIPT,
    /**
    * internal Server Unknown Error
    */
    INTERNAL_SERVER_UNKNOWN_ERROR,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For CloudPcOnPremisesConnectionHealthCheckErrorType values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
