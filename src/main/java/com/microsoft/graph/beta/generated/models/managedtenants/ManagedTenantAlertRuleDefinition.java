package com.microsoft.graph.beta.models.managedtenants;

import com.microsoft.graph.beta.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ManagedTenantAlertRuleDefinition extends Entity implements Parsable {
    /**
     * Instantiates a new {@link ManagedTenantAlertRuleDefinition} and sets the default values.
     */
    public ManagedTenantAlertRuleDefinition() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ManagedTenantAlertRuleDefinition}
     */
    @jakarta.annotation.Nonnull
    public static ManagedTenantAlertRuleDefinition createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ManagedTenantAlertRuleDefinition();
    }
    /**
     * Gets the alertRules property value. The alertRules property
     * @return a {@link java.util.List<ManagedTenantAlertRule>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ManagedTenantAlertRule> getAlertRules() {
        return this.backingStore.get("alertRules");
    }
    /**
     * Gets the createdByUserId property value. The createdByUserId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCreatedByUserId() {
        return this.backingStore.get("createdByUserId");
    }
    /**
     * Gets the createdDateTime property value. The createdDateTime property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * Gets the definitionTemplate property value. The definitionTemplate property
     * @return a {@link AlertRuleDefinitionTemplate}
     */
    @jakarta.annotation.Nullable
    public AlertRuleDefinitionTemplate getDefinitionTemplate() {
        return this.backingStore.get("definitionTemplate");
    }
    /**
     * Gets the displayName property value. The displayName property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("alertRules", (n) -> { this.setAlertRules(n.getCollectionOfObjectValues(ManagedTenantAlertRule::createFromDiscriminatorValue)); });
        deserializerMap.put("createdByUserId", (n) -> { this.setCreatedByUserId(n.getStringValue()); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("definitionTemplate", (n) -> { this.setDefinitionTemplate(n.getObjectValue(AlertRuleDefinitionTemplate::createFromDiscriminatorValue)); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("lastActionByUserId", (n) -> { this.setLastActionByUserId(n.getStringValue()); });
        deserializerMap.put("lastActionDateTime", (n) -> { this.setLastActionDateTime(n.getOffsetDateTimeValue()); });
        return deserializerMap;
    }
    /**
     * Gets the lastActionByUserId property value. The lastActionByUserId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLastActionByUserId() {
        return this.backingStore.get("lastActionByUserId");
    }
    /**
     * Gets the lastActionDateTime property value. The lastActionDateTime property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastActionDateTime() {
        return this.backingStore.get("lastActionDateTime");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("alertRules", this.getAlertRules());
        writer.writeStringValue("createdByUserId", this.getCreatedByUserId());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeObjectValue("definitionTemplate", this.getDefinitionTemplate());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("lastActionByUserId", this.getLastActionByUserId());
        writer.writeOffsetDateTimeValue("lastActionDateTime", this.getLastActionDateTime());
    }
    /**
     * Sets the alertRules property value. The alertRules property
     * @param value Value to set for the alertRules property.
     */
    public void setAlertRules(@jakarta.annotation.Nullable final java.util.List<ManagedTenantAlertRule> value) {
        this.backingStore.set("alertRules", value);
    }
    /**
     * Sets the createdByUserId property value. The createdByUserId property
     * @param value Value to set for the createdByUserId property.
     */
    public void setCreatedByUserId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("createdByUserId", value);
    }
    /**
     * Sets the createdDateTime property value. The createdDateTime property
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the definitionTemplate property value. The definitionTemplate property
     * @param value Value to set for the definitionTemplate property.
     */
    public void setDefinitionTemplate(@jakarta.annotation.Nullable final AlertRuleDefinitionTemplate value) {
        this.backingStore.set("definitionTemplate", value);
    }
    /**
     * Sets the displayName property value. The displayName property
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the lastActionByUserId property value. The lastActionByUserId property
     * @param value Value to set for the lastActionByUserId property.
     */
    public void setLastActionByUserId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("lastActionByUserId", value);
    }
    /**
     * Sets the lastActionDateTime property value. The lastActionDateTime property
     * @param value Value to set for the lastActionDateTime property.
     */
    public void setLastActionDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastActionDateTime", value);
    }
}
