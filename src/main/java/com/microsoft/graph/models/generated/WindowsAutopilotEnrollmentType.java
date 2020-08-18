// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.generated;


/**
 * The Enum Windows Autopilot Enrollment Type.
*/
public enum WindowsAutopilotEnrollmentType
{
    /**
    * unknown
    */
    UNKNOWN,
    /**
    * azure ADJoined With Autopilot Profile
    */
    AZURE_AD_JOINED_WITH_AUTOPILOT_PROFILE,
    /**
    * offline Domain Joined
    */
    OFFLINE_DOMAIN_JOINED,
    /**
    * azure ADJoined Using Device Auth With Autopilot Profile
    */
    AZURE_AD_JOINED_USING_DEVICE_AUTH_WITH_AUTOPILOT_PROFILE,
    /**
    * azure ADJoined Using Device Auth Without Autopilot Profile
    */
    AZURE_AD_JOINED_USING_DEVICE_AUTH_WITHOUT_AUTOPILOT_PROFILE,
    /**
    * azure ADJoined With Offline Autopilot Profile
    */
    AZURE_AD_JOINED_WITH_OFFLINE_AUTOPILOT_PROFILE,
    /**
    * azure ADJoined With White Glove
    */
    AZURE_AD_JOINED_WITH_WHITE_GLOVE,
    /**
    * offline Domain Joined With White Glove
    */
    OFFLINE_DOMAIN_JOINED_WITH_WHITE_GLOVE,
    /**
    * offline Domain Joined With Offline Autopilot Profile
    */
    OFFLINE_DOMAIN_JOINED_WITH_OFFLINE_AUTOPILOT_PROFILE,
    /**
    * For WindowsAutopilotEnrollmentType values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
