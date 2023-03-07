package com.microsoft.graph.users.item.activateserviceplan;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
public class ActivateServicePlanPostRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** The servicePlanId property */
    private UUID servicePlanId;
    /** The skuId property */
    private UUID skuId;
    /**
     * Instantiates a new activateServicePlanPostRequestBody and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ActivateServicePlanPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a activateServicePlanPostRequestBody
     */
    @javax.annotation.Nonnull
    public static ActivateServicePlanPostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ActivateServicePlanPostRequestBody();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("servicePlanId", (n) -> { this.setServicePlanId(n.getUUIDValue()); });
        deserializerMap.put("skuId", (n) -> { this.setSkuId(n.getUUIDValue()); });
        return deserializerMap;
    }
    /**
     * Gets the servicePlanId property value. The servicePlanId property
     * @return a UUID
     */
    @javax.annotation.Nullable
    public UUID getServicePlanId() {
        return this.servicePlanId;
    }
    /**
     * Gets the skuId property value. The skuId property
     * @return a UUID
     */
    @javax.annotation.Nullable
    public UUID getSkuId() {
        return this.skuId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeUUIDValue("servicePlanId", this.getServicePlanId());
        writer.writeUUIDValue("skuId", this.getSkuId());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the servicePlanId property value. The servicePlanId property
     * @param value Value to set for the servicePlanId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setServicePlanId(@javax.annotation.Nullable final UUID value) {
        this.servicePlanId = value;
    }
    /**
     * Sets the skuId property value. The skuId property
     * @param value Value to set for the skuId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSkuId(@javax.annotation.Nullable final UUID value) {
        this.skuId = value;
    }
}
