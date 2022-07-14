package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ParentLabelDetails implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The color that the user interface should display for the label, if configured. */
    private String _color;
    /** The admin-defined description for the label. */
    private String _description;
    /** The label ID is a globally unique identifier (GUID). */
    private String _id;
    /** Indicates whether the label is active or not. Active labels should be hidden or disabled in user interfaces. */
    private Boolean _isActive;
    /** The plaintext name of the label. */
    private String _name;
    /** The parent property */
    private ParentLabelDetails _parent;
    /** The sensitivity value of the label, where lower is less sensitive. */
    private Integer _sensitivity;
    /** The tooltip that should be displayed for the label in a user interface. */
    private String _tooltip;
    /** The type property */
    private String _type;
    /**
     * Instantiates a new parentLabelDetails and sets the default values.
     * @return a void
     */
    public ParentLabelDetails() {
        this.setAdditionalData(new HashMap<>());
        this.setType("#microsoft.graph.parentLabelDetails");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a parentLabelDetails
     */
    @javax.annotation.Nonnull
    public static ParentLabelDetails createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
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
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * Gets the color property value. The color that the user interface should display for the label, if configured.
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
        final ParentLabelDetails currentObject = this;
        return new HashMap<>(9) {{
            this.put("color", (n) -> { currentObject.setColor(n.getStringValue()); });
            this.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
            this.put("id", (n) -> { currentObject.setId(n.getStringValue()); });
            this.put("isActive", (n) -> { currentObject.setIsActive(n.getBooleanValue()); });
            this.put("name", (n) -> { currentObject.setName(n.getStringValue()); });
            this.put("parent", (n) -> { currentObject.setParent(n.getObjectValue(ParentLabelDetails::createFromDiscriminatorValue)); });
            this.put("sensitivity", (n) -> { currentObject.setSensitivity(n.getIntegerValue()); });
            this.put("tooltip", (n) -> { currentObject.setTooltip(n.getStringValue()); });
            this.put("@odata.type", (n) -> { currentObject.setType(n.getStringValue()); });
        }};
    }
    /**
     * Gets the id property value. The label ID is a globally unique identifier (GUID).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getId() {
        return this._id;
    }
    /**
     * Gets the isActive property value. Indicates whether the label is active or not. Active labels should be hidden or disabled in user interfaces.
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
     * Gets the parent property value. The parent property
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
     * Gets the tooltip property value. The tooltip that should be displayed for the label in a user interface.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTooltip() {
        return this._tooltip;
    }
    /**
     * Gets the @odata.type property value. The type property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getType() {
        return this._type;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("color", this.getColor());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("id", this.getId());
        writer.writeBooleanValue("isActive", this.getIsActive());
        writer.writeStringValue("name", this.getName());
        writer.writeObjectValue("parent", this.getParent());
        writer.writeIntegerValue("sensitivity", this.getSensitivity());
        writer.writeStringValue("tooltip", this.getTooltip());
        writer.writeStringValue("@odata.type", this.getType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the color property value. The color that the user interface should display for the label, if configured.
     * @param value Value to set for the color property.
     * @return a void
     */
    public void setColor(@javax.annotation.Nullable final String value) {
        this._color = value;
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
     * Sets the id property value. The label ID is a globally unique identifier (GUID).
     * @param value Value to set for the id property.
     * @return a void
     */
    public void setId(@javax.annotation.Nullable final String value) {
        this._id = value;
    }
    /**
     * Sets the isActive property value. Indicates whether the label is active or not. Active labels should be hidden or disabled in user interfaces.
     * @param value Value to set for the isActive property.
     * @return a void
     */
    public void setIsActive(@javax.annotation.Nullable final Boolean value) {
        this._isActive = value;
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
     * Sets the parent property value. The parent property
     * @param value Value to set for the parent property.
     * @return a void
     */
    public void setParent(@javax.annotation.Nullable final ParentLabelDetails value) {
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
     * Sets the tooltip property value. The tooltip that should be displayed for the label in a user interface.
     * @param value Value to set for the tooltip property.
     * @return a void
     */
    public void setTooltip(@javax.annotation.Nullable final String value) {
        this._tooltip = value;
    }
    /**
     * Sets the @odata.type property value. The type property
     * @param value Value to set for the type property.
     * @return a void
     */
    public void setType(@javax.annotation.Nullable final String value) {
        this._type = value;
    }
}
