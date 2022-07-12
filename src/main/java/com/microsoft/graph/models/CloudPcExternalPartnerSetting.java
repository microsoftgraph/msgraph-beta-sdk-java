package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class CloudPcExternalPartnerSetting extends Entity implements Parsable {
    /** The enableConnection property */
    private Boolean _enableConnection;
    /** The lastSyncDateTime property */
    private OffsetDateTime _lastSyncDateTime;
    /** The partnerId property */
    private String _partnerId;
    /** The status property */
    private CloudPcExternalPartnerStatus _status;
    /** The statusDetails property */
    private String _statusDetails;
    /**
     * Instantiates a new CloudPcExternalPartnerSetting and sets the default values.
     * @return a void
     */
    public CloudPcExternalPartnerSetting() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a CloudPcExternalPartnerSetting
     */
    @javax.annotation.Nonnull
    public static CloudPcExternalPartnerSetting createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CloudPcExternalPartnerSetting();
    }
    /**
     * Gets the enableConnection property value. The enableConnection property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEnableConnection() {
        return this._enableConnection;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final CloudPcExternalPartnerSetting currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("enableConnection", (n) -> { currentObject.setEnableConnection(n.getBooleanValue()); });
            this.put("lastSyncDateTime", (n) -> { currentObject.setLastSyncDateTime(n.getOffsetDateTimeValue()); });
            this.put("partnerId", (n) -> { currentObject.setPartnerId(n.getStringValue()); });
            this.put("status", (n) -> { currentObject.setStatus(n.getEnumValue(CloudPcExternalPartnerStatus.class)); });
            this.put("statusDetails", (n) -> { currentObject.setStatusDetails(n.getStringValue()); });
        }};
    }
    /**
     * Gets the lastSyncDateTime property value. The lastSyncDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastSyncDateTime() {
        return this._lastSyncDateTime;
    }
    /**
     * Gets the partnerId property value. The partnerId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPartnerId() {
        return this._partnerId;
    }
    /**
     * Gets the status property value. The status property
     * @return a cloudPcExternalPartnerStatus
     */
    @javax.annotation.Nullable
    public CloudPcExternalPartnerStatus getStatus() {
        return this._status;
    }
    /**
     * Gets the statusDetails property value. The statusDetails property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getStatusDetails() {
        return this._statusDetails;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("enableConnection", this.getEnableConnection());
        writer.writeOffsetDateTimeValue("lastSyncDateTime", this.getLastSyncDateTime());
        writer.writeStringValue("partnerId", this.getPartnerId());
        writer.writeEnumValue("status", this.getStatus());
        writer.writeStringValue("statusDetails", this.getStatusDetails());
    }
    /**
     * Sets the enableConnection property value. The enableConnection property
     * @param value Value to set for the enableConnection property.
     * @return a void
     */
    public void setEnableConnection(@javax.annotation.Nullable final Boolean value) {
        this._enableConnection = value;
    }
    /**
     * Sets the lastSyncDateTime property value. The lastSyncDateTime property
     * @param value Value to set for the lastSyncDateTime property.
     * @return a void
     */
    public void setLastSyncDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastSyncDateTime = value;
    }
    /**
     * Sets the partnerId property value. The partnerId property
     * @param value Value to set for the partnerId property.
     * @return a void
     */
    public void setPartnerId(@javax.annotation.Nullable final String value) {
        this._partnerId = value;
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     * @return a void
     */
    public void setStatus(@javax.annotation.Nullable final CloudPcExternalPartnerStatus value) {
        this._status = value;
    }
    /**
     * Sets the statusDetails property value. The statusDetails property
     * @param value Value to set for the statusDetails property.
     * @return a void
     */
    public void setStatusDetails(@javax.annotation.Nullable final String value) {
        this._statusDetails = value;
    }
}
