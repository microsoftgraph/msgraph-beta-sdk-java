package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** The number of device health scripts deployed and the number of devices the scripts remediated. */
public class DeviceHealthScriptRemediationSummary implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The number of devices remediated by device health scripts. */
    private Integer _remediatedDeviceCount;
    /** The number of device health scripts deployed. */
    private Integer _scriptCount;
    /**
     * Instantiates a new deviceHealthScriptRemediationSummary and sets the default values.
     * @return a void
     */
    public DeviceHealthScriptRemediationSummary() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceHealthScriptRemediationSummary
     */
    @javax.annotation.Nonnull
    public static DeviceHealthScriptRemediationSummary createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceHealthScriptRemediationSummary();
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
        final DeviceHealthScriptRemediationSummary currentObject = this;
        return new HashMap<>(2) {{
            this.put("remediatedDeviceCount", (n) -> { currentObject.setRemediatedDeviceCount(n.getIntegerValue()); });
            this.put("scriptCount", (n) -> { currentObject.setScriptCount(n.getIntegerValue()); });
        }};
    }
    /**
     * Gets the remediatedDeviceCount property value. The number of devices remediated by device health scripts.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getRemediatedDeviceCount() {
        return this._remediatedDeviceCount;
    }
    /**
     * Gets the scriptCount property value. The number of device health scripts deployed.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getScriptCount() {
        return this._scriptCount;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("remediatedDeviceCount", this.getRemediatedDeviceCount());
        writer.writeIntegerValue("scriptCount", this.getScriptCount());
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
     * Sets the remediatedDeviceCount property value. The number of devices remediated by device health scripts.
     * @param value Value to set for the remediatedDeviceCount property.
     * @return a void
     */
    public void setRemediatedDeviceCount(@javax.annotation.Nullable final Integer value) {
        this._remediatedDeviceCount = value;
    }
    /**
     * Sets the scriptCount property value. The number of device health scripts deployed.
     * @param value Value to set for the scriptCount property.
     * @return a void
     */
    public void setScriptCount(@javax.annotation.Nullable final Integer value) {
        this._scriptCount = value;
    }
}
