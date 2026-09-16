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
public class ConditionalAccessAgents implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link ConditionalAccessAgents} and sets the default values.
     */
    public ConditionalAccessAgents() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ConditionalAccessAgents}
     */
    @jakarta.annotation.Nonnull
    public static ConditionalAccessAgents createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ConditionalAccessAgents();
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
     * Gets the agentFilter property value. The agentFilter property
     * @return a {@link ConditionalAccessFilter}
     */
    @jakarta.annotation.Nullable
    public ConditionalAccessFilter getAgentFilter() {
        return this.backingStore.get("agentFilter");
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
     * Gets the excludeAgentUsers property value. The excludeAgentUsers property
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getExcludeAgentUsers() {
        return this.backingStore.get("excludeAgentUsers");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("agentFilter", (n) -> { this.setAgentFilter(n.getObjectValue(ConditionalAccessFilter::createFromDiscriminatorValue)); });
        deserializerMap.put("excludeAgentUsers", (n) -> { this.setExcludeAgentUsers(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("includeAgentUsers", (n) -> { this.setIncludeAgentUsers(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the includeAgentUsers property value. The includeAgentUsers property
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getIncludeAgentUsers() {
        return this.backingStore.get("includeAgentUsers");
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
        writer.writeObjectValue("agentFilter", this.getAgentFilter());
        writer.writeCollectionOfPrimitiveValues("excludeAgentUsers", this.getExcludeAgentUsers());
        writer.writeCollectionOfPrimitiveValues("includeAgentUsers", this.getIncludeAgentUsers());
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
     * Sets the agentFilter property value. The agentFilter property
     * @param value Value to set for the agentFilter property.
     */
    public void setAgentFilter(@jakarta.annotation.Nullable final ConditionalAccessFilter value) {
        this.backingStore.set("agentFilter", value);
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
     * Sets the excludeAgentUsers property value. The excludeAgentUsers property
     * @param value Value to set for the excludeAgentUsers property.
     */
    public void setExcludeAgentUsers(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("excludeAgentUsers", value);
    }
    /**
     * Sets the includeAgentUsers property value. The includeAgentUsers property
     * @param value Value to set for the includeAgentUsers property.
     */
    public void setIncludeAgentUsers(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("includeAgentUsers", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
}
