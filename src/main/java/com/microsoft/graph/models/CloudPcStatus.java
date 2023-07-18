// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Cloud Pc Status.
*/
public enum CloudPcStatus
{
    /**
    * not Provisioned
    */
    NOT_PROVISIONED,
    /**
    * provisioning
    */
    PROVISIONING,
    /**
    * provisioned
    */
    PROVISIONED,
    /**
    * in Grace Period
    */
    IN_GRACE_PERIOD,
    /**
    * deprovisioning
    */
    DEPROVISIONING,
    /**
    * failed
    */
    FAILED,
    /**
    * provisioned With Warnings
    */
    PROVISIONED_WITH_WARNINGS,
    /**
    * resizing
    */
    RESIZING,
    /**
    * restoring
    */
    RESTORING,
    /**
    * pending Provision
    */
    PENDING_PROVISION,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * moving Region
    */
    MOVING_REGION,
    /**
    * resize Pending License
    */
    RESIZE_PENDING_LICENSE,
    /**
    * updating Single Sign On
    */
    UPDATING_SINGLE_SIGN_ON,
    /**
    * For CloudPcStatus values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
