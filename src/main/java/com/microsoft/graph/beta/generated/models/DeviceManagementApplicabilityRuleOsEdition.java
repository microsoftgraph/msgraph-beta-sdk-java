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
public class DeviceManagementApplicabilityRuleOsEdition implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new DeviceManagementApplicabilityRuleOsEdition and sets the default values.
     */
    public DeviceManagementApplicabilityRuleOsEdition() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeviceManagementApplicabilityRuleOsEdition
     */
    @jakarta.annotation.Nonnull
    public static DeviceManagementApplicabilityRuleOsEdition createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementApplicabilityRuleOsEdition();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("osEditionTypes", (n) -> { this.setOsEditionTypes(n.getCollectionOfEnumValues(Windows10EditionType::forValue)); });
        deserializerMap.put("ruleType", (n) -> { this.setRuleType(n.getEnumValue(DeviceManagementApplicabilityRuleType::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the name property value. Name for object.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.backingStore.get("name");
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
     * Gets the osEditionTypes property value. Applicability rule OS edition type.
     * @return a java.util.List<Windows10EditionType>
     */
    @jakarta.annotation.Nullable
    public java.util.List<Windows10EditionType> getOsEditionTypes() {
        return this.backingStore.get("osEditionTypes");
    }
    /**
     * Gets the ruleType property value. Supported Applicability rule types for Device Configuration
     * @return a DeviceManagementApplicabilityRuleType
     */
    @jakarta.annotation.Nullable
    public DeviceManagementApplicabilityRuleType getRuleType() {
        return this.backingStore.get("ruleType");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("name", this.getName());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeCollectionOfEnumValues("osEditionTypes", this.getOsEditionTypes());
        writer.writeEnumValue("ruleType", this.getRuleType());
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
     * Sets the name property value. Name for object.
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("name", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the osEditionTypes property value. Applicability rule OS edition type.
     * @param value Value to set for the osEditionTypes property.
     */
    public void setOsEditionTypes(@jakarta.annotation.Nullable final java.util.List<Windows10EditionType> value) {
        this.backingStore.set("osEditionTypes", value);
    }
    /**
     * Sets the ruleType property value. Supported Applicability rule types for Device Configuration
     * @param value Value to set for the ruleType property.
     */
    public void setRuleType(@jakarta.annotation.Nullable final DeviceManagementApplicabilityRuleType value) {
        this.backingStore.set("ruleType", value);
    }
}
