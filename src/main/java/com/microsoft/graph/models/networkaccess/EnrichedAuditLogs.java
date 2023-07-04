package com.microsoft.graph.models.networkaccess;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class EnrichedAuditLogs extends Entity implements Parsable {
    /**
     * The exchange property
     */
    private EnrichedAuditLogsSettings exchange;
    /**
     * The sharepoint property
     */
    private EnrichedAuditLogsSettings sharepoint;
    /**
     * The teams property
     */
    private EnrichedAuditLogsSettings teams;
    /**
     * Instantiates a new enrichedAuditLogs and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public EnrichedAuditLogs() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a enrichedAuditLogs
     */
    @javax.annotation.Nonnull
    public static EnrichedAuditLogs createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EnrichedAuditLogs();
    }
    /**
     * Gets the exchange property value. The exchange property
     * @return a enrichedAuditLogsSettings
     */
    @javax.annotation.Nullable
    public EnrichedAuditLogsSettings getExchange() {
        return this.exchange;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("exchange", (n) -> { this.setExchange(n.getObjectValue(EnrichedAuditLogsSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("sharepoint", (n) -> { this.setSharepoint(n.getObjectValue(EnrichedAuditLogsSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("teams", (n) -> { this.setTeams(n.getObjectValue(EnrichedAuditLogsSettings::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the sharepoint property value. The sharepoint property
     * @return a enrichedAuditLogsSettings
     */
    @javax.annotation.Nullable
    public EnrichedAuditLogsSettings getSharepoint() {
        return this.sharepoint;
    }
    /**
     * Gets the teams property value. The teams property
     * @return a enrichedAuditLogsSettings
     */
    @javax.annotation.Nullable
    public EnrichedAuditLogsSettings getTeams() {
        return this.teams;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("exchange", this.getExchange());
        writer.writeObjectValue("sharepoint", this.getSharepoint());
        writer.writeObjectValue("teams", this.getTeams());
    }
    /**
     * Sets the exchange property value. The exchange property
     * @param value Value to set for the exchange property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExchange(@javax.annotation.Nullable final EnrichedAuditLogsSettings value) {
        this.exchange = value;
    }
    /**
     * Sets the sharepoint property value. The sharepoint property
     * @param value Value to set for the sharepoint property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSharepoint(@javax.annotation.Nullable final EnrichedAuditLogsSettings value) {
        this.sharepoint = value;
    }
    /**
     * Sets the teams property value. The teams property
     * @param value Value to set for the teams property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTeams(@javax.annotation.Nullable final EnrichedAuditLogsSettings value) {
        this.teams = value;
    }
}
