package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OpenAwsSecurityGroupFinding extends Finding implements Parsable {
    /**
     * Instantiates a new OpenAwsSecurityGroupFinding and sets the default values.
     */
    public OpenAwsSecurityGroupFinding() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a OpenAwsSecurityGroupFinding
     */
    @jakarta.annotation.Nonnull
    public static OpenAwsSecurityGroupFinding createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OpenAwsSecurityGroupFinding();
    }
    /**
     * Gets the assignedComputeInstancesDetails property value. The assignedComputeInstancesDetails property
     * @return a java.util.List<AssignedComputeInstanceDetails>
     */
    @jakarta.annotation.Nullable
    public java.util.List<AssignedComputeInstanceDetails> getAssignedComputeInstancesDetails() {
        return this.BackingStore.get("assignedComputeInstancesDetails");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("assignedComputeInstancesDetails", (n) -> { this.setAssignedComputeInstancesDetails(n.getCollectionOfObjectValues(AssignedComputeInstanceDetails::createFromDiscriminatorValue)); });
        deserializerMap.put("inboundPorts", (n) -> { this.setInboundPorts(n.getObjectValue(InboundPorts::createFromDiscriminatorValue)); });
        deserializerMap.put("securityGroup", (n) -> { this.setSecurityGroup(n.getObjectValue(AwsAuthorizationSystemResource::createFromDiscriminatorValue)); });
        deserializerMap.put("totalStorageBucketCount", (n) -> { this.setTotalStorageBucketCount(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the inboundPorts property value. The inboundPorts property
     * @return a InboundPorts
     */
    @jakarta.annotation.Nullable
    public InboundPorts getInboundPorts() {
        return this.BackingStore.get("inboundPorts");
    }
    /**
     * Gets the securityGroup property value. The securityGroup property
     * @return a AwsAuthorizationSystemResource
     */
    @jakarta.annotation.Nullable
    public AwsAuthorizationSystemResource getSecurityGroup() {
        return this.BackingStore.get("securityGroup");
    }
    /**
     * Gets the totalStorageBucketCount property value. The totalStorageBucketCount property
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getTotalStorageBucketCount() {
        return this.BackingStore.get("totalStorageBucketCount");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("assignedComputeInstancesDetails", this.getAssignedComputeInstancesDetails());
        writer.writeObjectValue("inboundPorts", this.getInboundPorts());
        writer.writeObjectValue("securityGroup", this.getSecurityGroup());
        writer.writeIntegerValue("totalStorageBucketCount", this.getTotalStorageBucketCount());
    }
    /**
     * Sets the assignedComputeInstancesDetails property value. The assignedComputeInstancesDetails property
     * @param value Value to set for the assignedComputeInstancesDetails property.
     */
    public void setAssignedComputeInstancesDetails(@jakarta.annotation.Nullable final java.util.List<AssignedComputeInstanceDetails> value) {
        this.BackingStore.set("assignedComputeInstancesDetails", value);
    }
    /**
     * Sets the inboundPorts property value. The inboundPorts property
     * @param value Value to set for the inboundPorts property.
     */
    public void setInboundPorts(@jakarta.annotation.Nullable final InboundPorts value) {
        this.BackingStore.set("inboundPorts", value);
    }
    /**
     * Sets the securityGroup property value. The securityGroup property
     * @param value Value to set for the securityGroup property.
     */
    public void setSecurityGroup(@jakarta.annotation.Nullable final AwsAuthorizationSystemResource value) {
        this.BackingStore.set("securityGroup", value);
    }
    /**
     * Sets the totalStorageBucketCount property value. The totalStorageBucketCount property
     * @param value Value to set for the totalStorageBucketCount property.
     */
    public void setTotalStorageBucketCount(@jakarta.annotation.Nullable final Integer value) {
        this.BackingStore.set("totalStorageBucketCount", value);
    }
}
