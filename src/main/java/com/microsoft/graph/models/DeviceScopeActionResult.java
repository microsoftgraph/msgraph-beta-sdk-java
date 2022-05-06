package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** The result of the triggered device scope action.  */
public class DeviceScopeActionResult implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.  */
    private Map<String, Object> _additionalData;
    /** The triggered action name.  */
    private DeviceScopeAction _deviceScopeAction;
    /** The unique identifier of the device scope the action was triggered on.  */
    private String _deviceScopeId;
    /** The message indicates the reason the device scope action failed to trigger.  */
    private String _failedMessage;
    /** Indicates the status of the attempt device scope action. When succeeded, the action was succeessfully triggered, When failed, the action was failed to trigger.  */
    private DeviceScopeActionStatus _status;
    /**
     * Instantiates a new deviceScopeActionResult and sets the default values.
     * @return a void
     */
    public DeviceScopeActionResult() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceScopeActionResult
     */
    @javax.annotation.Nonnull
    public static DeviceScopeActionResult createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceScopeActionResult();
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
     * Gets the deviceScopeAction property value. The triggered action name.
     * @return a deviceScopeAction
     */
    @javax.annotation.Nullable
    public DeviceScopeAction getDeviceScopeAction() {
        return this._deviceScopeAction;
    }
    /**
     * Gets the deviceScopeId property value. The unique identifier of the device scope the action was triggered on.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceScopeId() {
        return this._deviceScopeId;
    }
    /**
     * Gets the failedMessage property value. The message indicates the reason the device scope action failed to trigger.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getFailedMessage() {
        return this._failedMessage;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DeviceScopeActionResult currentObject = this;
        return new HashMap<>(4) {{
            this.put("deviceScopeAction", (n) -> { currentObject.setDeviceScopeAction(n.getObjectValue(DeviceScopeAction::createFromDiscriminatorValue)); });
            this.put("deviceScopeId", (n) -> { currentObject.setDeviceScopeId(n.getStringValue()); });
            this.put("failedMessage", (n) -> { currentObject.setFailedMessage(n.getStringValue()); });
            this.put("status", (n) -> { currentObject.setStatus(n.getEnumValue(DeviceScopeActionStatus.class)); });
        }};
    }
    /**
     * Gets the status property value. Indicates the status of the attempt device scope action. When succeeded, the action was succeessfully triggered, When failed, the action was failed to trigger.
     * @return a deviceScopeActionStatus
     */
    @javax.annotation.Nullable
    public DeviceScopeActionStatus getStatus() {
        return this._status;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("deviceScopeAction", this.getDeviceScopeAction());
        writer.writeStringValue("deviceScopeId", this.getDeviceScopeId());
        writer.writeStringValue("failedMessage", this.getFailedMessage());
        writer.writeEnumValue("status", this.getStatus());
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
     * Sets the deviceScopeAction property value. The triggered action name.
     * @param value Value to set for the deviceScopeAction property.
     * @return a void
     */
    public void setDeviceScopeAction(@javax.annotation.Nullable final DeviceScopeAction value) {
        this._deviceScopeAction = value;
    }
    /**
     * Sets the deviceScopeId property value. The unique identifier of the device scope the action was triggered on.
     * @param value Value to set for the deviceScopeId property.
     * @return a void
     */
    public void setDeviceScopeId(@javax.annotation.Nullable final String value) {
        this._deviceScopeId = value;
    }
    /**
     * Sets the failedMessage property value. The message indicates the reason the device scope action failed to trigger.
     * @param value Value to set for the failedMessage property.
     * @return a void
     */
    public void setFailedMessage(@javax.annotation.Nullable final String value) {
        this._failedMessage = value;
    }
    /**
     * Sets the status property value. Indicates the status of the attempt device scope action. When succeeded, the action was succeessfully triggered, When failed, the action was failed to trigger.
     * @param value Value to set for the status property.
     * @return a void
     */
    public void setStatus(@javax.annotation.Nullable final DeviceScopeActionStatus value) {
        this._status = value;
    }
}
