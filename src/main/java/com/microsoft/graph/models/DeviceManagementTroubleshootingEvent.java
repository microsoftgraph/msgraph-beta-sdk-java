package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DeviceManagementTroubleshootingEvent extends Entity implements Parsable {
    /** A set of string key and string value pairs which provides additional information on the Troubleshooting event */
    private java.util.List<KeyValuePair> _additionalInformation;
    /** Id used for tracing the failure in the service. */
    private String _correlationId;
    /** Time when the event occurred . */
    private OffsetDateTime _eventDateTime;
    /** Event Name corresponding to the Troubleshooting Event. It is an Optional field */
    private String _eventName;
    /** Object containing detailed information about the error and its remediation. */
    private DeviceManagementTroubleshootingErrorDetails _troubleshootingErrorDetails;
    /**
     * Instantiates a new DeviceManagementTroubleshootingEvent and sets the default values.
     * @return a void
     */
    public DeviceManagementTroubleshootingEvent() {
        super();
        this.setOdataType("#microsoft.graph.deviceManagementTroubleshootingEvent");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeviceManagementTroubleshootingEvent
     */
    @javax.annotation.Nonnull
    public static DeviceManagementTroubleshootingEvent createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.appleVppTokenTroubleshootingEvent": return new AppleVppTokenTroubleshootingEvent();
                case "#microsoft.graph.enrollmentTroubleshootingEvent": return new EnrollmentTroubleshootingEvent();
                case "#microsoft.graph.mobileAppTroubleshootingEvent": return new MobileAppTroubleshootingEvent();
            }
        }
        return new DeviceManagementTroubleshootingEvent();
    }
    /**
     * Gets the additionalInformation property value. A set of string key and string value pairs which provides additional information on the Troubleshooting event
     * @return a keyValuePair
     */
    @javax.annotation.Nullable
    public java.util.List<KeyValuePair> getAdditionalInformation() {
        return this._additionalInformation;
    }
    /**
     * Gets the correlationId property value. Id used for tracing the failure in the service.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCorrelationId() {
        return this._correlationId;
    }
    /**
     * Gets the eventDateTime property value. Time when the event occurred .
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getEventDateTime() {
        return this._eventDateTime;
    }
    /**
     * Gets the eventName property value. Event Name corresponding to the Troubleshooting Event. It is an Optional field
     * @return a string
     */
    @javax.annotation.Nullable
    public String getEventName() {
        return this._eventName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DeviceManagementTroubleshootingEvent currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("additionalInformation", (n) -> { currentObject.setAdditionalInformation(n.getCollectionOfObjectValues(KeyValuePair::createFromDiscriminatorValue)); });
            this.put("correlationId", (n) -> { currentObject.setCorrelationId(n.getStringValue()); });
            this.put("eventDateTime", (n) -> { currentObject.setEventDateTime(n.getOffsetDateTimeValue()); });
            this.put("eventName", (n) -> { currentObject.setEventName(n.getStringValue()); });
            this.put("troubleshootingErrorDetails", (n) -> { currentObject.setTroubleshootingErrorDetails(n.getObjectValue(DeviceManagementTroubleshootingErrorDetails::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the troubleshootingErrorDetails property value. Object containing detailed information about the error and its remediation.
     * @return a deviceManagementTroubleshootingErrorDetails
     */
    @javax.annotation.Nullable
    public DeviceManagementTroubleshootingErrorDetails getTroubleshootingErrorDetails() {
        return this._troubleshootingErrorDetails;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("additionalInformation", this.getAdditionalInformation());
        writer.writeStringValue("correlationId", this.getCorrelationId());
        writer.writeOffsetDateTimeValue("eventDateTime", this.getEventDateTime());
        writer.writeStringValue("eventName", this.getEventName());
        writer.writeObjectValue("troubleshootingErrorDetails", this.getTroubleshootingErrorDetails());
    }
    /**
     * Sets the additionalInformation property value. A set of string key and string value pairs which provides additional information on the Troubleshooting event
     * @param value Value to set for the additionalInformation property.
     * @return a void
     */
    public void setAdditionalInformation(@javax.annotation.Nullable final java.util.List<KeyValuePair> value) {
        this._additionalInformation = value;
    }
    /**
     * Sets the correlationId property value. Id used for tracing the failure in the service.
     * @param value Value to set for the correlationId property.
     * @return a void
     */
    public void setCorrelationId(@javax.annotation.Nullable final String value) {
        this._correlationId = value;
    }
    /**
     * Sets the eventDateTime property value. Time when the event occurred .
     * @param value Value to set for the eventDateTime property.
     * @return a void
     */
    public void setEventDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._eventDateTime = value;
    }
    /**
     * Sets the eventName property value. Event Name corresponding to the Troubleshooting Event. It is an Optional field
     * @param value Value to set for the eventName property.
     * @return a void
     */
    public void setEventName(@javax.annotation.Nullable final String value) {
        this._eventName = value;
    }
    /**
     * Sets the troubleshootingErrorDetails property value. Object containing detailed information about the error and its remediation.
     * @param value Value to set for the troubleshootingErrorDetails property.
     * @return a void
     */
    public void setTroubleshootingErrorDetails(@javax.annotation.Nullable final DeviceManagementTroubleshootingErrorDetails value) {
        this._troubleshootingErrorDetails = value;
    }
}
