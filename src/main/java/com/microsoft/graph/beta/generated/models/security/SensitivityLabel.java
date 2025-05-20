package com.microsoft.graph.beta.models.security;

import com.microsoft.graph.beta.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SensitivityLabel extends Entity implements Parsable {
    /**
     * Instantiates a new {@link SensitivityLabel} and sets the default values.
     */
    public SensitivityLabel() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SensitivityLabel}
     */
    @jakarta.annotation.Nonnull
    public static SensitivityLabel createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SensitivityLabel();
    }
    /**
     * Gets the color property value. The color that the UI should display for the label, if configured.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getColor() {
        return this.backingStore.get("color");
    }
    /**
     * Gets the contentFormats property value. Returns the supported content formats for the label.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getContentFormats() {
        return this.backingStore.get("contentFormats");
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("color", (n) -> { this.setColor(n.getStringValue()); });
        deserializerMap.put("contentFormats", (n) -> { this.setContentFormats(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("hasProtection", (n) -> { this.setHasProtection(n.getBooleanValue()); });
        deserializerMap.put("isActive", (n) -> { this.setIsActive(n.getBooleanValue()); });
        deserializerMap.put("isAppliable", (n) -> { this.setIsAppliable(n.getBooleanValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("parent", (n) -> { this.setParent(n.getObjectValue(SensitivityLabel::createFromDiscriminatorValue)); });
        deserializerMap.put("sensitivity", (n) -> { this.setSensitivity(n.getIntegerValue()); });
        deserializerMap.put("tooltip", (n) -> { this.setTooltip(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the hasProtection property value. Indicates whether the label has protection actions configured.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getHasProtection() {
        return this.backingStore.get("hasProtection");
    }
    /**
     * Gets the isActive property value. Indicates whether the label is active or not. Active labels should be hidden or disabled in the UI.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsActive() {
        return this.backingStore.get("isActive");
    }
    /**
     * Gets the isAppliable property value. Indicates whether the label can be applied to content. False if the label is a parent with child labels.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsAppliable() {
        return this.backingStore.get("isAppliable");
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
     * Gets the parent property value. The parent property
     * @return a {@link SensitivityLabel}
     */
    @jakarta.annotation.Nullable
    public SensitivityLabel getParent() {
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
     * Gets the tooltip property value. The tooltip that should be displayed for the label in a UI.
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
        super.serialize(writer);
        writer.writeStringValue("color", this.getColor());
        writer.writeCollectionOfPrimitiveValues("contentFormats", this.getContentFormats());
        writer.writeStringValue("description", this.getDescription());
        writer.writeBooleanValue("hasProtection", this.getHasProtection());
        writer.writeBooleanValue("isActive", this.getIsActive());
        writer.writeBooleanValue("isAppliable", this.getIsAppliable());
        writer.writeStringValue("name", this.getName());
        writer.writeObjectValue("parent", this.getParent());
        writer.writeIntegerValue("sensitivity", this.getSensitivity());
        writer.writeStringValue("tooltip", this.getTooltip());
    }
    /**
     * Sets the color property value. The color that the UI should display for the label, if configured.
     * @param value Value to set for the color property.
     */
    public void setColor(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("color", value);
    }
    /**
     * Sets the contentFormats property value. Returns the supported content formats for the label.
     * @param value Value to set for the contentFormats property.
     */
    public void setContentFormats(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("contentFormats", value);
    }
    /**
     * Sets the description property value. The admin-defined description for the label.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the hasProtection property value. Indicates whether the label has protection actions configured.
     * @param value Value to set for the hasProtection property.
     */
    public void setHasProtection(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("hasProtection", value);
    }
    /**
     * Sets the isActive property value. Indicates whether the label is active or not. Active labels should be hidden or disabled in the UI.
     * @param value Value to set for the isActive property.
     */
    public void setIsActive(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isActive", value);
    }
    /**
     * Sets the isAppliable property value. Indicates whether the label can be applied to content. False if the label is a parent with child labels.
     * @param value Value to set for the isAppliable property.
     */
    public void setIsAppliable(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isAppliable", value);
    }
    /**
     * Sets the name property value. The plaintext name of the label.
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("name", value);
    }
    /**
     * Sets the parent property value. The parent property
     * @param value Value to set for the parent property.
     */
    public void setParent(@jakarta.annotation.Nullable final SensitivityLabel value) {
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
     * Sets the tooltip property value. The tooltip that should be displayed for the label in a UI.
     * @param value Value to set for the tooltip property.
     */
    public void setTooltip(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("tooltip", value);
    }
}
