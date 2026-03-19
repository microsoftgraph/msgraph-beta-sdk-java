package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CloudPcExternalPartnerAgentSetting implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link CloudPcExternalPartnerAgentSetting} and sets the default values.
     */
    public CloudPcExternalPartnerAgentSetting() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CloudPcExternalPartnerAgentSetting}
     */
    @jakarta.annotation.Nonnull
    public static CloudPcExternalPartnerAgentSetting createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CloudPcExternalPartnerAgentSetting();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a {@link Map<String, Object>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.backingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the agentSha256 property value. The hash value of agent file by sha256 algorithm.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAgentSha256() {
        return this.backingStore.get("agentSha256");
    }
    /**
     * Gets the agentUrl property value. The download link url of the agent, when admin sets this url, then partner can call deploy agent API to deploy this agent to targeted Cloud PCs. The format is like this: https://www.external-partner.com/resources/agents/exampleAgentFile.exe
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAgentUrl() {
        return this.backingStore.get("agentUrl");
    }
    /**
     * Gets the autoDeploymentEnabled property value. Indicates whether partner agent auto deployment is enabled. When true, then the partner agent will be deployed after the Cloud PC is provisioned. When false, auto deployment isn&apos;t performed. Default value is false
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getAutoDeploymentEnabled() {
        return this.backingStore.get("autoDeploymentEnabled");
    }
    /**
     * Gets the backingStore property value. Stores model information.
     * @return a {@link BackingStore}
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("agentSha256", (n) -> { this.setAgentSha256(n.getStringValue()); });
        deserializerMap.put("agentUrl", (n) -> { this.setAgentUrl(n.getStringValue()); });
        deserializerMap.put("autoDeploymentEnabled", (n) -> { this.setAutoDeploymentEnabled(n.getBooleanValue()); });
        deserializerMap.put("installParameters", (n) -> { this.setInstallParameters(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the installParameters property value. The install command parameters to run the agent install command. The format is like this: [&apos;/p paramValue&apos;, &apos;/quiet&apos;]
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getInstallParameters() {
        return this.backingStore.get("installParameters");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("agentSha256", this.getAgentSha256());
        writer.writeStringValue("agentUrl", this.getAgentUrl());
        writer.writeBooleanValue("autoDeploymentEnabled", this.getAutoDeploymentEnabled());
        writer.writeCollectionOfPrimitiveValues("installParameters", this.getInstallParameters());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
    }
    /**
     * Sets the agentSha256 property value. The hash value of agent file by sha256 algorithm.
     * @param value Value to set for the agentSha256 property.
     */
    public void setAgentSha256(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("agentSha256", value);
    }
    /**
     * Sets the agentUrl property value. The download link url of the agent, when admin sets this url, then partner can call deploy agent API to deploy this agent to targeted Cloud PCs. The format is like this: https://www.external-partner.com/resources/agents/exampleAgentFile.exe
     * @param value Value to set for the agentUrl property.
     */
    public void setAgentUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("agentUrl", value);
    }
    /**
     * Sets the autoDeploymentEnabled property value. Indicates whether partner agent auto deployment is enabled. When true, then the partner agent will be deployed after the Cloud PC is provisioned. When false, auto deployment isn&apos;t performed. Default value is false
     * @param value Value to set for the autoDeploymentEnabled property.
     */
    public void setAutoDeploymentEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("autoDeploymentEnabled", value);
    }
    /**
     * Sets the backingStore property value. Stores model information.
     * @param value Value to set for the backingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.backingStore = value;
    }
    /**
     * Sets the installParameters property value. The install command parameters to run the agent install command. The format is like this: [&apos;/p paramValue&apos;, &apos;/quiet&apos;]
     * @param value Value to set for the installParameters property.
     */
    public void setInstallParameters(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("installParameters", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
}
