package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class CloudPcAuditEvent extends Entity implements Parsable {
    /** Friendly name of the activity.Optional. */
    private String activity;
    /** The date time in UTC when the activity was performed.Read-only. */
    private OffsetDateTime activityDateTime;
    /** The activityOperationType property */
    private CloudPcAuditActivityOperationType activityOperationType;
    /** The activityResult property */
    private CloudPcAuditActivityResult activityResult;
    /** The type of activity that was performed.Read-only. */
    private String activityType;
    /** The actor property */
    private CloudPcAuditActor actor;
    /** The category property */
    private CloudPcAuditCategory category;
    /** Component name. Read-only. */
    private String componentName;
    /** The client request identifier, used to correlate activity within the system.Read-only. */
    private String correlationId;
    /** Event display name. Read-only. */
    private String displayName;
    /** List of cloudPcAuditResource objects.Read-only. */
    private java.util.List<CloudPcAuditResource> resources;
    /**
     * Instantiates a new CloudPcAuditEvent and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public CloudPcAuditEvent() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a CloudPcAuditEvent
     */
    @javax.annotation.Nonnull
    public static CloudPcAuditEvent createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CloudPcAuditEvent();
    }
    /**
     * Gets the activity property value. Friendly name of the activity.Optional.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getActivity() {
        return this.activity;
    }
    /**
     * Gets the activityDateTime property value. The date time in UTC when the activity was performed.Read-only.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getActivityDateTime() {
        return this.activityDateTime;
    }
    /**
     * Gets the activityOperationType property value. The activityOperationType property
     * @return a CloudPcAuditActivityOperationType
     */
    @javax.annotation.Nullable
    public CloudPcAuditActivityOperationType getActivityOperationType() {
        return this.activityOperationType;
    }
    /**
     * Gets the activityResult property value. The activityResult property
     * @return a CloudPcAuditActivityResult
     */
    @javax.annotation.Nullable
    public CloudPcAuditActivityResult getActivityResult() {
        return this.activityResult;
    }
    /**
     * Gets the activityType property value. The type of activity that was performed.Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getActivityType() {
        return this.activityType;
    }
    /**
     * Gets the actor property value. The actor property
     * @return a CloudPcAuditActor
     */
    @javax.annotation.Nullable
    public CloudPcAuditActor getActor() {
        return this.actor;
    }
    /**
     * Gets the category property value. The category property
     * @return a CloudPcAuditCategory
     */
    @javax.annotation.Nullable
    public CloudPcAuditCategory getCategory() {
        return this.category;
    }
    /**
     * Gets the componentName property value. Component name. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getComponentName() {
        return this.componentName;
    }
    /**
     * Gets the correlationId property value. The client request identifier, used to correlate activity within the system.Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCorrelationId() {
        return this.correlationId;
    }
    /**
     * Gets the displayName property value. Event display name. Read-only.
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
        deserializerMap.put("activity", (n) -> { this.setActivity(n.getStringValue()); });
        deserializerMap.put("activityDateTime", (n) -> { this.setActivityDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("activityOperationType", (n) -> { this.setActivityOperationType(n.getEnumValue(CloudPcAuditActivityOperationType.class)); });
        deserializerMap.put("activityResult", (n) -> { this.setActivityResult(n.getEnumValue(CloudPcAuditActivityResult.class)); });
        deserializerMap.put("activityType", (n) -> { this.setActivityType(n.getStringValue()); });
        deserializerMap.put("actor", (n) -> { this.setActor(n.getObjectValue(CloudPcAuditActor::createFromDiscriminatorValue)); });
        deserializerMap.put("category", (n) -> { this.setCategory(n.getEnumValue(CloudPcAuditCategory.class)); });
        deserializerMap.put("componentName", (n) -> { this.setComponentName(n.getStringValue()); });
        deserializerMap.put("correlationId", (n) -> { this.setCorrelationId(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("resources", (n) -> { this.setResources(n.getCollectionOfObjectValues(CloudPcAuditResource::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the resources property value. List of cloudPcAuditResource objects.Read-only.
     * @return a CloudPcAuditResource
     */
    @javax.annotation.Nullable
    public java.util.List<CloudPcAuditResource> getResources() {
        return this.resources;
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
        writer.writeStringValue("activity", this.getActivity());
        writer.writeOffsetDateTimeValue("activityDateTime", this.getActivityDateTime());
        writer.writeEnumValue("activityOperationType", this.getActivityOperationType());
        writer.writeEnumValue("activityResult", this.getActivityResult());
        writer.writeStringValue("activityType", this.getActivityType());
        writer.writeObjectValue("actor", this.getActor());
        writer.writeEnumValue("category", this.getCategory());
        writer.writeStringValue("componentName", this.getComponentName());
        writer.writeStringValue("correlationId", this.getCorrelationId());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeCollectionOfObjectValues("resources", this.getResources());
    }
    /**
     * Sets the activity property value. Friendly name of the activity.Optional.
     * @param value Value to set for the activity property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setActivity(@javax.annotation.Nullable final String value) {
        this.activity = value;
    }
    /**
     * Sets the activityDateTime property value. The date time in UTC when the activity was performed.Read-only.
     * @param value Value to set for the activityDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setActivityDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.activityDateTime = value;
    }
    /**
     * Sets the activityOperationType property value. The activityOperationType property
     * @param value Value to set for the activityOperationType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setActivityOperationType(@javax.annotation.Nullable final CloudPcAuditActivityOperationType value) {
        this.activityOperationType = value;
    }
    /**
     * Sets the activityResult property value. The activityResult property
     * @param value Value to set for the activityResult property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setActivityResult(@javax.annotation.Nullable final CloudPcAuditActivityResult value) {
        this.activityResult = value;
    }
    /**
     * Sets the activityType property value. The type of activity that was performed.Read-only.
     * @param value Value to set for the activityType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setActivityType(@javax.annotation.Nullable final String value) {
        this.activityType = value;
    }
    /**
     * Sets the actor property value. The actor property
     * @param value Value to set for the actor property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setActor(@javax.annotation.Nullable final CloudPcAuditActor value) {
        this.actor = value;
    }
    /**
     * Sets the category property value. The category property
     * @param value Value to set for the category property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCategory(@javax.annotation.Nullable final CloudPcAuditCategory value) {
        this.category = value;
    }
    /**
     * Sets the componentName property value. Component name. Read-only.
     * @param value Value to set for the componentName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setComponentName(@javax.annotation.Nullable final String value) {
        this.componentName = value;
    }
    /**
     * Sets the correlationId property value. The client request identifier, used to correlate activity within the system.Read-only.
     * @param value Value to set for the correlationId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCorrelationId(@javax.annotation.Nullable final String value) {
        this.correlationId = value;
    }
    /**
     * Sets the displayName property value. Event display name. Read-only.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the resources property value. List of cloudPcAuditResource objects.Read-only.
     * @param value Value to set for the resources property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setResources(@javax.annotation.Nullable final java.util.List<CloudPcAuditResource> value) {
        this.resources = value;
    }
}
