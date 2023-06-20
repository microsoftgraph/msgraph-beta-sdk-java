package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Represent connector status
 */
public class ConnectorStatusDetails implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** Connector Instance Id */
    private String connectorInstanceId;
    /** Connectors name for connector status */
    private ConnectorName connectorName;
    /** Event datetime */
    private OffsetDateTime eventDateTime;
    /** The OdataType property */
    private String odataType;
    /** Connector health state for connector status */
    private ConnectorHealthState status;
    /**
     * Instantiates a new connectorStatusDetails and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ConnectorStatusDetails() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a connectorStatusDetails
     */
    @javax.annotation.Nonnull
    public static ConnectorStatusDetails createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ConnectorStatusDetails();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the connectorInstanceId property value. Connector Instance Id
     * @return a string
     */
    @javax.annotation.Nullable
    public String getConnectorInstanceId() {
        return this.connectorInstanceId;
    }
    /**
     * Gets the connectorName property value. Connectors name for connector status
     * @return a ConnectorName
     */
    @javax.annotation.Nullable
    public ConnectorName getConnectorName() {
        return this.connectorName;
    }
    /**
     * Gets the eventDateTime property value. Event datetime
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getEventDateTime() {
        return this.eventDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("connectorInstanceId", (n) -> { this.setConnectorInstanceId(n.getStringValue()); });
        deserializerMap.put("connectorName", (n) -> { this.setConnectorName(n.getEnumValue(ConnectorName.class)); });
        deserializerMap.put("eventDateTime", (n) -> { this.setEventDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(ConnectorHealthState.class)); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the status property value. Connector health state for connector status
     * @return a ConnectorHealthState
     */
    @javax.annotation.Nullable
    public ConnectorHealthState getStatus() {
        return this.status;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("connectorInstanceId", this.getConnectorInstanceId());
        writer.writeEnumValue("connectorName", this.getConnectorName());
        writer.writeOffsetDateTimeValue("eventDateTime", this.getEventDateTime());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeEnumValue("status", this.getStatus());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the connectorInstanceId property value. Connector Instance Id
     * @param value Value to set for the connectorInstanceId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setConnectorInstanceId(@javax.annotation.Nullable final String value) {
        this.connectorInstanceId = value;
    }
    /**
     * Sets the connectorName property value. Connectors name for connector status
     * @param value Value to set for the connectorName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setConnectorName(@javax.annotation.Nullable final ConnectorName value) {
        this.connectorName = value;
    }
    /**
     * Sets the eventDateTime property value. Event datetime
     * @param value Value to set for the eventDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEventDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.eventDateTime = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the status property value. Connector health state for connector status
     * @param value Value to set for the status property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStatus(@javax.annotation.Nullable final ConnectorHealthState value) {
        this.status = value;
    }
}
