package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum FileProcessingStatus implements ValuedEnum {
    Success("success"),
    InternalError("internalError"),
    UnknownError("unknownError"),
    ProcessingTimeout("processingTimeout"),
    InvalidFileId("invalidFileId"),
    FileSizeIsZero("fileSizeIsZero"),
    FileSizeIsTooLarge("fileSizeIsTooLarge"),
    FileDepthLimitExceeded("fileDepthLimitExceeded"),
    FileBodyIsTooLong("fileBodyIsTooLong"),
    FileTypeIsUnknown("fileTypeIsUnknown"),
    FileTypeIsNotSupported("fileTypeIsNotSupported"),
    MalformedFile("malformedFile"),
    ProtectedFile("protectedFile"),
    PoisonFile("poisonFile"),
    NoReviewSetSummaryGenerated("noReviewSetSummaryGenerated"),
    ExtractionException("extractionException"),
    OcrProcessingTimeout("ocrProcessingTimeout"),
    OcrFileSizeExceedsLimit("ocrFileSizeExceedsLimit"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    FileProcessingStatus(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static FileProcessingStatus forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "success": return Success;
            case "internalError": return InternalError;
            case "unknownError": return UnknownError;
            case "processingTimeout": return ProcessingTimeout;
            case "invalidFileId": return InvalidFileId;
            case "fileSizeIsZero": return FileSizeIsZero;
            case "fileSizeIsTooLarge": return FileSizeIsTooLarge;
            case "fileDepthLimitExceeded": return FileDepthLimitExceeded;
            case "fileBodyIsTooLong": return FileBodyIsTooLong;
            case "fileTypeIsUnknown": return FileTypeIsUnknown;
            case "fileTypeIsNotSupported": return FileTypeIsNotSupported;
            case "malformedFile": return MalformedFile;
            case "protectedFile": return ProtectedFile;
            case "poisonFile": return PoisonFile;
            case "noReviewSetSummaryGenerated": return NoReviewSetSummaryGenerated;
            case "extractionException": return ExtractionException;
            case "ocrProcessingTimeout": return OcrProcessingTimeout;
            case "ocrFileSizeExceedsLimit": return OcrFileSizeExceedsLimit;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
