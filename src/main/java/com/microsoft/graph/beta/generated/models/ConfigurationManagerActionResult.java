package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Result of the ConfigurationManager action
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ConfigurationManagerActionResult extends DeviceActionResult implements Parsable {
    /**
     * Instantiates a new ConfigurationManagerActionResult and sets the default values.
     */
    public ConfigurationManagerActionResult() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ConfigurationManagerActionResult
     */
    @jakarta.annotation.Nonnull
    public static ConfigurationManagerActionResult createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ConfigurationManagerActionResult();
    }
    /**
     * Gets the actionDeliveryStatus property value. Delivery state of Configuration Manager device action
     * @return a ConfigurationManagerActionDeliveryStatus
     */
    @jakarta.annotation.Nullable
    public ConfigurationManagerActionDeliveryStatus getActionDeliveryStatus() {
        return this.backingStore.get("actionDeliveryStatus");
    }
    /**
     * Gets the errorCode property value. Error code of Configuration Manager action from client
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getErrorCode() {
        return this.backingStore.get("errorCode");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("actionDeliveryStatus", (n) -> { this.setActionDeliveryStatus(n.getEnumValue(ConfigurationManagerActionDeliveryStatus::forValue)); });
        deserializerMap.put("errorCode", (n) -> { this.setErrorCode(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("actionDeliveryStatus", this.getActionDeliveryStatus());
        writer.writeIntegerValue("errorCode", this.getErrorCode());
    }
    /**
     * Sets the actionDeliveryStatus property value. Delivery state of Configuration Manager device action
     * @param value Value to set for the actionDeliveryStatus property.
     */
    public void setActionDeliveryStatus(@jakarta.annotation.Nullable final ConfigurationManagerActionDeliveryStatus value) {
        this.backingStore.set("actionDeliveryStatus", value);
    }
    /**
     * Sets the errorCode property value. Error code of Configuration Manager action from client
     * @param value Value to set for the errorCode property.
     */
    public void setErrorCode(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("errorCode", value);
    }
}
