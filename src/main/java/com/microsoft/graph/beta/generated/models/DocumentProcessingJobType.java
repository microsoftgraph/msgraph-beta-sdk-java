package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum DocumentProcessingJobType implements ValuedEnum {
    File("file"),
    Folder("folder"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    DocumentProcessingJobType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static DocumentProcessingJobType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "file": return File;
            case "folder": return Folder;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
