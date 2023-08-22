package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CloudPcBulkRestore extends CloudPcBulkAction implements Parsable {
    /**
     * The restorePointDateTime property
     */
    private OffsetDateTime restorePointDateTime;
    /**
     * The timeRange property
     */
    private RestoreTimeRange timeRange;
    /**
     * Instantiates a new cloudPcBulkRestore and sets the default values.
     */
    public CloudPcBulkRestore() {
        super();
        this.setOdataType("#microsoft.graph.cloudPcBulkRestore");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a cloudPcBulkRestore
     */
    @jakarta.annotation.Nonnull
    public static CloudPcBulkRestore createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CloudPcBulkRestore();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("restorePointDateTime", (n) -> { this.setRestorePointDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("timeRange", (n) -> { this.setTimeRange(n.getEnumValue(RestoreTimeRange.class)); });
        return deserializerMap;
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
        super.serialize(writer);
        writer.writeOffsetDateTimeValue("restorePointDateTime", this.getRestorePointDateTime());
        writer.writeEnumValue("timeRange", this.getTimeRange());
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
