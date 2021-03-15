// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Configuration Manager Action Delivery Status.
*/
public enum ConfigurationManagerActionDeliveryStatus
{
    /**
    * unknown
    */
    UNKNOWN,
    /**
    * pending Delivery
    */
    PENDING_DELIVERY,
    /**
    * delivered To Connector Service
    */
    DELIVERED_TO_CONNECTOR_SERVICE,
    /**
    * failed To Deliver To Connector Service
    */
    FAILED_TO_DELIVER_TO_CONNECTOR_SERVICE,
    /**
    * delivered To On Premises Server
    */
    DELIVERED_TO_ON_PREMISES_SERVER,
    /**
    * For ConfigurationManagerActionDeliveryStatus values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
