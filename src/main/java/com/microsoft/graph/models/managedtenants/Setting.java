package microsoft.graph.models.managedtenants;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Setting implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The display name for the setting. Required. Read-only. */
    private String _displayName;
    /** The value for the setting serialized as string of JSON. Required. Read-only. */
    private String _jsonValue;
    /** A flag indicating whether the setting can be override existing configurations when applied. Required. Read-only. */
    private Boolean _overwriteAllowed;
    /** The settingId property */
    private String _settingId;
    /** The data type for the setting. Possible values are: string, integer, boolean, guid, stringCollection, integerCollection, booleanCollection, guidCollection, unknownFutureValue. Required. Read-only. */
    private ManagementParameterValueType _valueType;
    /**
     * Instantiates a new setting and sets the default values.
     * @return a void
     */
    public Setting() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a setting
     */
    @javax.annotation.Nonnull
    public static Setting createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Setting();
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
     * Gets the displayName property value. The display name for the setting. Required. Read-only.
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
        final Setting currentObject = this;
        return new HashMap<>(5) {{
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("jsonValue", (n) -> { currentObject.setJsonValue(n.getStringValue()); });
            this.put("overwriteAllowed", (n) -> { currentObject.setOverwriteAllowed(n.getBooleanValue()); });
            this.put("settingId", (n) -> { currentObject.setSettingId(n.getStringValue()); });
            this.put("valueType", (n) -> { currentObject.setValueType(n.getEnumValue(ManagementParameterValueType.class)); });
        }};
    }
    /**
     * Gets the jsonValue property value. The value for the setting serialized as string of JSON. Required. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getJsonValue() {
        return this._jsonValue;
    }
    /**
     * Gets the overwriteAllowed property value. A flag indicating whether the setting can be override existing configurations when applied. Required. Read-only.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getOverwriteAllowed() {
        return this._overwriteAllowed;
    }
    /**
     * Gets the settingId property value. The settingId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSettingId() {
        return this._settingId;
    }
    /**
     * Gets the valueType property value. The data type for the setting. Possible values are: string, integer, boolean, guid, stringCollection, integerCollection, booleanCollection, guidCollection, unknownFutureValue. Required. Read-only.
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
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("jsonValue", this.getJsonValue());
        writer.writeBooleanValue("overwriteAllowed", this.getOverwriteAllowed());
        writer.writeStringValue("settingId", this.getSettingId());
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
     * Sets the displayName property value. The display name for the setting. Required. Read-only.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the jsonValue property value. The value for the setting serialized as string of JSON. Required. Read-only.
     * @param value Value to set for the jsonValue property.
     * @return a void
     */
    public void setJsonValue(@javax.annotation.Nullable final String value) {
        this._jsonValue = value;
    }
    /**
     * Sets the overwriteAllowed property value. A flag indicating whether the setting can be override existing configurations when applied. Required. Read-only.
     * @param value Value to set for the overwriteAllowed property.
     * @return a void
     */
    public void setOverwriteAllowed(@javax.annotation.Nullable final Boolean value) {
        this._overwriteAllowed = value;
    }
    /**
     * Sets the settingId property value. The settingId property
     * @param value Value to set for the settingId property.
     * @return a void
     */
    public void setSettingId(@javax.annotation.Nullable final String value) {
        this._settingId = value;
    }
    /**
     * Sets the valueType property value. The data type for the setting. Possible values are: string, integer, boolean, guid, stringCollection, integerCollection, booleanCollection, guidCollection, unknownFutureValue. Required. Read-only.
     * @param value Value to set for the valueType property.
     * @return a void
     */
    public void setValueType(@javax.annotation.Nullable final ManagementParameterValueType value) {
        this._valueType = value;
    }
}
