package com.microsoft.graph.devicemanagement.manageddevices.bulkrestorecloudpc;

import com.microsoft.graph.models.RestoreTimeRange;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class BulkRestoreCloudPcPostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The managedDeviceIds property
     */
    private java.util.List<String> managedDeviceIds;
    /**
     * The restorePointDateTime property
     */
    private OffsetDateTime restorePointDateTime;
    /**
     * The timeRange property
     */
    private RestoreTimeRange timeRange;
    /**
     * Instantiates a new bulkRestoreCloudPcPostRequestBody and sets the default values.
     */
    public BulkRestoreCloudPcPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a bulkRestoreCloudPcPostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static BulkRestoreCloudPcPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BulkRestoreCloudPcPostRequestBody();
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
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("managedDeviceIds", (n) -> { this.setManagedDeviceIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("restorePointDateTime", (n) -> { this.setRestorePointDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("timeRange", (n) -> { this.setTimeRange(n.getEnumValue(RestoreTimeRange.class)); });
        return deserializerMap;
    }
    /**
     * Gets the managedDeviceIds property value. The managedDeviceIds property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getManagedDeviceIds() {
        return this.managedDeviceIds;
    }
    /**
     * Gets the restorePointDateTime property value. The restorePointDateTime property
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getRestorePointDateTime() {
        return this.restorePointDateTime;
    }
    /**
     * Gets the timeRange property value. The timeRange property
     * @return a restoreTimeRange
     */
    @jakarta.annotation.Nullable
    public RestoreTimeRange getTimeRange() {
        return this.timeRange;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfPrimitiveValues("managedDeviceIds", this.getManagedDeviceIds());
        writer.writeOffsetDateTimeValue("restorePointDateTime", this.getRestorePointDateTime());
        writer.writeEnumValue("timeRange", this.getTimeRange());
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
     * Sets the managedDeviceIds property value. The managedDeviceIds property
     * @param value Value to set for the managedDeviceIds property.
     */
    public void setManagedDeviceIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.managedDeviceIds = value;
    }
    /**
     * Sets the restorePointDateTime property value. The restorePointDateTime property
     * @param value Value to set for the restorePointDateTime property.
     */
    public void setRestorePointDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.restorePointDateTime = value;
    }
    /**
     * Sets the timeRange property value. The timeRange property
     * @param value Value to set for the timeRange property.
     */
    public void setTimeRange(@jakarta.annotation.Nullable final RestoreTimeRange value) {
        this.timeRange = value;
    }
}
