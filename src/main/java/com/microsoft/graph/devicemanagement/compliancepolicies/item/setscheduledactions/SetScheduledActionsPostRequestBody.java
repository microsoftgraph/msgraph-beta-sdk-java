package com.microsoft.graph.devicemanagement.compliancepolicies.item.setscheduledactions;

import com.microsoft.graph.models.DeviceManagementComplianceScheduledActionForRule;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class SetScheduledActionsPostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The scheduledActions property
     */
    private java.util.List<DeviceManagementComplianceScheduledActionForRule> scheduledActions;
    /**
     * Instantiates a new setScheduledActionsPostRequestBody and sets the default values.
     */
    public SetScheduledActionsPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a setScheduledActionsPostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static SetScheduledActionsPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SetScheduledActionsPostRequestBody();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(1);
        deserializerMap.put("scheduledActions", (n) -> { this.setScheduledActions(n.getCollectionOfObjectValues(DeviceManagementComplianceScheduledActionForRule::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the scheduledActions property value. The scheduledActions property
     * @return a deviceManagementComplianceScheduledActionForRule
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceManagementComplianceScheduledActionForRule> getScheduledActions() {
        return this.scheduledActions;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("scheduledActions", this.getScheduledActions());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the scheduledActions property value. The scheduledActions property
     * @param value Value to set for the scheduledActions property.
     */
    public void setScheduledActions(@jakarta.annotation.Nullable final java.util.List<DeviceManagementComplianceScheduledActionForRule> value) {
        this.scheduledActions = value;
    }
}
