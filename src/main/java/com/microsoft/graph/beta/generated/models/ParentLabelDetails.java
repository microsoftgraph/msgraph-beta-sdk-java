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
public class ParentLabelDetails implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link ParentLabelDetails} and sets the default values.
     */
    public ParentLabelDetails() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ParentLabelDetails}
     */
    @jakarta.annotation.Nonnull
    public static ParentLabelDetails createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.labelDetails": return new LabelDetails();
            }
        }
        return new ParentLabelDetails();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a {@link Map<String, Object>}
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
     * @return a {@link BackingStore}
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * Gets the color property value. The color that the user interface should display for the label, if configured.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getColor() {
        return this.backingStore.get("color");
    }
    /**
     * Gets the description property value. The admin-defined description for the label.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(9);
        deserializerMap.put("color", (n) -> { this.setColor(n.getStringValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("isActive", (n) -> { this.setIsActive(n.getBooleanValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("parent", (n) -> { this.setParent(n.getObjectValue(ParentLabelDetails::createFromDiscriminatorValue)); });
        deserializerMap.put("sensitivity", (n) -> { this.setSensitivity(n.getIntegerValue()); });
        deserializerMap.put("tooltip", (n) -> { this.setTooltip(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the id property value. The label ID is a globally unique identifier (GUID).
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getId() {
        return this.backingStore.get("id");
    }
    /**
     * Gets the isActive property value. Indicates whether the label is active or not. Active labels should be hidden or disabled in user interfaces.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsActive() {
        return this.backingStore.get("isActive");
    }
    /**
     * Gets the name property value. The plaintext name of the label.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.backingStore.get("name");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Gets the parent property value. The parent property
     * @return a {@link ParentLabelDetails}
     */
    @jakarta.annotation.Nullable
    public ParentLabelDetails getParent() {
        return this.backingStore.get("parent");
    }
    /**
     * Gets the sensitivity property value. The sensitivity value of the label, where lower is less sensitive.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getSensitivity() {
        return this.backingStore.get("sensitivity");
    }
    /**
     * Gets the tooltip property value. The tooltip that should be displayed for the label in a user interface.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTooltip() {
        return this.backingStore.get("tooltip");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("color", this.getColor());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("id", this.getId());
        writer.writeBooleanValue("isActive", this.getIsActive());
        writer.writeStringValue("name", this.getName());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeObjectValue("parent", this.getParent());
        writer.writeIntegerValue("sensitivity", this.getSensitivity());
        writer.writeStringValue("tooltip", this.getTooltip());
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
     * Sets the color property value. The color that the user interface should display for the label, if configured.
     * @param value Value to set for the color property.
     */
    public void setColor(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("color", value);
    }
    /**
     * Sets the description property value. The admin-defined description for the label.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the id property value. The label ID is a globally unique identifier (GUID).
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("id", value);
    }
    /**
     * Sets the isActive property value. Indicates whether the label is active or not. Active labels should be hidden or disabled in user interfaces.
     * @param value Value to set for the isActive property.
     */
    public void setIsActive(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isActive", value);
    }
    /**
     * Sets the name property value. The plaintext name of the label.
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
     * Sets the parent property value. The parent property
     * @param value Value to set for the parent property.
     */
    public void setParent(@jakarta.annotation.Nullable final ParentLabelDetails value) {
        this.backingStore.set("parent", value);
    }
    /**
     * Sets the sensitivity property value. The sensitivity value of the label, where lower is less sensitive.
     * @param value Value to set for the sensitivity property.
     */
    public void setSensitivity(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("sensitivity", value);
    }
    /**
     * Sets the tooltip property value. The tooltip that should be displayed for the label in a user interface.
     * @param value Value to set for the tooltip property.
     */
    public void setTooltip(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("tooltip", value);
    }
}
