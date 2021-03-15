// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Vpn Traffic Rule Routing Policy Type.
*/
public enum VpnTrafficRuleRoutingPolicyType
{
    /**
    * none
    */
    NONE,
    /**
    * split Tunnel
    */
    SPLIT_TUNNEL,
    /**
    * force Tunnel
    */
    FORCE_TUNNEL,
    /**
    * For VpnTrafficRuleRoutingPolicyType values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
