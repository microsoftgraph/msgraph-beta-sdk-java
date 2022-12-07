package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DeliveryOptimizationGroupIdCustom extends DeliveryOptimizationGroupIdSource implements Parsable {
    /** Specifies an arbitrary group ID that the device belongs to */
    private String _groupIdCustom;
    /**
     * Instantiates a new DeliveryOptimizationGroupIdCustom and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public DeliveryOptimizationGroupIdCustom() {
        super();
        this.setOdataType("#microsoft.graph.deliveryOptimizationGroupIdCustom");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeliveryOptimizationGroupIdCustom
     */
    @javax.annotation.Nonnull
    public static DeliveryOptimizationGroupIdCustom createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeliveryOptimizationGroupIdCustom();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("groupIdCustom", (n) -> { this.setGroupIdCustom(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the groupIdCustom property value. Specifies an arbitrary group ID that the device belongs to
     * @return a string
     */
    @javax.annotation.Nullable
    public String getGroupIdCustom() {
        return this._groupIdCustom;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("groupIdCustom", this.getGroupIdCustom());
    }
    /**
     * Sets the groupIdCustom property value. Specifies an arbitrary group ID that the device belongs to
     * @param value Value to set for the groupIdCustom property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setGroupIdCustom(@javax.annotation.Nullable final String value) {
        this._groupIdCustom = value;
    }
}
