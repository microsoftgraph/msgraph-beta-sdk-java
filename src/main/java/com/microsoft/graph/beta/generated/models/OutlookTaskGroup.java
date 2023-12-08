package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OutlookTaskGroup extends Entity implements Parsable {
    /**
     * Instantiates a new OutlookTaskGroup and sets the default values.
     */
    public OutlookTaskGroup() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a OutlookTaskGroup
     */
    @jakarta.annotation.Nonnull
    public static OutlookTaskGroup createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OutlookTaskGroup();
    }
    /**
     * Gets the changeKey property value. The version of the task group.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getChangeKey() {
        return this.backingStore.get("changeKey");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("changeKey", (n) -> { this.setChangeKey(n.getStringValue()); });
        deserializerMap.put("groupKey", (n) -> { this.setGroupKey(n.getUUIDValue()); });
        deserializerMap.put("isDefaultGroup", (n) -> { this.setIsDefaultGroup(n.getBooleanValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("taskFolders", (n) -> { this.setTaskFolders(n.getCollectionOfObjectValues(OutlookTaskFolder::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the groupKey property value. The unique GUID identifier for the task group.
     * @return a UUID
     */
    @jakarta.annotation.Nullable
    public UUID getGroupKey() {
        return this.backingStore.get("groupKey");
    }
    /**
     * Gets the isDefaultGroup property value. True if the task group is the default task group.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsDefaultGroup() {
        return this.backingStore.get("isDefaultGroup");
    }
    /**
     * Gets the name property value. The name of the task group.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.backingStore.get("name");
    }
    /**
     * Gets the taskFolders property value. The collection of task folders in the task group. Read-only. Nullable.
     * @return a java.util.List<OutlookTaskFolder>
     */
    @jakarta.annotation.Nullable
    public java.util.List<OutlookTaskFolder> getTaskFolders() {
        return this.backingStore.get("taskFolders");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("changeKey", this.getChangeKey());
        writer.writeUUIDValue("groupKey", this.getGroupKey());
        writer.writeBooleanValue("isDefaultGroup", this.getIsDefaultGroup());
        writer.writeStringValue("name", this.getName());
        writer.writeCollectionOfObjectValues("taskFolders", this.getTaskFolders());
    }
    /**
     * Sets the changeKey property value. The version of the task group.
     * @param value Value to set for the changeKey property.
     */
    public void setChangeKey(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("changeKey", value);
    }
    /**
     * Sets the groupKey property value. The unique GUID identifier for the task group.
     * @param value Value to set for the groupKey property.
     */
    public void setGroupKey(@jakarta.annotation.Nullable final UUID value) {
        this.backingStore.set("groupKey", value);
    }
    /**
     * Sets the isDefaultGroup property value. True if the task group is the default task group.
     * @param value Value to set for the isDefaultGroup property.
     */
    public void setIsDefaultGroup(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isDefaultGroup", value);
    }
    /**
     * Sets the name property value. The name of the task group.
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("name", value);
    }
    /**
     * Sets the taskFolders property value. The collection of task folders in the task group. Read-only. Nullable.
     * @param value Value to set for the taskFolders property.
     */
    public void setTaskFolders(@jakarta.annotation.Nullable final java.util.List<OutlookTaskFolder> value) {
        this.backingStore.set("taskFolders", value);
    }
}
