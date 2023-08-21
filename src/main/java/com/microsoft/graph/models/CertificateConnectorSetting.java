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
 * Certificate connector settings.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CertificateConnectorSetting implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Certificate expire time
     */
    private OffsetDateTime certExpiryTime;
    /**
     * Version of certificate connector
     */
    private String connectorVersion;
    /**
     * Certificate connector enrollment error
     */
    private String enrollmentError;
    /**
     * Last time certificate connector connected
     */
    private OffsetDateTime lastConnectorConnectionTime;
    /**
     * Version of last uploaded certificate connector
     */
    private Long lastUploadVersion;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Certificate connector status
     */
    private Integer status;
    /**
     * Instantiates a new certificateConnectorSetting and sets the default values.
     */
    public CertificateConnectorSetting() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a certificateConnectorSetting
     */
    @jakarta.annotation.Nonnull
    public static CertificateConnectorSetting createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CertificateConnectorSetting();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the certExpiryTime property value. Certificate expire time
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCertExpiryTime() {
        return this.certExpiryTime;
    }
    /**
     * Gets the connectorVersion property value. Version of certificate connector
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getConnectorVersion() {
        return this.connectorVersion;
    }
    /**
     * Gets the enrollmentError property value. Certificate connector enrollment error
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getEnrollmentError() {
        return this.enrollmentError;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("certExpiryTime", (n) -> { this.setCertExpiryTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("connectorVersion", (n) -> { this.setConnectorVersion(n.getStringValue()); });
        deserializerMap.put("enrollmentError", (n) -> { this.setEnrollmentError(n.getStringValue()); });
        deserializerMap.put("lastConnectorConnectionTime", (n) -> { this.setLastConnectorConnectionTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("lastUploadVersion", (n) -> { this.setLastUploadVersion(n.getLongValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the lastConnectorConnectionTime property value. Last time certificate connector connected
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastConnectorConnectionTime() {
        return this.lastConnectorConnectionTime;
    }
    /**
     * Gets the lastUploadVersion property value. Version of last uploaded certificate connector
     * @return a int64
     */
    @jakarta.annotation.Nullable
    public Long getLastUploadVersion() {
        return this.lastUploadVersion;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the status property value. Certificate connector status
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getStatus() {
        return this.status;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeOffsetDateTimeValue("certExpiryTime", this.getCertExpiryTime());
        writer.writeStringValue("connectorVersion", this.getConnectorVersion());
        writer.writeStringValue("enrollmentError", this.getEnrollmentError());
        writer.writeOffsetDateTimeValue("lastConnectorConnectionTime", this.getLastConnectorConnectionTime());
        writer.writeLongValue("lastUploadVersion", this.getLastUploadVersion());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeIntegerValue("status", this.getStatus());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the certExpiryTime property value. Certificate expire time
     * @param value Value to set for the certExpiryTime property.
     */
    public void setCertExpiryTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.certExpiryTime = value;
    }
    /**
     * Sets the connectorVersion property value. Version of certificate connector
     * @param value Value to set for the connectorVersion property.
     */
    public void setConnectorVersion(@jakarta.annotation.Nullable final String value) {
        this.connectorVersion = value;
    }
    /**
     * Sets the enrollmentError property value. Certificate connector enrollment error
     * @param value Value to set for the enrollmentError property.
     */
    public void setEnrollmentError(@jakarta.annotation.Nullable final String value) {
        this.enrollmentError = value;
    }
    /**
     * Sets the lastConnectorConnectionTime property value. Last time certificate connector connected
     * @param value Value to set for the lastConnectorConnectionTime property.
     */
    public void setLastConnectorConnectionTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.lastConnectorConnectionTime = value;
    }
    /**
     * Sets the lastUploadVersion property value. Version of last uploaded certificate connector
     * @param value Value to set for the lastUploadVersion property.
     */
    public void setLastUploadVersion(@jakarta.annotation.Nullable final Long value) {
        this.lastUploadVersion = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the status property value. Certificate connector status
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final Integer value) {
        this.status = value;
    }
}
