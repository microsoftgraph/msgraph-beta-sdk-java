package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ExternalSapAcConnectionInfo extends ConnectionInfo implements Parsable {
    /**
     * Instantiates a new {@link ExternalSapAcConnectionInfo} and sets the default values.
     */
    public ExternalSapAcConnectionInfo() {
        super();
        this.setOdataType("#microsoft.graph.externalSapAcConnectionInfo");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ExternalSapAcConnectionInfo}
     */
    @jakarta.annotation.Nonnull
    public static ExternalSapAcConnectionInfo createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ExternalSapAcConnectionInfo();
    }
    /**
     * Gets the authenticationInfo property value. The authenticationInfo property
     * @return a {@link AuthenticationInfo}
     */
    @jakarta.annotation.Nullable
    public AuthenticationInfo getAuthenticationInfo() {
        return this.backingStore.get("authenticationInfo");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("authenticationInfo", (n) -> { this.setAuthenticationInfo(n.getObjectValue(AuthenticationInfo::createFromDiscriminatorValue)); });
        deserializerMap.put("keyVaultName", (n) -> { this.setKeyVaultName(n.getStringValue()); });
        deserializerMap.put("resourceGroup", (n) -> { this.setResourceGroup(n.getStringValue()); });
        deserializerMap.put("subscriptionId", (n) -> { this.setSubscriptionId(n.getStringValue()); });
        deserializerMap.put("systemId", (n) -> { this.setSystemId(n.getStringValue()); });
        deserializerMap.put("userIdentifier", (n) -> { this.setUserIdentifier(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the keyVaultName property value. The name of the Azure Key Vault that stores the credentials used for authentication.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getKeyVaultName() {
        return this.backingStore.get("keyVaultName");
    }
    /**
     * Gets the resourceGroup property value. The Azure resource group that contains the Key Vault.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getResourceGroup() {
        return this.backingStore.get("resourceGroup");
    }
    /**
     * Gets the subscriptionId property value. The Azure subscription ID that contains the Key Vault.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSubscriptionId() {
        return this.backingStore.get("subscriptionId");
    }
    /**
     * Gets the systemId property value. The identifier of the target SAP AC system.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSystemId() {
        return this.backingStore.get("systemId");
    }
    /**
     * Gets the userIdentifier property value. The user identifier used to connect to the SAP AC system.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUserIdentifier() {
        return this.backingStore.get("userIdentifier");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("authenticationInfo", this.getAuthenticationInfo());
        writer.writeStringValue("keyVaultName", this.getKeyVaultName());
        writer.writeStringValue("resourceGroup", this.getResourceGroup());
        writer.writeStringValue("subscriptionId", this.getSubscriptionId());
        writer.writeStringValue("systemId", this.getSystemId());
        writer.writeStringValue("userIdentifier", this.getUserIdentifier());
    }
    /**
     * Sets the authenticationInfo property value. The authenticationInfo property
     * @param value Value to set for the authenticationInfo property.
     */
    public void setAuthenticationInfo(@jakarta.annotation.Nullable final AuthenticationInfo value) {
        this.backingStore.set("authenticationInfo", value);
    }
    /**
     * Sets the keyVaultName property value. The name of the Azure Key Vault that stores the credentials used for authentication.
     * @param value Value to set for the keyVaultName property.
     */
    public void setKeyVaultName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("keyVaultName", value);
    }
    /**
     * Sets the resourceGroup property value. The Azure resource group that contains the Key Vault.
     * @param value Value to set for the resourceGroup property.
     */
    public void setResourceGroup(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("resourceGroup", value);
    }
    /**
     * Sets the subscriptionId property value. The Azure subscription ID that contains the Key Vault.
     * @param value Value to set for the subscriptionId property.
     */
    public void setSubscriptionId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("subscriptionId", value);
    }
    /**
     * Sets the systemId property value. The identifier of the target SAP AC system.
     * @param value Value to set for the systemId property.
     */
    public void setSystemId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("systemId", value);
    }
    /**
     * Sets the userIdentifier property value. The user identifier used to connect to the SAP AC system.
     * @param value Value to set for the userIdentifier property.
     */
    public void setUserIdentifier(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("userIdentifier", value);
    }
}
