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
    UnknownFutureValue("unknownFutureValue"),
    SplitSource("splitSource"),
    IncludeFolderAndPath("includeFolderAndPath"),
    FriendlyName("friendlyName"),
    CondensePaths("condensePaths"),
    OptimizedPartitionSize("optimizedPartitionSize");
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
            case "splitSource": return SplitSource;
            case "includeFolderAndPath": return IncludeFolderAndPath;
            case "friendlyName": return FriendlyName;
            case "condensePaths": return CondensePaths;
            case "optimizedPartitionSize": return OptimizedPartitionSize;
            default: return null;
        }
    }
}
