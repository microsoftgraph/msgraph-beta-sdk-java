package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class LogicAppTriggerEndpointConfiguration extends CustomExtensionEndpointConfiguration implements Parsable {
    /** The name of the logic app. */
    private String _logicAppWorkflowName;
    /** The Azure resource group name for the logic app. */
    private String _resourceGroupName;
    /** Identifier of the Azure subscription for the logic app. */
    private String _subscriptionId;
    /**
     * Instantiates a new LogicAppTriggerEndpointConfiguration and sets the default values.
     * @return a void
     */
    public LogicAppTriggerEndpointConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.logicAppTriggerEndpointConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a LogicAppTriggerEndpointConfiguration
     */
    @javax.annotation.Nonnull
    public static LogicAppTriggerEndpointConfiguration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new LogicAppTriggerEndpointConfiguration();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final LogicAppTriggerEndpointConfiguration currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("logicAppWorkflowName", (n) -> { currentObject.setLogicAppWorkflowName(n.getStringValue()); });
            this.put("resourceGroupName", (n) -> { currentObject.setResourceGroupName(n.getStringValue()); });
            this.put("subscriptionId", (n) -> { currentObject.setSubscriptionId(n.getStringValue()); });
        }};
    }
    /**
     * Gets the logicAppWorkflowName property value. The name of the logic app.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLogicAppWorkflowName() {
        return this._logicAppWorkflowName;
    }
    /**
     * Gets the resourceGroupName property value. The Azure resource group name for the logic app.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getResourceGroupName() {
        return this._resourceGroupName;
    }
    /**
     * Gets the subscriptionId property value. Identifier of the Azure subscription for the logic app.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSubscriptionId() {
        return this._subscriptionId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("logicAppWorkflowName", this.getLogicAppWorkflowName());
        writer.writeStringValue("resourceGroupName", this.getResourceGroupName());
        writer.writeStringValue("subscriptionId", this.getSubscriptionId());
    }
    /**
     * Sets the logicAppWorkflowName property value. The name of the logic app.
     * @param value Value to set for the logicAppWorkflowName property.
     * @return a void
     */
    public void setLogicAppWorkflowName(@javax.annotation.Nullable final String value) {
        this._logicAppWorkflowName = value;
    }
    /**
     * Sets the resourceGroupName property value. The Azure resource group name for the logic app.
     * @param value Value to set for the resourceGroupName property.
     * @return a void
     */
    public void setResourceGroupName(@javax.annotation.Nullable final String value) {
        this._resourceGroupName = value;
    }
    /**
     * Sets the subscriptionId property value. Identifier of the Azure subscription for the logic app.
     * @param value Value to set for the subscriptionId property.
     * @return a void
     */
    public void setSubscriptionId(@javax.annotation.Nullable final String value) {
        this._subscriptionId = value;
    }
}
