package com.microsoft.graph.beta.models.security.dlp;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AuditRecordType implements ValuedEnum {
    Unknown("unknown"),
    SharePointFileOperation("sharePointFileOperation"),
    ComplianceDlpSharePoint("complianceDlpSharePoint"),
    ComplianceDlpExchange("complianceDlpExchange"),
    DlpEndpoint("dlpEndpoint"),
    ComplianceDlpEndpoint("complianceDlpEndpoint"),
    PowerBiDlp("powerBiDlp"),
    ComplianceDlpApplications("complianceDlpApplications"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    AuditRecordType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AuditRecordType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "sharePointFileOperation": return SharePointFileOperation;
            case "complianceDlpSharePoint": return ComplianceDlpSharePoint;
            case "complianceDlpExchange": return ComplianceDlpExchange;
            case "dlpEndpoint": return DlpEndpoint;
            case "complianceDlpEndpoint": return ComplianceDlpEndpoint;
            case "powerBiDlp": return PowerBiDlp;
            case "complianceDlpApplications": return ComplianceDlpApplications;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
