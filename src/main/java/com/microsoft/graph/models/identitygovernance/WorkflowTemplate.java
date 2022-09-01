package com.microsoft.graph.models.identitygovernance;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class WorkflowTemplate extends Entity implements Parsable {
    /** The category property */
    private LifecycleWorkflowCategory _category;
    /** The description property */
    private String _description;
    /** The displayName property */
    private String _displayName;
    /** The executionConditions property */
    private WorkflowExecutionConditions _executionConditions;
    /** The tasks property */
    private java.util.List<Task> _tasks;
    /**
     * Instantiates a new WorkflowTemplate and sets the default values.
     * @return a void
     */
    public WorkflowTemplate() {
        super();
        this.setOdataType("#microsoft.graph.identityGovernance.workflowTemplate");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a WorkflowTemplate
     */
    @javax.annotation.Nonnull
    public static WorkflowTemplate createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WorkflowTemplate();
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
     * Gets the description property value. The description property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * Gets the displayName property value. The displayName property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * Gets the executionConditions property value. The executionConditions property
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
        final WorkflowTemplate currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("category", (n) -> { currentObject.setCategory(n.getEnumValue(LifecycleWorkflowCategory.class)); });
            this.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("executionConditions", (n) -> { currentObject.setExecutionConditions(n.getObjectValue(WorkflowExecutionConditions::createFromDiscriminatorValue)); });
            this.put("tasks", (n) -> { currentObject.setTasks(n.getCollectionOfObjectValues(Task::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the tasks property value. The tasks property
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
        super.serialize(writer);
        writer.writeEnumValue("category", this.getCategory());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeObjectValue("executionConditions", this.getExecutionConditions());
        writer.writeCollectionOfObjectValues("tasks", this.getTasks());
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
     * Sets the description property value. The description property
     * @param value Value to set for the description property.
     * @return a void
     */
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the displayName property value. The displayName property
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the executionConditions property value. The executionConditions property
     * @param value Value to set for the executionConditions property.
     * @return a void
     */
    public void setExecutionConditions(@javax.annotation.Nullable final WorkflowExecutionConditions value) {
        this._executionConditions = value;
    }
    /**
     * Sets the tasks property value. The tasks property
     * @param value Value to set for the tasks property.
     * @return a void
     */
    public void setTasks(@javax.annotation.Nullable final java.util.List<Task> value) {
        this._tasks = value;
    }
}
