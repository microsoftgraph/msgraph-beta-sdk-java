package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Default and customized value of a setting in a Security Baseline
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeviceManagementIntentCustomizedSetting implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * JSON representation of the customized value, if different from default
     */
    private String customizedJson;
    /**
     * JSON representation of the default value from the template
     */
    private String defaultJson;
    /**
     * The ID of the setting definition for this setting
     */
    private String definitionId;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Instantiates a new DeviceManagementIntentCustomizedSetting and sets the default values.
     */
    public DeviceManagementIntentCustomizedSetting() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeviceManagementIntentCustomizedSetting
     */
    @jakarta.annotation.Nonnull
    public static DeviceManagementIntentCustomizedSetting createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementIntentCustomizedSetting();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the customizedJson property value. JSON representation of the customized value, if different from default
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCustomizedJson() {
        return this.customizedJson;
    }
    /**
     * Gets the defaultJson property value. JSON representation of the default value from the template
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDefaultJson() {
        return this.defaultJson;
    }
    /**
     * Gets the definitionId property value. The ID of the setting definition for this setting
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDefinitionId() {
        return this.definitionId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("customizedJson", (n) -> { this.setCustomizedJson(n.getStringValue()); });
        deserializerMap.put("defaultJson", (n) -> { this.setDefaultJson(n.getStringValue()); });
        deserializerMap.put("definitionId", (n) -> { this.setDefinitionId(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("customizedJson", this.getCustomizedJson());
        writer.writeStringValue("defaultJson", this.getDefaultJson());
        writer.writeStringValue("definitionId", this.getDefinitionId());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the customizedJson property value. JSON representation of the customized value, if different from default
     * @param value Value to set for the customizedJson property.
     */
    public void setCustomizedJson(@jakarta.annotation.Nullable final String value) {
        this.customizedJson = value;
    }
    /**
     * Sets the defaultJson property value. JSON representation of the default value from the template
     * @param value Value to set for the defaultJson property.
     */
    public void setDefaultJson(@jakarta.annotation.Nullable final String value) {
        this.defaultJson = value;
    }
    /**
     * Sets the definitionId property value. The ID of the setting definition for this setting
     * @param value Value to set for the definitionId property.
     */
    public void setDefinitionId(@jakarta.annotation.Nullable final String value) {
        this.definitionId = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
}
