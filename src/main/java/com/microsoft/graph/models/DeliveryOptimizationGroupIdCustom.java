package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Custom group id type
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeliveryOptimizationGroupIdCustom extends DeliveryOptimizationGroupIdSource implements Parsable {
    /**
     * Specifies an arbitrary group ID that the device belongs to
     */
    private String groupIdCustom;
    /**
     * Instantiates a new deliveryOptimizationGroupIdCustom and sets the default values.
     */
    public DeliveryOptimizationGroupIdCustom() {
        super();
        this.setOdataType("#microsoft.graph.deliveryOptimizationGroupIdCustom");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deliveryOptimizationGroupIdCustom
     */
    @jakarta.annotation.Nonnull
    public static DeliveryOptimizationGroupIdCustom createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeliveryOptimizationGroupIdCustom();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("groupIdCustom", (n) -> { this.setGroupIdCustom(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the groupIdCustom property value. Specifies an arbitrary group ID that the device belongs to
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getGroupIdCustom() {
        return this.groupIdCustom;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("groupIdCustom", this.getGroupIdCustom());
    }
    /**
     * Sets the groupIdCustom property value. Specifies an arbitrary group ID that the device belongs to
     * @param value Value to set for the groupIdCustom property.
     */
    public void setGroupIdCustom(@jakarta.annotation.Nullable final String value) {
        this.groupIdCustom = value;
    }
}
