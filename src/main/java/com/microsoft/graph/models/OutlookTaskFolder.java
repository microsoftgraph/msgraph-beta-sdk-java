package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OutlookTaskFolder extends Entity implements Parsable {
    /**
     * Instantiates a new OutlookTaskFolder and sets the default values.
     */
    public OutlookTaskFolder() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a OutlookTaskFolder
     */
    @jakarta.annotation.Nonnull
    public static OutlookTaskFolder createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OutlookTaskFolder();
    }
    /**
     * Gets the changeKey property value. The version of the task folder.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getChangeKey() {
        return this.BackingStore.get("changeKey");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("changeKey", (n) -> { this.setChangeKey(n.getStringValue()); });
        deserializerMap.put("isDefaultFolder", (n) -> { this.setIsDefaultFolder(n.getBooleanValue()); });
        deserializerMap.put("multiValueExtendedProperties", (n) -> { this.setMultiValueExtendedProperties(n.getCollectionOfObjectValues(MultiValueLegacyExtendedProperty::createFromDiscriminatorValue)); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("parentGroupKey", (n) -> { this.setParentGroupKey(n.getUUIDValue()); });
        deserializerMap.put("singleValueExtendedProperties", (n) -> { this.setSingleValueExtendedProperties(n.getCollectionOfObjectValues(SingleValueLegacyExtendedProperty::createFromDiscriminatorValue)); });
        deserializerMap.put("tasks", (n) -> { this.setTasks(n.getCollectionOfObjectValues(OutlookTask::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the isDefaultFolder property value. True if the folder is the default task folder.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsDefaultFolder() {
        return this.BackingStore.get("isDefaultFolder");
    }
    /**
     * Gets the multiValueExtendedProperties property value. The collection of multi-value extended properties defined for the task folder. Read-only. Nullable.
     * @return a java.util.List<MultiValueLegacyExtendedProperty>
     */
    @jakarta.annotation.Nullable
    public java.util.List<MultiValueLegacyExtendedProperty> getMultiValueExtendedProperties() {
        return this.BackingStore.get("multiValueExtendedProperties");
    }
    /**
     * Gets the name property value. The name of the task folder.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.BackingStore.get("name");
    }
    /**
     * Gets the parentGroupKey property value. The unique GUID identifier for the task folder's parent group.
     * @return a UUID
     */
    @jakarta.annotation.Nullable
    public UUID getParentGroupKey() {
        return this.BackingStore.get("parentGroupKey");
    }
    /**
     * Gets the singleValueExtendedProperties property value. The collection of single-value extended properties defined for the task folder. Read-only. Nullable.
     * @return a java.util.List<SingleValueLegacyExtendedProperty>
     */
    @jakarta.annotation.Nullable
    public java.util.List<SingleValueLegacyExtendedProperty> getSingleValueExtendedProperties() {
        return this.BackingStore.get("singleValueExtendedProperties");
    }
    /**
     * Gets the tasks property value. The tasks in this task folder. Read-only. Nullable.
     * @return a java.util.List<OutlookTask>
     */
    @jakarta.annotation.Nullable
    public java.util.List<OutlookTask> getTasks() {
        return this.BackingStore.get("tasks");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("changeKey", this.getChangeKey());
        writer.writeBooleanValue("isDefaultFolder", this.getIsDefaultFolder());
        writer.writeCollectionOfObjectValues("multiValueExtendedProperties", this.getMultiValueExtendedProperties());
        writer.writeStringValue("name", this.getName());
        writer.writeUUIDValue("parentGroupKey", this.getParentGroupKey());
        writer.writeCollectionOfObjectValues("singleValueExtendedProperties", this.getSingleValueExtendedProperties());
        writer.writeCollectionOfObjectValues("tasks", this.getTasks());
    }
    /**
     * Sets the changeKey property value. The version of the task folder.
     * @param value Value to set for the changeKey property.
     */
    public void setChangeKey(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("changeKey", value);
    }
    /**
     * Sets the isDefaultFolder property value. True if the folder is the default task folder.
     * @param value Value to set for the isDefaultFolder property.
     */
    public void setIsDefaultFolder(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("isDefaultFolder", value);
    }
    /**
     * Sets the multiValueExtendedProperties property value. The collection of multi-value extended properties defined for the task folder. Read-only. Nullable.
     * @param value Value to set for the multiValueExtendedProperties property.
     */
    public void setMultiValueExtendedProperties(@jakarta.annotation.Nullable final java.util.List<MultiValueLegacyExtendedProperty> value) {
        this.BackingStore.set("multiValueExtendedProperties", value);
    }
    /**
     * Sets the name property value. The name of the task folder.
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("name", value);
    }
    /**
     * Sets the parentGroupKey property value. The unique GUID identifier for the task folder's parent group.
     * @param value Value to set for the parentGroupKey property.
     */
    public void setParentGroupKey(@jakarta.annotation.Nullable final UUID value) {
        this.BackingStore.set("parentGroupKey", value);
    }
    /**
     * Sets the singleValueExtendedProperties property value. The collection of single-value extended properties defined for the task folder. Read-only. Nullable.
     * @param value Value to set for the singleValueExtendedProperties property.
     */
    public void setSingleValueExtendedProperties(@jakarta.annotation.Nullable final java.util.List<SingleValueLegacyExtendedProperty> value) {
        this.BackingStore.set("singleValueExtendedProperties", value);
    }
    /**
     * Sets the tasks property value. The tasks in this task folder. Read-only. Nullable.
     * @param value Value to set for the tasks property.
     */
    public void setTasks(@jakarta.annotation.Nullable final java.util.List<OutlookTask> value) {
        this.BackingStore.set("tasks", value);
    }
}
