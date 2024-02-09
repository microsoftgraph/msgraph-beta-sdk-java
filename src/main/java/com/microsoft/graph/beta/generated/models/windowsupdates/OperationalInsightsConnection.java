package com.microsoft.graph.beta.models.windowsupdates;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OperationalInsightsConnection extends ResourceConnection implements Parsable {
    /**
     * Instantiates a new {@link OperationalInsightsConnection} and sets the default values.
     */
    public OperationalInsightsConnection() {
        super();
        this.setOdataType("#microsoft.graph.windowsUpdates.operationalInsightsConnection");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link OperationalInsightsConnection}
     */
    @jakarta.annotation.Nonnull
    public static OperationalInsightsConnection createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OperationalInsightsConnection();
    }
    /**
     * Gets the azureResourceGroupName property value. The name of the Azure resource group that contains the Log Analytics workspace.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAzureResourceGroupName() {
        return this.backingStore.get("azureResourceGroupName");
    }
    /**
     * Gets the azureSubscriptionId property value. The Azure subscription ID that contains the Log Analytics workspace.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAzureSubscriptionId() {
        return this.backingStore.get("azureSubscriptionId");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("azureResourceGroupName", (n) -> { this.setAzureResourceGroupName(n.getStringValue()); });
        deserializerMap.put("azureSubscriptionId", (n) -> { this.setAzureSubscriptionId(n.getStringValue()); });
        deserializerMap.put("workspaceName", (n) -> { this.setWorkspaceName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the workspaceName property value. The name of the Log Analytics workspace.
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
        writer.writeStringValue("azureResourceGroupName", this.getAzureResourceGroupName());
        writer.writeStringValue("azureSubscriptionId", this.getAzureSubscriptionId());
        writer.writeStringValue("workspaceName", this.getWorkspaceName());
    }
    /**
     * Sets the azureResourceGroupName property value. The name of the Azure resource group that contains the Log Analytics workspace.
     * @param value Value to set for the azureResourceGroupName property.
     */
    public void setAzureResourceGroupName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("azureResourceGroupName", value);
    }
    /**
     * Sets the azureSubscriptionId property value. The Azure subscription ID that contains the Log Analytics workspace.
     * @param value Value to set for the azureSubscriptionId property.
     */
    public void setAzureSubscriptionId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("azureSubscriptionId", value);
    }
    /**
     * Sets the workspaceName property value. The name of the Log Analytics workspace.
     * @param value Value to set for the workspaceName property.
     */
    public void setWorkspaceName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("workspaceName", value);
    }
}
