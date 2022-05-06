package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class HybridAgentUpdaterConfiguration implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.  */
    private Map<String, Object> _additionalData;
    /** Indicates if updater configuration will be skipped and the agent will receive an update when the next version of the agent is available.  */
    private Boolean _allowUpdateConfigurationOverride;
    /** The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z  */
    private OffsetDateTime _deferUpdateDateTime;
    /** The updateWindow property  */
    private UpdateWindow _updateWindow;
    /**
     * Instantiates a new hybridAgentUpdaterConfiguration and sets the default values.
     * @return a void
     */
    public HybridAgentUpdaterConfiguration() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a hybridAgentUpdaterConfiguration
     */
    @javax.annotation.Nonnull
    public static HybridAgentUpdaterConfiguration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new HybridAgentUpdaterConfiguration();
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
     * Gets the allowUpdateConfigurationOverride property value. Indicates if updater configuration will be skipped and the agent will receive an update when the next version of the agent is available.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAllowUpdateConfigurationOverride() {
        return this._allowUpdateConfigurationOverride;
    }
    /**
     * Gets the deferUpdateDateTime property value. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getDeferUpdateDateTime() {
        return this._deferUpdateDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HybridAgentUpdaterConfiguration currentObject = this;
        return new HashMap<>(3) {{
            this.put("allowUpdateConfigurationOverride", (n) -> { currentObject.setAllowUpdateConfigurationOverride(n.getBooleanValue()); });
            this.put("deferUpdateDateTime", (n) -> { currentObject.setDeferUpdateDateTime(n.getOffsetDateTimeValue()); });
            this.put("updateWindow", (n) -> { currentObject.setUpdateWindow(n.getObjectValue(UpdateWindow::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the updateWindow property value. The updateWindow property
     * @return a updateWindow
     */
    @javax.annotation.Nullable
    public UpdateWindow getUpdateWindow() {
        return this._updateWindow;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("allowUpdateConfigurationOverride", this.getAllowUpdateConfigurationOverride());
        writer.writeOffsetDateTimeValue("deferUpdateDateTime", this.getDeferUpdateDateTime());
        writer.writeObjectValue("updateWindow", this.getUpdateWindow());
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
     * Sets the allowUpdateConfigurationOverride property value. Indicates if updater configuration will be skipped and the agent will receive an update when the next version of the agent is available.
     * @param value Value to set for the allowUpdateConfigurationOverride property.
     * @return a void
     */
    public void setAllowUpdateConfigurationOverride(@javax.annotation.Nullable final Boolean value) {
        this._allowUpdateConfigurationOverride = value;
    }
    /**
     * Sets the deferUpdateDateTime property value. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @param value Value to set for the deferUpdateDateTime property.
     * @return a void
     */
    public void setDeferUpdateDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._deferUpdateDateTime = value;
    }
    /**
     * Sets the updateWindow property value. The updateWindow property
     * @param value Value to set for the updateWindow property.
     * @return a void
     */
    public void setUpdateWindow(@javax.annotation.Nullable final UpdateWindow value) {
        this._updateWindow = value;
    }
}
