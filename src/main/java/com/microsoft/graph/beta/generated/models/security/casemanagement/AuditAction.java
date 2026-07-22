package com.microsoft.graph.beta.models.security.casemanagement;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AuditAction implements ValuedEnum {
    Link("link"),
    Unlink("unlink"),
    Update("update"),
    Delete("delete"),
    Create("create"),
    Upload("upload"),
    Download("download"),
    FileUploadMalwareDetected("fileUploadMalwareDetected"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    AuditAction(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AuditAction forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "link": return Link;
            case "unlink": return Unlink;
            case "update": return Update;
            case "delete": return Delete;
            case "create": return Create;
            case "upload": return Upload;
            case "download": return Download;
            case "fileUploadMalwareDetected": return FileUploadMalwareDetected;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
