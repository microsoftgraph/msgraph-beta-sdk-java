package com.microsoft.graph.beta.models.security.casemanagement;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WorkspaceIndicatorRelation extends Relation implements Parsable {
    /**
     * Instantiates a new {@link WorkspaceIndicatorRelation} and sets the default values.
     */
    public WorkspaceIndicatorRelation() {
        super();
        this.setOdataType("#microsoft.graph.security.caseManagement.workspaceIndicatorRelation");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link WorkspaceIndicatorRelation}
     */
    @jakarta.annotation.Nonnull
    public static WorkspaceIndicatorRelation createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WorkspaceIndicatorRelation();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("resourceGroupName", (n) -> { this.setResourceGroupName(n.getStringValue()); });
        deserializerMap.put("subscriptionId", (n) -> { this.setSubscriptionId(n.getStringValue()); });
        deserializerMap.put("workspaceName", (n) -> { this.setWorkspaceName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the resourceGroupName property value. The Azure resource group name for the workspace.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getResourceGroupName() {
        return this.backingStore.get("resourceGroupName");
    }
    /**
     * Gets the subscriptionId property value. The Azure subscription identifier for the workspace.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSubscriptionId() {
        return this.backingStore.get("subscriptionId");
    }
    /**
     * Gets the workspaceName property value. The Log Analytics workspace name.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getWorkspaceName() {
        return this.backingStore.get("workspaceName");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("resourceGroupName", this.getResourceGroupName());
        writer.writeStringValue("subscriptionId", this.getSubscriptionId());
        writer.writeStringValue("workspaceName", this.getWorkspaceName());
    }
    /**
     * Sets the resourceGroupName property value. The Azure resource group name for the workspace.
     * @param value Value to set for the resourceGroupName property.
     */
    public void setResourceGroupName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("resourceGroupName", value);
    }
    /**
     * Sets the subscriptionId property value. The Azure subscription identifier for the workspace.
     * @param value Value to set for the subscriptionId property.
     */
    public void setSubscriptionId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("subscriptionId", value);
    }
    /**
     * Sets the workspaceName property value. The Log Analytics workspace name.
     * @param value Value to set for the workspaceName property.
     */
    public void setWorkspaceName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("workspaceName", value);
    }
}
