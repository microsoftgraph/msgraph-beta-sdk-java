// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.generated;


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
    * upgrading
    */
    UPGRADING,
    /**
    * in Grace Period
    */
    IN_GRACE_PERIOD,
    /**
    * deprovisioning
    */
    DEPROVISIONING,
    /**
    * upgrade Failed
    */
    UPGRADE_FAILED,
    /**
    * provision Failed
    */
    PROVISION_FAILED,
    /**
    * deprovision Failed
    */
    DEPROVISION_FAILED,
    /**
    * reprovision Failed
    */
    REPROVISION_FAILED,
    /**
    * For CloudPcStatus values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
