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
 * The result of the triggered device scope action.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeviceScopeActionResult implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new DeviceScopeActionResult and sets the default values.
     */
    public DeviceScopeActionResult() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeviceScopeActionResult
     */
    @jakarta.annotation.Nonnull
    public static DeviceScopeActionResult createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceScopeActionResult();
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
     * Gets the deviceScopeAction property value. Trigger on the service to either START or STOP computing metrics data based on a device scope configuration.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDeviceScopeAction() {
        return this.backingStore.get("deviceScopeAction");
    }
    /**
     * Gets the deviceScopeId property value. The unique identifier of the device scope the action was triggered on.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDeviceScopeId() {
        return this.backingStore.get("deviceScopeId");
    }
    /**
     * Gets the failedMessage property value. The message indicates the reason the device scope action failed to trigger.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getFailedMessage() {
        return this.backingStore.get("failedMessage");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("deviceScopeAction", (n) -> { this.setDeviceScopeAction(n.getStringValue()); });
        deserializerMap.put("deviceScopeId", (n) -> { this.setDeviceScopeId(n.getStringValue()); });
        deserializerMap.put("failedMessage", (n) -> { this.setFailedMessage(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(DeviceScopeActionStatus.class)); });
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
     * Gets the status property value. Indicates the status of the attempted device scope action
     * @return a DeviceScopeActionStatus
     */
    @jakarta.annotation.Nullable
    public DeviceScopeActionStatus getStatus() {
        return this.backingStore.get("status");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("deviceScopeAction", this.getDeviceScopeAction());
        writer.writeStringValue("deviceScopeId", this.getDeviceScopeId());
        writer.writeStringValue("failedMessage", this.getFailedMessage());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeEnumValue("status", this.getStatus());
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
     * Sets the deviceScopeAction property value. Trigger on the service to either START or STOP computing metrics data based on a device scope configuration.
     * @param value Value to set for the deviceScopeAction property.
     */
    public void setDeviceScopeAction(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("deviceScopeAction", value);
    }
    /**
     * Sets the deviceScopeId property value. The unique identifier of the device scope the action was triggered on.
     * @param value Value to set for the deviceScopeId property.
     */
    public void setDeviceScopeId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("deviceScopeId", value);
    }
    /**
     * Sets the failedMessage property value. The message indicates the reason the device scope action failed to trigger.
     * @param value Value to set for the failedMessage property.
     */
    public void setFailedMessage(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("failedMessage", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the status property value. Indicates the status of the attempted device scope action
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final DeviceScopeActionStatus value) {
        this.backingStore.set("status", value);
    }
}
