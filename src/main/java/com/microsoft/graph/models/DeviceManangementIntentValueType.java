package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReview entities. */
public enum DeviceManangementIntentValueType implements ValuedEnum {
    /** The setting value is an integer */
    Integer("integer"),
    /** The setting value is a boolean */
    Boolean_escaped("boolean_escaped"),
    /** The setting value is a string */
    String("string"),
    /** The setting value is a complex object */
    Complex("complex"),
    /** The setting value is a collection */
    Collection("collection"),
    /** The setting value is an abstract complex object */
    AbstractComplex("abstractComplex");
    public final String value;
    DeviceManangementIntentValueType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static DeviceManangementIntentValueType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "integer": return Integer;
            case "boolean": return Boolean_escaped;
            case "string": return String;
            case "complex": return Complex;
            case "collection": return Collection;
            case "abstractComplex": return AbstractComplex;
            default: return null;
        }
    }
}
