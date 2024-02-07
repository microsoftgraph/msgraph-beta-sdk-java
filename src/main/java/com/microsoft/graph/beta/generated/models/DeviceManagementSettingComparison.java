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
/**
 * Entity representing setting comparison result
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeviceManagementSettingComparison implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new DeviceManagementSettingComparison and sets the default values.
     */
    public DeviceManagementSettingComparison() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeviceManagementSettingComparison
     */
    @jakarta.annotation.Nonnull
    public static DeviceManagementSettingComparison createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementSettingComparison();
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
     * Gets the comparisonResult property value. Setting comparison result type
     * @return a DeviceManagementComparisonResult
     */
    @jakarta.annotation.Nullable
    public DeviceManagementComparisonResult getComparisonResult() {
        return this.backingStore.get("comparisonResult");
    }
    /**
     * Gets the currentValueJson property value. JSON representation of current intent (or) template setting's value
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCurrentValueJson() {
        return this.backingStore.get("currentValueJson");
    }
    /**
     * Gets the definitionId property value. The ID of the setting definition for this instance
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDefinitionId() {
        return this.backingStore.get("definitionId");
    }
    /**
     * Gets the displayName property value. The setting's display name
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("comparisonResult", (n) -> { this.setComparisonResult(n.getEnumValue(DeviceManagementComparisonResult::forValue)); });
        deserializerMap.put("currentValueJson", (n) -> { this.setCurrentValueJson(n.getStringValue()); });
        deserializerMap.put("definitionId", (n) -> { this.setDefinitionId(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("newValueJson", (n) -> { this.setNewValueJson(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the id property value. The setting ID
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getId() {
        return this.backingStore.get("id");
    }
    /**
     * Gets the newValueJson property value. JSON representation of new template setting's value
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getNewValueJson() {
        return this.backingStore.get("newValueJson");
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
        writer.writeEnumValue("comparisonResult", this.getComparisonResult());
        writer.writeStringValue("currentValueJson", this.getCurrentValueJson());
        writer.writeStringValue("definitionId", this.getDefinitionId());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("id", this.getId());
        writer.writeStringValue("newValueJson", this.getNewValueJson());
        writer.writeStringValue("@odata.type", this.getOdataType());
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
     * Sets the comparisonResult property value. Setting comparison result type
     * @param value Value to set for the comparisonResult property.
     */
    public void setComparisonResult(@jakarta.annotation.Nullable final DeviceManagementComparisonResult value) {
        this.backingStore.set("comparisonResult", value);
    }
    /**
     * Sets the currentValueJson property value. JSON representation of current intent (or) template setting's value
     * @param value Value to set for the currentValueJson property.
     */
    public void setCurrentValueJson(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("currentValueJson", value);
    }
    /**
     * Sets the definitionId property value. The ID of the setting definition for this instance
     * @param value Value to set for the definitionId property.
     */
    public void setDefinitionId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("definitionId", value);
    }
    /**
     * Sets the displayName property value. The setting's display name
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the id property value. The setting ID
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("id", value);
    }
    /**
     * Sets the newValueJson property value. JSON representation of new template setting's value
     * @param value Value to set for the newValueJson property.
     */
    public void setNewValueJson(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("newValueJson", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
}
