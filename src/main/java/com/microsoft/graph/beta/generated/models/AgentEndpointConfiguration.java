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
public class AgentEndpointConfiguration implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link AgentEndpointConfiguration} and sets the default values.
     */
    public AgentEndpointConfiguration() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AgentEndpointConfiguration}
     */
    @jakarta.annotation.Nonnull
    public static AgentEndpointConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AgentEndpointConfiguration();
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
     * Gets the apiBased property value. The API-based endpoint details. Populated when configurationType is apiBased; carries the callback URI that Teams posts to. Must be null when configurationType is botBased.
     * @return a {@link AgentBlueprintApiBasedEndpointConfigurationDetails}
     */
    @jakarta.annotation.Nullable
    public AgentBlueprintApiBasedEndpointConfigurationDetails getApiBased() {
        return this.backingStore.get("apiBased");
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
     * Gets the botBased property value. The bot-based endpoint details. Populated when configurationType is botBased; carries the bot ID that Teams messages. Must be null when configurationType is apiBased.
     * @return a {@link AgentBlueprintBotBasedEndpointConfigurationDetails}
     */
    @jakarta.annotation.Nullable
    public AgentBlueprintBotBasedEndpointConfigurationDetails getBotBased() {
        return this.backingStore.get("botBased");
    }
    /**
     * Gets the configurationType property value. The configurationType property
     * @return a {@link AgentEndpointConfigurationType}
     */
    @jakarta.annotation.Nullable
    public AgentEndpointConfigurationType getConfigurationType() {
        return this.backingStore.get("configurationType");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("apiBased", (n) -> { this.setApiBased(n.getObjectValue(AgentBlueprintApiBasedEndpointConfigurationDetails::createFromDiscriminatorValue)); });
        deserializerMap.put("botBased", (n) -> { this.setBotBased(n.getObjectValue(AgentBlueprintBotBasedEndpointConfigurationDetails::createFromDiscriminatorValue)); });
        deserializerMap.put("configurationType", (n) -> { this.setConfigurationType(n.getEnumValue(AgentEndpointConfigurationType::forValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
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
        writer.writeObjectValue("apiBased", this.getApiBased());
        writer.writeObjectValue("botBased", this.getBotBased());
        writer.writeEnumValue("configurationType", this.getConfigurationType());
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
     * Sets the apiBased property value. The API-based endpoint details. Populated when configurationType is apiBased; carries the callback URI that Teams posts to. Must be null when configurationType is botBased.
     * @param value Value to set for the apiBased property.
     */
    public void setApiBased(@jakarta.annotation.Nullable final AgentBlueprintApiBasedEndpointConfigurationDetails value) {
        this.backingStore.set("apiBased", value);
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
     * Sets the botBased property value. The bot-based endpoint details. Populated when configurationType is botBased; carries the bot ID that Teams messages. Must be null when configurationType is apiBased.
     * @param value Value to set for the botBased property.
     */
    public void setBotBased(@jakarta.annotation.Nullable final AgentBlueprintBotBasedEndpointConfigurationDetails value) {
        this.backingStore.set("botBased", value);
    }
    /**
     * Sets the configurationType property value. The configurationType property
     * @param value Value to set for the configurationType property.
     */
    public void setConfigurationType(@jakarta.annotation.Nullable final AgentEndpointConfigurationType value) {
        this.backingStore.set("configurationType", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
}
