package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Data types for rules. */
public enum DataType implements ValuedEnum {
    /** None data type. */
    None("none"),
    /** Boolean data type. */
    BooleanEscaped("boolean"),
    /** Int64 data type. */
    Int64("int64"),
    /** Double data type. */
    DoubleEscaped("double"),
    /** String data type. */
    String("string"),
    /** DateTime data type. */
    DateTime("dateTime"),
    /** Version data type. */
    Version("version"),
    /** Base64 data type. */
    Base64("base64"),
    /** Xml data type. */
    Xml("xml"),
    /** Boolean array data type. */
    BooleanArray("booleanArray"),
    /** Int64 array data type. */
    Int64Array("int64Array"),
    /** Double array data type. */
    DoubleArray("doubleArray"),
    /** String array data type. */
    StringArray("stringArray"),
    /** DateTime array data type. */
    DateTimeArray("dateTimeArray"),
    /** Version array data type. */
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
            case "boolean": return BooleanEscaped;
            case "int64": return Int64;
            case "double": return DoubleEscaped;
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
