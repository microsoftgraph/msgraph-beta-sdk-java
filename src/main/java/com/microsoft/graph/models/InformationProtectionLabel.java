package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the collection of accessReviewDecision entities. */
public class InformationProtectionLabel extends Entity implements Parsable {
    /** The color that the UI should display for the label, if configured. */
    private String _color;
    /** The admin-defined description for the label. */
    private String _description;
    /** Indicates whether the label is active or not. Active labels should be hidden or disabled in UI. */
    private Boolean _isActive;
    /** The plaintext name of the label. */
    private String _name;
    /** The parent label associated with a child label. Null if label has no parent. */
    private ParentLabelDetails _parent;
    /** The sensitivity value of the label, where lower is less sensitive. */
    private Integer _sensitivity;
    /** The tooltip that should be displayed for the label in a UI. */
    private String _tooltip;
    /**
     * Instantiates a new informationProtectionLabel and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public InformationProtectionLabel() {
        super();
        this.setOdataType("#microsoft.graph.informationProtectionLabel");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a informationProtectionLabel
     */
    @javax.annotation.Nonnull
    public static InformationProtectionLabel createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new InformationProtectionLabel();
    }
    /**
     * Gets the color property value. The color that the UI should display for the label, if configured.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getColor() {
        return this._color;
    }
    /**
     * Gets the description property value. The admin-defined description for the label.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final InformationProtectionLabel currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("color", (n) -> { currentObject.setColor(n.getStringValue()); });
        deserializerMap.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
        deserializerMap.put("isActive", (n) -> { currentObject.setIsActive(n.getBooleanValue()); });
        deserializerMap.put("name", (n) -> { currentObject.setName(n.getStringValue()); });
        deserializerMap.put("parent", (n) -> { currentObject.setParent(n.getObjectValue(ParentLabelDetails::createFromDiscriminatorValue)); });
        deserializerMap.put("sensitivity", (n) -> { currentObject.setSensitivity(n.getIntegerValue()); });
        deserializerMap.put("tooltip", (n) -> { currentObject.setTooltip(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isActive property value. Indicates whether the label is active or not. Active labels should be hidden or disabled in UI.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsActive() {
        return this._isActive;
    }
    /**
     * Gets the name property value. The plaintext name of the label.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getName() {
        return this._name;
    }
    /**
     * Gets the parent property value. The parent label associated with a child label. Null if label has no parent.
     * @return a parentLabelDetails
     */
    @javax.annotation.Nullable
    public ParentLabelDetails getParent() {
        return this._parent;
    }
    /**
     * Gets the sensitivity property value. The sensitivity value of the label, where lower is less sensitive.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getSensitivity() {
        return this._sensitivity;
    }
    /**
     * Gets the tooltip property value. The tooltip that should be displayed for the label in a UI.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTooltip() {
        return this._tooltip;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("color", this.getColor());
        writer.writeStringValue("description", this.getDescription());
        writer.writeBooleanValue("isActive", this.getIsActive());
        writer.writeStringValue("name", this.getName());
        writer.writeObjectValue("parent", this.getParent());
        writer.writeIntegerValue("sensitivity", this.getSensitivity());
        writer.writeStringValue("tooltip", this.getTooltip());
    }
    /**
     * Sets the color property value. The color that the UI should display for the label, if configured.
     * @param value Value to set for the color property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setColor(@javax.annotation.Nullable final String value) {
        this._color = value;
    }
    /**
     * Sets the description property value. The admin-defined description for the label.
     * @param value Value to set for the description property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the isActive property value. Indicates whether the label is active or not. Active labels should be hidden or disabled in UI.
     * @param value Value to set for the isActive property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsActive(@javax.annotation.Nullable final Boolean value) {
        this._isActive = value;
    }
    /**
     * Sets the name property value. The plaintext name of the label.
     * @param value Value to set for the name property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setName(@javax.annotation.Nullable final String value) {
        this._name = value;
    }
    /**
     * Sets the parent property value. The parent label associated with a child label. Null if label has no parent.
     * @param value Value to set for the parent property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setParent(@javax.annotation.Nullable final ParentLabelDetails value) {
        this._parent = value;
    }
    /**
     * Sets the sensitivity property value. The sensitivity value of the label, where lower is less sensitive.
     * @param value Value to set for the sensitivity property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSensitivity(@javax.annotation.Nullable final Integer value) {
        this._sensitivity = value;
    }
    /**
     * Sets the tooltip property value. The tooltip that should be displayed for the label in a UI.
     * @param value Value to set for the tooltip property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTooltip(@javax.annotation.Nullable final String value) {
        this._tooltip = value;
    }
}
