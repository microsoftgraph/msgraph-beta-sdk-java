package com.microsoft.graph.beta.models;

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
public class TeamworkPeripheralHealth implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new TeamworkPeripheralHealth and sets the default values.
     */
    public TeamworkPeripheralHealth() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a TeamworkPeripheralHealth
     */
    @jakarta.annotation.Nonnull
    public static TeamworkPeripheralHealth createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TeamworkPeripheralHealth();
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
     * Gets the connection property value. The connected state and time since the peripheral device was connected.
     * @return a TeamworkConnection
     */
    @jakarta.annotation.Nullable
    public TeamworkConnection getConnection() {
        return this.backingStore.get("connection");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("connection", (n) -> { this.setConnection(n.getObjectValue(TeamworkConnection::createFromDiscriminatorValue)); });
        deserializerMap.put("isOptional", (n) -> { this.setIsOptional(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("peripheral", (n) -> { this.setPeripheral(n.getObjectValue(TeamworkPeripheral::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the isOptional property value. True if the peripheral is optional. Used for health computation.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsOptional() {
        return this.backingStore.get("isOptional");
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
     * Gets the peripheral property value. The peripheral property
     * @return a TeamworkPeripheral
     */
    @jakarta.annotation.Nullable
    public TeamworkPeripheral getPeripheral() {
        return this.backingStore.get("peripheral");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("connection", this.getConnection());
        writer.writeBooleanValue("isOptional", this.getIsOptional());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeObjectValue("peripheral", this.getPeripheral());
        writer.writeAdditionalData(this.getAdditionalData());
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
     * Sets the connection property value. The connected state and time since the peripheral device was connected.
     * @param value Value to set for the connection property.
     */
    public void setConnection(@jakarta.annotation.Nullable final TeamworkConnection value) {
        this.backingStore.set("connection", value);
    }
    /**
     * Sets the isOptional property value. True if the peripheral is optional. Used for health computation.
     * @param value Value to set for the isOptional property.
     */
    public void setIsOptional(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isOptional", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the peripheral property value. The peripheral property
     * @param value Value to set for the peripheral property.
     */
    public void setPeripheral(@jakarta.annotation.Nullable final TeamworkPeripheral value) {
        this.backingStore.set("peripheral", value);
    }
}
