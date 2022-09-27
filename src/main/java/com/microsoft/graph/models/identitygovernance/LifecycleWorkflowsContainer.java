package com.microsoft.graph.models.identitygovernance;

import com.microsoft.graph.models.DeletedItemContainer;
import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class LifecycleWorkflowsContainer extends Entity implements Parsable {
    /** The customTaskExtension instance. */
    private java.util.List<CustomTaskExtension> _customTaskExtensions;
    /** Deleted workflows in your lifecycle workflows instance. */
    private DeletedItemContainer _deletedItems;
    /** The settings property */
    private LifecycleManagementSettings _settings;
    /** The definition of tasks within the lifecycle workflows instance. */
    private java.util.List<TaskDefinition> _taskDefinitions;
    /** The workflows in the lifecycle workflows instance. */
    private java.util.List<Workflow> _workflows;
    /** The workflow templates in the lifecycle workflow instance. */
    private java.util.List<WorkflowTemplate> _workflowTemplates;
    /**
     * Instantiates a new LifecycleWorkflowsContainer and sets the default values.
     * @return a void
     */
    public LifecycleWorkflowsContainer() {
        super();
        this.setOdataType("#microsoft.graph.identityGovernance.lifecycleWorkflowsContainer");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a LifecycleWorkflowsContainer
     */
    @javax.annotation.Nonnull
    public static LifecycleWorkflowsContainer createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new LifecycleWorkflowsContainer();
    }
    /**
     * Gets the customTaskExtensions property value. The customTaskExtension instance.
     * @return a customTaskExtension
     */
    @javax.annotation.Nullable
    public java.util.List<CustomTaskExtension> getCustomTaskExtensions() {
        return this._customTaskExtensions;
    }
    /**
     * Gets the deletedItems property value. Deleted workflows in your lifecycle workflows instance.
     * @return a deletedItemContainer
     */
    @javax.annotation.Nullable
    public DeletedItemContainer getDeletedItems() {
        return this._deletedItems;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final LifecycleWorkflowsContainer currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("customTaskExtensions", (n) -> { currentObject.setCustomTaskExtensions(n.getCollectionOfObjectValues(CustomTaskExtension::createFromDiscriminatorValue)); });
            this.put("deletedItems", (n) -> { currentObject.setDeletedItems(n.getObjectValue(DeletedItemContainer::createFromDiscriminatorValue)); });
            this.put("settings", (n) -> { currentObject.setSettings(n.getObjectValue(LifecycleManagementSettings::createFromDiscriminatorValue)); });
            this.put("taskDefinitions", (n) -> { currentObject.setTaskDefinitions(n.getCollectionOfObjectValues(TaskDefinition::createFromDiscriminatorValue)); });
            this.put("workflows", (n) -> { currentObject.setWorkflows(n.getCollectionOfObjectValues(Workflow::createFromDiscriminatorValue)); });
            this.put("workflowTemplates", (n) -> { currentObject.setWorkflowTemplates(n.getCollectionOfObjectValues(WorkflowTemplate::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the settings property value. The settings property
     * @return a lifecycleManagementSettings
     */
    @javax.annotation.Nullable
    public LifecycleManagementSettings getSettings() {
        return this._settings;
    }
    /**
     * Gets the taskDefinitions property value. The definition of tasks within the lifecycle workflows instance.
     * @return a taskDefinition
     */
    @javax.annotation.Nullable
    public java.util.List<TaskDefinition> getTaskDefinitions() {
        return this._taskDefinitions;
    }
    /**
     * Gets the workflows property value. The workflows in the lifecycle workflows instance.
     * @return a workflow
     */
    @javax.annotation.Nullable
    public java.util.List<Workflow> getWorkflows() {
        return this._workflows;
    }
    /**
     * Gets the workflowTemplates property value. The workflow templates in the lifecycle workflow instance.
     * @return a workflowTemplate
     */
    @javax.annotation.Nullable
    public java.util.List<WorkflowTemplate> getWorkflowTemplates() {
        return this._workflowTemplates;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("customTaskExtensions", this.getCustomTaskExtensions());
        writer.writeObjectValue("deletedItems", this.getDeletedItems());
        writer.writeObjectValue("settings", this.getSettings());
        writer.writeCollectionOfObjectValues("taskDefinitions", this.getTaskDefinitions());
        writer.writeCollectionOfObjectValues("workflows", this.getWorkflows());
        writer.writeCollectionOfObjectValues("workflowTemplates", this.getWorkflowTemplates());
    }
    /**
     * Sets the customTaskExtensions property value. The customTaskExtension instance.
     * @param value Value to set for the customTaskExtensions property.
     * @return a void
     */
    public void setCustomTaskExtensions(@javax.annotation.Nullable final java.util.List<CustomTaskExtension> value) {
        this._customTaskExtensions = value;
    }
    /**
     * Sets the deletedItems property value. Deleted workflows in your lifecycle workflows instance.
     * @param value Value to set for the deletedItems property.
     * @return a void
     */
    public void setDeletedItems(@javax.annotation.Nullable final DeletedItemContainer value) {
        this._deletedItems = value;
    }
    /**
     * Sets the settings property value. The settings property
     * @param value Value to set for the settings property.
     * @return a void
     */
    public void setSettings(@javax.annotation.Nullable final LifecycleManagementSettings value) {
        this._settings = value;
    }
    /**
     * Sets the taskDefinitions property value. The definition of tasks within the lifecycle workflows instance.
     * @param value Value to set for the taskDefinitions property.
     * @return a void
     */
    public void setTaskDefinitions(@javax.annotation.Nullable final java.util.List<TaskDefinition> value) {
        this._taskDefinitions = value;
    }
    /**
     * Sets the workflows property value. The workflows in the lifecycle workflows instance.
     * @param value Value to set for the workflows property.
     * @return a void
     */
    public void setWorkflows(@javax.annotation.Nullable final java.util.List<Workflow> value) {
        this._workflows = value;
    }
    /**
     * Sets the workflowTemplates property value. The workflow templates in the lifecycle workflow instance.
     * @param value Value to set for the workflowTemplates property.
     * @return a void
     */
    public void setWorkflowTemplates(@javax.annotation.Nullable final java.util.List<WorkflowTemplate> value) {
        this._workflowTemplates = value;
    }
}
