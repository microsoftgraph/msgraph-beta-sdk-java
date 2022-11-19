package com.microsoft.graph.devicemanagement.comanageddevices.bulksetcloudpcreviewstatus;

import com.microsoft.graph.models.CloudPcReviewStatus;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to call the bulkSetCloudPcReviewStatus method. */
public class BulkSetCloudPcReviewStatusPostRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The managedDeviceIds property */
    private java.util.List<String> _managedDeviceIds;
    /** The reviewStatus property */
    private CloudPcReviewStatus _reviewStatus;
    /**
     * Instantiates a new bulkSetCloudPcReviewStatusPostRequestBody and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public BulkSetCloudPcReviewStatusPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a bulkSetCloudPcReviewStatusPostRequestBody
     */
    @javax.annotation.Nonnull
    public static BulkSetCloudPcReviewStatusPostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BulkSetCloudPcReviewStatusPostRequestBody();
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
        final BulkSetCloudPcReviewStatusPostRequestBody currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(2);
        deserializerMap.put("managedDeviceIds", (n) -> { currentObject.setManagedDeviceIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("reviewStatus", (n) -> { currentObject.setReviewStatus(n.getObjectValue(CloudPcReviewStatus::createFromDiscriminatorValue)); });
        return deserializerMap
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
     * Gets the reviewStatus property value. The reviewStatus property
     * @return a cloudPcReviewStatus
     */
    @javax.annotation.Nullable
    public CloudPcReviewStatus getReviewStatus() {
        return this._reviewStatus;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfPrimitiveValues("managedDeviceIds", this.getManagedDeviceIds());
        writer.writeObjectValue("reviewStatus", this.getReviewStatus());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the managedDeviceIds property value. The managedDeviceIds property
     * @param value Value to set for the managedDeviceIds property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setManagedDeviceIds(@javax.annotation.Nullable final java.util.List<String> value) {
        this._managedDeviceIds = value;
    }
    /**
     * Sets the reviewStatus property value. The reviewStatus property
     * @param value Value to set for the reviewStatus property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setReviewStatus(@javax.annotation.Nullable final CloudPcReviewStatus value) {
        this._reviewStatus = value;
    }
}
