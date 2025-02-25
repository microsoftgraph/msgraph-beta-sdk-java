package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Describes the OfficeSuiteApp file format types that can be selected.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum OfficeSuiteDefaultFileFormatType implements ValuedEnum {
    /** No file format selected */
    NotConfigured("notConfigured"),
    /** Office Open XML Format selected */
    OfficeOpenXMLFormat("officeOpenXMLFormat"),
    /** Office Open Document Format selected */
    OfficeOpenDocumentFormat("officeOpenDocumentFormat"),
    /** Evolvable enumeration sentinel value. Do not use. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    OfficeSuiteDefaultFileFormatType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static OfficeSuiteDefaultFileFormatType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notConfigured": return NotConfigured;
            case "officeOpenXMLFormat": return OfficeOpenXMLFormat;
            case "officeOpenDocumentFormat": return OfficeOpenDocumentFormat;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
