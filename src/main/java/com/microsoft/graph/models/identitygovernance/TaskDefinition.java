package com.microsoft.graph.models.identitygovernance;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the collection of accessReviewDecision entities. */
public class TaskDefinition extends Entity implements Parsable {
    /** The category property */
    private LifecycleTaskCategory _category;
    /** The continueOnError property */
    private Boolean _continueOnError;
    /** The description of the taskDefinition. */
    private String _description;
    /** The display name of the taskDefinition`. */
    private String _displayName;
    /** The parameters that must be supplied when creating a workflow task object. */
    private java.util.List<Parameter> _parameters;
    /** The version number of the taskDefinition. New records are pushed when we add support for new parameters. */
    private Integer _version;
    /**
     * Instantiates a new taskDefinition and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public TaskDefinition() {
        super();
        this.setOdataType("#microsoft.graph.identityGovernance.taskDefinition");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a taskDefinition
     */
    @javax.annotation.Nonnull
    public static TaskDefinition createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TaskDefinition();
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
     * Gets the continueOnError property value. The continueOnError property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getContinueOnError() {
        return this._continueOnError;
    }
    /**
     * Gets the description property value. The description of the taskDefinition.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * Gets the displayName property value. The display name of the taskDefinition`.
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
        final TaskDefinition currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("category", (n) -> { currentObject.setCategory(n.getEnumValue(LifecycleTaskCategory.class)); });
            this.put("continueOnError", (n) -> { currentObject.setContinueOnError(n.getBooleanValue()); });
            this.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("parameters", (n) -> { currentObject.setParameters(n.getCollectionOfObjectValues(Parameter::createFromDiscriminatorValue)); });
            this.put("version", (n) -> { currentObject.setVersion(n.getIntegerValue()); });
        }};
    }
    /**
     * Gets the parameters property value. The parameters that must be supplied when creating a workflow task object.
     * @return a parameter
     */
    @javax.annotation.Nullable
    public java.util.List<Parameter> getParameters() {
        return this._parameters;
    }
    /**
     * Gets the version property value. The version number of the taskDefinition. New records are pushed when we add support for new parameters.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getVersion() {
        return this._version;
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
        writer.writeEnumValue("category", this.getCategory());
        writer.writeBooleanValue("continueOnError", this.getContinueOnError());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeCollectionOfObjectValues("parameters", this.getParameters());
        writer.writeIntegerValue("version", this.getVersion());
    }
    /**
     * Sets the category property value. The category property
     * @param value Value to set for the category property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCategory(@javax.annotation.Nullable final LifecycleTaskCategory value) {
        this._category = value;
    }
    /**
     * Sets the continueOnError property value. The continueOnError property
     * @param value Value to set for the continueOnError property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setContinueOnError(@javax.annotation.Nullable final Boolean value) {
        this._continueOnError = value;
    }
    /**
     * Sets the description property value. The description of the taskDefinition.
     * @param value Value to set for the description property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the displayName property value. The display name of the taskDefinition`.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the parameters property value. The parameters that must be supplied when creating a workflow task object.
     * @param value Value to set for the parameters property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setParameters(@javax.annotation.Nullable final java.util.List<Parameter> value) {
        this._parameters = value;
    }
    /**
     * Sets the version property value. The version number of the taskDefinition. New records are pushed when we add support for new parameters.
     * @param value Value to set for the version property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setVersion(@javax.annotation.Nullable final Integer value) {
        this._version = value;
    }
}
