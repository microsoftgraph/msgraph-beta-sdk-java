package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class UserExperienceAnalyticsMetric extends Entity implements Parsable {
    /** The unit of the user experience analytics metric. */
    private String _unit;
    /** The value of the user experience analytics metric. */
    private Double _value;
    /**
     * Instantiates a new userExperienceAnalyticsMetric and sets the default values.
     * @return a void
     */
    public UserExperienceAnalyticsMetric() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a userExperienceAnalyticsMetric
     */
    @javax.annotation.Nonnull
    public static UserExperienceAnalyticsMetric createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserExperienceAnalyticsMetric();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final UserExperienceAnalyticsMetric currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("unit", (n) -> { currentObject.setUnit(n.getStringValue()); });
            this.put("value", (n) -> { currentObject.setValue(n.getDoubleValue()); });
        }};
    }
    /**
     * Gets the unit property value. The unit of the user experience analytics metric.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUnit() {
        return this._unit;
    }
    /**
     * Gets the value property value. The value of the user experience analytics metric.
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getValue() {
        return this._value;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("unit", this.getUnit());
        writer.writeDoubleValue("value", this.getValue());
    }
    /**
     * Sets the unit property value. The unit of the user experience analytics metric.
     * @param value Value to set for the unit property.
     * @return a void
     */
    public void setUnit(@javax.annotation.Nullable final String value) {
        this._unit = value;
    }
    /**
     * Sets the value property value. The value of the user experience analytics metric.
     * @param value Value to set for the value property.
     * @return a void
     */
    public void setValue(@javax.annotation.Nullable final Double value) {
        this._value = value;
    }
}
