package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Group Setting Value Template
 */
public class DeviceManagementConfigurationGroupSettingValueTemplate implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** Group setting value children */
    private java.util.List<DeviceManagementConfigurationSettingInstanceTemplate> children;
    /** The OdataType property */
    private String odataType;
    /** Setting Value Template Id */
    private String settingValueTemplateId;
    /**
     * Instantiates a new deviceManagementConfigurationGroupSettingValueTemplate and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public DeviceManagementConfigurationGroupSettingValueTemplate() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceManagementConfigurationGroupSettingValueTemplate
     */
    @javax.annotation.Nonnull
    public static DeviceManagementConfigurationGroupSettingValueTemplate createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementConfigurationGroupSettingValueTemplate();
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
     * Gets the children property value. Group setting value children
     * @return a deviceManagementConfigurationSettingInstanceTemplate
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceManagementConfigurationSettingInstanceTemplate> getChildren() {
        return this.children;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("children", (n) -> { this.setChildren(n.getCollectionOfObjectValues(DeviceManagementConfigurationSettingInstanceTemplate::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("settingValueTemplateId", (n) -> { this.setSettingValueTemplateId(n.getStringValue()); });
        return deserializerMap;
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
     * Gets the settingValueTemplateId property value. Setting Value Template Id
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSettingValueTemplateId() {
        return this.settingValueTemplateId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("children", this.getChildren());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("settingValueTemplateId", this.getSettingValueTemplateId());
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
     * Sets the children property value. Group setting value children
     * @param value Value to set for the children property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setChildren(@javax.annotation.Nullable final java.util.List<DeviceManagementConfigurationSettingInstanceTemplate> value) {
        this.children = value;
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
     * Sets the settingValueTemplateId property value. Setting Value Template Id
     * @param value Value to set for the settingValueTemplateId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSettingValueTemplateId(@javax.annotation.Nullable final String value) {
        this.settingValueTemplateId = value;
    }
}
