package com.microsoft.graph.beta.models.networkaccess;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ThreatIntelligenceRule extends PolicyRule implements Parsable {
    /**
     * Instantiates a new {@link ThreatIntelligenceRule} and sets the default values.
     */
    public ThreatIntelligenceRule() {
        super();
        this.setOdataType("#microsoft.graph.networkaccess.threatIntelligenceRule");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ThreatIntelligenceRule}
     */
    @jakarta.annotation.Nonnull
    public static ThreatIntelligenceRule createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ThreatIntelligenceRule();
    }
    /**
     * Gets the action property value. The action property
     * @return a {@link ThreatIntelligenceAction}
     */
    @jakarta.annotation.Nullable
    public ThreatIntelligenceAction getAction() {
        return this.backingStore.get("action");
    }
    /**
     * Gets the description property value. The description property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("action", (n) -> { this.setAction(n.getEnumValue(ThreatIntelligenceAction::forValue)); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("matchingConditions", (n) -> { this.setMatchingConditions(n.getObjectValue(ThreatIntelligenceMatchingConditions::createFromDiscriminatorValue)); });
        deserializerMap.put("priority", (n) -> { this.setPriority(n.getLongValue()); });
        deserializerMap.put("settings", (n) -> { this.setSettings(n.getObjectValue(ThreatIntelligenceRuleSettings::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the matchingConditions property value. The matchingConditions property
     * @return a {@link ThreatIntelligenceMatchingConditions}
     */
    @jakarta.annotation.Nullable
    public ThreatIntelligenceMatchingConditions getMatchingConditions() {
        return this.backingStore.get("matchingConditions");
    }
    /**
     * Gets the priority property value. The priority property
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getPriority() {
        return this.backingStore.get("priority");
    }
    /**
     * Gets the settings property value. The settings property
     * @return a {@link ThreatIntelligenceRuleSettings}
     */
    @jakarta.annotation.Nullable
    public ThreatIntelligenceRuleSettings getSettings() {
        return this.backingStore.get("settings");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("action", this.getAction());
        writer.writeStringValue("description", this.getDescription());
        writer.writeObjectValue("matchingConditions", this.getMatchingConditions());
        writer.writeLongValue("priority", this.getPriority());
        writer.writeObjectValue("settings", this.getSettings());
    }
    /**
     * Sets the action property value. The action property
     * @param value Value to set for the action property.
     */
    public void setAction(@jakarta.annotation.Nullable final ThreatIntelligenceAction value) {
        this.backingStore.set("action", value);
    }
    /**
     * Sets the description property value. The description property
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the matchingConditions property value. The matchingConditions property
     * @param value Value to set for the matchingConditions property.
     */
    public void setMatchingConditions(@jakarta.annotation.Nullable final ThreatIntelligenceMatchingConditions value) {
        this.backingStore.set("matchingConditions", value);
    }
    /**
     * Sets the priority property value. The priority property
     * @param value Value to set for the priority property.
     */
    public void setPriority(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("priority", value);
    }
    /**
     * Sets the settings property value. The settings property
     * @param value Value to set for the settings property.
     */
    public void setSettings(@jakarta.annotation.Nullable final ThreatIntelligenceRuleSettings value) {
        this.backingStore.set("settings", value);
    }
}
