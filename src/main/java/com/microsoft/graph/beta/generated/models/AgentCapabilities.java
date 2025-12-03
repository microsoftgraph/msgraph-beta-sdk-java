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
public class AgentCapabilities implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link AgentCapabilities} and sets the default values.
     */
    public AgentCapabilities() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AgentCapabilities}
     */
    @jakarta.annotation.Nonnull
    public static AgentCapabilities createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AgentCapabilities();
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
     * Gets the extensions property value. A list of protocol extensions supported by the agent.
     * @return a {@link java.util.List<AgentExtension>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AgentExtension> getExtensions() {
        return this.backingStore.get("extensions");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("extensions", (n) -> { this.setExtensions(n.getCollectionOfObjectValues(AgentExtension::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("pushNotifications", (n) -> { this.setPushNotifications(n.getBooleanValue()); });
        deserializerMap.put("stateTransitionHistory", (n) -> { this.setStateTransitionHistory(n.getBooleanValue()); });
        deserializerMap.put("streaming", (n) -> { this.setStreaming(n.getBooleanValue()); });
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
     * Gets the pushNotifications property value. Indicates if the agent supports sending push notifications for asynchronous task updates.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getPushNotifications() {
        return this.backingStore.get("pushNotifications");
    }
    /**
     * Gets the stateTransitionHistory property value. Indicates if the agent provides a history of state transitions for a task.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getStateTransitionHistory() {
        return this.backingStore.get("stateTransitionHistory");
    }
    /**
     * Gets the streaming property value. Indicates if the agent supports Server-Sent Events (SSE) for streaming responses.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getStreaming() {
        return this.backingStore.get("streaming");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("extensions", this.getExtensions());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeBooleanValue("pushNotifications", this.getPushNotifications());
        writer.writeBooleanValue("stateTransitionHistory", this.getStateTransitionHistory());
        writer.writeBooleanValue("streaming", this.getStreaming());
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
     * Sets the extensions property value. A list of protocol extensions supported by the agent.
     * @param value Value to set for the extensions property.
     */
    public void setExtensions(@jakarta.annotation.Nullable final java.util.List<AgentExtension> value) {
        this.backingStore.set("extensions", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the pushNotifications property value. Indicates if the agent supports sending push notifications for asynchronous task updates.
     * @param value Value to set for the pushNotifications property.
     */
    public void setPushNotifications(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("pushNotifications", value);
    }
    /**
     * Sets the stateTransitionHistory property value. Indicates if the agent provides a history of state transitions for a task.
     * @param value Value to set for the stateTransitionHistory property.
     */
    public void setStateTransitionHistory(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("stateTransitionHistory", value);
    }
    /**
     * Sets the streaming property value. Indicates if the agent supports Server-Sent Events (SSE) for streaming responses.
     * @param value Value to set for the streaming property.
     */
    public void setStreaming(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("streaming", value);
    }
}
