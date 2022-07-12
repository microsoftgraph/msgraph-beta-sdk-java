package microsoft.graph.models.managedtenants;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class TemplateParameter implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The description for the template parameter. Optional. Read-only. */
    private String _description;
    /** The display name for the template parameter. Required. Read-only. */
    private String _displayName;
    /** The allowed values for the template parameter represented by a serialized string of JSON. Optional. Read-only. */
    private String _jsonAllowedValues;
    /** The default value for the template parameter represented by a serialized string of JSON. Required. Read-only. */
    private String _jsonDefaultValue;
    /** The valueType property */
    private ManagementParameterValueType _valueType;
    /**
     * Instantiates a new templateParameter and sets the default values.
     * @return a void
     */
    public TemplateParameter() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a templateParameter
     */
    @javax.annotation.Nonnull
    public static TemplateParameter createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TemplateParameter();
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
     * Gets the description property value. The description for the template parameter. Optional. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * Gets the displayName property value. The display name for the template parameter. Required. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final TemplateParameter currentObject = this;
        return new HashMap<>(5) {{
            this.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("jsonAllowedValues", (n) -> { currentObject.setJsonAllowedValues(n.getStringValue()); });
            this.put("jsonDefaultValue", (n) -> { currentObject.setJsonDefaultValue(n.getStringValue()); });
            this.put("valueType", (n) -> { currentObject.setValueType(n.getEnumValue(ManagementParameterValueType.class)); });
        }};
    }
    /**
     * Gets the jsonAllowedValues property value. The allowed values for the template parameter represented by a serialized string of JSON. Optional. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getJsonAllowedValues() {
        return this._jsonAllowedValues;
    }
    /**
     * Gets the jsonDefaultValue property value. The default value for the template parameter represented by a serialized string of JSON. Required. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getJsonDefaultValue() {
        return this._jsonDefaultValue;
    }
    /**
     * Gets the valueType property value. The valueType property
     * @return a managementParameterValueType
     */
    @javax.annotation.Nullable
    public ManagementParameterValueType getValueType() {
        return this._valueType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("jsonAllowedValues", this.getJsonAllowedValues());
        writer.writeStringValue("jsonDefaultValue", this.getJsonDefaultValue());
        writer.writeEnumValue("valueType", this.getValueType());
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
     * Sets the description property value. The description for the template parameter. Optional. Read-only.
     * @param value Value to set for the description property.
     * @return a void
     */
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the displayName property value. The display name for the template parameter. Required. Read-only.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the jsonAllowedValues property value. The allowed values for the template parameter represented by a serialized string of JSON. Optional. Read-only.
     * @param value Value to set for the jsonAllowedValues property.
     * @return a void
     */
    public void setJsonAllowedValues(@javax.annotation.Nullable final String value) {
        this._jsonAllowedValues = value;
    }
    /**
     * Sets the jsonDefaultValue property value. The default value for the template parameter represented by a serialized string of JSON. Required. Read-only.
     * @param value Value to set for the jsonDefaultValue property.
     * @return a void
     */
    public void setJsonDefaultValue(@javax.annotation.Nullable final String value) {
        this._jsonDefaultValue = value;
    }
    /**
     * Sets the valueType property value. The valueType property
     * @param value Value to set for the valueType property.
     * @return a void
     */
    public void setValueType(@javax.annotation.Nullable final ManagementParameterValueType value) {
        this._valueType = value;
    }
}
