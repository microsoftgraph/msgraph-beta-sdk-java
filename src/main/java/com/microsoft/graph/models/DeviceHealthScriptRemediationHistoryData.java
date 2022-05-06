package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.LocalDate;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** The number of devices remediated by a device health script on a given date.  */
public class DeviceHealthScriptRemediationHistoryData implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.  */
    private Map<String, Object> _additionalData;
    /** The date on which devices were remediated by the device health script.  */
    private LocalDate _date;
    /** The number of devices that were found to have no issue by the device health script.  */
    private Integer _noIssueDeviceCount;
    /** The number of devices remediated by the device health script.  */
    private Integer _remediatedDeviceCount;
    /**
     * Instantiates a new deviceHealthScriptRemediationHistoryData and sets the default values.
     * @return a void
     */
    public DeviceHealthScriptRemediationHistoryData() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceHealthScriptRemediationHistoryData
     */
    @javax.annotation.Nonnull
    public static DeviceHealthScriptRemediationHistoryData createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceHealthScriptRemediationHistoryData();
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
     * Gets the date property value. The date on which devices were remediated by the device health script.
     * @return a LocalDate
     */
    @javax.annotation.Nullable
    public LocalDate getDate() {
        return this._date;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DeviceHealthScriptRemediationHistoryData currentObject = this;
        return new HashMap<>(3) {{
            this.put("date", (n) -> { currentObject.setDate(n.getLocalDateValue()); });
            this.put("noIssueDeviceCount", (n) -> { currentObject.setNoIssueDeviceCount(n.getIntegerValue()); });
            this.put("remediatedDeviceCount", (n) -> { currentObject.setRemediatedDeviceCount(n.getIntegerValue()); });
        }};
    }
    /**
     * Gets the noIssueDeviceCount property value. The number of devices that were found to have no issue by the device health script.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getNoIssueDeviceCount() {
        return this._noIssueDeviceCount;
    }
    /**
     * Gets the remediatedDeviceCount property value. The number of devices remediated by the device health script.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getRemediatedDeviceCount() {
        return this._remediatedDeviceCount;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeLocalDateValue("date", this.getDate());
        writer.writeIntegerValue("noIssueDeviceCount", this.getNoIssueDeviceCount());
        writer.writeIntegerValue("remediatedDeviceCount", this.getRemediatedDeviceCount());
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
     * Sets the date property value. The date on which devices were remediated by the device health script.
     * @param value Value to set for the date property.
     * @return a void
     */
    public void setDate(@javax.annotation.Nullable final LocalDate value) {
        this._date = value;
    }
    /**
     * Sets the noIssueDeviceCount property value. The number of devices that were found to have no issue by the device health script.
     * @param value Value to set for the noIssueDeviceCount property.
     * @return a void
     */
    public void setNoIssueDeviceCount(@javax.annotation.Nullable final Integer value) {
        this._noIssueDeviceCount = value;
    }
    /**
     * Sets the remediatedDeviceCount property value. The number of devices remediated by the device health script.
     * @param value Value to set for the remediatedDeviceCount property.
     * @return a void
     */
    public void setRemediatedDeviceCount(@javax.annotation.Nullable final Integer value) {
        this._remediatedDeviceCount = value;
    }
}
