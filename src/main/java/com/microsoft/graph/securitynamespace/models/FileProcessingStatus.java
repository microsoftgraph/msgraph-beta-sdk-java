// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.security.models;


/**
 * The Enum File Processing Status.
*/
public enum FileProcessingStatus
{
    /**
    * success
    */
    SUCCESS,
    /**
    * internal Error
    */
    INTERNAL_ERROR,
    /**
    * unknown Error
    */
    UNKNOWN_ERROR,
    /**
    * processing Timeout
    */
    PROCESSING_TIMEOUT,
    /**
    * invalid File Id
    */
    INVALID_FILE_ID,
    /**
    * file Size Is Zero
    */
    FILE_SIZE_IS_ZERO,
    /**
    * file Size Is Too Large
    */
    FILE_SIZE_IS_TOO_LARGE,
    /**
    * file Depth Limit Exceeded
    */
    FILE_DEPTH_LIMIT_EXCEEDED,
    /**
    * file Body Is Too Long
    */
    FILE_BODY_IS_TOO_LONG,
    /**
    * file Type Is Unknown
    */
    FILE_TYPE_IS_UNKNOWN,
    /**
    * file Type Is Not Supported
    */
    FILE_TYPE_IS_NOT_SUPPORTED,
    /**
    * malformed File
    */
    MALFORMED_FILE,
    /**
    * protected File
    */
    PROTECTED_FILE,
    /**
    * poison File
    */
    POISON_FILE,
    /**
    * no Review Set Summary Generated
    */
    NO_REVIEW_SET_SUMMARY_GENERATED,
    /**
    * extraction Exception
    */
    EXTRACTION_EXCEPTION,
    /**
    * ocr Processing Timeout
    */
    OCR_PROCESSING_TIMEOUT,
    /**
    * ocr File Size Exceeds Limit
    */
    OCR_FILE_SIZE_EXCEEDS_LIMIT,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For FileProcessingStatus values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
