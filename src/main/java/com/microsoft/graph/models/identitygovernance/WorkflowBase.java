package com.microsoft.graph.models.identitygovernance;

import com.microsoft.graph.models.identitygovernance.Workflow;
import com.microsoft.graph.models.identitygovernance.WorkflowVersion;
import com.microsoft.graph.models.User;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class WorkflowBase implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The category property */
    private LifecycleWorkflowCategory _category;
    /** The user who created the workflow. */
    private User _createdBy;
    /** When a workflow was created. */
    private OffsetDateTime _createdDateTime;
    /** A string that describes the purpose of the workflow. */
    private String _description;
    /** A string to identify the workflow. */
    private String _displayName;
    /** Defines when and for who the workflow will run. */
    private WorkflowExecutionConditions _executionConditions;
    /** The user who last modified the workflow. */
    private User _lastModifiedBy;
    /** When the workflow was last modified. */
    private OffsetDateTime _lastModifiedDateTime;
    /** The OdataType property */
    private String _odataType;
    /** The tasks in the workflow. */
    private java.util.List<Task> _tasks;
    /**
     * Instantiates a new workflowBase and sets the default values.
     * @return a void
     */
    public WorkflowBase() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.identityGovernance.workflowBase");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a workflowBase
     */
    @javax.annotation.Nonnull
    public static WorkflowBase createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.identityGovernance.workflow": return new Workflow();
                case "#microsoft.graph.identityGovernance.workflowVersion": return new WorkflowVersion();
            }
        }
        return new WorkflowBase();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * Gets the category property value. The category property
     * @return a lifecycleWorkflowCategory
     */
    @javax.annotation.Nullable
    public LifecycleWorkflowCategory getCategory() {
        return this._category;
    }
    /**
     * Gets the createdBy property value. The user who created the workflow.
     * @return a user
     */
    @javax.annotation.Nullable
    public User getCreatedBy() {
        return this._createdBy;
    }
    /**
     * Gets the createdDateTime property value. When a workflow was created.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this._createdDateTime;
    }
    /**
     * Gets the description property value. A string that describes the purpose of the workflow.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * Gets the displayName property value. A string to identify the workflow.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * Gets the executionConditions property value. Defines when and for who the workflow will run.
     * @return a workflowExecutionConditions
     */
    @javax.annotation.Nullable
    public WorkflowExecutionConditions getExecutionConditions() {
        return this._executionConditions;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final WorkflowBase currentObject = this;
        return new HashMap<>(10) {{
            this.put("category", (n) -> { currentObject.setCategory(n.getEnumValue(LifecycleWorkflowCategory.class)); });
            this.put("createdBy", (n) -> { currentObject.setCreatedBy(n.getObjectValue(User::createFromDiscriminatorValue)); });
            this.put("createdDateTime", (n) -> { currentObject.setCreatedDateTime(n.getOffsetDateTimeValue()); });
            this.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("executionConditions", (n) -> { currentObject.setExecutionConditions(n.getObjectValue(WorkflowExecutionConditions::createFromDiscriminatorValue)); });
            this.put("lastModifiedBy", (n) -> { currentObject.setLastModifiedBy(n.getObjectValue(User::createFromDiscriminatorValue)); });
            this.put("lastModifiedDateTime", (n) -> { currentObject.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("tasks", (n) -> { currentObject.setTasks(n.getCollectionOfObjectValues(Task::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the lastModifiedBy property value. The user who last modified the workflow.
     * @return a user
     */
    @javax.annotation.Nullable
    public User getLastModifiedBy() {
        return this._lastModifiedBy;
    }
    /**
     * Gets the lastModifiedDateTime property value. When the workflow was last modified.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this._lastModifiedDateTime;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this._odataType;
    }
    /**
     * Gets the tasks property value. The tasks in the workflow.
     * @return a task
     */
    @javax.annotation.Nullable
    public java.util.List<Task> getTasks() {
        return this._tasks;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("category", this.getCategory());
        writer.writeObjectValue("createdBy", this.getCreatedBy());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeObjectValue("executionConditions", this.getExecutionConditions());
        writer.writeObjectValue("lastModifiedBy", this.getLastModifiedBy());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeCollectionOfObjectValues("tasks", this.getTasks());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the category property value. The category property
     * @param value Value to set for the category property.
     * @return a void
     */
    public void setCategory(@javax.annotation.Nullable final LifecycleWorkflowCategory value) {
        this._category = value;
    }
    /**
     * Sets the createdBy property value. The user who created the workflow.
     * @param value Value to set for the createdBy property.
     * @return a void
     */
    public void setCreatedBy(@javax.annotation.Nullable final User value) {
        this._createdBy = value;
    }
    /**
     * Sets the createdDateTime property value. When a workflow was created.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._createdDateTime = value;
    }
    /**
     * Sets the description property value. A string that describes the purpose of the workflow.
     * @param value Value to set for the description property.
     * @return a void
     */
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the displayName property value. A string to identify the workflow.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the executionConditions property value. Defines when and for who the workflow will run.
     * @param value Value to set for the executionConditions property.
     * @return a void
     */
    public void setExecutionConditions(@javax.annotation.Nullable final WorkflowExecutionConditions value) {
        this._executionConditions = value;
    }
    /**
     * Sets the lastModifiedBy property value. The user who last modified the workflow.
     * @param value Value to set for the lastModifiedBy property.
     * @return a void
     */
    public void setLastModifiedBy(@javax.annotation.Nullable final User value) {
        this._lastModifiedBy = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. When the workflow was last modified.
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastModifiedDateTime = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the tasks property value. The tasks in the workflow.
     * @param value Value to set for the tasks property.
     * @return a void
     */
    public void setTasks(@javax.annotation.Nullable final java.util.List<Task> value) {
        this._tasks = value;
    }
}
