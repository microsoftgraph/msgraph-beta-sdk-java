package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum EvaluationErrorType implements ValuedEnum {
    UnsupportedFile("unsupportedFile"),
    PasswordProtectedFile("passwordProtectedFile"),
    FileTooLarge("fileTooLarge"),
    ArchiveSizeTooLarge("archiveSizeTooLarge"),
    TextExceedsMceThreshold("textExceedsMceThreshold"),
    PartiallyScannedArchive("partiallyScannedArchive"),
    PartialImageExtraction("partialImageExtraction"),
    ImageOcrPartialResult("imageOcrPartialResult"),
    OcrProcessingFailure("ocrProcessingFailure"),
    OcrQuotaExhausted("ocrQuotaExhausted"),
    ClassificationServiceError("classificationServiceError"),
    SitExtractionFailure("sitExtractionFailure"),
    TextExtractionFailure("textExtractionFailure"),
    ArchiveTextExtractionError("archiveTextExtractionError"),
    MissingOrInvalidConfiguration("missingOrInvalidConfiguration"),
    AgentFailure("agentFailure"),
    EnforcementTimeout("enforcementTimeout"),
    OsOverride("osOverride"),
    ProcessNonExistent("processNonExistent"),
    Other("other"),
    ServiceTimeout("serviceTimeout"),
    ServiceError("serviceError"),
    ServiceUnavailable("serviceUnavailable"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    EvaluationErrorType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static EvaluationErrorType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unsupportedFile": return UnsupportedFile;
            case "passwordProtectedFile": return PasswordProtectedFile;
            case "fileTooLarge": return FileTooLarge;
            case "archiveSizeTooLarge": return ArchiveSizeTooLarge;
            case "textExceedsMceThreshold": return TextExceedsMceThreshold;
            case "partiallyScannedArchive": return PartiallyScannedArchive;
            case "partialImageExtraction": return PartialImageExtraction;
            case "imageOcrPartialResult": return ImageOcrPartialResult;
            case "ocrProcessingFailure": return OcrProcessingFailure;
            case "ocrQuotaExhausted": return OcrQuotaExhausted;
            case "classificationServiceError": return ClassificationServiceError;
            case "sitExtractionFailure": return SitExtractionFailure;
            case "textExtractionFailure": return TextExtractionFailure;
            case "archiveTextExtractionError": return ArchiveTextExtractionError;
            case "missingOrInvalidConfiguration": return MissingOrInvalidConfiguration;
            case "agentFailure": return AgentFailure;
            case "enforcementTimeout": return EnforcementTimeout;
            case "osOverride": return OsOverride;
            case "processNonExistent": return ProcessNonExistent;
            case "other": return Other;
            case "serviceTimeout": return ServiceTimeout;
            case "serviceError": return ServiceError;
            case "serviceUnavailable": return ServiceUnavailable;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
