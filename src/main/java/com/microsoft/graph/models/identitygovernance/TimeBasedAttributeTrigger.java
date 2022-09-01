package com.microsoft.graph.models.identitygovernance;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class TimeBasedAttributeTrigger extends WorkflowExecutionTrigger implements Parsable {
    /** The offsetInDays property */
    private Integer _offsetInDays;
    /** The timeBasedAttribute property */
    private WorkflowTriggerTimeBasedAttribute _timeBasedAttribute;
    /**
     * Instantiates a new TimeBasedAttributeTrigger and sets the default values.
     * @return a void
     */
    public TimeBasedAttributeTrigger() {
        super();
        this.setOdataType("#microsoft.graph.identityGovernance.timeBasedAttributeTrigger");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a TimeBasedAttributeTrigger
     */
    @javax.annotation.Nonnull
    public static TimeBasedAttributeTrigger createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TimeBasedAttributeTrigger();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final TimeBasedAttributeTrigger currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("offsetInDays", (n) -> { currentObject.setOffsetInDays(n.getIntegerValue()); });
            this.put("timeBasedAttribute", (n) -> { currentObject.setTimeBasedAttribute(n.getEnumValue(WorkflowTriggerTimeBasedAttribute.class)); });
        }};
    }
    /**
     * Gets the offsetInDays property value. The offsetInDays property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getOffsetInDays() {
        return this._offsetInDays;
    }
    /**
     * Gets the timeBasedAttribute property value. The timeBasedAttribute property
     * @return a workflowTriggerTimeBasedAttribute
     */
    @javax.annotation.Nullable
    public WorkflowTriggerTimeBasedAttribute getTimeBasedAttribute() {
        return this._timeBasedAttribute;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeIntegerValue("offsetInDays", this.getOffsetInDays());
        writer.writeEnumValue("timeBasedAttribute", this.getTimeBasedAttribute());
    }
    /**
     * Sets the offsetInDays property value. The offsetInDays property
     * @param value Value to set for the offsetInDays property.
     * @return a void
     */
    public void setOffsetInDays(@javax.annotation.Nullable final Integer value) {
        this._offsetInDays = value;
    }
    /**
     * Sets the timeBasedAttribute property value. The timeBasedAttribute property
     * @param value Value to set for the timeBasedAttribute property.
     * @return a void
     */
    public void setTimeBasedAttribute(@javax.annotation.Nullable final WorkflowTriggerTimeBasedAttribute value) {
        this._timeBasedAttribute = value;
    }
}
