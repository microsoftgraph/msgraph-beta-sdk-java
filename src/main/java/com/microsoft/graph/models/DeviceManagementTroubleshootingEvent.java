package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Event representing an general failure.
 */
public class DeviceManagementTroubleshootingEvent extends Entity implements Parsable {
    /** A set of string key and string value pairs which provides additional information on the Troubleshooting event */
    private java.util.List<KeyValuePair> additionalInformation;
    /** Id used for tracing the failure in the service. */
    private String correlationId;
    /** Time when the event occurred . */
    private OffsetDateTime eventDateTime;
    /** Event Name corresponding to the Troubleshooting Event. It is an Optional field */
    private String eventName;
    /** Object containing detailed information about the error and its remediation. */
    private DeviceManagementTroubleshootingErrorDetails troubleshootingErrorDetails;
    /**
     * Instantiates a new deviceManagementTroubleshootingEvent and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public DeviceManagementTroubleshootingEvent() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceManagementTroubleshootingEvent
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
        return this.additionalInformation;
    }
    /**
     * Gets the correlationId property value. Id used for tracing the failure in the service.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCorrelationId() {
        return this.correlationId;
    }
    /**
     * Gets the eventDateTime property value. Time when the event occurred .
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getEventDateTime() {
        return this.eventDateTime;
    }
    /**
     * Gets the eventName property value. Event Name corresponding to the Troubleshooting Event. It is an Optional field
     * @return a string
     */
    @javax.annotation.Nullable
    public String getEventName() {
        return this.eventName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("additionalInformation", (n) -> { this.setAdditionalInformation(n.getCollectionOfObjectValues(KeyValuePair::createFromDiscriminatorValue)); });
        deserializerMap.put("correlationId", (n) -> { this.setCorrelationId(n.getStringValue()); });
        deserializerMap.put("eventDateTime", (n) -> { this.setEventDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("eventName", (n) -> { this.setEventName(n.getStringValue()); });
        deserializerMap.put("troubleshootingErrorDetails", (n) -> { this.setTroubleshootingErrorDetails(n.getObjectValue(DeviceManagementTroubleshootingErrorDetails::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the troubleshootingErrorDetails property value. Object containing detailed information about the error and its remediation.
     * @return a deviceManagementTroubleshootingErrorDetails
     */
    @javax.annotation.Nullable
    public DeviceManagementTroubleshootingErrorDetails getTroubleshootingErrorDetails() {
        return this.troubleshootingErrorDetails;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
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
    @javax.annotation.Nonnull
    public void setAdditionalInformation(@javax.annotation.Nullable final java.util.List<KeyValuePair> value) {
        this.additionalInformation = value;
    }
    /**
     * Sets the correlationId property value. Id used for tracing the failure in the service.
     * @param value Value to set for the correlationId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCorrelationId(@javax.annotation.Nullable final String value) {
        this.correlationId = value;
    }
    /**
     * Sets the eventDateTime property value. Time when the event occurred .
     * @param value Value to set for the eventDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEventDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.eventDateTime = value;
    }
    /**
     * Sets the eventName property value. Event Name corresponding to the Troubleshooting Event. It is an Optional field
     * @param value Value to set for the eventName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEventName(@javax.annotation.Nullable final String value) {
        this.eventName = value;
    }
    /**
     * Sets the troubleshootingErrorDetails property value. Object containing detailed information about the error and its remediation.
     * @param value Value to set for the troubleshootingErrorDetails property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTroubleshootingErrorDetails(@javax.annotation.Nullable final DeviceManagementTroubleshootingErrorDetails value) {
        this.troubleshootingErrorDetails = value;
    }
}
