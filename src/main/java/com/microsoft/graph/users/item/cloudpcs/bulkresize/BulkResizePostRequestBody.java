package com.microsoft.graph.users.item.cloudpcs.bulkresize;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class BulkResizePostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The cloudPcIds property
     */
    private java.util.List<String> cloudPcIds;
    /**
     * The targetServicePlanId property
     */
    private String targetServicePlanId;
    /**
     * Instantiates a new bulkResizePostRequestBody and sets the default values.
     */
    public BulkResizePostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a bulkResizePostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static BulkResizePostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BulkResizePostRequestBody();
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
     * Gets the cloudPcIds property value. The cloudPcIds property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getCloudPcIds() {
        return this.cloudPcIds;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("cloudPcIds", (n) -> { this.setCloudPcIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("targetServicePlanId", (n) -> { this.setTargetServicePlanId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the targetServicePlanId property value. The targetServicePlanId property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getTargetServicePlanId() {
        return this.targetServicePlanId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfPrimitiveValues("cloudPcIds", this.getCloudPcIds());
        writer.writeStringValue("targetServicePlanId", this.getTargetServicePlanId());
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
     * Sets the cloudPcIds property value. The cloudPcIds property
     * @param value Value to set for the cloudPcIds property.
     */
    public void setCloudPcIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.cloudPcIds = value;
    }
    /**
     * Sets the targetServicePlanId property value. The targetServicePlanId property
     * @param value Value to set for the targetServicePlanId property.
     */
    public void setTargetServicePlanId(@jakarta.annotation.Nullable final String value) {
        this.targetServicePlanId = value;
    }
}
