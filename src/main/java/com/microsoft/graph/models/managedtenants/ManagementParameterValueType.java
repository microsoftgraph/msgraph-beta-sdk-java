package microsoft.graph.models.managedtenants;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the tenantRelationship singleton. */
public enum ManagementParameterValueType implements ValuedEnum {
    String("string"),
    Integer("integer"),
    Boolean_escaped("boolean_escaped"),
    Guid("guid"),
    StringCollection("stringCollection"),
    IntegerCollection("integerCollection"),
    BooleanCollection("booleanCollection"),
    GuidCollection("guidCollection"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ManagementParameterValueType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ManagementParameterValueType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "string": return String;
            case "integer": return Integer;
            case "boolean": return Boolean_escaped;
            case "guid": return Guid;
            case "stringCollection": return StringCollection;
            case "integerCollection": return IntegerCollection;
            case "booleanCollection": return BooleanCollection;
            case "guidCollection": return GuidCollection;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
