package com.microsoft.graph.models;

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
/**
 * Device Access Rules in Exchange.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeviceManagementExchangeAccessRule implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new DeviceManagementExchangeAccessRule and sets the default values.
     */
    public DeviceManagementExchangeAccessRule() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeviceManagementExchangeAccessRule
     */
    @jakarta.annotation.Nonnull
    public static DeviceManagementExchangeAccessRule createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementExchangeAccessRule();
    }
    /**
     * Gets the accessLevel property value. Access Level in Exchange.
     * @return a DeviceManagementExchangeAccessLevel
     */
    @jakarta.annotation.Nullable
    public DeviceManagementExchangeAccessLevel getAccessLevel() {
        return this.backingStore.get("accessLevel");
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
     * Gets the deviceClass property value. Device Class which will be impacted by this rule.
     * @return a DeviceManagementExchangeDeviceClass
     */
    @jakarta.annotation.Nullable
    public DeviceManagementExchangeDeviceClass getDeviceClass() {
        return this.backingStore.get("deviceClass");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("accessLevel", (n) -> { this.setAccessLevel(n.getEnumValue(DeviceManagementExchangeAccessLevel.class)); });
        deserializerMap.put("deviceClass", (n) -> { this.setDeviceClass(n.getObjectValue(DeviceManagementExchangeDeviceClass::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("accessLevel", this.getAccessLevel());
        writer.writeObjectValue("deviceClass", this.getDeviceClass());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the accessLevel property value. Access Level in Exchange.
     * @param value Value to set for the accessLevel property.
     */
    public void setAccessLevel(@jakarta.annotation.Nullable final DeviceManagementExchangeAccessLevel value) {
        this.backingStore.set("accessLevel", value);
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
     * Sets the deviceClass property value. Device Class which will be impacted by this rule.
     * @param value Value to set for the deviceClass property.
     */
    public void setDeviceClass(@jakarta.annotation.Nullable final DeviceManagementExchangeDeviceClass value) {
        this.backingStore.set("deviceClass", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
}
