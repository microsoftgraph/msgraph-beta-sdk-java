package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Entity that represents device setting state summary for an intent */
public class DeviceManagementIntentDeviceSettingStateSummary extends Entity implements Parsable {
    /** Number of compliant devices */
    private Integer _compliantCount;
    /** Number of devices in conflict */
    private Integer _conflictCount;
    /** Number of error devices */
    private Integer _errorCount;
    /** Number of non compliant devices */
    private Integer _nonCompliantCount;
    /** Number of not applicable devices */
    private Integer _notApplicableCount;
    /** Number of remediated devices */
    private Integer _remediatedCount;
    /** Name of a setting */
    private String _settingName;
    /**
     * Instantiates a new deviceManagementIntentDeviceSettingStateSummary and sets the default values.
     * @return a void
     */
    public DeviceManagementIntentDeviceSettingStateSummary() {
        super();
        this.setOdataType("#microsoft.graph.deviceManagementIntentDeviceSettingStateSummary");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceManagementIntentDeviceSettingStateSummary
     */
    @javax.annotation.Nonnull
    public static DeviceManagementIntentDeviceSettingStateSummary createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementIntentDeviceSettingStateSummary();
    }
    /**
     * Gets the compliantCount property value. Number of compliant devices
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getCompliantCount() {
        return this._compliantCount;
    }
    /**
     * Gets the conflictCount property value. Number of devices in conflict
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getConflictCount() {
        return this._conflictCount;
    }
    /**
     * Gets the errorCount property value. Number of error devices
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getErrorCount() {
        return this._errorCount;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DeviceManagementIntentDeviceSettingStateSummary currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("compliantCount", (n) -> { currentObject.setCompliantCount(n.getIntegerValue()); });
            this.put("conflictCount", (n) -> { currentObject.setConflictCount(n.getIntegerValue()); });
            this.put("errorCount", (n) -> { currentObject.setErrorCount(n.getIntegerValue()); });
            this.put("nonCompliantCount", (n) -> { currentObject.setNonCompliantCount(n.getIntegerValue()); });
            this.put("notApplicableCount", (n) -> { currentObject.setNotApplicableCount(n.getIntegerValue()); });
            this.put("remediatedCount", (n) -> { currentObject.setRemediatedCount(n.getIntegerValue()); });
            this.put("settingName", (n) -> { currentObject.setSettingName(n.getStringValue()); });
        }};
    }
    /**
     * Gets the nonCompliantCount property value. Number of non compliant devices
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getNonCompliantCount() {
        return this._nonCompliantCount;
    }
    /**
     * Gets the notApplicableCount property value. Number of not applicable devices
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getNotApplicableCount() {
        return this._notApplicableCount;
    }
    /**
     * Gets the remediatedCount property value. Number of remediated devices
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getRemediatedCount() {
        return this._remediatedCount;
    }
    /**
     * Gets the settingName property value. Name of a setting
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSettingName() {
        return this._settingName;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeIntegerValue("compliantCount", this.getCompliantCount());
        writer.writeIntegerValue("conflictCount", this.getConflictCount());
        writer.writeIntegerValue("errorCount", this.getErrorCount());
        writer.writeIntegerValue("nonCompliantCount", this.getNonCompliantCount());
        writer.writeIntegerValue("notApplicableCount", this.getNotApplicableCount());
        writer.writeIntegerValue("remediatedCount", this.getRemediatedCount());
        writer.writeStringValue("settingName", this.getSettingName());
    }
    /**
     * Sets the compliantCount property value. Number of compliant devices
     * @param value Value to set for the compliantCount property.
     * @return a void
     */
    public void setCompliantCount(@javax.annotation.Nullable final Integer value) {
        this._compliantCount = value;
    }
    /**
     * Sets the conflictCount property value. Number of devices in conflict
     * @param value Value to set for the conflictCount property.
     * @return a void
     */
    public void setConflictCount(@javax.annotation.Nullable final Integer value) {
        this._conflictCount = value;
    }
    /**
     * Sets the errorCount property value. Number of error devices
     * @param value Value to set for the errorCount property.
     * @return a void
     */
    public void setErrorCount(@javax.annotation.Nullable final Integer value) {
        this._errorCount = value;
    }
    /**
     * Sets the nonCompliantCount property value. Number of non compliant devices
     * @param value Value to set for the nonCompliantCount property.
     * @return a void
     */
    public void setNonCompliantCount(@javax.annotation.Nullable final Integer value) {
        this._nonCompliantCount = value;
    }
    /**
     * Sets the notApplicableCount property value. Number of not applicable devices
     * @param value Value to set for the notApplicableCount property.
     * @return a void
     */
    public void setNotApplicableCount(@javax.annotation.Nullable final Integer value) {
        this._notApplicableCount = value;
    }
    /**
     * Sets the remediatedCount property value. Number of remediated devices
     * @param value Value to set for the remediatedCount property.
     * @return a void
     */
    public void setRemediatedCount(@javax.annotation.Nullable final Integer value) {
        this._remediatedCount = value;
    }
    /**
     * Sets the settingName property value. Name of a setting
     * @param value Value to set for the settingName property.
     * @return a void
     */
    public void setSettingName(@javax.annotation.Nullable final String value) {
        this._settingName = value;
    }
}
