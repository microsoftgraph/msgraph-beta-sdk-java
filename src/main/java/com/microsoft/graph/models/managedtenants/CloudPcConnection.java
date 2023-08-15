package com.microsoft.graph.models.managedtenants;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class CloudPcConnection extends Entity implements Parsable {
    /**
     * The display name of the cloud PC connection. Required. Read-only.
     */
    private String displayName;
    /**
     * The health status of the cloud PC connection. Possible values are: pending, running, passed, failed, unknownFutureValue.  Required. Read-only.
     */
    private String healthCheckStatus;
    /**
     * Date and time the entity was last updated in the multi-tenant management platform. Required. Read-only.
     */
    private OffsetDateTime lastRefreshedDateTime;
    /**
     * The display name for the managed tenant. Required. Read-only.
     */
    private String tenantDisplayName;
    /**
     * The Azure Active Directory tenant identifier for the managed tenant. Required. Read-only.
     */
    private String tenantId;
    /**
     * Instantiates a new cloudPcConnection and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public CloudPcConnection() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a cloudPcConnection
     */
    @jakarta.annotation.Nonnull
    public static CloudPcConnection createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CloudPcConnection();
    }
    /**
     * Gets the displayName property value. The display name of the cloud PC connection. Required. Read-only.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
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
     * Gets the healthCheckStatus property value. The health status of the cloud PC connection. Possible values are: pending, running, passed, failed, unknownFutureValue.  Required. Read-only.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getHealthCheckStatus() {
        return this.healthCheckStatus;
    }
    /**
     * Gets the lastRefreshedDateTime property value. Date and time the entity was last updated in the multi-tenant management platform. Required. Read-only.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastRefreshedDateTime() {
        return this.lastRefreshedDateTime;
    }
    /**
     * Gets the tenantDisplayName property value. The display name for the managed tenant. Required. Read-only.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getTenantDisplayName() {
        return this.tenantDisplayName;
    }
    /**
     * Gets the tenantId property value. The Azure Active Directory tenant identifier for the managed tenant. Required. Read-only.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getTenantId() {
        return this.tenantId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
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
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the healthCheckStatus property value. The health status of the cloud PC connection. Possible values are: pending, running, passed, failed, unknownFutureValue.  Required. Read-only.
     * @param value Value to set for the healthCheckStatus property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setHealthCheckStatus(@jakarta.annotation.Nullable final String value) {
        this.healthCheckStatus = value;
    }
    /**
     * Sets the lastRefreshedDateTime property value. Date and time the entity was last updated in the multi-tenant management platform. Required. Read-only.
     * @param value Value to set for the lastRefreshedDateTime property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setLastRefreshedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.lastRefreshedDateTime = value;
    }
    /**
     * Sets the tenantDisplayName property value. The display name for the managed tenant. Required. Read-only.
     * @param value Value to set for the tenantDisplayName property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setTenantDisplayName(@jakarta.annotation.Nullable final String value) {
        this.tenantDisplayName = value;
    }
    /**
     * Sets the tenantId property value. The Azure Active Directory tenant identifier for the managed tenant. Required. Read-only.
     * @param value Value to set for the tenantId property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setTenantId(@jakarta.annotation.Nullable final String value) {
        this.tenantId = value;
    }
}
