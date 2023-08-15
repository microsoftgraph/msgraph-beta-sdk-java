package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Entity representing setting comparison result
 */
public class DeviceManagementSettingComparison implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Setting comparison result type
     */
    private DeviceManagementComparisonResult comparisonResult;
    /**
     * JSON representation of current intent (or) template setting's value
     */
    private String currentValueJson;
    /**
     * The ID of the setting definition for this instance
     */
    private String definitionId;
    /**
     * The setting's display name
     */
    private String displayName;
    /**
     * The setting ID
     */
    private String id;
    /**
     * JSON representation of new template setting's value
     */
    private String newValueJson;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Instantiates a new deviceManagementSettingComparison and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public DeviceManagementSettingComparison() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceManagementSettingComparison
     */
    @jakarta.annotation.Nonnull
    public static DeviceManagementSettingComparison createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementSettingComparison();
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
     * Gets the comparisonResult property value. Setting comparison result type
     * @return a deviceManagementComparisonResult
     */
    @jakarta.annotation.Nullable
    public DeviceManagementComparisonResult getComparisonResult() {
        return this.comparisonResult;
    }
    /**
     * Gets the currentValueJson property value. JSON representation of current intent (or) template setting's value
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getCurrentValueJson() {
        return this.currentValueJson;
    }
    /**
     * Gets the definitionId property value. The ID of the setting definition for this instance
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDefinitionId() {
        return this.definitionId;
    }
    /**
     * Gets the displayName property value. The setting's display name
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("comparisonResult", (n) -> { this.setComparisonResult(n.getEnumValue(DeviceManagementComparisonResult.class)); });
        deserializerMap.put("currentValueJson", (n) -> { this.setCurrentValueJson(n.getStringValue()); });
        deserializerMap.put("definitionId", (n) -> { this.setDefinitionId(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("newValueJson", (n) -> { this.setNewValueJson(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the id property value. The setting ID
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getId() {
        return this.id;
    }
    /**
     * Gets the newValueJson property value. JSON representation of new template setting's value
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getNewValueJson() {
        return this.newValueJson;
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     * @param value Value to set for the additionalData property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the comparisonResult property value. Setting comparison result type
     * @param value Value to set for the comparisonResult property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setComparisonResult(@jakarta.annotation.Nullable final DeviceManagementComparisonResult value) {
        this.comparisonResult = value;
    }
    /**
     * Sets the currentValueJson property value. JSON representation of current intent (or) template setting's value
     * @param value Value to set for the currentValueJson property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setCurrentValueJson(@jakarta.annotation.Nullable final String value) {
        this.currentValueJson = value;
    }
    /**
     * Sets the definitionId property value. The ID of the setting definition for this instance
     * @param value Value to set for the definitionId property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDefinitionId(@jakarta.annotation.Nullable final String value) {
        this.definitionId = value;
    }
    /**
     * Sets the displayName property value. The setting's display name
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the id property value. The setting ID
     * @param value Value to set for the id property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the newValueJson property value. JSON representation of new template setting's value
     * @param value Value to set for the newValueJson property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setNewValueJson(@jakarta.annotation.Nullable final String value) {
        this.newValueJson = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
}
