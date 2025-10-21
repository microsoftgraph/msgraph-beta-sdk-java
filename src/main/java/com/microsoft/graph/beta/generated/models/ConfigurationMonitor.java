package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ConfigurationMonitor extends Entity implements Parsable {
    /**
     * Instantiates a new {@link ConfigurationMonitor} and sets the default values.
     */
    public ConfigurationMonitor() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ConfigurationMonitor}
     */
    @jakarta.annotation.Nonnull
    public static ConfigurationMonitor createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ConfigurationMonitor();
    }
    /**
     * Gets the baseline property value. The baseline property
     * @return a {@link ConfigurationBaseline}
     */
    @jakarta.annotation.Nullable
    public ConfigurationBaseline getBaseline() {
        return this.backingStore.get("baseline");
    }
    /**
     * Gets the createdBy property value. The createdBy property
     * @return a {@link IdentitySet}
     */
    @jakarta.annotation.Nullable
    public IdentitySet getCreatedBy() {
        return this.backingStore.get("createdBy");
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
     * Gets the description property value. The description property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
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
        deserializerMap.put("baseline", (n) -> { this.setBaseline(n.getObjectValue(ConfigurationBaseline::createFromDiscriminatorValue)); });
        deserializerMap.put("createdBy", (n) -> { this.setCreatedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("inactivationReason", (n) -> { this.setInactivationReason(n.getStringValue()); });
        deserializerMap.put("lastModifiedBy", (n) -> { this.setLastModifiedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("mode", (n) -> { this.setMode(n.getEnumValue(MonitorMode::forValue)); });
        deserializerMap.put("monitorRunFrequencyInHours", (n) -> { this.setMonitorRunFrequencyInHours(n.getIntegerValue()); });
        deserializerMap.put("parameters", (n) -> { this.setParameters(n.getObjectValue(OpenComplexDictionaryType::createFromDiscriminatorValue)); });
        deserializerMap.put("runAsUTCMServicePrincipal", (n) -> { this.setRunAsUTCMServicePrincipal(n.getBooleanValue()); });
        deserializerMap.put("runningOnBehalfOf", (n) -> { this.setRunningOnBehalfOf(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(MonitorStatus::forValue)); });
        deserializerMap.put("tenantId", (n) -> { this.setTenantId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the inactivationReason property value. The inactivationReason property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getInactivationReason() {
        return this.backingStore.get("inactivationReason");
    }
    /**
     * Gets the lastModifiedBy property value. The lastModifiedBy property
     * @return a {@link IdentitySet}
     */
    @jakarta.annotation.Nullable
    public IdentitySet getLastModifiedBy() {
        return this.backingStore.get("lastModifiedBy");
    }
    /**
     * Gets the lastModifiedDateTime property value. The lastModifiedDateTime property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.backingStore.get("lastModifiedDateTime");
    }
    /**
     * Gets the mode property value. The mode property
     * @return a {@link MonitorMode}
     */
    @jakarta.annotation.Nullable
    public MonitorMode getMode() {
        return this.backingStore.get("mode");
    }
    /**
     * Gets the monitorRunFrequencyInHours property value. The monitorRunFrequencyInHours property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getMonitorRunFrequencyInHours() {
        return this.backingStore.get("monitorRunFrequencyInHours");
    }
    /**
     * Gets the parameters property value. The parameters property
     * @return a {@link OpenComplexDictionaryType}
     */
    @jakarta.annotation.Nullable
    public OpenComplexDictionaryType getParameters() {
        return this.backingStore.get("parameters");
    }
    /**
     * Gets the runAsUTCMServicePrincipal property value. The runAsUTCMServicePrincipal property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getRunAsUTCMServicePrincipal() {
        return this.backingStore.get("runAsUTCMServicePrincipal");
    }
    /**
     * Gets the runningOnBehalfOf property value. The runningOnBehalfOf property
     * @return a {@link IdentitySet}
     */
    @jakarta.annotation.Nullable
    public IdentitySet getRunningOnBehalfOf() {
        return this.backingStore.get("runningOnBehalfOf");
    }
    /**
     * Gets the status property value. The status property
     * @return a {@link MonitorStatus}
     */
    @jakarta.annotation.Nullable
    public MonitorStatus getStatus() {
        return this.backingStore.get("status");
    }
    /**
     * Gets the tenantId property value. The tenantId property
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
        writer.writeObjectValue("baseline", this.getBaseline());
        writer.writeObjectValue("createdBy", this.getCreatedBy());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeObjectValue("lastModifiedBy", this.getLastModifiedBy());
        writer.writeEnumValue("mode", this.getMode());
        writer.writeIntegerValue("monitorRunFrequencyInHours", this.getMonitorRunFrequencyInHours());
        writer.writeObjectValue("parameters", this.getParameters());
        writer.writeBooleanValue("runAsUTCMServicePrincipal", this.getRunAsUTCMServicePrincipal());
        writer.writeObjectValue("runningOnBehalfOf", this.getRunningOnBehalfOf());
        writer.writeEnumValue("status", this.getStatus());
    }
    /**
     * Sets the baseline property value. The baseline property
     * @param value Value to set for the baseline property.
     */
    public void setBaseline(@jakarta.annotation.Nullable final ConfigurationBaseline value) {
        this.backingStore.set("baseline", value);
    }
    /**
     * Sets the createdBy property value. The createdBy property
     * @param value Value to set for the createdBy property.
     */
    public void setCreatedBy(@jakarta.annotation.Nullable final IdentitySet value) {
        this.backingStore.set("createdBy", value);
    }
    /**
     * Sets the createdDateTime property value. The createdDateTime property
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the description property value. The description property
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the displayName property value. The displayName property
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the inactivationReason property value. The inactivationReason property
     * @param value Value to set for the inactivationReason property.
     */
    public void setInactivationReason(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("inactivationReason", value);
    }
    /**
     * Sets the lastModifiedBy property value. The lastModifiedBy property
     * @param value Value to set for the lastModifiedBy property.
     */
    public void setLastModifiedBy(@jakarta.annotation.Nullable final IdentitySet value) {
        this.backingStore.set("lastModifiedBy", value);
    }
    /**
     * Sets the lastModifiedDateTime property value. The lastModifiedDateTime property
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastModifiedDateTime", value);
    }
    /**
     * Sets the mode property value. The mode property
     * @param value Value to set for the mode property.
     */
    public void setMode(@jakarta.annotation.Nullable final MonitorMode value) {
        this.backingStore.set("mode", value);
    }
    /**
     * Sets the monitorRunFrequencyInHours property value. The monitorRunFrequencyInHours property
     * @param value Value to set for the monitorRunFrequencyInHours property.
     */
    public void setMonitorRunFrequencyInHours(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("monitorRunFrequencyInHours", value);
    }
    /**
     * Sets the parameters property value. The parameters property
     * @param value Value to set for the parameters property.
     */
    public void setParameters(@jakarta.annotation.Nullable final OpenComplexDictionaryType value) {
        this.backingStore.set("parameters", value);
    }
    /**
     * Sets the runAsUTCMServicePrincipal property value. The runAsUTCMServicePrincipal property
     * @param value Value to set for the runAsUTCMServicePrincipal property.
     */
    public void setRunAsUTCMServicePrincipal(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("runAsUTCMServicePrincipal", value);
    }
    /**
     * Sets the runningOnBehalfOf property value. The runningOnBehalfOf property
     * @param value Value to set for the runningOnBehalfOf property.
     */
    public void setRunningOnBehalfOf(@jakarta.annotation.Nullable final IdentitySet value) {
        this.backingStore.set("runningOnBehalfOf", value);
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final MonitorStatus value) {
        this.backingStore.set("status", value);
    }
    /**
     * Sets the tenantId property value. The tenantId property
     * @param value Value to set for the tenantId property.
     */
    public void setTenantId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("tenantId", value);
    }
}
