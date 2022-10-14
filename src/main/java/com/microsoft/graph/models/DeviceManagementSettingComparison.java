package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Entity representing setting comparison result */
public class DeviceManagementSettingComparison implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Setting comparison result type */
    private DeviceManagementComparisonResult _comparisonResult;
    /** JSON representation of current intent (or) template setting's value */
    private String _currentValueJson;
    /** The ID of the setting definition for this instance */
    private String _definitionId;
    /** The setting's display name */
    private String _displayName;
    /** The setting ID */
    private String _id;
    /** JSON representation of new template setting's value */
    private String _newValueJson;
    /** The OdataType property */
    private String _odataType;
    /**
     * Instantiates a new deviceManagementSettingComparison and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public DeviceManagementSettingComparison() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.deviceManagementSettingComparison");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceManagementSettingComparison
     */
    @javax.annotation.Nonnull
    public static DeviceManagementSettingComparison createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementSettingComparison();
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
     * Gets the comparisonResult property value. Setting comparison result type
     * @return a deviceManagementComparisonResult
     */
    @javax.annotation.Nullable
    public DeviceManagementComparisonResult getComparisonResult() {
        return this._comparisonResult;
    }
    /**
     * Gets the currentValueJson property value. JSON representation of current intent (or) template setting's value
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCurrentValueJson() {
        return this._currentValueJson;
    }
    /**
     * Gets the definitionId property value. The ID of the setting definition for this instance
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDefinitionId() {
        return this._definitionId;
    }
    /**
     * Gets the displayName property value. The setting's display name
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
        final DeviceManagementSettingComparison currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(7) {{
            this.put("comparisonResult", (n) -> { currentObject.setComparisonResult(n.getEnumValue(DeviceManagementComparisonResult.class)); });
            this.put("currentValueJson", (n) -> { currentObject.setCurrentValueJson(n.getStringValue()); });
            this.put("definitionId", (n) -> { currentObject.setDefinitionId(n.getStringValue()); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("id", (n) -> { currentObject.setId(n.getStringValue()); });
            this.put("newValueJson", (n) -> { currentObject.setNewValueJson(n.getStringValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
        }};
    }
    /**
     * Gets the id property value. The setting ID
     * @return a string
     */
    @javax.annotation.Nullable
    public String getId() {
        return this._id;
    }
    /**
     * Gets the newValueJson property value. JSON representation of new template setting's value
     * @return a string
     */
    @javax.annotation.Nullable
    public String getNewValueJson() {
        return this._newValueJson;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this._odataType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("comparisonResult", this.getComparisonResult());
        writer.writeStringValue("currentValueJson", this.getCurrentValueJson());
        writer.writeStringValue("definitionId", this.getDefinitionId());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("id", this.getId());
        writer.writeStringValue("newValueJson", this.getNewValueJson());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the comparisonResult property value. Setting comparison result type
     * @param value Value to set for the comparisonResult property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setComparisonResult(@javax.annotation.Nullable final DeviceManagementComparisonResult value) {
        this._comparisonResult = value;
    }
    /**
     * Sets the currentValueJson property value. JSON representation of current intent (or) template setting's value
     * @param value Value to set for the currentValueJson property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCurrentValueJson(@javax.annotation.Nullable final String value) {
        this._currentValueJson = value;
    }
    /**
     * Sets the definitionId property value. The ID of the setting definition for this instance
     * @param value Value to set for the definitionId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefinitionId(@javax.annotation.Nullable final String value) {
        this._definitionId = value;
    }
    /**
     * Sets the displayName property value. The setting's display name
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the id property value. The setting ID
     * @param value Value to set for the id property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setId(@javax.annotation.Nullable final String value) {
        this._id = value;
    }
    /**
     * Sets the newValueJson property value. JSON representation of new template setting's value
     * @param value Value to set for the newValueJson property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNewValueJson(@javax.annotation.Nullable final String value) {
        this._newValueJson = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
}
