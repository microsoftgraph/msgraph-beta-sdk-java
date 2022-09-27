package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Certificate connector settings. */
public class CertificateConnectorSetting implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Certificate expire time */
    private OffsetDateTime _certExpiryTime;
    /** Version of certificate connector */
    private String _connectorVersion;
    /** Certificate connector enrollment error */
    private String _enrollmentError;
    /** Last time certificate connector connected */
    private OffsetDateTime _lastConnectorConnectionTime;
    /** Version of last uploaded certificate connector */
    private Long _lastUploadVersion;
    /** The OdataType property */
    private String _odataType;
    /** Certificate connector status */
    private Integer _status;
    /**
     * Instantiates a new certificateConnectorSetting and sets the default values.
     * @return a void
     */
    public CertificateConnectorSetting() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.certificateConnectorSetting");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a certificateConnectorSetting
     */
    @javax.annotation.Nonnull
    public static CertificateConnectorSetting createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CertificateConnectorSetting();
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
     * Gets the certExpiryTime property value. Certificate expire time
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCertExpiryTime() {
        return this._certExpiryTime;
    }
    /**
     * Gets the connectorVersion property value. Version of certificate connector
     * @return a string
     */
    @javax.annotation.Nullable
    public String getConnectorVersion() {
        return this._connectorVersion;
    }
    /**
     * Gets the enrollmentError property value. Certificate connector enrollment error
     * @return a string
     */
    @javax.annotation.Nullable
    public String getEnrollmentError() {
        return this._enrollmentError;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final CertificateConnectorSetting currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(7) {{
            this.put("certExpiryTime", (n) -> { currentObject.setCertExpiryTime(n.getOffsetDateTimeValue()); });
            this.put("connectorVersion", (n) -> { currentObject.setConnectorVersion(n.getStringValue()); });
            this.put("enrollmentError", (n) -> { currentObject.setEnrollmentError(n.getStringValue()); });
            this.put("lastConnectorConnectionTime", (n) -> { currentObject.setLastConnectorConnectionTime(n.getOffsetDateTimeValue()); });
            this.put("lastUploadVersion", (n) -> { currentObject.setLastUploadVersion(n.getLongValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("status", (n) -> { currentObject.setStatus(n.getIntegerValue()); });
        }};
    }
    /**
     * Gets the lastConnectorConnectionTime property value. Last time certificate connector connected
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastConnectorConnectionTime() {
        return this._lastConnectorConnectionTime;
    }
    /**
     * Gets the lastUploadVersion property value. Version of last uploaded certificate connector
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getLastUploadVersion() {
        return this._lastUploadVersion;
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
     * Gets the status property value. Certificate connector status
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getStatus() {
        return this._status;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the certExpiryTime property value. Certificate expire time
     * @param value Value to set for the certExpiryTime property.
     * @return a void
     */
    public void setCertExpiryTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._certExpiryTime = value;
    }
    /**
     * Sets the connectorVersion property value. Version of certificate connector
     * @param value Value to set for the connectorVersion property.
     * @return a void
     */
    public void setConnectorVersion(@javax.annotation.Nullable final String value) {
        this._connectorVersion = value;
    }
    /**
     * Sets the enrollmentError property value. Certificate connector enrollment error
     * @param value Value to set for the enrollmentError property.
     * @return a void
     */
    public void setEnrollmentError(@javax.annotation.Nullable final String value) {
        this._enrollmentError = value;
    }
    /**
     * Sets the lastConnectorConnectionTime property value. Last time certificate connector connected
     * @param value Value to set for the lastConnectorConnectionTime property.
     * @return a void
     */
    public void setLastConnectorConnectionTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastConnectorConnectionTime = value;
    }
    /**
     * Sets the lastUploadVersion property value. Version of last uploaded certificate connector
     * @param value Value to set for the lastUploadVersion property.
     * @return a void
     */
    public void setLastUploadVersion(@javax.annotation.Nullable final Long value) {
        this._lastUploadVersion = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the status property value. Certificate connector status
     * @param value Value to set for the status property.
     * @return a void
     */
    public void setStatus(@javax.annotation.Nullable final Integer value) {
        this._status = value;
    }
}
