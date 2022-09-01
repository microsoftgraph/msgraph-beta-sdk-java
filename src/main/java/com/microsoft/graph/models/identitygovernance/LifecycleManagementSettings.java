package com.microsoft.graph.models.identitygovernance;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class LifecycleManagementSettings extends Entity implements Parsable {
    /** The workflowScheduleIntervalInHours property */
    private Integer _workflowScheduleIntervalInHours;
    /**
     * Instantiates a new LifecycleManagementSettings and sets the default values.
     * @return a void
     */
    public LifecycleManagementSettings() {
        super();
        this.setOdataType("#microsoft.graph.identityGovernance.lifecycleManagementSettings");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a LifecycleManagementSettings
     */
    @javax.annotation.Nonnull
    public static LifecycleManagementSettings createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new LifecycleManagementSettings();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final LifecycleManagementSettings currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("workflowScheduleIntervalInHours", (n) -> { currentObject.setWorkflowScheduleIntervalInHours(n.getIntegerValue()); });
        }};
    }
    /**
     * Gets the workflowScheduleIntervalInHours property value. The workflowScheduleIntervalInHours property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getWorkflowScheduleIntervalInHours() {
        return this._workflowScheduleIntervalInHours;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeIntegerValue("workflowScheduleIntervalInHours", this.getWorkflowScheduleIntervalInHours());
    }
    /**
     * Sets the workflowScheduleIntervalInHours property value. The workflowScheduleIntervalInHours property
     * @param value Value to set for the workflowScheduleIntervalInHours property.
     * @return a void
     */
    public void setWorkflowScheduleIntervalInHours(@javax.annotation.Nullable final Integer value) {
        this._workflowScheduleIntervalInHours = value;
    }
}
