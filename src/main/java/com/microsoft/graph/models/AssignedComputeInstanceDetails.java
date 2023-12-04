package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AssignedComputeInstanceDetails extends Entity implements Parsable {
    /**
     * Instantiates a new AssignedComputeInstanceDetails and sets the default values.
     */
    public AssignedComputeInstanceDetails() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AssignedComputeInstanceDetails
     */
    @jakarta.annotation.Nonnull
    public static AssignedComputeInstanceDetails createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AssignedComputeInstanceDetails();
    }
    /**
     * Gets the accessedStorageBuckets property value. Represents a set of S3 buckets accessed by this EC2 instance.
     * @return a java.util.List<AuthorizationSystemResource>
     */
    @jakarta.annotation.Nullable
    public java.util.List<AuthorizationSystemResource> getAccessedStorageBuckets() {
        return this.backingStore.get("accessedStorageBuckets");
    }
    /**
     * Gets the assignedComputeInstance property value. assigned EC2 instance.
     * @return a AuthorizationSystemResource
     */
    @jakarta.annotation.Nullable
    public AuthorizationSystemResource getAssignedComputeInstance() {
        return this.backingStore.get("assignedComputeInstance");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("accessedStorageBuckets", (n) -> { this.setAccessedStorageBuckets(n.getCollectionOfObjectValues(AuthorizationSystemResource::createFromDiscriminatorValue)); });
        deserializerMap.put("assignedComputeInstance", (n) -> { this.setAssignedComputeInstance(n.getObjectValue(AuthorizationSystemResource::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("accessedStorageBuckets", this.getAccessedStorageBuckets());
        writer.writeObjectValue("assignedComputeInstance", this.getAssignedComputeInstance());
    }
    /**
     * Sets the accessedStorageBuckets property value. Represents a set of S3 buckets accessed by this EC2 instance.
     * @param value Value to set for the accessedStorageBuckets property.
     */
    public void setAccessedStorageBuckets(@jakarta.annotation.Nullable final java.util.List<AuthorizationSystemResource> value) {
        this.backingStore.set("accessedStorageBuckets", value);
    }
    /**
     * Sets the assignedComputeInstance property value. assigned EC2 instance.
     * @param value Value to set for the assignedComputeInstance property.
     */
    public void setAssignedComputeInstance(@jakarta.annotation.Nullable final AuthorizationSystemResource value) {
        this.backingStore.set("assignedComputeInstance", value);
    }
}
