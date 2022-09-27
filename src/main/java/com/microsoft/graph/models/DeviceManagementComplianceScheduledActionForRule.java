package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Scheduled Action for Rule */
public class DeviceManagementComplianceScheduledActionForRule extends Entity implements Parsable {
    /** Name of the rule which this scheduled action applies to. */
    private String _ruleName;
    /** The list of scheduled action configurations for this compliance policy. This collection can contain a maximum of 100 elements. */
    private java.util.List<DeviceManagementComplianceActionItem> _scheduledActionConfigurations;
    /**
     * Instantiates a new deviceManagementComplianceScheduledActionForRule and sets the default values.
     * @return a void
     */
    public DeviceManagementComplianceScheduledActionForRule() {
        super();
        this.setOdataType("#microsoft.graph.deviceManagementComplianceScheduledActionForRule");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceManagementComplianceScheduledActionForRule
     */
    @javax.annotation.Nonnull
    public static DeviceManagementComplianceScheduledActionForRule createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementComplianceScheduledActionForRule();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DeviceManagementComplianceScheduledActionForRule currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("ruleName", (n) -> { currentObject.setRuleName(n.getStringValue()); });
            this.put("scheduledActionConfigurations", (n) -> { currentObject.setScheduledActionConfigurations(n.getCollectionOfObjectValues(DeviceManagementComplianceActionItem::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the ruleName property value. Name of the rule which this scheduled action applies to.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRuleName() {
        return this._ruleName;
    }
    /**
     * Gets the scheduledActionConfigurations property value. The list of scheduled action configurations for this compliance policy. This collection can contain a maximum of 100 elements.
     * @return a deviceManagementComplianceActionItem
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceManagementComplianceActionItem> getScheduledActionConfigurations() {
        return this._scheduledActionConfigurations;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("ruleName", this.getRuleName());
        writer.writeCollectionOfObjectValues("scheduledActionConfigurations", this.getScheduledActionConfigurations());
    }
    /**
     * Sets the ruleName property value. Name of the rule which this scheduled action applies to.
     * @param value Value to set for the ruleName property.
     * @return a void
     */
    public void setRuleName(@javax.annotation.Nullable final String value) {
        this._ruleName = value;
    }
    /**
     * Sets the scheduledActionConfigurations property value. The list of scheduled action configurations for this compliance policy. This collection can contain a maximum of 100 elements.
     * @param value Value to set for the scheduledActionConfigurations property.
     * @return a void
     */
    public void setScheduledActionConfigurations(@javax.annotation.Nullable final java.util.List<DeviceManagementComplianceActionItem> value) {
        this._scheduledActionConfigurations = value;
    }
}
