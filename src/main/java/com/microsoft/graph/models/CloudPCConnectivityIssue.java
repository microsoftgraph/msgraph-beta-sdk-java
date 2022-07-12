package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class CloudPCConnectivityIssue extends Entity implements Parsable {
    /** The Intune DeviceId of the device the connection is associated with. */
    private String _deviceId;
    /** The error code of the connectivity issue. */
    private String _errorCode;
    /** The time that the connection initiated. The time is shown in ISO 8601 format and Coordinated Universal Time (UTC) time. */
    private OffsetDateTime _errorDateTime;
    /** The detailed description of what went wrong. */
    private String _errorDescription;
    /** The recommended action to fix the corresponding error. */
    private String _recommendedAction;
    /** The unique id of user who initialize the connection. */
    private String _userId;
    /**
     * Instantiates a new CloudPCConnectivityIssue and sets the default values.
     * @return a void
     */
    public CloudPCConnectivityIssue() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a CloudPCConnectivityIssue
     */
    @javax.annotation.Nonnull
    public static CloudPCConnectivityIssue createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CloudPCConnectivityIssue();
    }
    /**
     * Gets the deviceId property value. The Intune DeviceId of the device the connection is associated with.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceId() {
        return this._deviceId;
    }
    /**
     * Gets the errorCode property value. The error code of the connectivity issue.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getErrorCode() {
        return this._errorCode;
    }
    /**
     * Gets the errorDateTime property value. The time that the connection initiated. The time is shown in ISO 8601 format and Coordinated Universal Time (UTC) time.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getErrorDateTime() {
        return this._errorDateTime;
    }
    /**
     * Gets the errorDescription property value. The detailed description of what went wrong.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getErrorDescription() {
        return this._errorDescription;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final CloudPCConnectivityIssue currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("deviceId", (n) -> { currentObject.setDeviceId(n.getStringValue()); });
            this.put("errorCode", (n) -> { currentObject.setErrorCode(n.getStringValue()); });
            this.put("errorDateTime", (n) -> { currentObject.setErrorDateTime(n.getOffsetDateTimeValue()); });
            this.put("errorDescription", (n) -> { currentObject.setErrorDescription(n.getStringValue()); });
            this.put("recommendedAction", (n) -> { currentObject.setRecommendedAction(n.getStringValue()); });
            this.put("userId", (n) -> { currentObject.setUserId(n.getStringValue()); });
        }};
    }
    /**
     * Gets the recommendedAction property value. The recommended action to fix the corresponding error.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRecommendedAction() {
        return this._recommendedAction;
    }
    /**
     * Gets the userId property value. The unique id of user who initialize the connection.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserId() {
        return this._userId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("deviceId", this.getDeviceId());
        writer.writeStringValue("errorCode", this.getErrorCode());
        writer.writeOffsetDateTimeValue("errorDateTime", this.getErrorDateTime());
        writer.writeStringValue("errorDescription", this.getErrorDescription());
        writer.writeStringValue("recommendedAction", this.getRecommendedAction());
        writer.writeStringValue("userId", this.getUserId());
    }
    /**
     * Sets the deviceId property value. The Intune DeviceId of the device the connection is associated with.
     * @param value Value to set for the deviceId property.
     * @return a void
     */
    public void setDeviceId(@javax.annotation.Nullable final String value) {
        this._deviceId = value;
    }
    /**
     * Sets the errorCode property value. The error code of the connectivity issue.
     * @param value Value to set for the errorCode property.
     * @return a void
     */
    public void setErrorCode(@javax.annotation.Nullable final String value) {
        this._errorCode = value;
    }
    /**
     * Sets the errorDateTime property value. The time that the connection initiated. The time is shown in ISO 8601 format and Coordinated Universal Time (UTC) time.
     * @param value Value to set for the errorDateTime property.
     * @return a void
     */
    public void setErrorDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._errorDateTime = value;
    }
    /**
     * Sets the errorDescription property value. The detailed description of what went wrong.
     * @param value Value to set for the errorDescription property.
     * @return a void
     */
    public void setErrorDescription(@javax.annotation.Nullable final String value) {
        this._errorDescription = value;
    }
    /**
     * Sets the recommendedAction property value. The recommended action to fix the corresponding error.
     * @param value Value to set for the recommendedAction property.
     * @return a void
     */
    public void setRecommendedAction(@javax.annotation.Nullable final String value) {
        this._recommendedAction = value;
    }
    /**
     * Sets the userId property value. The unique id of user who initialize the connection.
     * @param value Value to set for the userId property.
     * @return a void
     */
    public void setUserId(@javax.annotation.Nullable final String value) {
        this._userId = value;
    }
}
