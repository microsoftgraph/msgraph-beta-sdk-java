package com.microsoft.graph.beta.models.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ExportOptions implements ValuedEnum {
    OriginalFiles("originalFiles"),
    Text("text"),
    PdfReplacement("pdfReplacement"),
    FileInfo("fileInfo"),
    Tags("tags"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ExportOptions(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ExportOptions forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "originalFiles": return OriginalFiles;
            case "text": return Text;
            case "pdfReplacement": return PdfReplacement;
            case "fileInfo": return FileInfo;
            case "tags": return Tags;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
