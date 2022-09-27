package com.microsoft.graph.models.identitygovernance;

import com.microsoft.graph.models.Entity;
import com.microsoft.graph.models.KeyValuePair;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the collection of accessReview entities. */
public class Task extends Entity implements Parsable {
    /** Arguments included within the task. */
    private java.util.List<KeyValuePair> _arguments;
    /** The category property */
    private LifecycleTaskCategory _category;
    /** A boolean value that determines if the failure of this task stops the subsequent workflows from running. */
    private Boolean _continueOnError;
    /** A string that describes the purpose of the task for administrative use. */
    private String _description;
    /** A unique string that identifies the task. Supports $filter(eq) and orderBy. */
    private String _displayName;
    /** An integer that states in what order the task will run in a workflow. */
    private Integer _executionSequence;
    /** A boolean value that denotes whether the task is set to run or not. Supports $filter(eq, ne) and orderBy. */
    private Boolean _isEnabled;
    /** A unique template identifier for the task. For more information about the tasks that Lifecycle Workflows currently supports and their unique identifiers, see supported tasks */
    private String _taskDefinitionId;
    /** The result of processing the task. */
    private java.util.List<TaskProcessingResult> _taskProcessingResults;
    /**
     * Instantiates a new task and sets the default values.
     * @return a void
     */
    public Task() {
        super();
        this.setOdataType("#microsoft.graph.identityGovernance.task");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a task
     */
    @javax.annotation.Nonnull
    public static Task createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Task();
    }
    /**
     * Gets the arguments property value. Arguments included within the task.
     * @return a keyValuePair
     */
    @javax.annotation.Nullable
    public java.util.List<KeyValuePair> getArguments() {
        return this._arguments;
    }
    /**
     * Gets the category property value. The category property
     * @return a lifecycleTaskCategory
     */
    @javax.annotation.Nullable
    public LifecycleTaskCategory getCategory() {
        return this._category;
    }
    /**
     * Gets the continueOnError property value. A boolean value that determines if the failure of this task stops the subsequent workflows from running.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getContinueOnError() {
        return this._continueOnError;
    }
    /**
     * Gets the description property value. A string that describes the purpose of the task for administrative use.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * Gets the displayName property value. A unique string that identifies the task. Supports $filter(eq) and orderBy.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * Gets the executionSequence property value. An integer that states in what order the task will run in a workflow.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getExecutionSequence() {
        return this._executionSequence;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final Task currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("arguments", (n) -> { currentObject.setArguments(n.getCollectionOfObjectValues(KeyValuePair::createFromDiscriminatorValue)); });
            this.put("category", (n) -> { currentObject.setCategory(n.getEnumValue(LifecycleTaskCategory.class)); });
            this.put("continueOnError", (n) -> { currentObject.setContinueOnError(n.getBooleanValue()); });
            this.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("executionSequence", (n) -> { currentObject.setExecutionSequence(n.getIntegerValue()); });
            this.put("isEnabled", (n) -> { currentObject.setIsEnabled(n.getBooleanValue()); });
            this.put("taskDefinitionId", (n) -> { currentObject.setTaskDefinitionId(n.getStringValue()); });
            this.put("taskProcessingResults", (n) -> { currentObject.setTaskProcessingResults(n.getCollectionOfObjectValues(TaskProcessingResult::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the isEnabled property value. A boolean value that denotes whether the task is set to run or not. Supports $filter(eq, ne) and orderBy.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsEnabled() {
        return this._isEnabled;
    }
    /**
     * Gets the taskDefinitionId property value. A unique template identifier for the task. For more information about the tasks that Lifecycle Workflows currently supports and their unique identifiers, see supported tasks
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTaskDefinitionId() {
        return this._taskDefinitionId;
    }
    /**
     * Gets the taskProcessingResults property value. The result of processing the task.
     * @return a taskProcessingResult
     */
    @javax.annotation.Nullable
    public java.util.List<TaskProcessingResult> getTaskProcessingResults() {
        return this._taskProcessingResults;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("arguments", this.getArguments());
        writer.writeEnumValue("category", this.getCategory());
        writer.writeBooleanValue("continueOnError", this.getContinueOnError());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeIntegerValue("executionSequence", this.getExecutionSequence());
        writer.writeBooleanValue("isEnabled", this.getIsEnabled());
        writer.writeStringValue("taskDefinitionId", this.getTaskDefinitionId());
        writer.writeCollectionOfObjectValues("taskProcessingResults", this.getTaskProcessingResults());
    }
    /**
     * Sets the arguments property value. Arguments included within the task.
     * @param value Value to set for the arguments property.
     * @return a void
     */
    public void setArguments(@javax.annotation.Nullable final java.util.List<KeyValuePair> value) {
        this._arguments = value;
    }
    /**
     * Sets the category property value. The category property
     * @param value Value to set for the category property.
     * @return a void
     */
    public void setCategory(@javax.annotation.Nullable final LifecycleTaskCategory value) {
        this._category = value;
    }
    /**
     * Sets the continueOnError property value. A boolean value that determines if the failure of this task stops the subsequent workflows from running.
     * @param value Value to set for the continueOnError property.
     * @return a void
     */
    public void setContinueOnError(@javax.annotation.Nullable final Boolean value) {
        this._continueOnError = value;
    }
    /**
     * Sets the description property value. A string that describes the purpose of the task for administrative use.
     * @param value Value to set for the description property.
     * @return a void
     */
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the displayName property value. A unique string that identifies the task. Supports $filter(eq) and orderBy.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the executionSequence property value. An integer that states in what order the task will run in a workflow.
     * @param value Value to set for the executionSequence property.
     * @return a void
     */
    public void setExecutionSequence(@javax.annotation.Nullable final Integer value) {
        this._executionSequence = value;
    }
    /**
     * Sets the isEnabled property value. A boolean value that denotes whether the task is set to run or not. Supports $filter(eq, ne) and orderBy.
     * @param value Value to set for the isEnabled property.
     * @return a void
     */
    public void setIsEnabled(@javax.annotation.Nullable final Boolean value) {
        this._isEnabled = value;
    }
    /**
     * Sets the taskDefinitionId property value. A unique template identifier for the task. For more information about the tasks that Lifecycle Workflows currently supports and their unique identifiers, see supported tasks
     * @param value Value to set for the taskDefinitionId property.
     * @return a void
     */
    public void setTaskDefinitionId(@javax.annotation.Nullable final String value) {
        this._taskDefinitionId = value;
    }
    /**
     * Sets the taskProcessingResults property value. The result of processing the task.
     * @param value Value to set for the taskProcessingResults property.
     * @return a void
     */
    public void setTaskProcessingResults(@javax.annotation.Nullable final java.util.List<TaskProcessingResult> value) {
        this._taskProcessingResults = value;
    }
}
