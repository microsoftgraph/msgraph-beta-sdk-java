package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CloudPcKeyVaultDomainJoinCredential extends CloudPcDomainJoinCredential implements Parsable {
    /**
     * Instantiates a new {@link CloudPcKeyVaultDomainJoinCredential} and sets the default values.
     */
    public CloudPcKeyVaultDomainJoinCredential() {
        super();
        this.setOdataType("#microsoft.graph.cloudPcKeyVaultDomainJoinCredential");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CloudPcKeyVaultDomainJoinCredential}
     */
    @jakarta.annotation.Nonnull
    public static CloudPcKeyVaultDomainJoinCredential createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CloudPcKeyVaultDomainJoinCredential();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("keyVaultIntentConfiguration", (n) -> { this.setKeyVaultIntentConfiguration(n.getObjectValue(CloudPcDomainJoinKeyVaultIntentConfiguration::createFromDiscriminatorValue)); });
        deserializerMap.put("keyVaultResourceId", (n) -> { this.setKeyVaultResourceId(n.getStringValue()); });
        deserializerMap.put("secretName", (n) -> { this.setSecretName(n.getStringValue()); });
        deserializerMap.put("serviceConnectorResourceId", (n) -> { this.setServiceConnectorResourceId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the keyVaultIntentConfiguration property value. The keyVaultIntentConfiguration property
     * @return a {@link CloudPcDomainJoinKeyVaultIntentConfiguration}
     */
    @jakarta.annotation.Nullable
    public CloudPcDomainJoinKeyVaultIntentConfiguration getKeyVaultIntentConfiguration() {
        return this.backingStore.get("keyVaultIntentConfiguration");
    }
    /**
     * Gets the keyVaultResourceId property value. The full Azure Resource Manager resource ID of the Azure Key Vault that stores the domain join password. Required format: /subscriptions/{subscription-id}/resourceGroups/{resourceGroupName}/providers/Microsoft.KeyVault/vaults/{vaultName}. Required.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getKeyVaultResourceId() {
        return this.backingStore.get("keyVaultResourceId");
    }
    /**
     * Gets the secretName property value. The name of the secret in the Azure Key Vault that stores the domain join password. Required.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSecretName() {
        return this.backingStore.get("secretName");
    }
    /**
     * Gets the serviceConnectorResourceId property value. The full Azure Resource Manager resource ID of the Windows 365 service connector that grants Windows 365 access to the Azure Key Vault. Required format when specified: /subscriptions/{subscription-id}/resourceGroups/{resourceGroupName}/providers/Microsoft.Windows365/serviceConnectors/{serviceConnectorName}. Optional.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getServiceConnectorResourceId() {
        return this.backingStore.get("serviceConnectorResourceId");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("keyVaultIntentConfiguration", this.getKeyVaultIntentConfiguration());
        writer.writeStringValue("keyVaultResourceId", this.getKeyVaultResourceId());
        writer.writeStringValue("secretName", this.getSecretName());
        writer.writeStringValue("serviceConnectorResourceId", this.getServiceConnectorResourceId());
    }
    /**
     * Sets the keyVaultIntentConfiguration property value. The keyVaultIntentConfiguration property
     * @param value Value to set for the keyVaultIntentConfiguration property.
     */
    public void setKeyVaultIntentConfiguration(@jakarta.annotation.Nullable final CloudPcDomainJoinKeyVaultIntentConfiguration value) {
        this.backingStore.set("keyVaultIntentConfiguration", value);
    }
    /**
     * Sets the keyVaultResourceId property value. The full Azure Resource Manager resource ID of the Azure Key Vault that stores the domain join password. Required format: /subscriptions/{subscription-id}/resourceGroups/{resourceGroupName}/providers/Microsoft.KeyVault/vaults/{vaultName}. Required.
     * @param value Value to set for the keyVaultResourceId property.
     */
    public void setKeyVaultResourceId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("keyVaultResourceId", value);
    }
    /**
     * Sets the secretName property value. The name of the secret in the Azure Key Vault that stores the domain join password. Required.
     * @param value Value to set for the secretName property.
     */
    public void setSecretName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("secretName", value);
    }
    /**
     * Sets the serviceConnectorResourceId property value. The full Azure Resource Manager resource ID of the Windows 365 service connector that grants Windows 365 access to the Azure Key Vault. Required format when specified: /subscriptions/{subscription-id}/resourceGroups/{resourceGroupName}/providers/Microsoft.Windows365/serviceConnectors/{serviceConnectorName}. Optional.
     * @param value Value to set for the serviceConnectorResourceId property.
     */
    public void setServiceConnectorResourceId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("serviceConnectorResourceId", value);
    }
}
