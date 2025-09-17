package com.microsoft.graph.beta.models.networkaccess;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TlsInspectionRule extends PolicyRule implements Parsable {
    /**
     * Instantiates a new {@link TlsInspectionRule} and sets the default values.
     */
    public TlsInspectionRule() {
        super();
        this.setOdataType("#microsoft.graph.networkaccess.tlsInspectionRule");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link TlsInspectionRule}
     */
    @jakarta.annotation.Nonnull
    public static TlsInspectionRule createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TlsInspectionRule();
    }
    /**
     * Gets the description property value. Optional description explaining the purpose of the rule.
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
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("matchingConditions", (n) -> { this.setMatchingConditions(n.getObjectValue(TlsInspectionMatchingConditions::createFromDiscriminatorValue)); });
        deserializerMap.put("priority", (n) -> { this.setPriority(n.getLongValue()); });
        deserializerMap.put("settings", (n) -> { this.setSettings(n.getObjectValue(TlsInspectionRuleSettings::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the matchingConditions property value. The conditions that determine when this rule should be applied to traffic.
     * @return a {@link TlsInspectionMatchingConditions}
     */
    @jakarta.annotation.Nullable
    public TlsInspectionMatchingConditions getMatchingConditions() {
        return this.backingStore.get("matchingConditions");
    }
    /**
     * Gets the priority property value. The priority of the rule. Rules are evaluated in ascending order of priority. Lower numbers indicate higher priority. Supports $filter (eq, ne, not, ge, le, in) and $orderby.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getPriority() {
        return this.backingStore.get("priority");
    }
    /**
     * Gets the settings property value. The settings property
     * @return a {@link TlsInspectionRuleSettings}
     */
    @jakarta.annotation.Nullable
    public TlsInspectionRuleSettings getSettings() {
        return this.backingStore.get("settings");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("description", this.getDescription());
        writer.writeObjectValue("matchingConditions", this.getMatchingConditions());
        writer.writeLongValue("priority", this.getPriority());
        writer.writeObjectValue("settings", this.getSettings());
    }
    /**
     * Sets the description property value. Optional description explaining the purpose of the rule.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the matchingConditions property value. The conditions that determine when this rule should be applied to traffic.
     * @param value Value to set for the matchingConditions property.
     */
    public void setMatchingConditions(@jakarta.annotation.Nullable final TlsInspectionMatchingConditions value) {
        this.backingStore.set("matchingConditions", value);
    }
    /**
     * Sets the priority property value. The priority of the rule. Rules are evaluated in ascending order of priority. Lower numbers indicate higher priority. Supports $filter (eq, ne, not, ge, le, in) and $orderby.
     * @param value Value to set for the priority property.
     */
    public void setPriority(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("priority", value);
    }
    /**
     * Sets the settings property value. The settings property
     * @param value Value to set for the settings property.
     */
    public void setSettings(@jakarta.annotation.Nullable final TlsInspectionRuleSettings value) {
        this.backingStore.set("settings", value);
    }
}
