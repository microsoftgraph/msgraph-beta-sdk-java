package com.microsoft.graph.models.managedtenants;

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
public class Setting implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new Setting and sets the default values.
     */
    public Setting() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Setting
     */
    @jakarta.annotation.Nonnull
    public static Setting createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Setting();
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
     * Gets the displayName property value. The display name for the setting. Required. Read-only.
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("jsonValue", (n) -> { this.setJsonValue(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("overwriteAllowed", (n) -> { this.setOverwriteAllowed(n.getBooleanValue()); });
        deserializerMap.put("settingId", (n) -> { this.setSettingId(n.getStringValue()); });
        deserializerMap.put("valueType", (n) -> { this.setValueType(n.getEnumValue(ManagementParameterValueType::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the jsonValue property value. The value for the setting serialized as string of JSON. Required. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getJsonValue() {
        return this.backingStore.get("jsonValue");
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
     * Gets the overwriteAllowed property value. A flag indicating whether the setting can be override existing configurations when applied. Required. Read-only.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getOverwriteAllowed() {
        return this.backingStore.get("overwriteAllowed");
    }
    /**
     * Gets the settingId property value. The settingId property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSettingId() {
        return this.backingStore.get("settingId");
    }
    /**
     * Gets the valueType property value. The valueType property
     * @return a ManagementParameterValueType
     */
    @jakarta.annotation.Nullable
    public ManagementParameterValueType getValueType() {
        return this.backingStore.get("valueType");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("jsonValue", this.getJsonValue());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeBooleanValue("overwriteAllowed", this.getOverwriteAllowed());
        writer.writeStringValue("settingId", this.getSettingId());
        writer.writeEnumValue("valueType", this.getValueType());
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
     * Sets the displayName property value. The display name for the setting. Required. Read-only.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the jsonValue property value. The value for the setting serialized as string of JSON. Required. Read-only.
     * @param value Value to set for the jsonValue property.
     */
    public void setJsonValue(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("jsonValue", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the overwriteAllowed property value. A flag indicating whether the setting can be override existing configurations when applied. Required. Read-only.
     * @param value Value to set for the overwriteAllowed property.
     */
    public void setOverwriteAllowed(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("overwriteAllowed", value);
    }
    /**
     * Sets the settingId property value. The settingId property
     * @param value Value to set for the settingId property.
     */
    public void setSettingId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("settingId", value);
    }
    /**
     * Sets the valueType property value. The valueType property
     * @param value Value to set for the valueType property.
     */
    public void setValueType(@jakarta.annotation.Nullable final ManagementParameterValueType value) {
        this.backingStore.set("valueType", value);
    }
}
