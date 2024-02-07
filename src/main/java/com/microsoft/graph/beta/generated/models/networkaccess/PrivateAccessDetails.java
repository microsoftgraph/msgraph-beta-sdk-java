package com.microsoft.graph.beta.models.networkaccess;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PrivateAccessDetails implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new PrivateAccessDetails and sets the default values.
     */
    public PrivateAccessDetails() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a PrivateAccessDetails
     */
    @jakarta.annotation.Nonnull
    public static PrivateAccessDetails createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PrivateAccessDetails();
    }
    /**
     * Gets the accessType property value. The accessType property
     * @return a AccessType
     */
    @jakarta.annotation.Nullable
    public AccessType getAccessType() {
        return this.backingStore.get("accessType");
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.backingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the backingStore property value. Stores model information.
     * @return a BackingStore
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * Gets the connectionStatus property value. The connectionStatus property
     * @return a ConnectionStatus
     */
    @jakarta.annotation.Nullable
    public ConnectionStatus getConnectionStatus() {
        return this.backingStore.get("connectionStatus");
    }
    /**
     * Gets the connectorId property value. The connectorId property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getConnectorId() {
        return this.backingStore.get("connectorId");
    }
    /**
     * Gets the connectorIp property value. The connectorIp property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getConnectorIp() {
        return this.backingStore.get("connectorIp");
    }
    /**
     * Gets the connectorName property value. The connectorName property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getConnectorName() {
        return this.backingStore.get("connectorName");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("accessType", (n) -> { this.setAccessType(n.getEnumValue(AccessType::forValue)); });
        deserializerMap.put("connectionStatus", (n) -> { this.setConnectionStatus(n.getEnumValue(ConnectionStatus::forValue)); });
        deserializerMap.put("connectorId", (n) -> { this.setConnectorId(n.getStringValue()); });
        deserializerMap.put("connectorIp", (n) -> { this.setConnectorIp(n.getStringValue()); });
        deserializerMap.put("connectorName", (n) -> { this.setConnectorName(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("processingRegion", (n) -> { this.setProcessingRegion(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Gets the processingRegion property value. The processingRegion property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getProcessingRegion() {
        return this.backingStore.get("processingRegion");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("accessType", this.getAccessType());
        writer.writeEnumValue("connectionStatus", this.getConnectionStatus());
        writer.writeStringValue("connectorId", this.getConnectorId());
        writer.writeStringValue("connectorIp", this.getConnectorIp());
        writer.writeStringValue("connectorName", this.getConnectorName());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("processingRegion", this.getProcessingRegion());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the accessType property value. The accessType property
     * @param value Value to set for the accessType property.
     */
    public void setAccessType(@jakarta.annotation.Nullable final AccessType value) {
        this.backingStore.set("accessType", value);
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
    }
    /**
     * Sets the backingStore property value. Stores model information.
     * @param value Value to set for the backingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.backingStore = value;
    }
    /**
     * Sets the connectionStatus property value. The connectionStatus property
     * @param value Value to set for the connectionStatus property.
     */
    public void setConnectionStatus(@jakarta.annotation.Nullable final ConnectionStatus value) {
        this.backingStore.set("connectionStatus", value);
    }
    /**
     * Sets the connectorId property value. The connectorId property
     * @param value Value to set for the connectorId property.
     */
    public void setConnectorId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("connectorId", value);
    }
    /**
     * Sets the connectorIp property value. The connectorIp property
     * @param value Value to set for the connectorIp property.
     */
    public void setConnectorIp(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("connectorIp", value);
    }
    /**
     * Sets the connectorName property value. The connectorName property
     * @param value Value to set for the connectorName property.
     */
    public void setConnectorName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("connectorName", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the processingRegion property value. The processingRegion property
     * @param value Value to set for the processingRegion property.
     */
    public void setProcessingRegion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("processingRegion", value);
    }
}
