package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Entity used to retrieve information about Intune Certificate Connectors. */
public class CertificateConnectorDetails extends Entity implements Parsable {
    /** Connector name (set during enrollment). */
    private String _connectorName;
    /** Version of the connector installed. */
    private String _connectorVersion;
    /** Date/time when this connector was enrolled. */
    private OffsetDateTime _enrollmentDateTime;
    /** Date/time when this connector last connected to the service. */
    private OffsetDateTime _lastCheckinDateTime;
    /** Name of the machine hosting this connector service. */
    private String _machineName;
    /**
     * Instantiates a new certificateConnectorDetails and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public CertificateConnectorDetails() {
        super();
        this.setOdataType("#microsoft.graph.certificateConnectorDetails");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a certificateConnectorDetails
     */
    @javax.annotation.Nonnull
    public static CertificateConnectorDetails createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CertificateConnectorDetails();
    }
    /**
     * Gets the connectorName property value. Connector name (set during enrollment).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getConnectorName() {
        return this._connectorName;
    }
    /**
     * Gets the connectorVersion property value. Version of the connector installed.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getConnectorVersion() {
        return this._connectorVersion;
    }
    /**
     * Gets the enrollmentDateTime property value. Date/time when this connector was enrolled.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getEnrollmentDateTime() {
        return this._enrollmentDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final CertificateConnectorDetails currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("connectorName", (n) -> { currentObject.setConnectorName(n.getStringValue()); });
            this.put("connectorVersion", (n) -> { currentObject.setConnectorVersion(n.getStringValue()); });
            this.put("enrollmentDateTime", (n) -> { currentObject.setEnrollmentDateTime(n.getOffsetDateTimeValue()); });
            this.put("lastCheckinDateTime", (n) -> { currentObject.setLastCheckinDateTime(n.getOffsetDateTimeValue()); });
            this.put("machineName", (n) -> { currentObject.setMachineName(n.getStringValue()); });
        }};
    }
    /**
     * Gets the lastCheckinDateTime property value. Date/time when this connector last connected to the service.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastCheckinDateTime() {
        return this._lastCheckinDateTime;
    }
    /**
     * Gets the machineName property value. Name of the machine hosting this connector service.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMachineName() {
        return this._machineName;
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
        writer.writeStringValue("connectorName", this.getConnectorName());
        writer.writeStringValue("connectorVersion", this.getConnectorVersion());
        writer.writeOffsetDateTimeValue("enrollmentDateTime", this.getEnrollmentDateTime());
        writer.writeOffsetDateTimeValue("lastCheckinDateTime", this.getLastCheckinDateTime());
        writer.writeStringValue("machineName", this.getMachineName());
    }
    /**
     * Sets the connectorName property value. Connector name (set during enrollment).
     * @param value Value to set for the connectorName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setConnectorName(@javax.annotation.Nullable final String value) {
        this._connectorName = value;
    }
    /**
     * Sets the connectorVersion property value. Version of the connector installed.
     * @param value Value to set for the connectorVersion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setConnectorVersion(@javax.annotation.Nullable final String value) {
        this._connectorVersion = value;
    }
    /**
     * Sets the enrollmentDateTime property value. Date/time when this connector was enrolled.
     * @param value Value to set for the enrollmentDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEnrollmentDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._enrollmentDateTime = value;
    }
    /**
     * Sets the lastCheckinDateTime property value. Date/time when this connector last connected to the service.
     * @param value Value to set for the lastCheckinDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastCheckinDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastCheckinDateTime = value;
    }
    /**
     * Sets the machineName property value. Name of the machine hosting this connector service.
     * @param value Value to set for the machineName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMachineName(@javax.annotation.Nullable final String value) {
        this._machineName = value;
    }
}
