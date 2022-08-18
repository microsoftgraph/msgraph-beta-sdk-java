package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReviewDecision entities. */
public enum OfficeSuiteDefaultFileFormatType implements ValuedEnum {
    /** No file format selected */
    NotConfigured("notConfigured"),
    /** Office Open XML Format selected */
    OfficeOpenXMLFormat("officeOpenXMLFormat"),
    /** Office Open Document Format selected */
    OfficeOpenDocumentFormat("officeOpenDocumentFormat"),
    /** Placeholder for evolvable enum. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    OfficeSuiteDefaultFileFormatType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static OfficeSuiteDefaultFileFormatType forValue(@javax.annotation.Nonnull final String searchValue) {
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
