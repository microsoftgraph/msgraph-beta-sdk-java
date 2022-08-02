package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DeliveryOptimizationGroupIdSourceOptions extends DeliveryOptimizationGroupIdSource implements Parsable {
    /** Possible values for the DeliveryOptimizationGroupIdOptionsType setting. */
    private DeliveryOptimizationGroupIdOptionsType _groupIdSourceOption;
    /**
     * Instantiates a new DeliveryOptimizationGroupIdSourceOptions and sets the default values.
     * @return a void
     */
    public DeliveryOptimizationGroupIdSourceOptions() {
        super();
        this.setOdataType("#microsoft.graph.deliveryOptimizationGroupIdSourceOptions");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeliveryOptimizationGroupIdSourceOptions
     */
    @javax.annotation.Nonnull
    public static DeliveryOptimizationGroupIdSourceOptions createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeliveryOptimizationGroupIdSourceOptions();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DeliveryOptimizationGroupIdSourceOptions currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("groupIdSourceOption", (n) -> { currentObject.setGroupIdSourceOption(n.getEnumValue(DeliveryOptimizationGroupIdOptionsType.class)); });
        }};
    }
    /**
     * Gets the groupIdSourceOption property value. Possible values for the DeliveryOptimizationGroupIdOptionsType setting.
     * @return a deliveryOptimizationGroupIdOptionsType
     */
    @javax.annotation.Nullable
    public DeliveryOptimizationGroupIdOptionsType getGroupIdSourceOption() {
        return this._groupIdSourceOption;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("groupIdSourceOption", this.getGroupIdSourceOption());
    }
    /**
     * Sets the groupIdSourceOption property value. Possible values for the DeliveryOptimizationGroupIdOptionsType setting.
     * @param value Value to set for the groupIdSourceOption property.
     * @return a void
     */
    public void setGroupIdSourceOption(@javax.annotation.Nullable final DeliveryOptimizationGroupIdOptionsType value) {
        this._groupIdSourceOption = value;
    }
}
