package com.microsoft.graph.models.security;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class SensitivityLabel extends Entity implements Parsable {
    /**
     * The color that the UI should display for the label, if configured.
     */
    private String color;
    /**
     * Returns the supported content formats for the label.
     */
    private java.util.List<String> contentFormats;
    /**
     * The admin-defined description for the label.
     */
    private String description;
    /**
     * Indicates whether the label has protection actions configured.
     */
    private Boolean hasProtection;
    /**
     * Indicates whether the label is active or not. Active labels should be hidden or disabled in the UI.
     */
    private Boolean isActive;
    /**
     * Indicates whether the label can be applied to content. False if the label is a parent with child labels.
     */
    private Boolean isAppliable;
    /**
     * The plaintext name of the label.
     */
    private String name;
    /**
     * The parent label associated with a child label. Null if the label has no parent.
     */
    private SensitivityLabel parent;
    /**
     * The sensitivity value of the label, where lower is less sensitive.
     */
    private Integer sensitivity;
    /**
     * The tooltip that should be displayed for the label in a UI.
     */
    private String tooltip;
    /**
     * Instantiates a new sensitivityLabel and sets the default values.
     */
    public SensitivityLabel() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a sensitivityLabel
     */
    @jakarta.annotation.Nonnull
    public static SensitivityLabel createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SensitivityLabel();
    }
    /**
     * Gets the color property value. The color that the UI should display for the label, if configured.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getColor() {
        return this.color;
    }
    /**
     * Gets the contentFormats property value. Returns the supported content formats for the label.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getContentFormats() {
        return this.contentFormats;
    }
    /**
     * Gets the description property value. The admin-defined description for the label.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
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
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getHasProtection() {
        return this.hasProtection;
    }
    /**
     * Gets the isActive property value. Indicates whether the label is active or not. Active labels should be hidden or disabled in the UI.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsActive() {
        return this.isActive;
    }
    /**
     * Gets the isAppliable property value. Indicates whether the label can be applied to content. False if the label is a parent with child labels.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsAppliable() {
        return this.isAppliable;
    }
    /**
     * Gets the name property value. The plaintext name of the label.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the parent property value. The parent label associated with a child label. Null if the label has no parent.
     * @return a sensitivityLabel
     */
    @jakarta.annotation.Nullable
    public SensitivityLabel getParent() {
        return this.parent;
    }
    /**
     * Gets the sensitivity property value. The sensitivity value of the label, where lower is less sensitive.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getSensitivity() {
        return this.sensitivity;
    }
    /**
     * Gets the tooltip property value. The tooltip that should be displayed for the label in a UI.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getTooltip() {
        return this.tooltip;
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
        this.color = value;
    }
    /**
     * Sets the contentFormats property value. Returns the supported content formats for the label.
     * @param value Value to set for the contentFormats property.
     */
    public void setContentFormats(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.contentFormats = value;
    }
    /**
     * Sets the description property value. The admin-defined description for the label.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the hasProtection property value. Indicates whether the label has protection actions configured.
     * @param value Value to set for the hasProtection property.
     */
    public void setHasProtection(@jakarta.annotation.Nullable final Boolean value) {
        this.hasProtection = value;
    }
    /**
     * Sets the isActive property value. Indicates whether the label is active or not. Active labels should be hidden or disabled in the UI.
     * @param value Value to set for the isActive property.
     */
    public void setIsActive(@jakarta.annotation.Nullable final Boolean value) {
        this.isActive = value;
    }
    /**
     * Sets the isAppliable property value. Indicates whether the label can be applied to content. False if the label is a parent with child labels.
     * @param value Value to set for the isAppliable property.
     */
    public void setIsAppliable(@jakarta.annotation.Nullable final Boolean value) {
        this.isAppliable = value;
    }
    /**
     * Sets the name property value. The plaintext name of the label.
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the parent property value. The parent label associated with a child label. Null if the label has no parent.
     * @param value Value to set for the parent property.
     */
    public void setParent(@jakarta.annotation.Nullable final SensitivityLabel value) {
        this.parent = value;
    }
    /**
     * Sets the sensitivity property value. The sensitivity value of the label, where lower is less sensitive.
     * @param value Value to set for the sensitivity property.
     */
    public void setSensitivity(@jakarta.annotation.Nullable final Integer value) {
        this.sensitivity = value;
    }
    /**
     * Sets the tooltip property value. The tooltip that should be displayed for the label in a UI.
     * @param value Value to set for the tooltip property.
     */
    public void setTooltip(@jakarta.annotation.Nullable final String value) {
        this.tooltip = value;
    }
}
