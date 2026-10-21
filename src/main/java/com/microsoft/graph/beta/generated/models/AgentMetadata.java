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
public class AgentMetadata implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link AgentMetadata} and sets the default values.
     */
    public AgentMetadata() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AgentMetadata}
     */
    @jakarta.annotation.Nonnull
    public static AgentMetadata createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AgentMetadata();
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
     * Gets the agentAdministrativeUnitId property value. The agentAdministrativeUnitId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAgentAdministrativeUnitId() {
        return this.backingStore.get("agentAdministrativeUnitId");
    }
    /**
     * Gets the agentBlueprintId property value. The agentBlueprintId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAgentBlueprintId() {
        return this.backingStore.get("agentBlueprintId");
    }
    /**
     * Gets the agentCategory property value. The agentCategory property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAgentCategory() {
        return this.backingStore.get("agentCategory");
    }
    /**
     * Gets the agentOwner property value. The agentOwner property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAgentOwner() {
        return this.backingStore.get("agentOwner");
    }
    /**
     * Gets the agentPublisher property value. The agentPublisher property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAgentPublisher() {
        return this.backingStore.get("agentPublisher");
    }
    /**
     * Gets the altAgentIds property value. The altAgentIds property
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getAltAgentIds() {
        return this.backingStore.get("altAgentIds");
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(8);
        deserializerMap.put("agentAdministrativeUnitId", (n) -> { this.setAgentAdministrativeUnitId(n.getStringValue()); });
        deserializerMap.put("agentBlueprintId", (n) -> { this.setAgentBlueprintId(n.getStringValue()); });
        deserializerMap.put("agentCategory", (n) -> { this.setAgentCategory(n.getStringValue()); });
        deserializerMap.put("agentOwner", (n) -> { this.setAgentOwner(n.getStringValue()); });
        deserializerMap.put("agentPublisher", (n) -> { this.setAgentPublisher(n.getStringValue()); });
        deserializerMap.put("altAgentIds", (n) -> { this.setAltAgentIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("isEntraAgentId", (n) -> { this.setIsEntraAgentId(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isEntraAgentId property value. The isEntraAgentId property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsEntraAgentId() {
        return this.backingStore.get("isEntraAgentId");
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
        writer.writeStringValue("agentAdministrativeUnitId", this.getAgentAdministrativeUnitId());
        writer.writeStringValue("agentBlueprintId", this.getAgentBlueprintId());
        writer.writeStringValue("agentCategory", this.getAgentCategory());
        writer.writeStringValue("agentOwner", this.getAgentOwner());
        writer.writeStringValue("agentPublisher", this.getAgentPublisher());
        writer.writeCollectionOfPrimitiveValues("altAgentIds", this.getAltAgentIds());
        writer.writeBooleanValue("isEntraAgentId", this.getIsEntraAgentId());
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
     * Sets the agentAdministrativeUnitId property value. The agentAdministrativeUnitId property
     * @param value Value to set for the agentAdministrativeUnitId property.
     */
    public void setAgentAdministrativeUnitId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("agentAdministrativeUnitId", value);
    }
    /**
     * Sets the agentBlueprintId property value. The agentBlueprintId property
     * @param value Value to set for the agentBlueprintId property.
     */
    public void setAgentBlueprintId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("agentBlueprintId", value);
    }
    /**
     * Sets the agentCategory property value. The agentCategory property
     * @param value Value to set for the agentCategory property.
     */
    public void setAgentCategory(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("agentCategory", value);
    }
    /**
     * Sets the agentOwner property value. The agentOwner property
     * @param value Value to set for the agentOwner property.
     */
    public void setAgentOwner(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("agentOwner", value);
    }
    /**
     * Sets the agentPublisher property value. The agentPublisher property
     * @param value Value to set for the agentPublisher property.
     */
    public void setAgentPublisher(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("agentPublisher", value);
    }
    /**
     * Sets the altAgentIds property value. The altAgentIds property
     * @param value Value to set for the altAgentIds property.
     */
    public void setAltAgentIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("altAgentIds", value);
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
     * Sets the isEntraAgentId property value. The isEntraAgentId property
     * @param value Value to set for the isEntraAgentId property.
     */
    public void setIsEntraAgentId(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isEntraAgentId", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
}
