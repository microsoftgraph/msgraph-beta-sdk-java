package com.microsoft.graph.beta.models.security;

import com.microsoft.graph.beta.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SensorMigration extends Entity implements Parsable {
    /**
     * Instantiates a new {@link SensorMigration} and sets the default values.
     */
    public SensorMigration() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SensorMigration}
     */
    @jakarta.annotation.Nonnull
    public static SensorMigration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SensorMigration();
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
     * Gets the displayName property value. The displayName property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * Gets the domainName property value. The domainName property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDomainName() {
        return this.backingStore.get("domainName");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("domainName", (n) -> { this.setDomainName(n.getStringValue()); });
        deserializerMap.put("healthStatus", (n) -> { this.setHealthStatus(n.getEnumValue(SensorHealthStatus::forValue)); });
        deserializerMap.put("migrationState", (n) -> { this.setMigrationState(n.getEnumValue(MigrationState::forValue)); });
        deserializerMap.put("sensorType", (n) -> { this.setSensorType(n.getEnumValue(SensorType::forValue)); });
        deserializerMap.put("serviceStatus", (n) -> { this.setServiceStatus(n.getEnumValue(ServiceStatus::forValue)); });
        deserializerMap.put("version", (n) -> { this.setVersion(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the healthStatus property value. The healthStatus property
     * @return a {@link SensorHealthStatus}
     */
    @jakarta.annotation.Nullable
    public SensorHealthStatus getHealthStatus() {
        return this.backingStore.get("healthStatus");
    }
    /**
     * Gets the migrationState property value. The migrationState property
     * @return a {@link MigrationState}
     */
    @jakarta.annotation.Nullable
    public MigrationState getMigrationState() {
        return this.backingStore.get("migrationState");
    }
    /**
     * Gets the sensorType property value. The sensorType property
     * @return a {@link SensorType}
     */
    @jakarta.annotation.Nullable
    public SensorType getSensorType() {
        return this.backingStore.get("sensorType");
    }
    /**
     * Gets the serviceStatus property value. The serviceStatus property
     * @return a {@link ServiceStatus}
     */
    @jakarta.annotation.Nullable
    public ServiceStatus getServiceStatus() {
        return this.backingStore.get("serviceStatus");
    }
    /**
     * Gets the version property value. The version property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getVersion() {
        return this.backingStore.get("version");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("domainName", this.getDomainName());
        writer.writeEnumValue("healthStatus", this.getHealthStatus());
        writer.writeEnumValue("migrationState", this.getMigrationState());
        writer.writeEnumValue("sensorType", this.getSensorType());
        writer.writeEnumValue("serviceStatus", this.getServiceStatus());
        writer.writeStringValue("version", this.getVersion());
    }
    /**
     * Sets the createdDateTime property value. The createdDateTime property
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the displayName property value. The displayName property
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the domainName property value. The domainName property
     * @param value Value to set for the domainName property.
     */
    public void setDomainName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("domainName", value);
    }
    /**
     * Sets the healthStatus property value. The healthStatus property
     * @param value Value to set for the healthStatus property.
     */
    public void setHealthStatus(@jakarta.annotation.Nullable final SensorHealthStatus value) {
        this.backingStore.set("healthStatus", value);
    }
    /**
     * Sets the migrationState property value. The migrationState property
     * @param value Value to set for the migrationState property.
     */
    public void setMigrationState(@jakarta.annotation.Nullable final MigrationState value) {
        this.backingStore.set("migrationState", value);
    }
    /**
     * Sets the sensorType property value. The sensorType property
     * @param value Value to set for the sensorType property.
     */
    public void setSensorType(@jakarta.annotation.Nullable final SensorType value) {
        this.backingStore.set("sensorType", value);
    }
    /**
     * Sets the serviceStatus property value. The serviceStatus property
     * @param value Value to set for the serviceStatus property.
     */
    public void setServiceStatus(@jakarta.annotation.Nullable final ServiceStatus value) {
        this.backingStore.set("serviceStatus", value);
    }
    /**
     * Sets the version property value. The version property
     * @param value Value to set for the version property.
     */
    public void setVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("version", value);
    }
}
