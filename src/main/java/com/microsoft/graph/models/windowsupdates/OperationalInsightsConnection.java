package com.microsoft.graph.models.windowsupdates;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class OperationalInsightsConnection extends ResourceConnection implements Parsable {
    /** The name of the Azure resource group that contains the Log Analytics workspace. */
    private String _azureResourceGroupName;
    /** The Azure subscription ID that contains the Log Analytics workspace. */
    private String _azureSubscriptionId;
    /** The name of the Log Analytics workspace. */
    private String _workspaceName;
    /**
     * Instantiates a new OperationalInsightsConnection and sets the default values.
     * @return a void
     */
    public OperationalInsightsConnection() {
        super();
        this.setOdataType("#microsoft.graph.windowsUpdates.operationalInsightsConnection");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a OperationalInsightsConnection
     */
    @javax.annotation.Nonnull
    public static OperationalInsightsConnection createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OperationalInsightsConnection();
    }
    /**
     * Gets the azureResourceGroupName property value. The name of the Azure resource group that contains the Log Analytics workspace.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAzureResourceGroupName() {
        return this._azureResourceGroupName;
    }
    /**
     * Gets the azureSubscriptionId property value. The Azure subscription ID that contains the Log Analytics workspace.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAzureSubscriptionId() {
        return this._azureSubscriptionId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final OperationalInsightsConnection currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("azureResourceGroupName", (n) -> { currentObject.setAzureResourceGroupName(n.getStringValue()); });
            this.put("azureSubscriptionId", (n) -> { currentObject.setAzureSubscriptionId(n.getStringValue()); });
            this.put("workspaceName", (n) -> { currentObject.setWorkspaceName(n.getStringValue()); });
        }};
    }
    /**
     * Gets the workspaceName property value. The name of the Log Analytics workspace.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getWorkspaceName() {
        return this._workspaceName;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("azureResourceGroupName", this.getAzureResourceGroupName());
        writer.writeStringValue("azureSubscriptionId", this.getAzureSubscriptionId());
        writer.writeStringValue("workspaceName", this.getWorkspaceName());
    }
    /**
     * Sets the azureResourceGroupName property value. The name of the Azure resource group that contains the Log Analytics workspace.
     * @param value Value to set for the azureResourceGroupName property.
     * @return a void
     */
    public void setAzureResourceGroupName(@javax.annotation.Nullable final String value) {
        this._azureResourceGroupName = value;
    }
    /**
     * Sets the azureSubscriptionId property value. The Azure subscription ID that contains the Log Analytics workspace.
     * @param value Value to set for the azureSubscriptionId property.
     * @return a void
     */
    public void setAzureSubscriptionId(@javax.annotation.Nullable final String value) {
        this._azureSubscriptionId = value;
    }
    /**
     * Sets the workspaceName property value. The name of the Log Analytics workspace.
     * @param value Value to set for the workspaceName property.
     * @return a void
     */
    public void setWorkspaceName(@javax.annotation.Nullable final String value) {
        this._workspaceName = value;
    }
}
