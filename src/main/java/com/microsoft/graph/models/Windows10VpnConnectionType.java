// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Windows10Vpn Connection Type.
*/
public enum Windows10VpnConnectionType
{
    /**
    * pulse Secure
    */
    PULSE_SECURE,
    /**
    * f5Edge Client
    */
    F5_EDGE_CLIENT,
    /**
    * dell Sonic Wall Mobile Connect
    */
    DELL_SONIC_WALL_MOBILE_CONNECT,
    /**
    * check Point Capsule Vpn
    */
    CHECK_POINT_CAPSULE_VPN,
    /**
    * automatic
    */
    AUTOMATIC,
    /**
    * ik Ev2
    */
    IK_EV2,
    /**
    * l2tp
    */
    L2TP,
    /**
    * pptp
    */
    PPTP,
    /**
    * citrix
    */
    CITRIX,
    /**
    * palo Alto Global Protect
    */
    PALO_ALTO_GLOBAL_PROTECT,
    /**
    * cisco Any Connect
    */
    CISCO_ANY_CONNECT,
    /**
    * For Windows10VpnConnectionType values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
