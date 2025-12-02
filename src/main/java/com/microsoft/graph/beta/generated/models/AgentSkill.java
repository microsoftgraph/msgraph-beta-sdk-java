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
public class AgentSkill implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link AgentSkill} and sets the default values.
     */
    public AgentSkill() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AgentSkill}
     */
    @jakarta.annotation.Nonnull
    public static AgentSkill createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AgentSkill();
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
     * Gets the description property value. A detailed description of the skill, intended to help clients or users understand its purpose and functionality.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * Gets the displayName property value. A human-readable name for the skill.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * Gets the examples property value. Example prompts or scenarios that this skill can handle. Provides a hint to the client on how to use the skill.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getExamples() {
        return this.backingStore.get("examples");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(9);
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("examples", (n) -> { this.setExamples(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("inputModes", (n) -> { this.setInputModes(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("outputModes", (n) -> { this.setOutputModes(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("security", (n) -> { this.setSecurity(n.getCollectionOfObjectValues(SecurityRequirement::createFromDiscriminatorValue)); });
        deserializerMap.put("tags", (n) -> { this.setTags(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the id property value. A unique identifier for the agent&apos;s skill.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getId() {
        return this.backingStore.get("id");
    }
    /**
     * Gets the inputModes property value. The set of supported input MIME types for this skill, overriding the agent&apos;s defaults.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getInputModes() {
        return this.backingStore.get("inputModes");
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
     * Gets the outputModes property value. The set of supported output MIME types for this skill, overriding the agent&apos;s defaults.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getOutputModes() {
        return this.backingStore.get("outputModes");
    }
    /**
     * Gets the security property value. Security schemes necessary for the agent to leverage this skill.
     * @return a {@link java.util.List<SecurityRequirement>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<SecurityRequirement> getSecurity() {
        return this.backingStore.get("security");
    }
    /**
     * Gets the tags property value. A set of keywords describing the skill&apos;s capabilities.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getTags() {
        return this.backingStore.get("tags");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeCollectionOfPrimitiveValues("examples", this.getExamples());
        writer.writeStringValue("id", this.getId());
        writer.writeCollectionOfPrimitiveValues("inputModes", this.getInputModes());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeCollectionOfPrimitiveValues("outputModes", this.getOutputModes());
        writer.writeCollectionOfObjectValues("security", this.getSecurity());
        writer.writeCollectionOfPrimitiveValues("tags", this.getTags());
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
     * Sets the description property value. A detailed description of the skill, intended to help clients or users understand its purpose and functionality.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the displayName property value. A human-readable name for the skill.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the examples property value. Example prompts or scenarios that this skill can handle. Provides a hint to the client on how to use the skill.
     * @param value Value to set for the examples property.
     */
    public void setExamples(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("examples", value);
    }
    /**
     * Sets the id property value. A unique identifier for the agent&apos;s skill.
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("id", value);
    }
    /**
     * Sets the inputModes property value. The set of supported input MIME types for this skill, overriding the agent&apos;s defaults.
     * @param value Value to set for the inputModes property.
     */
    public void setInputModes(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("inputModes", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the outputModes property value. The set of supported output MIME types for this skill, overriding the agent&apos;s defaults.
     * @param value Value to set for the outputModes property.
     */
    public void setOutputModes(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("outputModes", value);
    }
    /**
     * Sets the security property value. Security schemes necessary for the agent to leverage this skill.
     * @param value Value to set for the security property.
     */
    public void setSecurity(@jakarta.annotation.Nullable final java.util.List<SecurityRequirement> value) {
        this.backingStore.set("security", value);
    }
    /**
     * Sets the tags property value. A set of keywords describing the skill&apos;s capabilities.
     * @param value Value to set for the tags property.
     */
    public void setTags(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("tags", value);
    }
}
