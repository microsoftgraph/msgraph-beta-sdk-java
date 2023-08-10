// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.devicemanagement.models;


/**
 * The Enum Alert Rule Template.
*/
public enum AlertRuleTemplate
{
    /**
    * cloud Pc Provision Scenario
    */
    CLOUD_PC_PROVISION_SCENARIO,
    /**
    * cloud Pc Image Upload Scenario
    */
    CLOUD_PC_IMAGE_UPLOAD_SCENARIO,
    /**
    * cloud Pc On Premise Network Connection Check Scenario
    */
    CLOUD_PC_ON_PREMISE_NETWORK_CONNECTION_CHECK_SCENARIO,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * cloud Pc In Grace Period Scenario
    */
    CLOUD_PC_IN_GRACE_PERIOD_SCENARIO,
    /**
    * cloud Pc Frontline Insufficient Licenses Scenario
    */
    CLOUD_PC_FRONTLINE_INSUFFICIENT_LICENSES_SCENARIO,
    /**
    * For AlertRuleTemplate values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
