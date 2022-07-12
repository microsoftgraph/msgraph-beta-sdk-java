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
/** The number of devices remediated by a device health script on a given date with the last modified time. */
public class DeviceHealthScriptRemediationHistory implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The number of devices remediated by the device health script on the given date. */
    private java.util.List<DeviceHealthScriptRemediationHistoryData> _historyData;
    /** The date on which the results history is calculated for the healthscript. */
    private OffsetDateTime _lastModifiedDateTime;
    /**
     * Instantiates a new deviceHealthScriptRemediationHistory and sets the default values.
     * @return a void
     */
    public DeviceHealthScriptRemediationHistory() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceHealthScriptRemediationHistory
     */
    @javax.annotation.Nonnull
    public static DeviceHealthScriptRemediationHistory createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceHealthScriptRemediationHistory();
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
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DeviceHealthScriptRemediationHistory currentObject = this;
        return new HashMap<>(2) {{
            this.put("historyData", (n) -> { currentObject.setHistoryData(n.getCollectionOfObjectValues(DeviceHealthScriptRemediationHistoryData::createFromDiscriminatorValue)); });
            this.put("lastModifiedDateTime", (n) -> { currentObject.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        }};
    }
    /**
     * Gets the historyData property value. The number of devices remediated by the device health script on the given date.
     * @return a deviceHealthScriptRemediationHistoryData
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceHealthScriptRemediationHistoryData> getHistoryData() {
        return this._historyData;
    }
    /**
     * Gets the lastModifiedDateTime property value. The date on which the results history is calculated for the healthscript.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this._lastModifiedDateTime;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("historyData", this.getHistoryData());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
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
     * Sets the historyData property value. The number of devices remediated by the device health script on the given date.
     * @param value Value to set for the historyData property.
     * @return a void
     */
    public void setHistoryData(@javax.annotation.Nullable final java.util.List<DeviceHealthScriptRemediationHistoryData> value) {
        this._historyData = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. The date on which the results history is calculated for the healthscript.
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastModifiedDateTime = value;
    }
}
