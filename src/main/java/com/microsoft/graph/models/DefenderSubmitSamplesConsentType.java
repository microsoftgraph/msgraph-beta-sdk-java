// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Defender Submit Samples Consent Type.
*/
public enum DefenderSubmitSamplesConsentType
{
    /**
    * send Safe Samples Automatically
    */
    SEND_SAFE_SAMPLES_AUTOMATICALLY,
    /**
    * always Prompt
    */
    ALWAYS_PROMPT,
    /**
    * never Send
    */
    NEVER_SEND,
    /**
    * send All Samples Automatically
    */
    SEND_ALL_SAMPLES_AUTOMATICALLY,
    /**
    * For DefenderSubmitSamplesConsentType values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
