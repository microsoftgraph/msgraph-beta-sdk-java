package microsoft.graph.devicemanagement.comanageddevices.bulkrestorecloudpc;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import microsoft.graph.models.RestoreTimeRange;
/** Provides operations to call the bulkRestoreCloudPc method. */
public class BulkRestoreCloudPcRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The managedDeviceIds property */
    private java.util.List<String> _managedDeviceIds;
    /** The restorePointDateTime property */
    private OffsetDateTime _restorePointDateTime;
    /** The timeRange property */
    private RestoreTimeRange _timeRange;
    /**
     * Instantiates a new bulkRestoreCloudPcRequestBody and sets the default values.
     * @return a void
     */
    public BulkRestoreCloudPcRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a bulkRestoreCloudPcRequestBody
     */
    @javax.annotation.Nonnull
    public static BulkRestoreCloudPcRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BulkRestoreCloudPcRequestBody();
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
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final BulkRestoreCloudPcRequestBody currentObject = this;
        return new HashMap<>(3) {{
            this.put("managedDeviceIds", (n) -> { currentObject.setManagedDeviceIds(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("restorePointDateTime", (n) -> { currentObject.setRestorePointDateTime(n.getOffsetDateTimeValue()); });
            this.put("timeRange", (n) -> { currentObject.setTimeRange(n.getEnumValue(RestoreTimeRange.class)); });
        }};
    }
    /**
     * Gets the managedDeviceIds property value. The managedDeviceIds property
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getManagedDeviceIds() {
        return this._managedDeviceIds;
    }
    /**
     * Gets the restorePointDateTime property value. The restorePointDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getRestorePointDateTime() {
        return this._restorePointDateTime;
    }
    /**
     * Gets the timeRange property value. The timeRange property
     * @return a restoreTimeRange
     */
    @javax.annotation.Nullable
    public RestoreTimeRange getTimeRange() {
        return this._timeRange;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfPrimitiveValues("managedDeviceIds", this.getManagedDeviceIds());
        writer.writeOffsetDateTimeValue("restorePointDateTime", this.getRestorePointDateTime());
        writer.writeEnumValue("timeRange", this.getTimeRange());
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
     * Sets the managedDeviceIds property value. The managedDeviceIds property
     * @param value Value to set for the managedDeviceIds property.
     * @return a void
     */
    public void setManagedDeviceIds(@javax.annotation.Nullable final java.util.List<String> value) {
        this._managedDeviceIds = value;
    }
    /**
     * Sets the restorePointDateTime property value. The restorePointDateTime property
     * @param value Value to set for the restorePointDateTime property.
     * @return a void
     */
    public void setRestorePointDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._restorePointDateTime = value;
    }
    /**
     * Sets the timeRange property value. The timeRange property
     * @param value Value to set for the timeRange property.
     * @return a void
     */
    public void setTimeRange(@javax.annotation.Nullable final RestoreTimeRange value) {
        this._timeRange = value;
    }
}
