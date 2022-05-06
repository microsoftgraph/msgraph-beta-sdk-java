package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to call the validateComplianceScript method.  */
public enum DataType implements ValuedEnum {
    None("none"),
    Boolean_escaped("boolean_escaped"),
    Int64("int64"),
    Double_escaped("double_escaped"),
    String("string"),
    DateTime("dateTime"),
    Version("version"),
    Base64("base64"),
    Xml("xml"),
    BooleanArray("booleanArray"),
    Int64Array("int64Array"),
    DoubleArray("doubleArray"),
    StringArray("stringArray"),
    DateTimeArray("dateTimeArray"),
    VersionArray("versionArray");
    public final String value;
    DataType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static DataType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "boolean_escaped": return Boolean_escaped;
            case "int64": return Int64;
            case "double_escaped": return Double_escaped;
            case "string": return String;
            case "dateTime": return DateTime;
            case "version": return Version;
            case "base64": return Base64;
            case "xml": return Xml;
            case "booleanArray": return BooleanArray;
            case "int64Array": return Int64Array;
            case "doubleArray": return DoubleArray;
            case "stringArray": return StringArray;
            case "dateTimeArray": return DateTimeArray;
            case "versionArray": return VersionArray;
            default: return null;
        }
    }
}
