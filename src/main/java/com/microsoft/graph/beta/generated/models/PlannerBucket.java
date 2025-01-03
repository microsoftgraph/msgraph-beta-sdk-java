package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PlannerBucket extends PlannerDelta implements Parsable {
    /**
     * Instantiates a new {@link PlannerBucket} and sets the default values.
     */
    public PlannerBucket() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PlannerBucket}
     */
    @jakarta.annotation.Nonnull
    public static PlannerBucket createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PlannerBucket();
    }
    /**
     * Gets the archivalInfo property value. Read-only. Nullable. Contains information about who archived or unarchived the bucket and why.
     * @return a {@link PlannerArchivalInfo}
     */
    @jakarta.annotation.Nullable
    public PlannerArchivalInfo getArchivalInfo() {
        return this.backingStore.get("archivalInfo");
    }
    /**
     * Gets the creationSource property value. Contains information about the origin of the bucket.
     * @return a {@link PlannerBucketCreation}
     */
    @jakarta.annotation.Nullable
    public PlannerBucketCreation getCreationSource() {
        return this.backingStore.get("creationSource");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("archivalInfo", (n) -> { this.setArchivalInfo(n.getObjectValue(PlannerArchivalInfo::createFromDiscriminatorValue)); });
        deserializerMap.put("creationSource", (n) -> { this.setCreationSource(n.getObjectValue(PlannerBucketCreation::createFromDiscriminatorValue)); });
        deserializerMap.put("isArchived", (n) -> { this.setIsArchived(n.getBooleanValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("orderHint", (n) -> { this.setOrderHint(n.getStringValue()); });
        deserializerMap.put("planId", (n) -> { this.setPlanId(n.getStringValue()); });
        deserializerMap.put("tasks", (n) -> { this.setTasks(n.getCollectionOfObjectValues(PlannerTask::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the isArchived property value. Read-only. If set totrue, the bucket is archived. An archived bucket is read-only.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsArchived() {
        return this.backingStore.get("isArchived");
    }
    /**
     * Gets the name property value. Name of the bucket.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.backingStore.get("name");
    }
    /**
     * Gets the orderHint property value. Hint used to order items of this type in a list view. For details about the supported format, see Using order hints in Planner.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOrderHint() {
        return this.backingStore.get("orderHint");
    }
    /**
     * Gets the planId property value. Plan ID to which the bucket belongs.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPlanId() {
        return this.backingStore.get("planId");
    }
    /**
     * Gets the tasks property value. Read-only. Nullable. The collection of tasks in the bucket.
     * @return a {@link java.util.List<PlannerTask>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<PlannerTask> getTasks() {
        return this.backingStore.get("tasks");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("archivalInfo", this.getArchivalInfo());
        writer.writeObjectValue("creationSource", this.getCreationSource());
        writer.writeBooleanValue("isArchived", this.getIsArchived());
        writer.writeStringValue("name", this.getName());
        writer.writeStringValue("orderHint", this.getOrderHint());
        writer.writeStringValue("planId", this.getPlanId());
        writer.writeCollectionOfObjectValues("tasks", this.getTasks());
    }
    /**
     * Sets the archivalInfo property value. Read-only. Nullable. Contains information about who archived or unarchived the bucket and why.
     * @param value Value to set for the archivalInfo property.
     */
    public void setArchivalInfo(@jakarta.annotation.Nullable final PlannerArchivalInfo value) {
        this.backingStore.set("archivalInfo", value);
    }
    /**
     * Sets the creationSource property value. Contains information about the origin of the bucket.
     * @param value Value to set for the creationSource property.
     */
    public void setCreationSource(@jakarta.annotation.Nullable final PlannerBucketCreation value) {
        this.backingStore.set("creationSource", value);
    }
    /**
     * Sets the isArchived property value. Read-only. If set totrue, the bucket is archived. An archived bucket is read-only.
     * @param value Value to set for the isArchived property.
     */
    public void setIsArchived(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isArchived", value);
    }
    /**
     * Sets the name property value. Name of the bucket.
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("name", value);
    }
    /**
     * Sets the orderHint property value. Hint used to order items of this type in a list view. For details about the supported format, see Using order hints in Planner.
     * @param value Value to set for the orderHint property.
     */
    public void setOrderHint(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("orderHint", value);
    }
    /**
     * Sets the planId property value. Plan ID to which the bucket belongs.
     * @param value Value to set for the planId property.
     */
    public void setPlanId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("planId", value);
    }
    /**
     * Sets the tasks property value. Read-only. Nullable. The collection of tasks in the bucket.
     * @param value Value to set for the tasks property.
     */
    public void setTasks(@jakarta.annotation.Nullable final java.util.List<PlannerTask> value) {
        this.backingStore.set("tasks", value);
    }
}
