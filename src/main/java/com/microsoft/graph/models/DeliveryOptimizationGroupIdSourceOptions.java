package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Group id options type
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeliveryOptimizationGroupIdSourceOptions extends DeliveryOptimizationGroupIdSource implements Parsable {
    /**
     * Possible values for the DeliveryOptimizationGroupIdOptionsType setting.
     */
    private DeliveryOptimizationGroupIdOptionsType groupIdSourceOption;
    /**
     * Instantiates a new deliveryOptimizationGroupIdSourceOptions and sets the default values.
     */
    public DeliveryOptimizationGroupIdSourceOptions() {
        super();
        this.setOdataType("#microsoft.graph.deliveryOptimizationGroupIdSourceOptions");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deliveryOptimizationGroupIdSourceOptions
     */
    @jakarta.annotation.Nonnull
    public static DeliveryOptimizationGroupIdSourceOptions createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeliveryOptimizationGroupIdSourceOptions();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("groupIdSourceOption", (n) -> { this.setGroupIdSourceOption(n.getEnumValue(DeliveryOptimizationGroupIdOptionsType.class)); });
        return deserializerMap;
    }
    /**
     * Gets the groupIdSourceOption property value. Possible values for the DeliveryOptimizationGroupIdOptionsType setting.
     * @return a deliveryOptimizationGroupIdOptionsType
     */
    @jakarta.annotation.Nullable
    public DeliveryOptimizationGroupIdOptionsType getGroupIdSourceOption() {
        return this.groupIdSourceOption;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("groupIdSourceOption", this.getGroupIdSourceOption());
    }
    /**
     * Sets the groupIdSourceOption property value. Possible values for the DeliveryOptimizationGroupIdOptionsType setting.
     * @param value Value to set for the groupIdSourceOption property.
     */
    public void setGroupIdSourceOption(@jakarta.annotation.Nullable final DeliveryOptimizationGroupIdOptionsType value) {
        this.groupIdSourceOption = value;
    }
}
