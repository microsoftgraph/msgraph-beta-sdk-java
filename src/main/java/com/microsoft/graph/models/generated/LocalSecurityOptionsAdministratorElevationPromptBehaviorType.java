// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.generated;


/**
 * The Enum Local Security Options Administrator Elevation Prompt Behavior Type.
*/
public enum LocalSecurityOptionsAdministratorElevationPromptBehaviorType
{
    /**
    * not Configured
    */
    NOT_CONFIGURED,
    /**
    * elevate Without Prompting
    */
    ELEVATE_WITHOUT_PROMPTING,
    /**
    * prompt For Credentials On The Secure Desktop
    */
    PROMPT_FOR_CREDENTIALS_ON_THE_SECURE_DESKTOP,
    /**
    * prompt For Consent On The Secure Desktop
    */
    PROMPT_FOR_CONSENT_ON_THE_SECURE_DESKTOP,
    /**
    * prompt For Credentials
    */
    PROMPT_FOR_CREDENTIALS,
    /**
    * prompt For Consent
    */
    PROMPT_FOR_CONSENT,
    /**
    * prompt For Consent For Non Windows Binaries
    */
    PROMPT_FOR_CONSENT_FOR_NON_WINDOWS_BINARIES,
    /**
    * For LocalSecurityOptionsAdministratorElevationPromptBehaviorType values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
