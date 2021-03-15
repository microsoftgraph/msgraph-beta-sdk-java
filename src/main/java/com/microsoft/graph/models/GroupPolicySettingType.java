// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Group Policy Setting Type.
*/
public enum GroupPolicySettingType
{
    /**
    * unknown
    */
    UNKNOWN,
    /**
    * policy
    */
    POLICY,
    /**
    * account
    */
    ACCOUNT,
    /**
    * security Options
    */
    SECURITY_OPTIONS,
    /**
    * user Rights Assignment
    */
    USER_RIGHTS_ASSIGNMENT,
    /**
    * audit Setting
    */
    AUDIT_SETTING,
    /**
    * windows Firewall Settings
    */
    WINDOWS_FIREWALL_SETTINGS,
    /**
    * For GroupPolicySettingType values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
