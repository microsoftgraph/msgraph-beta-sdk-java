package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ResourcePolicyEvaluationEvent extends Entity implements Parsable {
    /**
     * Instantiates a new {@link ResourcePolicyEvaluationEvent} and sets the default values.
     */
    public ResourcePolicyEvaluationEvent() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ResourcePolicyEvaluationEvent}
     */
    @jakarta.annotation.Nonnull
    public static ResourcePolicyEvaluationEvent createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ResourcePolicyEvaluationEvent();
    }
    /**
     * Gets the apiVersion property value. The apiVersion property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getApiVersion() {
        return this.backingStore.get("apiVersion");
    }
    /**
     * Gets the appDisplayName property value. The appDisplayName property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAppDisplayName() {
        return this.backingStore.get("appDisplayName");
    }
    /**
     * Gets the appId property value. The appId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAppId() {
        return this.backingStore.get("appId");
    }
    /**
     * Gets the applicablePoliciesCount property value. The applicablePoliciesCount property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getApplicablePoliciesCount() {
        return this.backingStore.get("applicablePoliciesCount");
    }
    /**
     * Gets the auditPoliciesCount property value. The auditPoliciesCount property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getAuditPoliciesCount() {
        return this.backingStore.get("auditPoliciesCount");
    }
    /**
     * Gets the clientRequestId property value. The clientRequestId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getClientRequestId() {
        return this.backingStore.get("clientRequestId");
    }
    /**
     * Gets the denyPoliciesCount property value. The denyPoliciesCount property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getDenyPoliciesCount() {
        return this.backingStore.get("denyPoliciesCount");
    }
    /**
     * Gets the durationMs property value. The durationMs property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getDurationMs() {
        return this.backingStore.get("durationMs");
    }
    /**
     * Gets the errorPoliciesCount property value. The errorPoliciesCount property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getErrorPoliciesCount() {
        return this.backingStore.get("errorPoliciesCount");
    }
    /**
     * Gets the evaluatedDateTime property value. The evaluatedDateTime property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getEvaluatedDateTime() {
        return this.backingStore.get("evaluatedDateTime");
    }
    /**
     * Gets the evaluatedPoliciesCount property value. The evaluatedPoliciesCount property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getEvaluatedPoliciesCount() {
        return this.backingStore.get("evaluatedPoliciesCount");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("apiVersion", (n) -> { this.setApiVersion(n.getStringValue()); });
        deserializerMap.put("appDisplayName", (n) -> { this.setAppDisplayName(n.getStringValue()); });
        deserializerMap.put("appId", (n) -> { this.setAppId(n.getStringValue()); });
        deserializerMap.put("applicablePoliciesCount", (n) -> { this.setApplicablePoliciesCount(n.getIntegerValue()); });
        deserializerMap.put("auditPoliciesCount", (n) -> { this.setAuditPoliciesCount(n.getIntegerValue()); });
        deserializerMap.put("clientRequestId", (n) -> { this.setClientRequestId(n.getStringValue()); });
        deserializerMap.put("denyPoliciesCount", (n) -> { this.setDenyPoliciesCount(n.getIntegerValue()); });
        deserializerMap.put("durationMs", (n) -> { this.setDurationMs(n.getIntegerValue()); });
        deserializerMap.put("errorPoliciesCount", (n) -> { this.setErrorPoliciesCount(n.getIntegerValue()); });
        deserializerMap.put("evaluatedDateTime", (n) -> { this.setEvaluatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("evaluatedPoliciesCount", (n) -> { this.setEvaluatedPoliciesCount(n.getIntegerValue()); });
        deserializerMap.put("location", (n) -> { this.setLocation(n.getStringValue()); });
        deserializerMap.put("operationId", (n) -> { this.setOperationId(n.getStringValue()); });
        deserializerMap.put("policyDecision", (n) -> { this.setPolicyDecision(n.getEnumValue(ResourcePolicyDecision::forValue)); });
        deserializerMap.put("policyDetails", (n) -> { this.setPolicyDetails(n.getCollectionOfObjectValues(PolicyEvaluationDetail::createFromDiscriminatorValue)); });
        deserializerMap.put("requestId", (n) -> { this.setRequestId(n.getStringValue()); });
        deserializerMap.put("requestMethod", (n) -> { this.setRequestMethod(n.getStringValue()); });
        deserializerMap.put("requestUri", (n) -> { this.setRequestUri(n.getStringValue()); });
        deserializerMap.put("servicePrincipalId", (n) -> { this.setServicePrincipalId(n.getStringValue()); });
        deserializerMap.put("targetResourceId", (n) -> { this.setTargetResourceId(n.getStringValue()); });
        deserializerMap.put("targetResourceName", (n) -> { this.setTargetResourceName(n.getStringValue()); });
        deserializerMap.put("tenantId", (n) -> { this.setTenantId(n.getStringValue()); });
        deserializerMap.put("totalFetchDurationMs", (n) -> { this.setTotalFetchDurationMs(n.getIntegerValue()); });
        deserializerMap.put("totalPolicyEvaluationDurationMs", (n) -> { this.setTotalPolicyEvaluationDurationMs(n.getIntegerValue()); });
        deserializerMap.put("userId", (n) -> { this.setUserId(n.getStringValue()); });
        return deserializerMap;
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
     * Gets the operationId property value. The operationId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOperationId() {
        return this.backingStore.get("operationId");
    }
    /**
     * Gets the policyDecision property value. The policyDecision property
     * @return a {@link ResourcePolicyDecision}
     */
    @jakarta.annotation.Nullable
    public ResourcePolicyDecision getPolicyDecision() {
        return this.backingStore.get("policyDecision");
    }
    /**
     * Gets the policyDetails property value. The policyDetails property
     * @return a {@link java.util.List<PolicyEvaluationDetail>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<PolicyEvaluationDetail> getPolicyDetails() {
        return this.backingStore.get("policyDetails");
    }
    /**
     * Gets the requestId property value. The requestId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRequestId() {
        return this.backingStore.get("requestId");
    }
    /**
     * Gets the requestMethod property value. The requestMethod property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRequestMethod() {
        return this.backingStore.get("requestMethod");
    }
    /**
     * Gets the requestUri property value. The requestUri property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRequestUri() {
        return this.backingStore.get("requestUri");
    }
    /**
     * Gets the servicePrincipalId property value. The servicePrincipalId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getServicePrincipalId() {
        return this.backingStore.get("servicePrincipalId");
    }
    /**
     * Gets the targetResourceId property value. The targetResourceId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTargetResourceId() {
        return this.backingStore.get("targetResourceId");
    }
    /**
     * Gets the targetResourceName property value. The targetResourceName property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTargetResourceName() {
        return this.backingStore.get("targetResourceName");
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
     * Gets the totalFetchDurationMs property value. The totalFetchDurationMs property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getTotalFetchDurationMs() {
        return this.backingStore.get("totalFetchDurationMs");
    }
    /**
     * Gets the totalPolicyEvaluationDurationMs property value. The totalPolicyEvaluationDurationMs property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getTotalPolicyEvaluationDurationMs() {
        return this.backingStore.get("totalPolicyEvaluationDurationMs");
    }
    /**
     * Gets the userId property value. The userId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUserId() {
        return this.backingStore.get("userId");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("apiVersion", this.getApiVersion());
        writer.writeStringValue("appDisplayName", this.getAppDisplayName());
        writer.writeStringValue("appId", this.getAppId());
        writer.writeIntegerValue("applicablePoliciesCount", this.getApplicablePoliciesCount());
        writer.writeIntegerValue("auditPoliciesCount", this.getAuditPoliciesCount());
        writer.writeStringValue("clientRequestId", this.getClientRequestId());
        writer.writeIntegerValue("denyPoliciesCount", this.getDenyPoliciesCount());
        writer.writeIntegerValue("durationMs", this.getDurationMs());
        writer.writeIntegerValue("errorPoliciesCount", this.getErrorPoliciesCount());
        writer.writeOffsetDateTimeValue("evaluatedDateTime", this.getEvaluatedDateTime());
        writer.writeIntegerValue("evaluatedPoliciesCount", this.getEvaluatedPoliciesCount());
        writer.writeStringValue("location", this.getLocation());
        writer.writeStringValue("operationId", this.getOperationId());
        writer.writeEnumValue("policyDecision", this.getPolicyDecision());
        writer.writeCollectionOfObjectValues("policyDetails", this.getPolicyDetails());
        writer.writeStringValue("requestId", this.getRequestId());
        writer.writeStringValue("requestMethod", this.getRequestMethod());
        writer.writeStringValue("requestUri", this.getRequestUri());
        writer.writeStringValue("servicePrincipalId", this.getServicePrincipalId());
        writer.writeStringValue("targetResourceId", this.getTargetResourceId());
        writer.writeStringValue("targetResourceName", this.getTargetResourceName());
        writer.writeStringValue("tenantId", this.getTenantId());
        writer.writeIntegerValue("totalFetchDurationMs", this.getTotalFetchDurationMs());
        writer.writeIntegerValue("totalPolicyEvaluationDurationMs", this.getTotalPolicyEvaluationDurationMs());
        writer.writeStringValue("userId", this.getUserId());
    }
    /**
     * Sets the apiVersion property value. The apiVersion property
     * @param value Value to set for the apiVersion property.
     */
    public void setApiVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("apiVersion", value);
    }
    /**
     * Sets the appDisplayName property value. The appDisplayName property
     * @param value Value to set for the appDisplayName property.
     */
    public void setAppDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("appDisplayName", value);
    }
    /**
     * Sets the appId property value. The appId property
     * @param value Value to set for the appId property.
     */
    public void setAppId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("appId", value);
    }
    /**
     * Sets the applicablePoliciesCount property value. The applicablePoliciesCount property
     * @param value Value to set for the applicablePoliciesCount property.
     */
    public void setApplicablePoliciesCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("applicablePoliciesCount", value);
    }
    /**
     * Sets the auditPoliciesCount property value. The auditPoliciesCount property
     * @param value Value to set for the auditPoliciesCount property.
     */
    public void setAuditPoliciesCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("auditPoliciesCount", value);
    }
    /**
     * Sets the clientRequestId property value. The clientRequestId property
     * @param value Value to set for the clientRequestId property.
     */
    public void setClientRequestId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("clientRequestId", value);
    }
    /**
     * Sets the denyPoliciesCount property value. The denyPoliciesCount property
     * @param value Value to set for the denyPoliciesCount property.
     */
    public void setDenyPoliciesCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("denyPoliciesCount", value);
    }
    /**
     * Sets the durationMs property value. The durationMs property
     * @param value Value to set for the durationMs property.
     */
    public void setDurationMs(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("durationMs", value);
    }
    /**
     * Sets the errorPoliciesCount property value. The errorPoliciesCount property
     * @param value Value to set for the errorPoliciesCount property.
     */
    public void setErrorPoliciesCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("errorPoliciesCount", value);
    }
    /**
     * Sets the evaluatedDateTime property value. The evaluatedDateTime property
     * @param value Value to set for the evaluatedDateTime property.
     */
    public void setEvaluatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("evaluatedDateTime", value);
    }
    /**
     * Sets the evaluatedPoliciesCount property value. The evaluatedPoliciesCount property
     * @param value Value to set for the evaluatedPoliciesCount property.
     */
    public void setEvaluatedPoliciesCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("evaluatedPoliciesCount", value);
    }
    /**
     * Sets the location property value. The location property
     * @param value Value to set for the location property.
     */
    public void setLocation(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("location", value);
    }
    /**
     * Sets the operationId property value. The operationId property
     * @param value Value to set for the operationId property.
     */
    public void setOperationId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("operationId", value);
    }
    /**
     * Sets the policyDecision property value. The policyDecision property
     * @param value Value to set for the policyDecision property.
     */
    public void setPolicyDecision(@jakarta.annotation.Nullable final ResourcePolicyDecision value) {
        this.backingStore.set("policyDecision", value);
    }
    /**
     * Sets the policyDetails property value. The policyDetails property
     * @param value Value to set for the policyDetails property.
     */
    public void setPolicyDetails(@jakarta.annotation.Nullable final java.util.List<PolicyEvaluationDetail> value) {
        this.backingStore.set("policyDetails", value);
    }
    /**
     * Sets the requestId property value. The requestId property
     * @param value Value to set for the requestId property.
     */
    public void setRequestId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("requestId", value);
    }
    /**
     * Sets the requestMethod property value. The requestMethod property
     * @param value Value to set for the requestMethod property.
     */
    public void setRequestMethod(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("requestMethod", value);
    }
    /**
     * Sets the requestUri property value. The requestUri property
     * @param value Value to set for the requestUri property.
     */
    public void setRequestUri(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("requestUri", value);
    }
    /**
     * Sets the servicePrincipalId property value. The servicePrincipalId property
     * @param value Value to set for the servicePrincipalId property.
     */
    public void setServicePrincipalId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("servicePrincipalId", value);
    }
    /**
     * Sets the targetResourceId property value. The targetResourceId property
     * @param value Value to set for the targetResourceId property.
     */
    public void setTargetResourceId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("targetResourceId", value);
    }
    /**
     * Sets the targetResourceName property value. The targetResourceName property
     * @param value Value to set for the targetResourceName property.
     */
    public void setTargetResourceName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("targetResourceName", value);
    }
    /**
     * Sets the tenantId property value. The tenantId property
     * @param value Value to set for the tenantId property.
     */
    public void setTenantId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("tenantId", value);
    }
    /**
     * Sets the totalFetchDurationMs property value. The totalFetchDurationMs property
     * @param value Value to set for the totalFetchDurationMs property.
     */
    public void setTotalFetchDurationMs(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("totalFetchDurationMs", value);
    }
    /**
     * Sets the totalPolicyEvaluationDurationMs property value. The totalPolicyEvaluationDurationMs property
     * @param value Value to set for the totalPolicyEvaluationDurationMs property.
     */
    public void setTotalPolicyEvaluationDurationMs(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("totalPolicyEvaluationDurationMs", value);
    }
    /**
     * Sets the userId property value. The userId property
     * @param value Value to set for the userId property.
     */
    public void setUserId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("userId", value);
    }
}
