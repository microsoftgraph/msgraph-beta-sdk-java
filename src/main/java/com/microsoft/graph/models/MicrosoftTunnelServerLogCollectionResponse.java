package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class MicrosoftTunnelServerLogCollectionResponse extends Entity implements Parsable {
    /** The end time of the logs collected */
    private OffsetDateTime _endDateTime;
    /** The time when the log collection is expired */
    private OffsetDateTime _expiryDateTime;
    /** The time when the log collection was requested */
    private OffsetDateTime _requestDateTime;
    /** ID of the server the log collection is requested upon */
    private String _serverId;
    /** The size of the logs in bytes */
    private Long _sizeInBytes;
    /** The start time of the logs collected */
    private OffsetDateTime _startDateTime;
    /** Enum type that represent the status of log collection. */
    private MicrosoftTunnelLogCollectionStatus _status;
    /**
     * Instantiates a new MicrosoftTunnelServerLogCollectionResponse and sets the default values.
     * @return a void
     */
    public MicrosoftTunnelServerLogCollectionResponse() {
        super();
        this.setOdataType("#microsoft.graph.microsoftTunnelServerLogCollectionResponse");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a MicrosoftTunnelServerLogCollectionResponse
     */
    @javax.annotation.Nonnull
    public static MicrosoftTunnelServerLogCollectionResponse createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MicrosoftTunnelServerLogCollectionResponse();
    }
    /**
     * Gets the endDateTime property value. The end time of the logs collected
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getEndDateTime() {
        return this._endDateTime;
    }
    /**
     * Gets the expiryDateTime property value. The time when the log collection is expired
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getExpiryDateTime() {
        return this._expiryDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final MicrosoftTunnelServerLogCollectionResponse currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("endDateTime", (n) -> { currentObject.setEndDateTime(n.getOffsetDateTimeValue()); });
            this.put("expiryDateTime", (n) -> { currentObject.setExpiryDateTime(n.getOffsetDateTimeValue()); });
            this.put("requestDateTime", (n) -> { currentObject.setRequestDateTime(n.getOffsetDateTimeValue()); });
            this.put("serverId", (n) -> { currentObject.setServerId(n.getStringValue()); });
            this.put("sizeInBytes", (n) -> { currentObject.setSizeInBytes(n.getLongValue()); });
            this.put("startDateTime", (n) -> { currentObject.setStartDateTime(n.getOffsetDateTimeValue()); });
            this.put("status", (n) -> { currentObject.setStatus(n.getEnumValue(MicrosoftTunnelLogCollectionStatus.class)); });
        }};
    }
    /**
     * Gets the requestDateTime property value. The time when the log collection was requested
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getRequestDateTime() {
        return this._requestDateTime;
    }
    /**
     * Gets the serverId property value. ID of the server the log collection is requested upon
     * @return a string
     */
    @javax.annotation.Nullable
    public String getServerId() {
        return this._serverId;
    }
    /**
     * Gets the sizeInBytes property value. The size of the logs in bytes
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getSizeInBytes() {
        return this._sizeInBytes;
    }
    /**
     * Gets the startDateTime property value. The start time of the logs collected
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getStartDateTime() {
        return this._startDateTime;
    }
    /**
     * Gets the status property value. Enum type that represent the status of log collection.
     * @return a microsoftTunnelLogCollectionStatus
     */
    @javax.annotation.Nullable
    public MicrosoftTunnelLogCollectionStatus getStatus() {
        return this._status;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeOffsetDateTimeValue("endDateTime", this.getEndDateTime());
        writer.writeOffsetDateTimeValue("expiryDateTime", this.getExpiryDateTime());
        writer.writeOffsetDateTimeValue("requestDateTime", this.getRequestDateTime());
        writer.writeStringValue("serverId", this.getServerId());
        writer.writeLongValue("sizeInBytes", this.getSizeInBytes());
        writer.writeOffsetDateTimeValue("startDateTime", this.getStartDateTime());
        writer.writeEnumValue("status", this.getStatus());
    }
    /**
     * Sets the endDateTime property value. The end time of the logs collected
     * @param value Value to set for the endDateTime property.
     * @return a void
     */
    public void setEndDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._endDateTime = value;
    }
    /**
     * Sets the expiryDateTime property value. The time when the log collection is expired
     * @param value Value to set for the expiryDateTime property.
     * @return a void
     */
    public void setExpiryDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._expiryDateTime = value;
    }
    /**
     * Sets the requestDateTime property value. The time when the log collection was requested
     * @param value Value to set for the requestDateTime property.
     * @return a void
     */
    public void setRequestDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._requestDateTime = value;
    }
    /**
     * Sets the serverId property value. ID of the server the log collection is requested upon
     * @param value Value to set for the serverId property.
     * @return a void
     */
    public void setServerId(@javax.annotation.Nullable final String value) {
        this._serverId = value;
    }
    /**
     * Sets the sizeInBytes property value. The size of the logs in bytes
     * @param value Value to set for the sizeInBytes property.
     * @return a void
     */
    public void setSizeInBytes(@javax.annotation.Nullable final Long value) {
        this._sizeInBytes = value;
    }
    /**
     * Sets the startDateTime property value. The start time of the logs collected
     * @param value Value to set for the startDateTime property.
     * @return a void
     */
    public void setStartDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._startDateTime = value;
    }
    /**
     * Sets the status property value. Enum type that represent the status of log collection.
     * @param value Value to set for the status property.
     * @return a void
     */
    public void setStatus(@javax.annotation.Nullable final MicrosoftTunnelLogCollectionStatus value) {
        this._status = value;
    }
}
