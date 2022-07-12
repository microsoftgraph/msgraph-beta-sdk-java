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
public class CloudPcConnectivityResult implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The failedHealthCheckItems property */
    private java.util.List<CloudPcHealthCheckItem> _failedHealthCheckItems;
    /** The status property */
    private CloudPcConnectivityStatus _status;
    /** The updatedDateTime property */
    private OffsetDateTime _updatedDateTime;
    /**
     * Instantiates a new cloudPcConnectivityResult and sets the default values.
     * @return a void
     */
    public CloudPcConnectivityResult() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a cloudPcConnectivityResult
     */
    @javax.annotation.Nonnull
    public static CloudPcConnectivityResult createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CloudPcConnectivityResult();
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
     * Gets the failedHealthCheckItems property value. The failedHealthCheckItems property
     * @return a cloudPcHealthCheckItem
     */
    @javax.annotation.Nullable
    public java.util.List<CloudPcHealthCheckItem> getFailedHealthCheckItems() {
        return this._failedHealthCheckItems;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final CloudPcConnectivityResult currentObject = this;
        return new HashMap<>(3) {{
            this.put("failedHealthCheckItems", (n) -> { currentObject.setFailedHealthCheckItems(n.getCollectionOfObjectValues(CloudPcHealthCheckItem::createFromDiscriminatorValue)); });
            this.put("status", (n) -> { currentObject.setStatus(n.getEnumValue(CloudPcConnectivityStatus.class)); });
            this.put("updatedDateTime", (n) -> { currentObject.setUpdatedDateTime(n.getOffsetDateTimeValue()); });
        }};
    }
    /**
     * Gets the status property value. The status property
     * @return a cloudPcConnectivityStatus
     */
    @javax.annotation.Nullable
    public CloudPcConnectivityStatus getStatus() {
        return this._status;
    }
    /**
     * Gets the updatedDateTime property value. The updatedDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getUpdatedDateTime() {
        return this._updatedDateTime;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("failedHealthCheckItems", this.getFailedHealthCheckItems());
        writer.writeEnumValue("status", this.getStatus());
        writer.writeOffsetDateTimeValue("updatedDateTime", this.getUpdatedDateTime());
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
     * Sets the failedHealthCheckItems property value. The failedHealthCheckItems property
     * @param value Value to set for the failedHealthCheckItems property.
     * @return a void
     */
    public void setFailedHealthCheckItems(@javax.annotation.Nullable final java.util.List<CloudPcHealthCheckItem> value) {
        this._failedHealthCheckItems = value;
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     * @return a void
     */
    public void setStatus(@javax.annotation.Nullable final CloudPcConnectivityStatus value) {
        this._status = value;
    }
    /**
     * Sets the updatedDateTime property value. The updatedDateTime property
     * @param value Value to set for the updatedDateTime property.
     * @return a void
     */
    public void setUpdatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._updatedDateTime = value;
    }
}
