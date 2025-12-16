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
public class CloudPcConnection extends Entity implements Parsable {
    /**
     * Instantiates a new {@link CloudPcConnection} and sets the default values.
     */
    public CloudPcConnection() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CloudPcConnection}
     */
    @jakarta.annotation.Nonnull
    public static CloudPcConnection createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CloudPcConnection();
    }
    /**
     * Gets the displayName property value. The display name of the cloud PC connection. Required. Read-only.
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
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("healthCheckStatus", (n) -> { this.setHealthCheckStatus(n.getStringValue()); });
        deserializerMap.put("lastRefreshedDateTime", (n) -> { this.setLastRefreshedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("tenantDisplayName", (n) -> { this.setTenantDisplayName(n.getStringValue()); });
        deserializerMap.put("tenantId", (n) -> { this.setTenantId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the healthCheckStatus property value. The health status of the cloud PC connection. The possible values are: pending, running, passed, failed, unknownFutureValue.  Required. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getHealthCheckStatus() {
        return this.backingStore.get("healthCheckStatus");
    }
    /**
     * Gets the lastRefreshedDateTime property value. Date and time the entity was last updated in the multi-tenant management platform. Required. Read-only.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastRefreshedDateTime() {
        return this.backingStore.get("lastRefreshedDateTime");
    }
    /**
     * Gets the tenantDisplayName property value. The display name for the managed tenant. Required. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTenantDisplayName() {
        return this.backingStore.get("tenantDisplayName");
    }
    /**
     * Gets the tenantId property value. The Microsoft Entra tenant identifier for the managed tenant. Required. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTenantId() {
        return this.backingStore.get("tenantId");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("healthCheckStatus", this.getHealthCheckStatus());
        writer.writeOffsetDateTimeValue("lastRefreshedDateTime", this.getLastRefreshedDateTime());
        writer.writeStringValue("tenantDisplayName", this.getTenantDisplayName());
        writer.writeStringValue("tenantId", this.getTenantId());
    }
    /**
     * Sets the displayName property value. The display name of the cloud PC connection. Required. Read-only.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the healthCheckStatus property value. The health status of the cloud PC connection. The possible values are: pending, running, passed, failed, unknownFutureValue.  Required. Read-only.
     * @param value Value to set for the healthCheckStatus property.
     */
    public void setHealthCheckStatus(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("healthCheckStatus", value);
    }
    /**
     * Sets the lastRefreshedDateTime property value. Date and time the entity was last updated in the multi-tenant management platform. Required. Read-only.
     * @param value Value to set for the lastRefreshedDateTime property.
     */
    public void setLastRefreshedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastRefreshedDateTime", value);
    }
    /**
     * Sets the tenantDisplayName property value. The display name for the managed tenant. Required. Read-only.
     * @param value Value to set for the tenantDisplayName property.
     */
    public void setTenantDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("tenantDisplayName", value);
    }
    /**
     * Sets the tenantId property value. The Microsoft Entra tenant identifier for the managed tenant. Required. Read-only.
     * @param value Value to set for the tenantId property.
     */
    public void setTenantId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("tenantId", value);
    }
}
