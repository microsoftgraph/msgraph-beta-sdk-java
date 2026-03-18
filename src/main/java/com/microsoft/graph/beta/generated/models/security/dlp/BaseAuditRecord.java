package com.microsoft.graph.beta.models.security.dlp;

import com.microsoft.graph.beta.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class BaseAuditRecord extends Entity implements Parsable {
    /**
     * Instantiates a new {@link BaseAuditRecord} and sets the default values.
     */
    public BaseAuditRecord() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link BaseAuditRecord}
     */
    @jakarta.annotation.Nonnull
    public static BaseAuditRecord createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.security.dlp.complianceBaseAuditRecord": return new ComplianceBaseAuditRecord();
                case "#microsoft.graph.security.dlp.complianceDLPBaseAuditRecord": return new ComplianceDLPBaseAuditRecord();
                case "#microsoft.graph.security.dlp.complianceDlpEndpointAuditRecord": return new ComplianceDlpEndpointAuditRecord();
                case "#microsoft.graph.security.dlp.complianceDlpExchangeAuditRecord": return new ComplianceDlpExchangeAuditRecord();
                case "#microsoft.graph.security.dlp.complianceDlpSharePointAuditRecord": return new ComplianceDlpSharePointAuditRecord();
            }
        }
        return new BaseAuditRecord();
    }
    /**
     * Gets the agentBlueprintId property value. The agentBlueprintId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAgentBlueprintId() {
        return this.backingStore.get("agentBlueprintId");
    }
    /**
     * Gets the agentBlueprintName property value. The agentBlueprintName property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAgentBlueprintName() {
        return this.backingStore.get("agentBlueprintName");
    }
    /**
     * Gets the agentId property value. The agentId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAgentId() {
        return this.backingStore.get("agentId");
    }
    /**
     * Gets the agentName property value. The agentName property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAgentName() {
        return this.backingStore.get("agentName");
    }
    /**
     * Gets the agentPlatform property value. The agentPlatform property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAgentPlatform() {
        return this.backingStore.get("agentPlatform");
    }
    /**
     * Gets the agentVersion property value. The agentVersion property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAgentVersion() {
        return this.backingStore.get("agentVersion");
    }
    /**
     * Gets the appAccessContext property value. The appAccessContext property
     * @return a {@link AppAccessContext}
     */
    @jakarta.annotation.Nullable
    public AppAccessContext getAppAccessContext() {
        return this.backingStore.get("appAccessContext");
    }
    /**
     * Gets the appIdentity property value. The appIdentity property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAppIdentity() {
        return this.backingStore.get("appIdentity");
    }
    /**
     * Gets the applicationName property value. The applicationName property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getApplicationName() {
        return this.backingStore.get("applicationName");
    }
    /**
     * Gets the associatedAdminUnitIds property value. The associatedAdminUnitIds property
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getAssociatedAdminUnitIds() {
        return this.backingStore.get("associatedAdminUnitIds");
    }
    /**
     * Gets the correlationIdentity property value. The correlationIdentity property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCorrelationIdentity() {
        return this.backingStore.get("correlationIdentity");
    }
    /**
     * Gets the createdDateTime property value. The createdDateTime property
     * @return a {@link LocalDate}
     */
    @jakarta.annotation.Nullable
    public LocalDate getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("agentBlueprintId", (n) -> { this.setAgentBlueprintId(n.getStringValue()); });
        deserializerMap.put("agentBlueprintName", (n) -> { this.setAgentBlueprintName(n.getStringValue()); });
        deserializerMap.put("agentId", (n) -> { this.setAgentId(n.getStringValue()); });
        deserializerMap.put("agentName", (n) -> { this.setAgentName(n.getStringValue()); });
        deserializerMap.put("agentPlatform", (n) -> { this.setAgentPlatform(n.getStringValue()); });
        deserializerMap.put("agentVersion", (n) -> { this.setAgentVersion(n.getStringValue()); });
        deserializerMap.put("appAccessContext", (n) -> { this.setAppAccessContext(n.getObjectValue(AppAccessContext::createFromDiscriminatorValue)); });
        deserializerMap.put("appIdentity", (n) -> { this.setAppIdentity(n.getStringValue()); });
        deserializerMap.put("applicationName", (n) -> { this.setApplicationName(n.getStringValue()); });
        deserializerMap.put("associatedAdminUnitIds", (n) -> { this.setAssociatedAdminUnitIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("correlationIdentity", (n) -> { this.setCorrelationIdentity(n.getStringValue()); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getLocalDateValue()); });
        deserializerMap.put("isRequiresCustomerKeyEncryption", (n) -> { this.setIsRequiresCustomerKeyEncryption(n.getBooleanValue()); });
        deserializerMap.put("operation", (n) -> { this.setOperation(n.getStringValue()); });
        deserializerMap.put("opId", (n) -> { this.setOpId(n.getStringValue()); });
        deserializerMap.put("organizationId", (n) -> { this.setOrganizationId(n.getStringValue()); });
        deserializerMap.put("parentId", (n) -> { this.setParentId(n.getStringValue()); });
        deserializerMap.put("purpose", (n) -> { this.setPurpose(n.getEnumValue(PurposeType::forValue)); });
        deserializerMap.put("recordType", (n) -> { this.setRecordType(n.getEnumValue(AuditRecordType::forValue)); });
        deserializerMap.put("resultStatus", (n) -> { this.setResultStatus(n.getStringValue()); });
        deserializerMap.put("scopingEntityIds", (n) -> { this.setScopingEntityIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("scopingEntityType", (n) -> { this.setScopingEntityType(n.getIntegerValue()); });
        deserializerMap.put("sessionIdentity", (n) -> { this.setSessionIdentity(n.getStringValue()); });
        deserializerMap.put("subjectType", (n) -> { this.setSubjectType(n.getStringValue()); });
        deserializerMap.put("subscription", (n) -> { this.setSubscription(n.getObjectValue(SubscriptionInfo::createFromDiscriminatorValue)); });
        deserializerMap.put("userKey", (n) -> { this.setUserKey(n.getStringValue()); });
        deserializerMap.put("userType", (n) -> { this.setUserType(n.getEnumValue(UserType::forValue)); });
        deserializerMap.put("version", (n) -> { this.setVersion(n.getIntegerValue()); });
        deserializerMap.put("workload", (n) -> { this.setWorkload(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isRequiresCustomerKeyEncryption property value. The isRequiresCustomerKeyEncryption property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsRequiresCustomerKeyEncryption() {
        return this.backingStore.get("isRequiresCustomerKeyEncryption");
    }
    /**
     * Gets the operation property value. The operation property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOperation() {
        return this.backingStore.get("operation");
    }
    /**
     * Gets the opId property value. The opId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOpId() {
        return this.backingStore.get("opId");
    }
    /**
     * Gets the organizationId property value. The organizationId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOrganizationId() {
        return this.backingStore.get("organizationId");
    }
    /**
     * Gets the parentId property value. The parentId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getParentId() {
        return this.backingStore.get("parentId");
    }
    /**
     * Gets the purpose property value. The purpose property
     * @return a {@link PurposeType}
     */
    @jakarta.annotation.Nullable
    public PurposeType getPurpose() {
        return this.backingStore.get("purpose");
    }
    /**
     * Gets the recordType property value. The recordType property
     * @return a {@link AuditRecordType}
     */
    @jakarta.annotation.Nullable
    public AuditRecordType getRecordType() {
        return this.backingStore.get("recordType");
    }
    /**
     * Gets the resultStatus property value. The resultStatus property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getResultStatus() {
        return this.backingStore.get("resultStatus");
    }
    /**
     * Gets the scopingEntityIds property value. The scopingEntityIds property
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getScopingEntityIds() {
        return this.backingStore.get("scopingEntityIds");
    }
    /**
     * Gets the scopingEntityType property value. The scopingEntityType property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getScopingEntityType() {
        return this.backingStore.get("scopingEntityType");
    }
    /**
     * Gets the sessionIdentity property value. The sessionIdentity property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSessionIdentity() {
        return this.backingStore.get("sessionIdentity");
    }
    /**
     * Gets the subjectType property value. The subjectType property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSubjectType() {
        return this.backingStore.get("subjectType");
    }
    /**
     * Gets the subscription property value. The subscription property
     * @return a {@link SubscriptionInfo}
     */
    @jakarta.annotation.Nullable
    public SubscriptionInfo getSubscription() {
        return this.backingStore.get("subscription");
    }
    /**
     * Gets the userKey property value. The userKey property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUserKey() {
        return this.backingStore.get("userKey");
    }
    /**
     * Gets the userType property value. The userType property
     * @return a {@link UserType}
     */
    @jakarta.annotation.Nullable
    public UserType getUserType() {
        return this.backingStore.get("userType");
    }
    /**
     * Gets the version property value. The version property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getVersion() {
        return this.backingStore.get("version");
    }
    /**
     * Gets the workload property value. The workload property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getWorkload() {
        return this.backingStore.get("workload");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("agentBlueprintId", this.getAgentBlueprintId());
        writer.writeStringValue("agentBlueprintName", this.getAgentBlueprintName());
        writer.writeStringValue("agentId", this.getAgentId());
        writer.writeStringValue("agentName", this.getAgentName());
        writer.writeStringValue("agentPlatform", this.getAgentPlatform());
        writer.writeStringValue("agentVersion", this.getAgentVersion());
        writer.writeObjectValue("appAccessContext", this.getAppAccessContext());
        writer.writeStringValue("appIdentity", this.getAppIdentity());
        writer.writeStringValue("applicationName", this.getApplicationName());
        writer.writeCollectionOfPrimitiveValues("associatedAdminUnitIds", this.getAssociatedAdminUnitIds());
        writer.writeStringValue("correlationIdentity", this.getCorrelationIdentity());
        writer.writeLocalDateValue("createdDateTime", this.getCreatedDateTime());
        writer.writeBooleanValue("isRequiresCustomerKeyEncryption", this.getIsRequiresCustomerKeyEncryption());
        writer.writeStringValue("operation", this.getOperation());
        writer.writeStringValue("opId", this.getOpId());
        writer.writeStringValue("organizationId", this.getOrganizationId());
        writer.writeStringValue("parentId", this.getParentId());
        writer.writeEnumValue("purpose", this.getPurpose());
        writer.writeEnumValue("recordType", this.getRecordType());
        writer.writeStringValue("resultStatus", this.getResultStatus());
        writer.writeCollectionOfPrimitiveValues("scopingEntityIds", this.getScopingEntityIds());
        writer.writeIntegerValue("scopingEntityType", this.getScopingEntityType());
        writer.writeStringValue("sessionIdentity", this.getSessionIdentity());
        writer.writeStringValue("subjectType", this.getSubjectType());
        writer.writeObjectValue("subscription", this.getSubscription());
        writer.writeStringValue("userKey", this.getUserKey());
        writer.writeEnumValue("userType", this.getUserType());
        writer.writeIntegerValue("version", this.getVersion());
        writer.writeStringValue("workload", this.getWorkload());
    }
    /**
     * Sets the agentBlueprintId property value. The agentBlueprintId property
     * @param value Value to set for the agentBlueprintId property.
     */
    public void setAgentBlueprintId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("agentBlueprintId", value);
    }
    /**
     * Sets the agentBlueprintName property value. The agentBlueprintName property
     * @param value Value to set for the agentBlueprintName property.
     */
    public void setAgentBlueprintName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("agentBlueprintName", value);
    }
    /**
     * Sets the agentId property value. The agentId property
     * @param value Value to set for the agentId property.
     */
    public void setAgentId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("agentId", value);
    }
    /**
     * Sets the agentName property value. The agentName property
     * @param value Value to set for the agentName property.
     */
    public void setAgentName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("agentName", value);
    }
    /**
     * Sets the agentPlatform property value. The agentPlatform property
     * @param value Value to set for the agentPlatform property.
     */
    public void setAgentPlatform(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("agentPlatform", value);
    }
    /**
     * Sets the agentVersion property value. The agentVersion property
     * @param value Value to set for the agentVersion property.
     */
    public void setAgentVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("agentVersion", value);
    }
    /**
     * Sets the appAccessContext property value. The appAccessContext property
     * @param value Value to set for the appAccessContext property.
     */
    public void setAppAccessContext(@jakarta.annotation.Nullable final AppAccessContext value) {
        this.backingStore.set("appAccessContext", value);
    }
    /**
     * Sets the appIdentity property value. The appIdentity property
     * @param value Value to set for the appIdentity property.
     */
    public void setAppIdentity(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("appIdentity", value);
    }
    /**
     * Sets the applicationName property value. The applicationName property
     * @param value Value to set for the applicationName property.
     */
    public void setApplicationName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("applicationName", value);
    }
    /**
     * Sets the associatedAdminUnitIds property value. The associatedAdminUnitIds property
     * @param value Value to set for the associatedAdminUnitIds property.
     */
    public void setAssociatedAdminUnitIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("associatedAdminUnitIds", value);
    }
    /**
     * Sets the correlationIdentity property value. The correlationIdentity property
     * @param value Value to set for the correlationIdentity property.
     */
    public void setCorrelationIdentity(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("correlationIdentity", value);
    }
    /**
     * Sets the createdDateTime property value. The createdDateTime property
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final LocalDate value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the isRequiresCustomerKeyEncryption property value. The isRequiresCustomerKeyEncryption property
     * @param value Value to set for the isRequiresCustomerKeyEncryption property.
     */
    public void setIsRequiresCustomerKeyEncryption(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isRequiresCustomerKeyEncryption", value);
    }
    /**
     * Sets the operation property value. The operation property
     * @param value Value to set for the operation property.
     */
    public void setOperation(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("operation", value);
    }
    /**
     * Sets the opId property value. The opId property
     * @param value Value to set for the opId property.
     */
    public void setOpId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("opId", value);
    }
    /**
     * Sets the organizationId property value. The organizationId property
     * @param value Value to set for the organizationId property.
     */
    public void setOrganizationId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("organizationId", value);
    }
    /**
     * Sets the parentId property value. The parentId property
     * @param value Value to set for the parentId property.
     */
    public void setParentId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("parentId", value);
    }
    /**
     * Sets the purpose property value. The purpose property
     * @param value Value to set for the purpose property.
     */
    public void setPurpose(@jakarta.annotation.Nullable final PurposeType value) {
        this.backingStore.set("purpose", value);
    }
    /**
     * Sets the recordType property value. The recordType property
     * @param value Value to set for the recordType property.
     */
    public void setRecordType(@jakarta.annotation.Nullable final AuditRecordType value) {
        this.backingStore.set("recordType", value);
    }
    /**
     * Sets the resultStatus property value. The resultStatus property
     * @param value Value to set for the resultStatus property.
     */
    public void setResultStatus(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("resultStatus", value);
    }
    /**
     * Sets the scopingEntityIds property value. The scopingEntityIds property
     * @param value Value to set for the scopingEntityIds property.
     */
    public void setScopingEntityIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("scopingEntityIds", value);
    }
    /**
     * Sets the scopingEntityType property value. The scopingEntityType property
     * @param value Value to set for the scopingEntityType property.
     */
    public void setScopingEntityType(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("scopingEntityType", value);
    }
    /**
     * Sets the sessionIdentity property value. The sessionIdentity property
     * @param value Value to set for the sessionIdentity property.
     */
    public void setSessionIdentity(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("sessionIdentity", value);
    }
    /**
     * Sets the subjectType property value. The subjectType property
     * @param value Value to set for the subjectType property.
     */
    public void setSubjectType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("subjectType", value);
    }
    /**
     * Sets the subscription property value. The subscription property
     * @param value Value to set for the subscription property.
     */
    public void setSubscription(@jakarta.annotation.Nullable final SubscriptionInfo value) {
        this.backingStore.set("subscription", value);
    }
    /**
     * Sets the userKey property value. The userKey property
     * @param value Value to set for the userKey property.
     */
    public void setUserKey(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("userKey", value);
    }
    /**
     * Sets the userType property value. The userType property
     * @param value Value to set for the userType property.
     */
    public void setUserType(@jakarta.annotation.Nullable final UserType value) {
        this.backingStore.set("userType", value);
    }
    /**
     * Sets the version property value. The version property
     * @param value Value to set for the version property.
     */
    public void setVersion(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("version", value);
    }
    /**
     * Sets the workload property value. The workload property
     * @param value Value to set for the workload property.
     */
    public void setWorkload(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("workload", value);
    }
}
