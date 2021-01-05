// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.generated;


/**
 * The Enum Record Completion Reason.
*/
public enum RecordCompletionReason
{
    /**
    * operation Canceled
    */
    OPERATION_CANCELED,
    /**
    * stop Tone Detected
    */
    STOP_TONE_DETECTED,
    /**
    * max Record Duration Reached
    */
    MAX_RECORD_DURATION_REACHED,
    /**
    * initial Silence Timeout
    */
    INITIAL_SILENCE_TIMEOUT,
    /**
    * max Silence Timeout
    */
    MAX_SILENCE_TIMEOUT,
    /**
    * play Prompt Failed
    */
    PLAY_PROMPT_FAILED,
    /**
    * play Beep Failed
    */
    PLAY_BEEP_FAILED,
    /**
    * media Receive Timeout
    */
    MEDIA_RECEIVE_TIMEOUT,
    /**
    * unspecified Error
    */
    UNSPECIFIED_ERROR,
    /**
    * For RecordCompletionReason values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
