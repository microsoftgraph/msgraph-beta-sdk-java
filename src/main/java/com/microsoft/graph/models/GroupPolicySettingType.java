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
    * app Locker Rule Collection
    */
    APP_LOCKER_RULE_COLLECTION,
    /**
    * data Sources Settings
    */
    DATA_SOURCES_SETTINGS,
    /**
    * devices Settings
    */
    DEVICES_SETTINGS,
    /**
    * drive Map Settings
    */
    DRIVE_MAP_SETTINGS,
    /**
    * environment Variables
    */
    ENVIRONMENT_VARIABLES,
    /**
    * files Settings
    */
    FILES_SETTINGS,
    /**
    * folder Options
    */
    FOLDER_OPTIONS,
    /**
    * folders
    */
    FOLDERS,
    /**
    * ini Files
    */
    INI_FILES,
    /**
    * internet Options
    */
    INTERNET_OPTIONS,
    /**
    * local Users And Groups
    */
    LOCAL_USERS_AND_GROUPS,
    /**
    * network Options
    */
    NETWORK_OPTIONS,
    /**
    * network Shares
    */
    NETWORK_SHARES,
    /**
    * nt Services
    */
    NT_SERVICES,
    /**
    * power Options
    */
    POWER_OPTIONS,
    /**
    * printers
    */
    PRINTERS,
    /**
    * regional Options Settings
    */
    REGIONAL_OPTIONS_SETTINGS,
    /**
    * registry Settings
    */
    REGISTRY_SETTINGS,
    /**
    * scheduled Tasks
    */
    SCHEDULED_TASKS,
    /**
    * shortcut Settings
    */
    SHORTCUT_SETTINGS,
    /**
    * start Menu Settings
    */
    START_MENU_SETTINGS,
    /**
    * For GroupPolicySettingType values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
