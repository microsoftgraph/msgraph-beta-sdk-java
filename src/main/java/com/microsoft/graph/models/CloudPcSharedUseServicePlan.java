package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class CloudPcSharedUseServicePlan extends Entity implements Parsable {
    /**
     * The display name of the shared-use service plan.
     */
    private String displayName;
    /**
     * Total number of shared-use service plans purchased by the customer.
     */
    private Integer totalCount;
    /**
     * The number of service plans that the account uses.
     */
    private Integer usedCount;
    /**
     * Instantiates a new CloudPcSharedUseServicePlan and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public CloudPcSharedUseServicePlan() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a CloudPcSharedUseServicePlan
     */
    @javax.annotation.Nonnull
    public static CloudPcSharedUseServicePlan createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CloudPcSharedUseServicePlan();
    }
    /**
     * Gets the displayName property value. The display name of the shared-use service plan.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("totalCount", (n) -> { this.setTotalCount(n.getIntegerValue()); });
        deserializerMap.put("usedCount", (n) -> { this.setUsedCount(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the totalCount property value. Total number of shared-use service plans purchased by the customer.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getTotalCount() {
        return this.totalCount;
    }
    /**
     * Gets the usedCount property value. The number of service plans that the account uses.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getUsedCount() {
        return this.usedCount;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeIntegerValue("totalCount", this.getTotalCount());
        writer.writeIntegerValue("usedCount", this.getUsedCount());
    }
    /**
     * Sets the displayName property value. The display name of the shared-use service plan.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the totalCount property value. Total number of shared-use service plans purchased by the customer.
     * @param value Value to set for the totalCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTotalCount(@javax.annotation.Nullable final Integer value) {
        this.totalCount = value;
    }
    /**
     * Sets the usedCount property value. The number of service plans that the account uses.
     * @param value Value to set for the usedCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUsedCount(@javax.annotation.Nullable final Integer value) {
        this.usedCount = value;
    }
}
