package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class CloudPcAuditEvent extends Entity implements Parsable {
    /** Friendly name of the activity. Optional.  */
    private String _activity;
    /** The date time in UTC when the activity was performed. Read-only.  */
    private OffsetDateTime _activityDateTime;
    /** The HTTP operation type of the activity. Possible values include create, delete, patch and other. Read-only.  */
    private CloudPcAuditActivityOperationType _activityOperationType;
    /** The result of the activity. Read-only.  */
    private CloudPcAuditActivityResult _activityResult;
    /** The type of activity that was performed. Read-only.  */
    private String _activityType;
    /** The actor property  */
    private CloudPcAuditActor _actor;
    /** Audit category. Read-only.  */
    private CloudPcAuditCategory _category;
    /** Component name. Read-only.  */
    private String _componentName;
    /** The client request identifier, used to correlate activity within the system. Read-only.  */
    private String _correlationId;
    /** Event display name. Read-only.  */
    private String _displayName;
    /** List of cloudPcAuditResource objects. Read-only.  */
    private java.util.List<CloudPcAuditResource> _resources;
    /**
     * Instantiates a new cloudPcAuditEvent and sets the default values.
     * @return a void
     */
    public CloudPcAuditEvent() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a cloudPcAuditEvent
     */
    @javax.annotation.Nonnull
    public static CloudPcAuditEvent createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CloudPcAuditEvent();
    }
    /**
     * Gets the activity property value. Friendly name of the activity. Optional.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getActivity() {
        return this._activity;
    }
    /**
     * Gets the activityDateTime property value. The date time in UTC when the activity was performed. Read-only.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getActivityDateTime() {
        return this._activityDateTime;
    }
    /**
     * Gets the activityOperationType property value. The HTTP operation type of the activity. Possible values include create, delete, patch and other. Read-only.
     * @return a cloudPcAuditActivityOperationType
     */
    @javax.annotation.Nullable
    public CloudPcAuditActivityOperationType getActivityOperationType() {
        return this._activityOperationType;
    }
    /**
     * Gets the activityResult property value. The result of the activity. Read-only.
     * @return a cloudPcAuditActivityResult
     */
    @javax.annotation.Nullable
    public CloudPcAuditActivityResult getActivityResult() {
        return this._activityResult;
    }
    /**
     * Gets the activityType property value. The type of activity that was performed. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getActivityType() {
        return this._activityType;
    }
    /**
     * Gets the actor property value. The actor property
     * @return a cloudPcAuditActor
     */
    @javax.annotation.Nullable
    public CloudPcAuditActor getActor() {
        return this._actor;
    }
    /**
     * Gets the category property value. Audit category. Read-only.
     * @return a cloudPcAuditCategory
     */
    @javax.annotation.Nullable
    public CloudPcAuditCategory getCategory() {
        return this._category;
    }
    /**
     * Gets the componentName property value. Component name. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getComponentName() {
        return this._componentName;
    }
    /**
     * Gets the correlationId property value. The client request identifier, used to correlate activity within the system. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCorrelationId() {
        return this._correlationId;
    }
    /**
     * Gets the displayName property value. Event display name. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final CloudPcAuditEvent currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("activity", (n) -> { currentObject.setActivity(n.getStringValue()); });
            this.put("activityDateTime", (n) -> { currentObject.setActivityDateTime(n.getOffsetDateTimeValue()); });
            this.put("activityOperationType", (n) -> { currentObject.setActivityOperationType(n.getEnumValue(CloudPcAuditActivityOperationType.class)); });
            this.put("activityResult", (n) -> { currentObject.setActivityResult(n.getEnumValue(CloudPcAuditActivityResult.class)); });
            this.put("activityType", (n) -> { currentObject.setActivityType(n.getStringValue()); });
            this.put("actor", (n) -> { currentObject.setActor(n.getObjectValue(CloudPcAuditActor::createFromDiscriminatorValue)); });
            this.put("category", (n) -> { currentObject.setCategory(n.getEnumValue(CloudPcAuditCategory.class)); });
            this.put("componentName", (n) -> { currentObject.setComponentName(n.getStringValue()); });
            this.put("correlationId", (n) -> { currentObject.setCorrelationId(n.getStringValue()); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("resources", (n) -> { currentObject.setResources(n.getCollectionOfObjectValues(CloudPcAuditResource::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the resources property value. List of cloudPcAuditResource objects. Read-only.
     * @return a cloudPcAuditResource
     */
    @javax.annotation.Nullable
    public java.util.List<CloudPcAuditResource> getResources() {
        return this._resources;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
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
     * Sets the activity property value. Friendly name of the activity. Optional.
     * @param value Value to set for the activity property.
     * @return a void
     */
    public void setActivity(@javax.annotation.Nullable final String value) {
        this._activity = value;
    }
    /**
     * Sets the activityDateTime property value. The date time in UTC when the activity was performed. Read-only.
     * @param value Value to set for the activityDateTime property.
     * @return a void
     */
    public void setActivityDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._activityDateTime = value;
    }
    /**
     * Sets the activityOperationType property value. The HTTP operation type of the activity. Possible values include create, delete, patch and other. Read-only.
     * @param value Value to set for the activityOperationType property.
     * @return a void
     */
    public void setActivityOperationType(@javax.annotation.Nullable final CloudPcAuditActivityOperationType value) {
        this._activityOperationType = value;
    }
    /**
     * Sets the activityResult property value. The result of the activity. Read-only.
     * @param value Value to set for the activityResult property.
     * @return a void
     */
    public void setActivityResult(@javax.annotation.Nullable final CloudPcAuditActivityResult value) {
        this._activityResult = value;
    }
    /**
     * Sets the activityType property value. The type of activity that was performed. Read-only.
     * @param value Value to set for the activityType property.
     * @return a void
     */
    public void setActivityType(@javax.annotation.Nullable final String value) {
        this._activityType = value;
    }
    /**
     * Sets the actor property value. The actor property
     * @param value Value to set for the actor property.
     * @return a void
     */
    public void setActor(@javax.annotation.Nullable final CloudPcAuditActor value) {
        this._actor = value;
    }
    /**
     * Sets the category property value. Audit category. Read-only.
     * @param value Value to set for the category property.
     * @return a void
     */
    public void setCategory(@javax.annotation.Nullable final CloudPcAuditCategory value) {
        this._category = value;
    }
    /**
     * Sets the componentName property value. Component name. Read-only.
     * @param value Value to set for the componentName property.
     * @return a void
     */
    public void setComponentName(@javax.annotation.Nullable final String value) {
        this._componentName = value;
    }
    /**
     * Sets the correlationId property value. The client request identifier, used to correlate activity within the system. Read-only.
     * @param value Value to set for the correlationId property.
     * @return a void
     */
    public void setCorrelationId(@javax.annotation.Nullable final String value) {
        this._correlationId = value;
    }
    /**
     * Sets the displayName property value. Event display name. Read-only.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the resources property value. List of cloudPcAuditResource objects. Read-only.
     * @param value Value to set for the resources property.
     * @return a void
     */
    public void setResources(@javax.annotation.Nullable final java.util.List<CloudPcAuditResource> value) {
        this._resources = value;
    }
}
