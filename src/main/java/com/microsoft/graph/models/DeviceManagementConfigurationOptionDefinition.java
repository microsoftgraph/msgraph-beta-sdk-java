package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DeviceManagementConfigurationOptionDefinition implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** List of Settings that depends on this option */
    private java.util.List<DeviceManagementConfigurationSettingDependedOnBy> _dependedOnBy;
    /** List of dependent settings for this option */
    private java.util.List<DeviceManagementConfigurationDependentOn> _dependentOn;
    /** Description of the option */
    private String _description;
    /** Friendly name of the option */
    private String _displayName;
    /** Help text of the option */
    private String _helpText;
    /** Identifier of option */
    private String _itemId;
    /** Name of the option */
    private String _name;
    /** The OdataType property */
    private String _odataType;
    /** Value of the option */
    private DeviceManagementConfigurationSettingValue _optionValue;
    /**
     * Instantiates a new deviceManagementConfigurationOptionDefinition and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public DeviceManagementConfigurationOptionDefinition() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.deviceManagementConfigurationOptionDefinition");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceManagementConfigurationOptionDefinition
     */
    @javax.annotation.Nonnull
    public static DeviceManagementConfigurationOptionDefinition createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementConfigurationOptionDefinition();
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
     * Gets the dependedOnBy property value. List of Settings that depends on this option
     * @return a deviceManagementConfigurationSettingDependedOnBy
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceManagementConfigurationSettingDependedOnBy> getDependedOnBy() {
        return this._dependedOnBy;
    }
    /**
     * Gets the dependentOn property value. List of dependent settings for this option
     * @return a deviceManagementConfigurationDependentOn
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceManagementConfigurationDependentOn> getDependentOn() {
        return this._dependentOn;
    }
    /**
     * Gets the description property value. Description of the option
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * Gets the displayName property value. Friendly name of the option
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
        final DeviceManagementConfigurationOptionDefinition currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(9);
        deserializerMap.put("dependedOnBy", (n) -> { currentObject.setDependedOnBy(n.getCollectionOfObjectValues(DeviceManagementConfigurationSettingDependedOnBy::createFromDiscriminatorValue)); });
        deserializerMap.put("dependentOn", (n) -> { currentObject.setDependentOn(n.getCollectionOfObjectValues(DeviceManagementConfigurationDependentOn::createFromDiscriminatorValue)); });
        deserializerMap.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
        deserializerMap.put("helpText", (n) -> { currentObject.setHelpText(n.getStringValue()); });
        deserializerMap.put("itemId", (n) -> { currentObject.setItemId(n.getStringValue()); });
        deserializerMap.put("name", (n) -> { currentObject.setName(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
        deserializerMap.put("optionValue", (n) -> { currentObject.setOptionValue(n.getObjectValue(DeviceManagementConfigurationSettingValue::createFromDiscriminatorValue)); });
        return deserializerMap
    }
    /**
     * Gets the helpText property value. Help text of the option
     * @return a string
     */
    @javax.annotation.Nullable
    public String getHelpText() {
        return this._helpText;
    }
    /**
     * Gets the itemId property value. Identifier of option
     * @return a string
     */
    @javax.annotation.Nullable
    public String getItemId() {
        return this._itemId;
    }
    /**
     * Gets the name property value. Name of the option
     * @return a string
     */
    @javax.annotation.Nullable
    public String getName() {
        return this._name;
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
     * Gets the optionValue property value. Value of the option
     * @return a deviceManagementConfigurationSettingValue
     */
    @javax.annotation.Nullable
    public DeviceManagementConfigurationSettingValue getOptionValue() {
        return this._optionValue;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("dependedOnBy", this.getDependedOnBy());
        writer.writeCollectionOfObjectValues("dependentOn", this.getDependentOn());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("helpText", this.getHelpText());
        writer.writeStringValue("itemId", this.getItemId());
        writer.writeStringValue("name", this.getName());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeObjectValue("optionValue", this.getOptionValue());
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
     * Sets the dependedOnBy property value. List of Settings that depends on this option
     * @param value Value to set for the dependedOnBy property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDependedOnBy(@javax.annotation.Nullable final java.util.List<DeviceManagementConfigurationSettingDependedOnBy> value) {
        this._dependedOnBy = value;
    }
    /**
     * Sets the dependentOn property value. List of dependent settings for this option
     * @param value Value to set for the dependentOn property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDependentOn(@javax.annotation.Nullable final java.util.List<DeviceManagementConfigurationDependentOn> value) {
        this._dependentOn = value;
    }
    /**
     * Sets the description property value. Description of the option
     * @param value Value to set for the description property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the displayName property value. Friendly name of the option
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the helpText property value. Help text of the option
     * @param value Value to set for the helpText property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHelpText(@javax.annotation.Nullable final String value) {
        this._helpText = value;
    }
    /**
     * Sets the itemId property value. Identifier of option
     * @param value Value to set for the itemId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setItemId(@javax.annotation.Nullable final String value) {
        this._itemId = value;
    }
    /**
     * Sets the name property value. Name of the option
     * @param value Value to set for the name property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setName(@javax.annotation.Nullable final String value) {
        this._name = value;
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
    /**
     * Sets the optionValue property value. Value of the option
     * @param value Value to set for the optionValue property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOptionValue(@javax.annotation.Nullable final DeviceManagementConfigurationSettingValue value) {
        this._optionValue = value;
    }
}
