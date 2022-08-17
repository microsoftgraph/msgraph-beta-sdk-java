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
public class CloudPcConnectivityEvent implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Indicates the date and time when this event was created. The timestamp is shown in ISO 8601 format and Coordinated Universal Time (UTC). For example, midnight UTC on Jan 1, 2014 appears as 2014-01-01T00:00:00Z. */
    private OffsetDateTime _eventDateTime;
    /** Name of the event. */
    private String _eventName;
    /** The eventResult property */
    private CloudPcConnectivityEventResult _eventResult;
    /** The eventType property */
    private CloudPcConnectivityEventType _eventType;
    /** Additional message for this event. */
    private String _message;
    /** The OdataType property */
    private String _odataType;
    /**
     * Instantiates a new cloudPcConnectivityEvent and sets the default values.
     * @return a void
     */
    public CloudPcConnectivityEvent() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.cloudPcConnectivityEvent");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a cloudPcConnectivityEvent
     */
    @javax.annotation.Nonnull
    public static CloudPcConnectivityEvent createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CloudPcConnectivityEvent();
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
     * Gets the eventDateTime property value. Indicates the date and time when this event was created. The timestamp is shown in ISO 8601 format and Coordinated Universal Time (UTC). For example, midnight UTC on Jan 1, 2014 appears as 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getEventDateTime() {
        return this._eventDateTime;
    }
    /**
     * Gets the eventName property value. Name of the event.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getEventName() {
        return this._eventName;
    }
    /**
     * Gets the eventResult property value. The eventResult property
     * @return a cloudPcConnectivityEventResult
     */
    @javax.annotation.Nullable
    public CloudPcConnectivityEventResult getEventResult() {
        return this._eventResult;
    }
    /**
     * Gets the eventType property value. The eventType property
     * @return a cloudPcConnectivityEventType
     */
    @javax.annotation.Nullable
    public CloudPcConnectivityEventType getEventType() {
        return this._eventType;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final CloudPcConnectivityEvent currentObject = this;
        return new HashMap<>(6) {{
            this.put("eventDateTime", (n) -> { currentObject.setEventDateTime(n.getOffsetDateTimeValue()); });
            this.put("eventName", (n) -> { currentObject.setEventName(n.getStringValue()); });
            this.put("eventResult", (n) -> { currentObject.setEventResult(n.getEnumValue(CloudPcConnectivityEventResult.class)); });
            this.put("eventType", (n) -> { currentObject.setEventType(n.getEnumValue(CloudPcConnectivityEventType.class)); });
            this.put("message", (n) -> { currentObject.setMessage(n.getStringValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
        }};
    }
    /**
     * Gets the message property value. Additional message for this event.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMessage() {
        return this._message;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this._odataType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeOffsetDateTimeValue("eventDateTime", this.getEventDateTime());
        writer.writeStringValue("eventName", this.getEventName());
        writer.writeEnumValue("eventResult", this.getEventResult());
        writer.writeEnumValue("eventType", this.getEventType());
        writer.writeStringValue("message", this.getMessage());
        writer.writeStringValue("@odata.type", this.getOdataType());
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
     * Sets the eventDateTime property value. Indicates the date and time when this event was created. The timestamp is shown in ISO 8601 format and Coordinated Universal Time (UTC). For example, midnight UTC on Jan 1, 2014 appears as 2014-01-01T00:00:00Z.
     * @param value Value to set for the eventDateTime property.
     * @return a void
     */
    public void setEventDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._eventDateTime = value;
    }
    /**
     * Sets the eventName property value. Name of the event.
     * @param value Value to set for the eventName property.
     * @return a void
     */
    public void setEventName(@javax.annotation.Nullable final String value) {
        this._eventName = value;
    }
    /**
     * Sets the eventResult property value. The eventResult property
     * @param value Value to set for the eventResult property.
     * @return a void
     */
    public void setEventResult(@javax.annotation.Nullable final CloudPcConnectivityEventResult value) {
        this._eventResult = value;
    }
    /**
     * Sets the eventType property value. The eventType property
     * @param value Value to set for the eventType property.
     * @return a void
     */
    public void setEventType(@javax.annotation.Nullable final CloudPcConnectivityEventType value) {
        this._eventType = value;
    }
    /**
     * Sets the message property value. Additional message for this event.
     * @param value Value to set for the message property.
     * @return a void
     */
    public void setMessage(@javax.annotation.Nullable final String value) {
        this._message = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
}
