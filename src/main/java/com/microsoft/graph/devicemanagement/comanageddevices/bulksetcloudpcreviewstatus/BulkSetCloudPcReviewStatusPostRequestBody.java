package com.microsoft.graph.devicemanagement.comanageddevices.bulksetcloudpcreviewstatus;

import com.microsoft.graph.models.CloudPcReviewStatus;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class BulkSetCloudPcReviewStatusPostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The managedDeviceIds property
     */
    private java.util.List<String> managedDeviceIds;
    /**
     * The reviewStatus property
     */
    private CloudPcReviewStatus reviewStatus;
    /**
     * Instantiates a new bulkSetCloudPcReviewStatusPostRequestBody and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public BulkSetCloudPcReviewStatusPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a bulkSetCloudPcReviewStatusPostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static BulkSetCloudPcReviewStatusPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BulkSetCloudPcReviewStatusPostRequestBody();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("managedDeviceIds", (n) -> { this.setManagedDeviceIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("reviewStatus", (n) -> { this.setReviewStatus(n.getObjectValue(CloudPcReviewStatus::createFromDiscriminatorValue)); });
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
     * Gets the reviewStatus property value. The reviewStatus property
     * @return a cloudPcReviewStatus
     */
    @jakarta.annotation.Nullable
    public CloudPcReviewStatus getReviewStatus() {
        return this.reviewStatus;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfPrimitiveValues("managedDeviceIds", this.getManagedDeviceIds());
        writer.writeObjectValue("reviewStatus", this.getReviewStatus());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the managedDeviceIds property value. The managedDeviceIds property
     * @param value Value to set for the managedDeviceIds property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setManagedDeviceIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.managedDeviceIds = value;
    }
    /**
     * Sets the reviewStatus property value. The reviewStatus property
     * @param value Value to set for the reviewStatus property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setReviewStatus(@jakarta.annotation.Nullable final CloudPcReviewStatus value) {
        this.reviewStatus = value;
    }
}
