package com.microsoft.graph.models.managedtenants;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Setting implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The display name for the setting. Required. Read-only.
     */
    private String displayName;
    /**
     * The value for the setting serialized as string of JSON. Required. Read-only.
     */
    private String jsonValue;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * A flag indicating whether the setting can be override existing configurations when applied. Required. Read-only.
     */
    private Boolean overwriteAllowed;
    /**
     * The settingId property
     */
    private String settingId;
    /**
     * The valueType property
     */
    private ManagementParameterValueType valueType;
    /**
     * Instantiates a new setting and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
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
        return this.additionalData;
    }
    /**
     * Gets the displayName property value. The display name for the setting. Required. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("jsonValue", (n) -> { this.setJsonValue(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("overwriteAllowed", (n) -> { this.setOverwriteAllowed(n.getBooleanValue()); });
        deserializerMap.put("settingId", (n) -> { this.setSettingId(n.getStringValue()); });
        deserializerMap.put("valueType", (n) -> { this.setValueType(n.getEnumValue(ManagementParameterValueType.class)); });
        return deserializerMap;
    }
    /**
     * Gets the jsonValue property value. The value for the setting serialized as string of JSON. Required. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getJsonValue() {
        return this.jsonValue;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the overwriteAllowed property value. A flag indicating whether the setting can be override existing configurations when applied. Required. Read-only.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getOverwriteAllowed() {
        return this.overwriteAllowed;
    }
    /**
     * Gets the settingId property value. The settingId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSettingId() {
        return this.settingId;
    }
    /**
     * Gets the valueType property value. The valueType property
     * @return a managementParameterValueType
     */
    @javax.annotation.Nullable
    public ManagementParameterValueType getValueType() {
        return this.valueType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("jsonValue", this.getJsonValue());
        writer.writeStringValue("@odata.type", this.getOdataType());
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
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the displayName property value. The display name for the setting. Required. Read-only.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the jsonValue property value. The value for the setting serialized as string of JSON. Required. Read-only.
     * @param value Value to set for the jsonValue property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setJsonValue(@javax.annotation.Nullable final String value) {
        this.jsonValue = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the overwriteAllowed property value. A flag indicating whether the setting can be override existing configurations when applied. Required. Read-only.
     * @param value Value to set for the overwriteAllowed property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOverwriteAllowed(@javax.annotation.Nullable final Boolean value) {
        this.overwriteAllowed = value;
    }
    /**
     * Sets the settingId property value. The settingId property
     * @param value Value to set for the settingId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSettingId(@javax.annotation.Nullable final String value) {
        this.settingId = value;
    }
    /**
     * Sets the valueType property value. The valueType property
     * @param value Value to set for the valueType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setValueType(@javax.annotation.Nullable final ManagementParameterValueType value) {
        this.valueType = value;
    }
}
