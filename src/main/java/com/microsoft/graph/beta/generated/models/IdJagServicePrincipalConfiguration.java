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
public class IdJagServicePrincipalConfiguration implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link IdJagServicePrincipalConfiguration} and sets the default values.
     */
    public IdJagServicePrincipalConfiguration() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link IdJagServicePrincipalConfiguration}
     */
    @jakarta.annotation.Nonnull
    public static IdJagServicePrincipalConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IdJagServicePrincipalConfiguration();
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
     * Gets the backingStore property value. Stores model information.
     * @return a {@link BackingStore}
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * Gets the enabledClients property value. Required and non-null when ServicePrincipal ID-JAG configuration is supplied. Maps enabled Entra clients to their Resource Authorization Server client identifiers. This is the only supported ID-JAG child on agentIdentityBlueprintPrincipal and agentIdentity.
     * @return a {@link java.util.List<IdJagEnabledClient>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<IdJagEnabledClient> getEnabledClients() {
        return this.backingStore.get("enabledClients");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("enabledClients", (n) -> { this.setEnabledClients(n.getCollectionOfObjectValues(IdJagEnabledClient::createFromDiscriminatorValue)); });
        deserializerMap.put("isEnabled", (n) -> { this.setIsEnabled(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isEnabled property value. Required and non-null when ID-JAG configuration is supplied on a base ServicePrincipal. Indicates whether ID-JAG issuance is enabled for this tenant-local resource. Not supported on agentIdentityBlueprintPrincipal or agentIdentity; returned as null and rejected on write.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsEnabled() {
        return this.backingStore.get("isEnabled");
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
        writer.writeCollectionOfObjectValues("enabledClients", this.getEnabledClients());
        writer.writeBooleanValue("isEnabled", this.getIsEnabled());
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
     * Sets the backingStore property value. Stores model information.
     * @param value Value to set for the backingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.backingStore = value;
    }
    /**
     * Sets the enabledClients property value. Required and non-null when ServicePrincipal ID-JAG configuration is supplied. Maps enabled Entra clients to their Resource Authorization Server client identifiers. This is the only supported ID-JAG child on agentIdentityBlueprintPrincipal and agentIdentity.
     * @param value Value to set for the enabledClients property.
     */
    public void setEnabledClients(@jakarta.annotation.Nullable final java.util.List<IdJagEnabledClient> value) {
        this.backingStore.set("enabledClients", value);
    }
    /**
     * Sets the isEnabled property value. Required and non-null when ID-JAG configuration is supplied on a base ServicePrincipal. Indicates whether ID-JAG issuance is enabled for this tenant-local resource. Not supported on agentIdentityBlueprintPrincipal or agentIdentity; returned as null and rejected on write.
     * @param value Value to set for the isEnabled property.
     */
    public void setIsEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isEnabled", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
}
