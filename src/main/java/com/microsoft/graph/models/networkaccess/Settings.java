package com.microsoft.graph.models.networkaccess;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Settings extends Entity implements Parsable {
    /**
     * The conditionalAccess property
     */
    private ConditionalAccessSettings conditionalAccess;
    /**
     * The crossTenantAccess property
     */
    private CrossTenantAccessSettings crossTenantAccess;
    /**
     * The enrichedAuditLogs property
     */
    private EnrichedAuditLogs enrichedAuditLogs;
    /**
     * The forwardingOptions property
     */
    private ForwardingOptions forwardingOptions;
    /**
     * Instantiates a new settings and sets the default values.
     */
    public Settings() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a settings
     */
    @jakarta.annotation.Nonnull
    public static Settings createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Settings();
    }
    /**
     * Gets the conditionalAccess property value. The conditionalAccess property
     * @return a conditionalAccessSettings
     */
    @jakarta.annotation.Nullable
    public ConditionalAccessSettings getConditionalAccess() {
        return this.conditionalAccess;
    }
    /**
     * Gets the crossTenantAccess property value. The crossTenantAccess property
     * @return a crossTenantAccessSettings
     */
    @jakarta.annotation.Nullable
    public CrossTenantAccessSettings getCrossTenantAccess() {
        return this.crossTenantAccess;
    }
    /**
     * Gets the enrichedAuditLogs property value. The enrichedAuditLogs property
     * @return a enrichedAuditLogs
     */
    @jakarta.annotation.Nullable
    public EnrichedAuditLogs getEnrichedAuditLogs() {
        return this.enrichedAuditLogs;
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
     * @return a forwardingOptions
     */
    @jakarta.annotation.Nullable
    public ForwardingOptions getForwardingOptions() {
        return this.forwardingOptions;
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
        this.conditionalAccess = value;
    }
    /**
     * Sets the crossTenantAccess property value. The crossTenantAccess property
     * @param value Value to set for the crossTenantAccess property.
     */
    public void setCrossTenantAccess(@jakarta.annotation.Nullable final CrossTenantAccessSettings value) {
        this.crossTenantAccess = value;
    }
    /**
     * Sets the enrichedAuditLogs property value. The enrichedAuditLogs property
     * @param value Value to set for the enrichedAuditLogs property.
     */
    public void setEnrichedAuditLogs(@jakarta.annotation.Nullable final EnrichedAuditLogs value) {
        this.enrichedAuditLogs = value;
    }
    /**
     * Sets the forwardingOptions property value. The forwardingOptions property
     * @param value Value to set for the forwardingOptions property.
     */
    public void setForwardingOptions(@jakarta.annotation.Nullable final ForwardingOptions value) {
        this.forwardingOptions = value;
    }
}
