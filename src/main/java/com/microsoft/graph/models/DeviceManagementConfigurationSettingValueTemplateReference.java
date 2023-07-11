package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Setting value template reference information
 */
public class DeviceManagementConfigurationSettingValueTemplateReference implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Setting value template id
     */
    private String settingValueTemplateId;
    /**
     * Indicates whether to update policy setting value to match template setting default value
     */
    private Boolean useTemplateDefault;
    /**
     * Instantiates a new deviceManagementConfigurationSettingValueTemplateReference and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public DeviceManagementConfigurationSettingValueTemplateReference() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceManagementConfigurationSettingValueTemplateReference
     */
    @javax.annotation.Nonnull
    public static DeviceManagementConfigurationSettingValueTemplateReference createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementConfigurationSettingValueTemplateReference();
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
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("settingValueTemplateId", (n) -> { this.setSettingValueTemplateId(n.getStringValue()); });
        deserializerMap.put("useTemplateDefault", (n) -> { this.setUseTemplateDefault(n.getBooleanValue()); });
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
     * Gets the settingValueTemplateId property value. Setting value template id
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSettingValueTemplateId() {
        return this.settingValueTemplateId;
    }
    /**
     * Gets the useTemplateDefault property value. Indicates whether to update policy setting value to match template setting default value
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getUseTemplateDefault() {
        return this.useTemplateDefault;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("settingValueTemplateId", this.getSettingValueTemplateId());
        writer.writeBooleanValue("useTemplateDefault", this.getUseTemplateDefault());
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
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the settingValueTemplateId property value. Setting value template id
     * @param value Value to set for the settingValueTemplateId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSettingValueTemplateId(@javax.annotation.Nullable final String value) {
        this.settingValueTemplateId = value;
    }
    /**
     * Sets the useTemplateDefault property value. Indicates whether to update policy setting value to match template setting default value
     * @param value Value to set for the useTemplateDefault property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUseTemplateDefault(@javax.annotation.Nullable final Boolean value) {
        this.useTemplateDefault = value;
    }
}
