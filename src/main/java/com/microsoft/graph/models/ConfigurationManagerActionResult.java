package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ConfigurationManagerActionResult extends DeviceActionResult implements Parsable {
    /** Delivery state of Configuration Manager device action */
    private ConfigurationManagerActionDeliveryStatus actionDeliveryStatus;
    /** Error code of Configuration Manager action from client */
    private Integer errorCode;
    /**
     * Instantiates a new ConfigurationManagerActionResult and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ConfigurationManagerActionResult() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ConfigurationManagerActionResult
     */
    @javax.annotation.Nonnull
    public static ConfigurationManagerActionResult createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ConfigurationManagerActionResult();
    }
    /**
     * Gets the actionDeliveryStatus property value. Delivery state of Configuration Manager device action
     * @return a ConfigurationManagerActionDeliveryStatus
     */
    @javax.annotation.Nullable
    public ConfigurationManagerActionDeliveryStatus getActionDeliveryStatus() {
        return this.actionDeliveryStatus;
    }
    /**
     * Gets the errorCode property value. Error code of Configuration Manager action from client
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getErrorCode() {
        return this.errorCode;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("actionDeliveryStatus", (n) -> { this.setActionDeliveryStatus(n.getEnumValue(ConfigurationManagerActionDeliveryStatus.class)); });
        deserializerMap.put("errorCode", (n) -> { this.setErrorCode(n.getIntegerValue()); });
        return deserializerMap;
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
        writer.writeEnumValue("actionDeliveryStatus", this.getActionDeliveryStatus());
        writer.writeIntegerValue("errorCode", this.getErrorCode());
    }
    /**
     * Sets the actionDeliveryStatus property value. Delivery state of Configuration Manager device action
     * @param value Value to set for the actionDeliveryStatus property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setActionDeliveryStatus(@javax.annotation.Nullable final ConfigurationManagerActionDeliveryStatus value) {
        this.actionDeliveryStatus = value;
    }
    /**
     * Sets the errorCode property value. Error code of Configuration Manager action from client
     * @param value Value to set for the errorCode property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setErrorCode(@javax.annotation.Nullable final Integer value) {
        this.errorCode = value;
    }
}
