package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Scheduled Action for Rule
 */
public class DeviceManagementComplianceScheduledActionForRule extends Entity implements Parsable {
    /**
     * Name of the rule which this scheduled action applies to.
     */
    private String ruleName;
    /**
     * The list of scheduled action configurations for this compliance policy. This collection can contain a maximum of 100 elements.
     */
    private java.util.List<DeviceManagementComplianceActionItem> scheduledActionConfigurations;
    /**
     * Instantiates a new deviceManagementComplianceScheduledActionForRule and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public DeviceManagementComplianceScheduledActionForRule() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceManagementComplianceScheduledActionForRule
     */
    @jakarta.annotation.Nonnull
    public static DeviceManagementComplianceScheduledActionForRule createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementComplianceScheduledActionForRule();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("ruleName", (n) -> { this.setRuleName(n.getStringValue()); });
        deserializerMap.put("scheduledActionConfigurations", (n) -> { this.setScheduledActionConfigurations(n.getCollectionOfObjectValues(DeviceManagementComplianceActionItem::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the ruleName property value. Name of the rule which this scheduled action applies to.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getRuleName() {
        return this.ruleName;
    }
    /**
     * Gets the scheduledActionConfigurations property value. The list of scheduled action configurations for this compliance policy. This collection can contain a maximum of 100 elements.
     * @return a deviceManagementComplianceActionItem
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceManagementComplianceActionItem> getScheduledActionConfigurations() {
        return this.scheduledActionConfigurations;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
    @jakarta.annotation.Nonnull
    public void setRuleName(@jakarta.annotation.Nullable final String value) {
        this.ruleName = value;
    }
    /**
     * Sets the scheduledActionConfigurations property value. The list of scheduled action configurations for this compliance policy. This collection can contain a maximum of 100 elements.
     * @param value Value to set for the scheduledActionConfigurations property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setScheduledActionConfigurations(@jakarta.annotation.Nullable final java.util.List<DeviceManagementComplianceActionItem> value) {
        this.scheduledActionConfigurations = value;
    }
}
