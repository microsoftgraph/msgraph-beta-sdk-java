package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Entity used to retrieve information about Intune Certificate Connectors.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CertificateConnectorDetails extends Entity implements Parsable {
    /**
     * Instantiates a new CertificateConnectorDetails and sets the default values.
     */
    public CertificateConnectorDetails() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a CertificateConnectorDetails
     */
    @jakarta.annotation.Nonnull
    public static CertificateConnectorDetails createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CertificateConnectorDetails();
    }
    /**
     * Gets the connectorName property value. Connector name (set during enrollment).
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getConnectorName() {
        return this.backingStore.get("connectorName");
    }
    /**
     * Gets the connectorVersion property value. Version of the connector installed.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getConnectorVersion() {
        return this.backingStore.get("connectorVersion");
    }
    /**
     * Gets the enrollmentDateTime property value. Date/time when this connector was enrolled.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getEnrollmentDateTime() {
        return this.backingStore.get("enrollmentDateTime");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("connectorName", (n) -> { this.setConnectorName(n.getStringValue()); });
        deserializerMap.put("connectorVersion", (n) -> { this.setConnectorVersion(n.getStringValue()); });
        deserializerMap.put("enrollmentDateTime", (n) -> { this.setEnrollmentDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("lastCheckinDateTime", (n) -> { this.setLastCheckinDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("machineName", (n) -> { this.setMachineName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the lastCheckinDateTime property value. Date/time when this connector last connected to the service.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastCheckinDateTime() {
        return this.backingStore.get("lastCheckinDateTime");
    }
    /**
     * Gets the machineName property value. Name of the machine hosting this connector service.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getMachineName() {
        return this.backingStore.get("machineName");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("connectorName", this.getConnectorName());
        writer.writeStringValue("connectorVersion", this.getConnectorVersion());
        writer.writeOffsetDateTimeValue("enrollmentDateTime", this.getEnrollmentDateTime());
        writer.writeOffsetDateTimeValue("lastCheckinDateTime", this.getLastCheckinDateTime());
        writer.writeStringValue("machineName", this.getMachineName());
    }
    /**
     * Sets the connectorName property value. Connector name (set during enrollment).
     * @param value Value to set for the connectorName property.
     */
    public void setConnectorName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("connectorName", value);
    }
    /**
     * Sets the connectorVersion property value. Version of the connector installed.
     * @param value Value to set for the connectorVersion property.
     */
    public void setConnectorVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("connectorVersion", value);
    }
    /**
     * Sets the enrollmentDateTime property value. Date/time when this connector was enrolled.
     * @param value Value to set for the enrollmentDateTime property.
     */
    public void setEnrollmentDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("enrollmentDateTime", value);
    }
    /**
     * Sets the lastCheckinDateTime property value. Date/time when this connector last connected to the service.
     * @param value Value to set for the lastCheckinDateTime property.
     */
    public void setLastCheckinDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastCheckinDateTime", value);
    }
    /**
     * Sets the machineName property value. Name of the machine hosting this connector service.
     * @param value Value to set for the machineName property.
     */
    public void setMachineName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("machineName", value);
    }
}
