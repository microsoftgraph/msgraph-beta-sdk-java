package com.microsoft.graph.beta.models.security.casemanagement;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CaseEscaped extends CaseManagementEntity implements Parsable {
    /**
     * Instantiates a new {@link CaseEscaped} and sets the default values.
     */
    public CaseEscaped() {
        super();
        this.setOdataType("#microsoft.graph.security.caseManagement.case");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CaseEscaped}
     */
    @jakarta.annotation.Nonnull
    public static CaseEscaped createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.security.caseManagement.exposureCase": return new ExposureCase();
                case "#microsoft.graph.security.caseManagement.genericCase": return new GenericCase();
                case "#microsoft.graph.security.caseManagement.incidentCase": return new IncidentCase();
            }
        }
        return new CaseEscaped();
    }
    /**
     * Gets the activities property value. The timeline of comments and audit events associated with the case. Supports $expand.
     * @return a {@link java.util.List<Activity>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Activity> getActivities() {
        return this.backingStore.get("activities");
    }
    /**
     * Gets the attachments property value. Evidence files and metadata associated with the case. Supports $expand.
     * @return a {@link java.util.List<Attachment>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Attachment> getAttachments() {
        return this.backingStore.get("attachments");
    }
    /**
     * Gets the customFields property value. Tenant-defined custom field values keyed by custom field identifier.
     * @return a {@link CustomFieldValues}
     */
    @jakarta.annotation.Nullable
    public CustomFieldValues getCustomFields() {
        return this.backingStore.get("customFields");
    }
    /**
     * Gets the displayName property value. The display name of the case. Supports $filter (eq, ne) and $orderby.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("activities", (n) -> { this.setActivities(n.getCollectionOfObjectValues(Activity::createFromDiscriminatorValue)); });
        deserializerMap.put("attachments", (n) -> { this.setAttachments(n.getCollectionOfObjectValues(Attachment::createFromDiscriminatorValue)); });
        deserializerMap.put("customFields", (n) -> { this.setCustomFields(n.getObjectValue(CustomFieldValues::createFromDiscriminatorValue)); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("relations", (n) -> { this.setRelations(n.getCollectionOfObjectValues(Relation::createFromDiscriminatorValue)); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getStringValue()); });
        deserializerMap.put("tasks", (n) -> { this.setTasks(n.getCollectionOfObjectValues(Task::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the relations property value. Links from the case to related security resources. Supports $expand.
     * @return a {@link java.util.List<Relation>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Relation> getRelations() {
        return this.backingStore.get("relations");
    }
    /**
     * Gets the status property value. The lifecycle status of the case, such as open, in progress, or closed. Supports $filter (eq, ne) and $orderby.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getStatus() {
        return this.backingStore.get("status");
    }
    /**
     * Gets the tasks property value. Tasks used to track work required to resolve the case. Supports $expand.
     * @return a {@link java.util.List<Task>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Task> getTasks() {
        return this.backingStore.get("tasks");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("activities", this.getActivities());
        writer.writeCollectionOfObjectValues("attachments", this.getAttachments());
        writer.writeObjectValue("customFields", this.getCustomFields());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeCollectionOfObjectValues("relations", this.getRelations());
        writer.writeStringValue("status", this.getStatus());
        writer.writeCollectionOfObjectValues("tasks", this.getTasks());
    }
    /**
     * Sets the activities property value. The timeline of comments and audit events associated with the case. Supports $expand.
     * @param value Value to set for the activities property.
     */
    public void setActivities(@jakarta.annotation.Nullable final java.util.List<Activity> value) {
        this.backingStore.set("activities", value);
    }
    /**
     * Sets the attachments property value. Evidence files and metadata associated with the case. Supports $expand.
     * @param value Value to set for the attachments property.
     */
    public void setAttachments(@jakarta.annotation.Nullable final java.util.List<Attachment> value) {
        this.backingStore.set("attachments", value);
    }
    /**
     * Sets the customFields property value. Tenant-defined custom field values keyed by custom field identifier.
     * @param value Value to set for the customFields property.
     */
    public void setCustomFields(@jakarta.annotation.Nullable final CustomFieldValues value) {
        this.backingStore.set("customFields", value);
    }
    /**
     * Sets the displayName property value. The display name of the case. Supports $filter (eq, ne) and $orderby.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the relations property value. Links from the case to related security resources. Supports $expand.
     * @param value Value to set for the relations property.
     */
    public void setRelations(@jakarta.annotation.Nullable final java.util.List<Relation> value) {
        this.backingStore.set("relations", value);
    }
    /**
     * Sets the status property value. The lifecycle status of the case, such as open, in progress, or closed. Supports $filter (eq, ne) and $orderby.
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("status", value);
    }
    /**
     * Sets the tasks property value. Tasks used to track work required to resolve the case. Supports $expand.
     * @param value Value to set for the tasks property.
     */
    public void setTasks(@jakarta.annotation.Nullable final java.util.List<Task> value) {
        this.backingStore.set("tasks", value);
    }
}
