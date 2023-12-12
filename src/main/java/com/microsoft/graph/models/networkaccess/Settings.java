package com.microsoft.graph.models.networkaccess;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Settings extends Entity implements Parsable {
    /**
     * Instantiates a new Settings and sets the default values.
     */
    public Settings() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Settings
     */
    @jakarta.annotation.Nonnull
    public static Settings createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Settings();
    }
    /**
     * Gets the conditionalAccess property value. The conditionalAccess property
     * @return a ConditionalAccessSettings
     */
    @jakarta.annotation.Nullable
    public ConditionalAccessSettings getConditionalAccess() {
        return this.backingStore.get("conditionalAccess");
    }
    /**
     * Gets the crossTenantAccess property value. The crossTenantAccess property
     * @return a CrossTenantAccessSettings
     */
    @jakarta.annotation.Nullable
    public CrossTenantAccessSettings getCrossTenantAccess() {
        return this.backingStore.get("crossTenantAccess");
    }
    /**
     * Gets the enrichedAuditLogs property value. The enrichedAuditLogs property
     * @return a EnrichedAuditLogs
     */
    @jakarta.annotation.Nullable
    public EnrichedAuditLogs getEnrichedAuditLogs() {
        return this.backingStore.get("enrichedAuditLogs");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("conditionalAccess", (n) -> { this.setConditionalAccess(n.getObjectValue(ConditionalAccessSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("crossTenantAccess", (n) -> { this.setCrossTenantAccess(n.getObjectValue(CrossTenantAccessSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("enrichedAuditLogs", (n) -> { this.setEnrichedAuditLogs(n.getObjectValue(EnrichedAuditLogs::createFromDiscriminatorValue)); });
        deserializerMap.put("forwardingOptions", (n) -> { this.setForwardingOptions(n.getObjectValue(ForwardingOptions::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the forwardingOptions property value. The forwardingOptions property
     * @return a ForwardingOptions
     */
    @jakarta.annotation.Nullable
    public ForwardingOptions getForwardingOptions() {
        return this.backingStore.get("forwardingOptions");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("conditionalAccess", this.getConditionalAccess());
        writer.writeObjectValue("crossTenantAccess", this.getCrossTenantAccess());
        writer.writeObjectValue("enrichedAuditLogs", this.getEnrichedAuditLogs());
        writer.writeObjectValue("forwardingOptions", this.getForwardingOptions());
    }
    /**
     * Sets the conditionalAccess property value. The conditionalAccess property
     * @param value Value to set for the conditionalAccess property.
     */
    public void setConditionalAccess(@jakarta.annotation.Nullable final ConditionalAccessSettings value) {
        this.backingStore.set("conditionalAccess", value);
    }
    /**
     * Sets the crossTenantAccess property value. The crossTenantAccess property
     * @param value Value to set for the crossTenantAccess property.
     */
    public void setCrossTenantAccess(@jakarta.annotation.Nullable final CrossTenantAccessSettings value) {
        this.backingStore.set("crossTenantAccess", value);
    }
    /**
     * Sets the enrichedAuditLogs property value. The enrichedAuditLogs property
     * @param value Value to set for the enrichedAuditLogs property.
     */
    public void setEnrichedAuditLogs(@jakarta.annotation.Nullable final EnrichedAuditLogs value) {
        this.backingStore.set("enrichedAuditLogs", value);
    }
    /**
     * Sets the forwardingOptions property value. The forwardingOptions property
     * @param value Value to set for the forwardingOptions property.
     */
    public void setForwardingOptions(@jakarta.annotation.Nullable final ForwardingOptions value) {
        this.backingStore.set("forwardingOptions", value);
    }
}
