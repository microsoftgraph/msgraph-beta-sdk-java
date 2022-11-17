package com.microsoft.graph.models.identitygovernance;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the collection of activityStatistics entities. */
public class WorkflowVersion extends WorkflowBase implements Parsable {
    /** The version of the workflow.Supports $filter(lt, le, gt, ge, eq, ne) and $orderby. */
    private Integer _versionNumber;
    /**
     * Instantiates a new workflowVersion and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public WorkflowVersion() {
        super();
        this.setOdataType("#microsoft.graph.identityGovernance.workflowVersion");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a workflowVersion
     */
    @javax.annotation.Nonnull
    public static WorkflowVersion createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WorkflowVersion();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final WorkflowVersion currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("versionNumber", (n) -> { currentObject.setVersionNumber(n.getIntegerValue()); });
        }};
    }
    /**
     * Gets the versionNumber property value. The version of the workflow.Supports $filter(lt, le, gt, ge, eq, ne) and $orderby.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getVersionNumber() {
        return this._versionNumber;
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
        writer.writeIntegerValue("versionNumber", this.getVersionNumber());
    }
    /**
     * Sets the versionNumber property value. The version of the workflow.Supports $filter(lt, le, gt, ge, eq, ne) and $orderby.
     * @param value Value to set for the versionNumber property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setVersionNumber(@javax.annotation.Nullable final Integer value) {
        this._versionNumber = value;
    }
}
