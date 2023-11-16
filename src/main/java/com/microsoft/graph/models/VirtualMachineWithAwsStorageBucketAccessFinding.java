package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class VirtualMachineWithAwsStorageBucketAccessFinding extends Finding implements Parsable {
    /**
     * Instantiates a new VirtualMachineWithAwsStorageBucketAccessFinding and sets the default values.
     */
    public VirtualMachineWithAwsStorageBucketAccessFinding() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a VirtualMachineWithAwsStorageBucketAccessFinding
     */
    @jakarta.annotation.Nonnull
    public static VirtualMachineWithAwsStorageBucketAccessFinding createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new VirtualMachineWithAwsStorageBucketAccessFinding();
    }
    /**
     * Gets the accessibleCount property value. The total number of storage buckets that the EC2 instance can access using the role
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getAccessibleCount() {
        return this.backingStore.get("accessibleCount");
    }
    /**
     * Gets the bucketCount property value. The total number of storage buckets in the authorization system that host the EC2 instance
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getBucketCount() {
        return this.backingStore.get("bucketCount");
    }
    /**
     * Gets the ec2Instance property value. The ec2Instance property
     * @return a AuthorizationSystemResource
     */
    @jakarta.annotation.Nullable
    public AuthorizationSystemResource getEc2Instance() {
        return this.backingStore.get("ec2Instance");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("accessibleCount", (n) -> { this.setAccessibleCount(n.getIntegerValue()); });
        deserializerMap.put("bucketCount", (n) -> { this.setBucketCount(n.getIntegerValue()); });
        deserializerMap.put("ec2Instance", (n) -> { this.setEc2Instance(n.getObjectValue(AuthorizationSystemResource::createFromDiscriminatorValue)); });
        deserializerMap.put("permissionsCreepIndex", (n) -> { this.setPermissionsCreepIndex(n.getObjectValue(PermissionsCreepIndex::createFromDiscriminatorValue)); });
        deserializerMap.put("role", (n) -> { this.setRole(n.getObjectValue(AwsRole::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the permissionsCreepIndex property value. The permissionsCreepIndex property
     * @return a PermissionsCreepIndex
     */
    @jakarta.annotation.Nullable
    public PermissionsCreepIndex getPermissionsCreepIndex() {
        return this.backingStore.get("permissionsCreepIndex");
    }
    /**
     * Gets the role property value. The role property
     * @return a AwsRole
     */
    @jakarta.annotation.Nullable
    public AwsRole getRole() {
        return this.backingStore.get("role");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeIntegerValue("accessibleCount", this.getAccessibleCount());
        writer.writeIntegerValue("bucketCount", this.getBucketCount());
        writer.writeObjectValue("ec2Instance", this.getEc2Instance());
        writer.writeObjectValue("permissionsCreepIndex", this.getPermissionsCreepIndex());
        writer.writeObjectValue("role", this.getRole());
    }
    /**
     * Sets the accessibleCount property value. The total number of storage buckets that the EC2 instance can access using the role
     * @param value Value to set for the accessibleCount property.
     */
    public void setAccessibleCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("accessibleCount", value);
    }
    /**
     * Sets the bucketCount property value. The total number of storage buckets in the authorization system that host the EC2 instance
     * @param value Value to set for the bucketCount property.
     */
    public void setBucketCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("bucketCount", value);
    }
    /**
     * Sets the ec2Instance property value. The ec2Instance property
     * @param value Value to set for the ec2Instance property.
     */
    public void setEc2Instance(@jakarta.annotation.Nullable final AuthorizationSystemResource value) {
        this.backingStore.set("ec2Instance", value);
    }
    /**
     * Sets the permissionsCreepIndex property value. The permissionsCreepIndex property
     * @param value Value to set for the permissionsCreepIndex property.
     */
    public void setPermissionsCreepIndex(@jakarta.annotation.Nullable final PermissionsCreepIndex value) {
        this.backingStore.set("permissionsCreepIndex", value);
    }
    /**
     * Sets the role property value. The role property
     * @param value Value to set for the role property.
     */
    public void setRole(@jakarta.annotation.Nullable final AwsRole value) {
        this.backingStore.set("role", value);
    }
}
