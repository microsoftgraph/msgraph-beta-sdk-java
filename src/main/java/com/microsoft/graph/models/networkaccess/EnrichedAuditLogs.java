package com.microsoft.graph.models.networkaccess;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EnrichedAuditLogs extends Entity implements Parsable {
    /**
     * Instantiates a new EnrichedAuditLogs and sets the default values.
     */
    public EnrichedAuditLogs() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a EnrichedAuditLogs
     */
    @jakarta.annotation.Nonnull
    public static EnrichedAuditLogs createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EnrichedAuditLogs();
    }
    /**
     * Gets the exchange property value. Exchange Online enriched audit logs settings.
     * @return a EnrichedAuditLogsSettings
     */
    @jakarta.annotation.Nullable
    public EnrichedAuditLogsSettings getExchange() {
        return this.backingStore.get("exchange");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("exchange", (n) -> { this.setExchange(n.getObjectValue(EnrichedAuditLogsSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("sharepoint", (n) -> { this.setSharepoint(n.getObjectValue(EnrichedAuditLogsSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("teams", (n) -> { this.setTeams(n.getObjectValue(EnrichedAuditLogsSettings::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the sharepoint property value. SharePoint Online enriched audit logs settings.
     * @return a EnrichedAuditLogsSettings
     */
    @jakarta.annotation.Nullable
    public EnrichedAuditLogsSettings getSharepoint() {
        return this.backingStore.get("sharepoint");
    }
    /**
     * Gets the teams property value. Teams enriched audit logs settings.
     * @return a EnrichedAuditLogsSettings
     */
    @jakarta.annotation.Nullable
    public EnrichedAuditLogsSettings getTeams() {
        return this.backingStore.get("teams");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("exchange", this.getExchange());
        writer.writeObjectValue("sharepoint", this.getSharepoint());
        writer.writeObjectValue("teams", this.getTeams());
    }
    /**
     * Sets the exchange property value. Exchange Online enriched audit logs settings.
     * @param value Value to set for the exchange property.
     */
    public void setExchange(@jakarta.annotation.Nullable final EnrichedAuditLogsSettings value) {
        this.backingStore.set("exchange", value);
    }
    /**
     * Sets the sharepoint property value. SharePoint Online enriched audit logs settings.
     * @param value Value to set for the sharepoint property.
     */
    public void setSharepoint(@jakarta.annotation.Nullable final EnrichedAuditLogsSettings value) {
        this.backingStore.set("sharepoint", value);
    }
    /**
     * Sets the teams property value. Teams enriched audit logs settings.
     * @param value Value to set for the teams property.
     */
    public void setTeams(@jakarta.annotation.Nullable final EnrichedAuditLogsSettings value) {
        this.backingStore.set("teams", value);
    }
}
