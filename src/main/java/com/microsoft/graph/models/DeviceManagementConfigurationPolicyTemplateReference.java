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
 * Policy template reference information
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeviceManagementConfigurationPolicyTemplateReference implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new DeviceManagementConfigurationPolicyTemplateReference and sets the default values.
     */
    public DeviceManagementConfigurationPolicyTemplateReference() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeviceManagementConfigurationPolicyTemplateReference
     */
    @jakarta.annotation.Nonnull
    public static DeviceManagementConfigurationPolicyTemplateReference createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementConfigurationPolicyTemplateReference();
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
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("templateDisplayName", (n) -> { this.setTemplateDisplayName(n.getStringValue()); });
        deserializerMap.put("templateDisplayVersion", (n) -> { this.setTemplateDisplayVersion(n.getStringValue()); });
        deserializerMap.put("templateFamily", (n) -> { this.setTemplateFamily(n.getEnumValue(DeviceManagementConfigurationTemplateFamily.class)); });
        deserializerMap.put("templateId", (n) -> { this.setTemplateId(n.getStringValue()); });
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
     * Gets the templateDisplayName property value. Template Display Name of the referenced template. This property is read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getTemplateDisplayName() {
        return this.backingStore.get("templateDisplayName");
    }
    /**
     * Gets the templateDisplayVersion property value. Template Display Version of the referenced Template. This property is read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getTemplateDisplayVersion() {
        return this.backingStore.get("templateDisplayVersion");
    }
    /**
     * Gets the templateFamily property value. Describes the TemplateFamily for the Template entity
     * @return a DeviceManagementConfigurationTemplateFamily
     */
    @jakarta.annotation.Nullable
    public DeviceManagementConfigurationTemplateFamily getTemplateFamily() {
        return this.backingStore.get("templateFamily");
    }
    /**
     * Gets the templateId property value. Template id
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getTemplateId() {
        return this.backingStore.get("templateId");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeEnumValue("templateFamily", this.getTemplateFamily());
        writer.writeStringValue("templateId", this.getTemplateId());
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
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the templateDisplayName property value. Template Display Name of the referenced template. This property is read-only.
     * @param value Value to set for the templateDisplayName property.
     */
    public void setTemplateDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("templateDisplayName", value);
    }
    /**
     * Sets the templateDisplayVersion property value. Template Display Version of the referenced Template. This property is read-only.
     * @param value Value to set for the templateDisplayVersion property.
     */
    public void setTemplateDisplayVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("templateDisplayVersion", value);
    }
    /**
     * Sets the templateFamily property value. Describes the TemplateFamily for the Template entity
     * @param value Value to set for the templateFamily property.
     */
    public void setTemplateFamily(@jakarta.annotation.Nullable final DeviceManagementConfigurationTemplateFamily value) {
        this.backingStore.set("templateFamily", value);
    }
    /**
     * Sets the templateId property value. Template id
     * @param value Value to set for the templateId property.
     */
    public void setTemplateId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("templateId", value);
    }
}
