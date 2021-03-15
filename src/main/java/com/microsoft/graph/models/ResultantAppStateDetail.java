// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Resultant App State Detail.
*/
public enum ResultantAppStateDetail
{
    /**
    * processor Architecture Not Applicable
    */
    PROCESSOR_ARCHITECTURE_NOT_APPLICABLE,
    /**
    * minimum Disk Space Not Met
    */
    MINIMUM_DISK_SPACE_NOT_MET,
    /**
    * minimum Os Version Not Met
    */
    MINIMUM_OS_VERSION_NOT_MET,
    /**
    * minimum Physical Memory Not Met
    */
    MINIMUM_PHYSICAL_MEMORY_NOT_MET,
    /**
    * minimum Logical Processor Count Not Met
    */
    MINIMUM_LOGICAL_PROCESSOR_COUNT_NOT_MET,
    /**
    * minimum Cpu Speed Not Met
    */
    MINIMUM_CPU_SPEED_NOT_MET,
    /**
    * platform Not Applicable
    */
    PLATFORM_NOT_APPLICABLE,
    /**
    * file System Requirement Not Met
    */
    FILE_SYSTEM_REQUIREMENT_NOT_MET,
    /**
    * registry Requirement Not Met
    */
    REGISTRY_REQUIREMENT_NOT_MET,
    /**
    * power Shell Script Requirement Not Met
    */
    POWER_SHELL_SCRIPT_REQUIREMENT_NOT_MET,
    /**
    * no Additional Details
    */
    NO_ADDITIONAL_DETAILS,
    /**
    * dependency Failed To Install
    */
    DEPENDENCY_FAILED_TO_INSTALL,
    /**
    * dependency With Requirements Not Met
    */
    DEPENDENCY_WITH_REQUIREMENTS_NOT_MET,
    /**
    * dependency Pending Reboot
    */
    DEPENDENCY_PENDING_REBOOT,
    /**
    * dependency With Auto Install Disabled
    */
    DEPENDENCY_WITH_AUTO_INSTALL_DISABLED,
    /**
    * ios App Store Update Failed To Install
    */
    IOS_APP_STORE_UPDATE_FAILED_TO_INSTALL,
    /**
    * vpp App Has Update Available
    */
    VPP_APP_HAS_UPDATE_AVAILABLE,
    /**
    * user Rejected Update
    */
    USER_REJECTED_UPDATE,
    /**
    * see Install Error Code
    */
    SEE_INSTALL_ERROR_CODE,
    /**
    * auto Install Disabled
    */
    AUTO_INSTALL_DISABLED,
    /**
    * managed App No Longer Present
    */
    MANAGED_APP_NO_LONGER_PRESENT,
    /**
    * user Rejected Install
    */
    USER_REJECTED_INSTALL,
    /**
    * user Is Not Logged Into App Store
    */
    USER_IS_NOT_LOGGED_INTO_APP_STORE,
    /**
    * see Uninstall Error Code
    */
    SEE_UNINSTALL_ERROR_CODE,
    /**
    * pending Reboot
    */
    PENDING_REBOOT,
    /**
    * installing Dependencies
    */
    INSTALLING_DEPENDENCIES,
    /**
    * content Downloaded
    */
    CONTENT_DOWNLOADED,
    /**
    * For ResultantAppStateDetail values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
