package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DeviceManagementConfigurationOptionDefinition implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * List of Settings that depends on this option
     */
    private java.util.List<DeviceManagementConfigurationSettingDependedOnBy> dependedOnBy;
    /**
     * List of dependent settings for this option
     */
    private java.util.List<DeviceManagementConfigurationDependentOn> dependentOn;
    /**
     * Description of the option
     */
    private String description;
    /**
     * Friendly name of the option
     */
    private String displayName;
    /**
     * Help text of the option
     */
    private String helpText;
    /**
     * Identifier of option
     */
    private String itemId;
    /**
     * Name of the option
     */
    private String name;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Value of the option
     */
    private DeviceManagementConfigurationSettingValue optionValue;
    /**
     * Instantiates a new deviceManagementConfigurationOptionDefinition and sets the default values.
     */
    public DeviceManagementConfigurationOptionDefinition() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceManagementConfigurationOptionDefinition
     */
    @jakarta.annotation.Nonnull
    public static DeviceManagementConfigurationOptionDefinition createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementConfigurationOptionDefinition();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the dependedOnBy property value. List of Settings that depends on this option
     * @return a deviceManagementConfigurationSettingDependedOnBy
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceManagementConfigurationSettingDependedOnBy> getDependedOnBy() {
        return this.dependedOnBy;
    }
    /**
     * Gets the dependentOn property value. List of dependent settings for this option
     * @return a deviceManagementConfigurationDependentOn
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceManagementConfigurationDependentOn> getDependentOn() {
        return this.dependentOn;
    }
    /**
     * Gets the description property value. Description of the option
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * Gets the displayName property value. Friendly name of the option
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(9);
        deserializerMap.put("dependedOnBy", (n) -> { this.setDependedOnBy(n.getCollectionOfObjectValues(DeviceManagementConfigurationSettingDependedOnBy::createFromDiscriminatorValue)); });
        deserializerMap.put("dependentOn", (n) -> { this.setDependentOn(n.getCollectionOfObjectValues(DeviceManagementConfigurationDependentOn::createFromDiscriminatorValue)); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("helpText", (n) -> { this.setHelpText(n.getStringValue()); });
        deserializerMap.put("itemId", (n) -> { this.setItemId(n.getStringValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("optionValue", (n) -> { this.setOptionValue(n.getObjectValue(DeviceManagementConfigurationSettingValue::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the helpText property value. Help text of the option
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getHelpText() {
        return this.helpText;
    }
    /**
     * Gets the itemId property value. Identifier of option
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getItemId() {
        return this.itemId;
    }
    /**
     * Gets the name property value. Name of the option
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the optionValue property value. Value of the option
     * @return a deviceManagementConfigurationSettingValue
     */
    @jakarta.annotation.Nullable
    public DeviceManagementConfigurationSettingValue getOptionValue() {
        return this.optionValue;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     * @param value Value to set for the additionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the dependedOnBy property value. List of Settings that depends on this option
     * @param value Value to set for the dependedOnBy property.
     */
    public void setDependedOnBy(@jakarta.annotation.Nullable final java.util.List<DeviceManagementConfigurationSettingDependedOnBy> value) {
        this.dependedOnBy = value;
    }
    /**
     * Sets the dependentOn property value. List of dependent settings for this option
     * @param value Value to set for the dependentOn property.
     */
    public void setDependentOn(@jakarta.annotation.Nullable final java.util.List<DeviceManagementConfigurationDependentOn> value) {
        this.dependentOn = value;
    }
    /**
     * Sets the description property value. Description of the option
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the displayName property value. Friendly name of the option
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the helpText property value. Help text of the option
     * @param value Value to set for the helpText property.
     */
    public void setHelpText(@jakarta.annotation.Nullable final String value) {
        this.helpText = value;
    }
    /**
     * Sets the itemId property value. Identifier of option
     * @param value Value to set for the itemId property.
     */
    public void setItemId(@jakarta.annotation.Nullable final String value) {
        this.itemId = value;
    }
    /**
     * Sets the name property value. Name of the option
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the optionValue property value. Value of the option
     * @param value Value to set for the optionValue property.
     */
    public void setOptionValue(@jakarta.annotation.Nullable final DeviceManagementConfigurationSettingValue value) {
        this.optionValue = value;
    }
}
