package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CustomSecurityAttributeAudit extends Entity implements Parsable {
    /**
     * The activityDateTime property
     */
    private OffsetDateTime activityDateTime;
    /**
     * The activityDisplayName property
     */
    private String activityDisplayName;
    /**
     * The additionalDetails property
     */
    private java.util.List<KeyValue> additionalDetails;
    /**
     * The category property
     */
    private String category;
    /**
     * The correlationId property
     */
    private String correlationId;
    /**
     * The initiatedBy property
     */
    private AuditActivityInitiator initiatedBy;
    /**
     * The loggedByService property
     */
    private String loggedByService;
    /**
     * The operationType property
     */
    private String operationType;
    /**
     * The result property
     */
    private OperationResult result;
    /**
     * The resultReason property
     */
    private String resultReason;
    /**
     * The targetResources property
     */
    private java.util.List<TargetResource> targetResources;
    /**
     * The userAgent property
     */
    private String userAgent;
    /**
     * Instantiates a new customSecurityAttributeAudit and sets the default values.
     */
    public CustomSecurityAttributeAudit() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a customSecurityAttributeAudit
     */
    @jakarta.annotation.Nonnull
    public static CustomSecurityAttributeAudit createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CustomSecurityAttributeAudit();
    }
    /**
     * Gets the activityDateTime property value. The activityDateTime property
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getActivityDateTime() {
        return this.activityDateTime;
    }
    /**
     * Gets the activityDisplayName property value. The activityDisplayName property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getActivityDisplayName() {
        return this.activityDisplayName;
    }
    /**
     * Gets the additionalDetails property value. The additionalDetails property
     * @return a keyValue
     */
    @jakarta.annotation.Nullable
    public java.util.List<KeyValue> getAdditionalDetails() {
        return this.additionalDetails;
    }
    /**
     * Gets the category property value. The category property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getCategory() {
        return this.category;
    }
    /**
     * Gets the correlationId property value. The correlationId property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getCorrelationId() {
        return this.correlationId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("activityDateTime", (n) -> { this.setActivityDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("activityDisplayName", (n) -> { this.setActivityDisplayName(n.getStringValue()); });
        deserializerMap.put("additionalDetails", (n) -> { this.setAdditionalDetails(n.getCollectionOfObjectValues(KeyValue::createFromDiscriminatorValue)); });
        deserializerMap.put("category", (n) -> { this.setCategory(n.getStringValue()); });
        deserializerMap.put("correlationId", (n) -> { this.setCorrelationId(n.getStringValue()); });
        deserializerMap.put("initiatedBy", (n) -> { this.setInitiatedBy(n.getObjectValue(AuditActivityInitiator::createFromDiscriminatorValue)); });
        deserializerMap.put("loggedByService", (n) -> { this.setLoggedByService(n.getStringValue()); });
        deserializerMap.put("operationType", (n) -> { this.setOperationType(n.getStringValue()); });
        deserializerMap.put("result", (n) -> { this.setResult(n.getEnumValue(OperationResult.class)); });
        deserializerMap.put("resultReason", (n) -> { this.setResultReason(n.getStringValue()); });
        deserializerMap.put("targetResources", (n) -> { this.setTargetResources(n.getCollectionOfObjectValues(TargetResource::createFromDiscriminatorValue)); });
        deserializerMap.put("userAgent", (n) -> { this.setUserAgent(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the initiatedBy property value. The initiatedBy property
     * @return a auditActivityInitiator
     */
    @jakarta.annotation.Nullable
    public AuditActivityInitiator getInitiatedBy() {
        return this.initiatedBy;
    }
    /**
     * Gets the loggedByService property value. The loggedByService property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getLoggedByService() {
        return this.loggedByService;
    }
    /**
     * Gets the operationType property value. The operationType property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOperationType() {
        return this.operationType;
    }
    /**
     * Gets the result property value. The result property
     * @return a operationResult
     */
    @jakarta.annotation.Nullable
    public OperationResult getResult() {
        return this.result;
    }
    /**
     * Gets the resultReason property value. The resultReason property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getResultReason() {
        return this.resultReason;
    }
    /**
     * Gets the targetResources property value. The targetResources property
     * @return a targetResource
     */
    @jakarta.annotation.Nullable
    public java.util.List<TargetResource> getTargetResources() {
        return this.targetResources;
    }
    /**
     * Gets the userAgent property value. The userAgent property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getUserAgent() {
        return this.userAgent;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeOffsetDateTimeValue("activityDateTime", this.getActivityDateTime());
        writer.writeStringValue("activityDisplayName", this.getActivityDisplayName());
        writer.writeCollectionOfObjectValues("additionalDetails", this.getAdditionalDetails());
        writer.writeStringValue("category", this.getCategory());
        writer.writeStringValue("correlationId", this.getCorrelationId());
        writer.writeObjectValue("initiatedBy", this.getInitiatedBy());
        writer.writeStringValue("loggedByService", this.getLoggedByService());
        writer.writeStringValue("operationType", this.getOperationType());
        writer.writeEnumValue("result", this.getResult());
        writer.writeStringValue("resultReason", this.getResultReason());
        writer.writeCollectionOfObjectValues("targetResources", this.getTargetResources());
        writer.writeStringValue("userAgent", this.getUserAgent());
    }
    /**
     * Sets the activityDateTime property value. The activityDateTime property
     * @param value Value to set for the activityDateTime property.
     */
    public void setActivityDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.activityDateTime = value;
    }
    /**
     * Sets the activityDisplayName property value. The activityDisplayName property
     * @param value Value to set for the activityDisplayName property.
     */
    public void setActivityDisplayName(@jakarta.annotation.Nullable final String value) {
        this.activityDisplayName = value;
    }
    /**
     * Sets the additionalDetails property value. The additionalDetails property
     * @param value Value to set for the additionalDetails property.
     */
    public void setAdditionalDetails(@jakarta.annotation.Nullable final java.util.List<KeyValue> value) {
        this.additionalDetails = value;
    }
    /**
     * Sets the category property value. The category property
     * @param value Value to set for the category property.
     */
    public void setCategory(@jakarta.annotation.Nullable final String value) {
        this.category = value;
    }
    /**
     * Sets the correlationId property value. The correlationId property
     * @param value Value to set for the correlationId property.
     */
    public void setCorrelationId(@jakarta.annotation.Nullable final String value) {
        this.correlationId = value;
    }
    /**
     * Sets the initiatedBy property value. The initiatedBy property
     * @param value Value to set for the initiatedBy property.
     */
    public void setInitiatedBy(@jakarta.annotation.Nullable final AuditActivityInitiator value) {
        this.initiatedBy = value;
    }
    /**
     * Sets the loggedByService property value. The loggedByService property
     * @param value Value to set for the loggedByService property.
     */
    public void setLoggedByService(@jakarta.annotation.Nullable final String value) {
        this.loggedByService = value;
    }
    /**
     * Sets the operationType property value. The operationType property
     * @param value Value to set for the operationType property.
     */
    public void setOperationType(@jakarta.annotation.Nullable final String value) {
        this.operationType = value;
    }
    /**
     * Sets the result property value. The result property
     * @param value Value to set for the result property.
     */
    public void setResult(@jakarta.annotation.Nullable final OperationResult value) {
        this.result = value;
    }
    /**
     * Sets the resultReason property value. The resultReason property
     * @param value Value to set for the resultReason property.
     */
    public void setResultReason(@jakarta.annotation.Nullable final String value) {
        this.resultReason = value;
    }
    /**
     * Sets the targetResources property value. The targetResources property
     * @param value Value to set for the targetResources property.
     */
    public void setTargetResources(@jakarta.annotation.Nullable final java.util.List<TargetResource> value) {
        this.targetResources = value;
    }
    /**
     * Sets the userAgent property value. The userAgent property
     * @param value Value to set for the userAgent property.
     */
    public void setUserAgent(@jakarta.annotation.Nullable final String value) {
        this.userAgent = value;
    }
}
