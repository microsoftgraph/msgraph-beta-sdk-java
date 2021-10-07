// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Message Event Type.
*/
public enum MessageEventType
{
    /**
    * received
    */
    RECEIVED,
    /**
    * sent
    */
    SENT,
    /**
    * delivered
    */
    DELIVERED,
    /**
    * failed
    */
    FAILED,
    /**
    * processing Failed
    */
    PROCESSING_FAILED,
    /**
    * distribution Group Expanded
    */
    DISTRIBUTION_GROUP_EXPANDED,
    /**
    * submitted
    */
    SUBMITTED,
    /**
    * delayed
    */
    DELAYED,
    /**
    * redirected
    */
    REDIRECTED,
    /**
    * resolved
    */
    RESOLVED,
    /**
    * dropped
    */
    DROPPED,
    /**
    * recipients Added
    */
    RECIPIENTS_ADDED,
    /**
    * malware Detected
    */
    MALWARE_DETECTED,
    /**
    * malware Detected In Message
    */
    MALWARE_DETECTED_IN_MESSAGE,
    /**
    * malware Detected In Attachment
    */
    MALWARE_DETECTED_IN_ATTACHMENT,
    /**
    * tt Zapped
    */
    TT_ZAPPED,
    /**
    * tt Delivered
    */
    TT_DELIVERED,
    /**
    * spam Detected
    */
    SPAM_DETECTED,
    /**
    * transport Rule Triggered
    */
    TRANSPORT_RULE_TRIGGERED,
    /**
    * dlp Rule Triggered
    */
    DLP_RULE_TRIGGERED,
    /**
    * journaled
    */
    JOURNALED,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For MessageEventType values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
