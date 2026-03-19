package com.microsoft.graph.beta.models.security.dlp;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ComplianceDLPBaseAuditRecord extends ComplianceBaseAuditRecord implements Parsable {
    /**
     * Instantiates a new {@link ComplianceDLPBaseAuditRecord} and sets the default values.
     */
    public ComplianceDLPBaseAuditRecord() {
        super();
        this.setOdataType("#microsoft.graph.security.dlp.complianceDLPBaseAuditRecord");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ComplianceDLPBaseAuditRecord}
     */
    @jakarta.annotation.Nonnull
    public static ComplianceDLPBaseAuditRecord createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.security.dlp.complianceDlpEndpointAuditRecord": return new ComplianceDlpEndpointAuditRecord();
                case "#microsoft.graph.security.dlp.complianceDlpExchangeAuditRecord": return new ComplianceDlpExchangeAuditRecord();
                case "#microsoft.graph.security.dlp.complianceDlpSharePointAuditRecord": return new ComplianceDlpSharePointAuditRecord();
            }
        }
        return new ComplianceDLPBaseAuditRecord();
    }
    /**
     * Gets the enforcementType property value. The enforcementType property
     * @return a {@link EnforcementType}
     */
    @jakarta.annotation.Nullable
    public EnforcementType getEnforcementType() {
        return this.backingStore.get("enforcementType");
    }
    /**
     * Gets the evaluationSource property value. The evaluationSource property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getEvaluationSource() {
        return this.backingStore.get("evaluationSource");
    }
    /**
     * Gets the exceptionInfo property value. The exceptionInfo property
     * @return a {@link ExceptionInfo}
     */
    @jakarta.annotation.Nullable
    public ExceptionInfo getExceptionInfo() {
        return this.backingStore.get("exceptionInfo");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("enforcementType", (n) -> { this.setEnforcementType(n.getEnumValue(EnforcementType::forValue)); });
        deserializerMap.put("evaluationSource", (n) -> { this.setEvaluationSource(n.getStringValue()); });
        deserializerMap.put("exceptionInfo", (n) -> { this.setExceptionInfo(n.getObjectValue(ExceptionInfo::createFromDiscriminatorValue)); });
        deserializerMap.put("incidentId", (n) -> { this.setIncidentId(n.getUUIDValue()); });
        deserializerMap.put("isSensitiveInfoDetectionIsIncluded", (n) -> { this.setIsSensitiveInfoDetectionIsIncluded(n.getBooleanValue()); });
        deserializerMap.put("location", (n) -> { this.setLocation(n.getStringValue()); });
        deserializerMap.put("policyDetails", (n) -> { this.setPolicyDetails(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("remediationDetails", (n) -> { this.setRemediationDetails(n.getObjectValue(RemediationInfo::createFromDiscriminatorValue)); });
        deserializerMap.put("sessionMetadata", (n) -> { this.setSessionMetadata(n.getObjectValue(SessionMetadataInfo::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the incidentId property value. The incidentId property
     * @return a {@link UUID}
     */
    @jakarta.annotation.Nullable
    public UUID getIncidentId() {
        return this.backingStore.get("incidentId");
    }
    /**
     * Gets the isSensitiveInfoDetectionIsIncluded property value. The isSensitiveInfoDetectionIsIncluded property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsSensitiveInfoDetectionIsIncluded() {
        return this.backingStore.get("isSensitiveInfoDetectionIsIncluded");
    }
    /**
     * Gets the location property value. The location property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLocation() {
        return this.backingStore.get("location");
    }
    /**
     * Gets the policyDetails property value. The policyDetails property
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getPolicyDetails() {
        return this.backingStore.get("policyDetails");
    }
    /**
     * Gets the remediationDetails property value. The remediationDetails property
     * @return a {@link RemediationInfo}
     */
    @jakarta.annotation.Nullable
    public RemediationInfo getRemediationDetails() {
        return this.backingStore.get("remediationDetails");
    }
    /**
     * Gets the sessionMetadata property value. The sessionMetadata property
     * @return a {@link SessionMetadataInfo}
     */
    @jakarta.annotation.Nullable
    public SessionMetadataInfo getSessionMetadata() {
        return this.backingStore.get("sessionMetadata");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("enforcementType", this.getEnforcementType());
        writer.writeStringValue("evaluationSource", this.getEvaluationSource());
        writer.writeObjectValue("exceptionInfo", this.getExceptionInfo());
        writer.writeUUIDValue("incidentId", this.getIncidentId());
        writer.writeBooleanValue("isSensitiveInfoDetectionIsIncluded", this.getIsSensitiveInfoDetectionIsIncluded());
        writer.writeStringValue("location", this.getLocation());
        writer.writeCollectionOfPrimitiveValues("policyDetails", this.getPolicyDetails());
        writer.writeObjectValue("remediationDetails", this.getRemediationDetails());
        writer.writeObjectValue("sessionMetadata", this.getSessionMetadata());
    }
    /**
     * Sets the enforcementType property value. The enforcementType property
     * @param value Value to set for the enforcementType property.
     */
    public void setEnforcementType(@jakarta.annotation.Nullable final EnforcementType value) {
        this.backingStore.set("enforcementType", value);
    }
    /**
     * Sets the evaluationSource property value. The evaluationSource property
     * @param value Value to set for the evaluationSource property.
     */
    public void setEvaluationSource(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("evaluationSource", value);
    }
    /**
     * Sets the exceptionInfo property value. The exceptionInfo property
     * @param value Value to set for the exceptionInfo property.
     */
    public void setExceptionInfo(@jakarta.annotation.Nullable final ExceptionInfo value) {
        this.backingStore.set("exceptionInfo", value);
    }
    /**
     * Sets the incidentId property value. The incidentId property
     * @param value Value to set for the incidentId property.
     */
    public void setIncidentId(@jakarta.annotation.Nullable final UUID value) {
        this.backingStore.set("incidentId", value);
    }
    /**
     * Sets the isSensitiveInfoDetectionIsIncluded property value. The isSensitiveInfoDetectionIsIncluded property
     * @param value Value to set for the isSensitiveInfoDetectionIsIncluded property.
     */
    public void setIsSensitiveInfoDetectionIsIncluded(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isSensitiveInfoDetectionIsIncluded", value);
    }
    /**
     * Sets the location property value. The location property
     * @param value Value to set for the location property.
     */
    public void setLocation(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("location", value);
    }
    /**
     * Sets the policyDetails property value. The policyDetails property
     * @param value Value to set for the policyDetails property.
     */
    public void setPolicyDetails(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("policyDetails", value);
    }
    /**
     * Sets the remediationDetails property value. The remediationDetails property
     * @param value Value to set for the remediationDetails property.
     */
    public void setRemediationDetails(@jakarta.annotation.Nullable final RemediationInfo value) {
        this.backingStore.set("remediationDetails", value);
    }
    /**
     * Sets the sessionMetadata property value. The sessionMetadata property
     * @param value Value to set for the sessionMetadata property.
     */
    public void setSessionMetadata(@jakarta.annotation.Nullable final SessionMetadataInfo value) {
        this.backingStore.set("sessionMetadata", value);
    }
}
