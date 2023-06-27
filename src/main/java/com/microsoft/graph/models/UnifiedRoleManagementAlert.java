package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class UnifiedRoleManagementAlert extends Entity implements Parsable {
    /**
     * The configuration of the alert in PIM for Azure AD roles. Alert configurations are pre-defined and cannot be created or deleted, but some configurations can be modified. Supports $expand.
     */
    private UnifiedRoleManagementAlertConfiguration alertConfiguration;
    /**
     * Contains the description, impact, and measures to mitigate or prevent the security alert from being triggered in your tenant. Supports $expand.
     */
    private UnifiedRoleManagementAlertDefinition alertDefinition;
    /**
     * The identifier of an alert definition. Supports $filter (eq, ne).
     */
    private String alertDefinitionId;
    /**
     * Represents the incidents of this alert that have been triggered in Privileged Identity Management (PIM) for Azure AD roles in the tenant. Supports $expand.
     */
    private java.util.List<UnifiedRoleManagementAlertIncident> alertIncidents;
    /**
     * The number of incidents triggered in the tenant and relating to the alert. Can only be a positive integer.
     */
    private Integer incidentCount;
    /**
     * false by default. true if the alert is active.
     */
    private Boolean isActive;
    /**
     * The date time when the alert configuration was updated or new incidents generated.
     */
    private OffsetDateTime lastModifiedDateTime;
    /**
     * The date time when the tenant was last scanned for incidents that trigger this alert.
     */
    private OffsetDateTime lastScannedDateTime;
    /**
     * The identifier of the scope where the alert is related. / is the only supported one for the tenant. Supports $filter (eq, ne).
     */
    private String scopeId;
    /**
     * The type of scope where the alert is created. DirectoryRole is the only currently supported scope type for Azure AD roles.
     */
    private String scopeType;
    /**
     * Instantiates a new unifiedRoleManagementAlert and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public UnifiedRoleManagementAlert() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a unifiedRoleManagementAlert
     */
    @javax.annotation.Nonnull
    public static UnifiedRoleManagementAlert createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UnifiedRoleManagementAlert();
    }
    /**
     * Gets the alertConfiguration property value. The configuration of the alert in PIM for Azure AD roles. Alert configurations are pre-defined and cannot be created or deleted, but some configurations can be modified. Supports $expand.
     * @return a unifiedRoleManagementAlertConfiguration
     */
    @javax.annotation.Nullable
    public UnifiedRoleManagementAlertConfiguration getAlertConfiguration() {
        return this.alertConfiguration;
    }
    /**
     * Gets the alertDefinition property value. Contains the description, impact, and measures to mitigate or prevent the security alert from being triggered in your tenant. Supports $expand.
     * @return a unifiedRoleManagementAlertDefinition
     */
    @javax.annotation.Nullable
    public UnifiedRoleManagementAlertDefinition getAlertDefinition() {
        return this.alertDefinition;
    }
    /**
     * Gets the alertDefinitionId property value. The identifier of an alert definition. Supports $filter (eq, ne).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAlertDefinitionId() {
        return this.alertDefinitionId;
    }
    /**
     * Gets the alertIncidents property value. Represents the incidents of this alert that have been triggered in Privileged Identity Management (PIM) for Azure AD roles in the tenant. Supports $expand.
     * @return a unifiedRoleManagementAlertIncident
     */
    @javax.annotation.Nullable
    public java.util.List<UnifiedRoleManagementAlertIncident> getAlertIncidents() {
        return this.alertIncidents;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("alertConfiguration", (n) -> { this.setAlertConfiguration(n.getObjectValue(UnifiedRoleManagementAlertConfiguration::createFromDiscriminatorValue)); });
        deserializerMap.put("alertDefinition", (n) -> { this.setAlertDefinition(n.getObjectValue(UnifiedRoleManagementAlertDefinition::createFromDiscriminatorValue)); });
        deserializerMap.put("alertDefinitionId", (n) -> { this.setAlertDefinitionId(n.getStringValue()); });
        deserializerMap.put("alertIncidents", (n) -> { this.setAlertIncidents(n.getCollectionOfObjectValues(UnifiedRoleManagementAlertIncident::createFromDiscriminatorValue)); });
        deserializerMap.put("incidentCount", (n) -> { this.setIncidentCount(n.getIntegerValue()); });
        deserializerMap.put("isActive", (n) -> { this.setIsActive(n.getBooleanValue()); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("lastScannedDateTime", (n) -> { this.setLastScannedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("scopeId", (n) -> { this.setScopeId(n.getStringValue()); });
        deserializerMap.put("scopeType", (n) -> { this.setScopeType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the incidentCount property value. The number of incidents triggered in the tenant and relating to the alert. Can only be a positive integer.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getIncidentCount() {
        return this.incidentCount;
    }
    /**
     * Gets the isActive property value. false by default. true if the alert is active.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsActive() {
        return this.isActive;
    }
    /**
     * Gets the lastModifiedDateTime property value. The date time when the alert configuration was updated or new incidents generated.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.lastModifiedDateTime;
    }
    /**
     * Gets the lastScannedDateTime property value. The date time when the tenant was last scanned for incidents that trigger this alert.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastScannedDateTime() {
        return this.lastScannedDateTime;
    }
    /**
     * Gets the scopeId property value. The identifier of the scope where the alert is related. / is the only supported one for the tenant. Supports $filter (eq, ne).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getScopeId() {
        return this.scopeId;
    }
    /**
     * Gets the scopeType property value. The type of scope where the alert is created. DirectoryRole is the only currently supported scope type for Azure AD roles.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getScopeType() {
        return this.scopeType;
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
        writer.writeObjectValue("alertConfiguration", this.getAlertConfiguration());
        writer.writeObjectValue("alertDefinition", this.getAlertDefinition());
        writer.writeStringValue("alertDefinitionId", this.getAlertDefinitionId());
        writer.writeCollectionOfObjectValues("alertIncidents", this.getAlertIncidents());
        writer.writeIntegerValue("incidentCount", this.getIncidentCount());
        writer.writeBooleanValue("isActive", this.getIsActive());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeOffsetDateTimeValue("lastScannedDateTime", this.getLastScannedDateTime());
        writer.writeStringValue("scopeId", this.getScopeId());
        writer.writeStringValue("scopeType", this.getScopeType());
    }
    /**
     * Sets the alertConfiguration property value. The configuration of the alert in PIM for Azure AD roles. Alert configurations are pre-defined and cannot be created or deleted, but some configurations can be modified. Supports $expand.
     * @param value Value to set for the alertConfiguration property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAlertConfiguration(@javax.annotation.Nullable final UnifiedRoleManagementAlertConfiguration value) {
        this.alertConfiguration = value;
    }
    /**
     * Sets the alertDefinition property value. Contains the description, impact, and measures to mitigate or prevent the security alert from being triggered in your tenant. Supports $expand.
     * @param value Value to set for the alertDefinition property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAlertDefinition(@javax.annotation.Nullable final UnifiedRoleManagementAlertDefinition value) {
        this.alertDefinition = value;
    }
    /**
     * Sets the alertDefinitionId property value. The identifier of an alert definition. Supports $filter (eq, ne).
     * @param value Value to set for the alertDefinitionId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAlertDefinitionId(@javax.annotation.Nullable final String value) {
        this.alertDefinitionId = value;
    }
    /**
     * Sets the alertIncidents property value. Represents the incidents of this alert that have been triggered in Privileged Identity Management (PIM) for Azure AD roles in the tenant. Supports $expand.
     * @param value Value to set for the alertIncidents property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAlertIncidents(@javax.annotation.Nullable final java.util.List<UnifiedRoleManagementAlertIncident> value) {
        this.alertIncidents = value;
    }
    /**
     * Sets the incidentCount property value. The number of incidents triggered in the tenant and relating to the alert. Can only be a positive integer.
     * @param value Value to set for the incidentCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIncidentCount(@javax.annotation.Nullable final Integer value) {
        this.incidentCount = value;
    }
    /**
     * Sets the isActive property value. false by default. true if the alert is active.
     * @param value Value to set for the isActive property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsActive(@javax.annotation.Nullable final Boolean value) {
        this.isActive = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. The date time when the alert configuration was updated or new incidents generated.
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.lastModifiedDateTime = value;
    }
    /**
     * Sets the lastScannedDateTime property value. The date time when the tenant was last scanned for incidents that trigger this alert.
     * @param value Value to set for the lastScannedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastScannedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.lastScannedDateTime = value;
    }
    /**
     * Sets the scopeId property value. The identifier of the scope where the alert is related. / is the only supported one for the tenant. Supports $filter (eq, ne).
     * @param value Value to set for the scopeId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setScopeId(@javax.annotation.Nullable final String value) {
        this.scopeId = value;
    }
    /**
     * Sets the scopeType property value. The type of scope where the alert is created. DirectoryRole is the only currently supported scope type for Azure AD roles.
     * @param value Value to set for the scopeType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setScopeType(@javax.annotation.Nullable final String value) {
        this.scopeType = value;
    }
}
