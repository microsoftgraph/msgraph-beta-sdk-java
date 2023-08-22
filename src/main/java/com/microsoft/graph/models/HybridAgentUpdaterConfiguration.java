package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class HybridAgentUpdaterConfiguration implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Indicates if updater configuration will be skipped and the agent will receive an update when the next version of the agent is available.
     */
    private Boolean allowUpdateConfigurationOverride;
    /**
     * The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     */
    private OffsetDateTime deferUpdateDateTime;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The updateWindow property
     */
    private UpdateWindow updateWindow;
    /**
     * Instantiates a new hybridAgentUpdaterConfiguration and sets the default values.
     */
    public HybridAgentUpdaterConfiguration() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a hybridAgentUpdaterConfiguration
     */
    @jakarta.annotation.Nonnull
    public static HybridAgentUpdaterConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new HybridAgentUpdaterConfiguration();
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
     * Gets the allowUpdateConfigurationOverride property value. Indicates if updater configuration will be skipped and the agent will receive an update when the next version of the agent is available.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAllowUpdateConfigurationOverride() {
        return this.allowUpdateConfigurationOverride;
    }
    /**
     * Gets the deferUpdateDateTime property value. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getDeferUpdateDateTime() {
        return this.deferUpdateDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("allowUpdateConfigurationOverride", (n) -> { this.setAllowUpdateConfigurationOverride(n.getBooleanValue()); });
        deserializerMap.put("deferUpdateDateTime", (n) -> { this.setDeferUpdateDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("updateWindow", (n) -> { this.setUpdateWindow(n.getObjectValue(UpdateWindow::createFromDiscriminatorValue)); });
        return deserializerMap;
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
     * Gets the updateWindow property value. The updateWindow property
     * @return a updateWindow
     */
    @jakarta.annotation.Nullable
    public UpdateWindow getUpdateWindow() {
        return this.updateWindow;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("allowUpdateConfigurationOverride", this.getAllowUpdateConfigurationOverride());
        writer.writeOffsetDateTimeValue("deferUpdateDateTime", this.getDeferUpdateDateTime());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeObjectValue("updateWindow", this.getUpdateWindow());
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
     * Sets the allowUpdateConfigurationOverride property value. Indicates if updater configuration will be skipped and the agent will receive an update when the next version of the agent is available.
     * @param value Value to set for the allowUpdateConfigurationOverride property.
     */
    public void setAllowUpdateConfigurationOverride(@jakarta.annotation.Nullable final Boolean value) {
        this.allowUpdateConfigurationOverride = value;
    }
    /**
     * Sets the deferUpdateDateTime property value. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @param value Value to set for the deferUpdateDateTime property.
     */
    public void setDeferUpdateDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.deferUpdateDateTime = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the updateWindow property value. The updateWindow property
     * @param value Value to set for the updateWindow property.
     */
    public void setUpdateWindow(@jakarta.annotation.Nullable final UpdateWindow value) {
        this.updateWindow = value;
    }
}
