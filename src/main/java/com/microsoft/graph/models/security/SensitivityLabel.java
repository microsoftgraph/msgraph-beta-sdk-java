package microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import microsoft.graph.models.Entity;
/** Provides operations to manage the collection of activityStatistics entities. */
public class SensitivityLabel extends Entity implements Parsable {
    /** The color that the UI should display for the label, if configured. */
    private String _color;
    /** Returns the supported content formats for the label. */
    private java.util.List<String> _contentFormats;
    /** The admin-defined description for the label. */
    private String _description;
    /** Indicates whether the label has protection actions configured. */
    private Boolean _hasProtection;
    /** Indicates whether the label is active or not. Active labels should be hidden or disabled in the UI. */
    private Boolean _isActive;
    /** Indicates whether the label can be applied to content. False if the label is a parent with child labels. */
    private Boolean _isAppliable;
    /** The plaintext name of the label. */
    private String _name;
    /** The parent label associated with a child label. Null if the label has no parent. */
    private SensitivityLabel _parent;
    /** The sensitivity value of the label, where lower is less sensitive. */
    private Integer _sensitivity;
    /** The tooltip that should be displayed for the label in a UI. */
    private String _tooltip;
    /**
     * Instantiates a new sensitivityLabel and sets the default values.
     * @return a void
     */
    public SensitivityLabel() {
        super();
        this.setOdataType("#microsoft.graph.security.sensitivityLabel");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a sensitivityLabel
     */
    @javax.annotation.Nonnull
    public static SensitivityLabel createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SensitivityLabel();
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
     * Gets the contentFormats property value. Returns the supported content formats for the label.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getContentFormats() {
        return this._contentFormats;
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
        final SensitivityLabel currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("color", (n) -> { currentObject.setColor(n.getStringValue()); });
            this.put("contentFormats", (n) -> { currentObject.setContentFormats(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
            this.put("hasProtection", (n) -> { currentObject.setHasProtection(n.getBooleanValue()); });
            this.put("isActive", (n) -> { currentObject.setIsActive(n.getBooleanValue()); });
            this.put("isAppliable", (n) -> { currentObject.setIsAppliable(n.getBooleanValue()); });
            this.put("name", (n) -> { currentObject.setName(n.getStringValue()); });
            this.put("parent", (n) -> { currentObject.setParent(n.getObjectValue(SensitivityLabel::createFromDiscriminatorValue)); });
            this.put("sensitivity", (n) -> { currentObject.setSensitivity(n.getIntegerValue()); });
            this.put("tooltip", (n) -> { currentObject.setTooltip(n.getStringValue()); });
        }};
    }
    /**
     * Gets the hasProtection property value. Indicates whether the label has protection actions configured.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getHasProtection() {
        return this._hasProtection;
    }
    /**
     * Gets the isActive property value. Indicates whether the label is active or not. Active labels should be hidden or disabled in the UI.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsActive() {
        return this._isActive;
    }
    /**
     * Gets the isAppliable property value. Indicates whether the label can be applied to content. False if the label is a parent with child labels.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsAppliable() {
        return this._isAppliable;
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
     * Gets the parent property value. The parent label associated with a child label. Null if the label has no parent.
     * @return a sensitivityLabel
     */
    @javax.annotation.Nullable
    public SensitivityLabel getParent() {
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
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * @return a void
     */
    public void setColor(@javax.annotation.Nullable final String value) {
        this._color = value;
    }
    /**
     * Sets the contentFormats property value. Returns the supported content formats for the label.
     * @param value Value to set for the contentFormats property.
     * @return a void
     */
    public void setContentFormats(@javax.annotation.Nullable final java.util.List<String> value) {
        this._contentFormats = value;
    }
    /**
     * Sets the description property value. The admin-defined description for the label.
     * @param value Value to set for the description property.
     * @return a void
     */
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the hasProtection property value. Indicates whether the label has protection actions configured.
     * @param value Value to set for the hasProtection property.
     * @return a void
     */
    public void setHasProtection(@javax.annotation.Nullable final Boolean value) {
        this._hasProtection = value;
    }
    /**
     * Sets the isActive property value. Indicates whether the label is active or not. Active labels should be hidden or disabled in the UI.
     * @param value Value to set for the isActive property.
     * @return a void
     */
    public void setIsActive(@javax.annotation.Nullable final Boolean value) {
        this._isActive = value;
    }
    /**
     * Sets the isAppliable property value. Indicates whether the label can be applied to content. False if the label is a parent with child labels.
     * @param value Value to set for the isAppliable property.
     * @return a void
     */
    public void setIsAppliable(@javax.annotation.Nullable final Boolean value) {
        this._isAppliable = value;
    }
    /**
     * Sets the name property value. The plaintext name of the label.
     * @param value Value to set for the name property.
     * @return a void
     */
    public void setName(@javax.annotation.Nullable final String value) {
        this._name = value;
    }
    /**
     * Sets the parent property value. The parent label associated with a child label. Null if the label has no parent.
     * @param value Value to set for the parent property.
     * @return a void
     */
    public void setParent(@javax.annotation.Nullable final SensitivityLabel value) {
        this._parent = value;
    }
    /**
     * Sets the sensitivity property value. The sensitivity value of the label, where lower is less sensitive.
     * @param value Value to set for the sensitivity property.
     * @return a void
     */
    public void setSensitivity(@javax.annotation.Nullable final Integer value) {
        this._sensitivity = value;
    }
    /**
     * Sets the tooltip property value. The tooltip that should be displayed for the label in a UI.
     * @param value Value to set for the tooltip property.
     * @return a void
     */
    public void setTooltip(@javax.annotation.Nullable final String value) {
        this._tooltip = value;
    }
}
