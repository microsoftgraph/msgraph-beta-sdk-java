package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RecommendationBase extends Entity implements Parsable {
    /**
     * Instantiates a new RecommendationBase and sets the default values.
     */
    public RecommendationBase() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a RecommendationBase
     */
    @jakarta.annotation.Nonnull
    public static RecommendationBase createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.recommendation": return new Recommendation();
            }
        }
        return new RecommendationBase();
    }
    /**
     * Gets the actionSteps property value. List of actions to take to complete a recommendation.
     * @return a java.util.List<ActionStep>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ActionStep> getActionSteps() {
        return this.backingStore.get("actionSteps");
    }
    /**
     * Gets the benefits property value. An explanation of why completing the recommendation will benefit you. Corresponds to the Value section of a recommendation shown in the Microsoft Entra admin center.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getBenefits() {
        return this.backingStore.get("benefits");
    }
    /**
     * Gets the category property value. The category property
     * @return a RecommendationCategory
     */
    @jakarta.annotation.Nullable
    public RecommendationCategory getCategory() {
        return this.backingStore.get("category");
    }
    /**
     * Gets the createdDateTime property value. The date and time when the recommendation was detected as applicable to your directory.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * Gets the currentScore property value. The number of points the tenant has attained. Only applies to recommendations with category set to identitySecureScore.
     * @return a Double
     */
    @jakarta.annotation.Nullable
    public Double getCurrentScore() {
        return this.backingStore.get("currentScore");
    }
    /**
     * Gets the displayName property value. The title of the recommendation.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * Gets the featureAreas property value. The directory feature that the recommendation is related to.
     * @return a java.util.List<RecommendationFeatureAreas>
     */
    @jakarta.annotation.Nullable
    public java.util.List<RecommendationFeatureAreas> getFeatureAreas() {
        return this.backingStore.get("featureAreas");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("actionSteps", (n) -> { this.setActionSteps(n.getCollectionOfObjectValues(ActionStep::createFromDiscriminatorValue)); });
        deserializerMap.put("benefits", (n) -> { this.setBenefits(n.getStringValue()); });
        deserializerMap.put("category", (n) -> { this.setCategory(n.getEnumValue(RecommendationCategory::forValue)); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("currentScore", (n) -> { this.setCurrentScore(n.getDoubleValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("featureAreas", (n) -> { this.setFeatureAreas(n.getCollectionOfEnumValues(RecommendationFeatureAreas::forValue)); });
        deserializerMap.put("impactedResources", (n) -> { this.setImpactedResources(n.getCollectionOfObjectValues(ImpactedResource::createFromDiscriminatorValue)); });
        deserializerMap.put("impactStartDateTime", (n) -> { this.setImpactStartDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("impactType", (n) -> { this.setImpactType(n.getStringValue()); });
        deserializerMap.put("insights", (n) -> { this.setInsights(n.getStringValue()); });
        deserializerMap.put("lastCheckedDateTime", (n) -> { this.setLastCheckedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("lastModifiedBy", (n) -> { this.setLastModifiedBy(n.getStringValue()); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("maxScore", (n) -> { this.setMaxScore(n.getDoubleValue()); });
        deserializerMap.put("postponeUntilDateTime", (n) -> { this.setPostponeUntilDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("priority", (n) -> { this.setPriority(n.getEnumValue(RecommendationPriority::forValue)); });
        deserializerMap.put("recommendationType", (n) -> { this.setRecommendationType(n.getEnumValue(RecommendationType::forValue)); });
        deserializerMap.put("releaseType", (n) -> { this.setReleaseType(n.getStringValue()); });
        deserializerMap.put("remediationImpact", (n) -> { this.setRemediationImpact(n.getStringValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(RecommendationStatus::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the impactedResources property value. The list of directory objects associated with the recommendation.
     * @return a java.util.List<ImpactedResource>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ImpactedResource> getImpactedResources() {
        return this.backingStore.get("impactedResources");
    }
    /**
     * Gets the impactStartDateTime property value. The future date and time when a recommendation should be completed.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getImpactStartDateTime() {
        return this.backingStore.get("impactStartDateTime");
    }
    /**
     * Gets the impactType property value. Indicates the scope of impact of a recommendation. Tenant level indicates that the recommendation impacts the whole tenant. Other possible values include users, applications.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getImpactType() {
        return this.backingStore.get("impactType");
    }
    /**
     * Gets the insights property value. Describes why a recommendation uniquely applies to your directory. Corresponds to the Description section of a recommendation shown in the Microsoft Entra admin center.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getInsights() {
        return this.backingStore.get("insights");
    }
    /**
     * Gets the lastCheckedDateTime property value. The most recent date and time a recommendation was deemed applicable to your directory.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastCheckedDateTime() {
        return this.backingStore.get("lastCheckedDateTime");
    }
    /**
     * Gets the lastModifiedBy property value. Name of the user who last updated the status of the recommendation.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getLastModifiedBy() {
        return this.backingStore.get("lastModifiedBy");
    }
    /**
     * Gets the lastModifiedDateTime property value. The date and time the status of a recommendation was last updated.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.backingStore.get("lastModifiedDateTime");
    }
    /**
     * Gets the maxScore property value. The maximum number of points attainable. Only applies to recommendations with category set to identitySecureScore.
     * @return a Double
     */
    @jakarta.annotation.Nullable
    public Double getMaxScore() {
        return this.backingStore.get("maxScore");
    }
    /**
     * Gets the postponeUntilDateTime property value. The future date and time when the status of a postponed recommendation will be active again.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getPostponeUntilDateTime() {
        return this.backingStore.get("postponeUntilDateTime");
    }
    /**
     * Gets the priority property value. The priority property
     * @return a RecommendationPriority
     */
    @jakarta.annotation.Nullable
    public RecommendationPriority getPriority() {
        return this.backingStore.get("priority");
    }
    /**
     * Gets the recommendationType property value. Friendly shortname to identify the recommendation. The possible values are: adfsAppsMigration, enableDesktopSSO, enablePHS, enableProvisioning, switchFromPerUserMFA, tenantMFA, thirdPartyApps, turnOffPerUserMFA, useAuthenticatorApp, useMyApps, staleApps, staleAppCreds, applicationCredentialExpiry, servicePrincipalKeyExpiry, adminMFAV2, blockLegacyAuthentication, integratedApps, mfaRegistrationV2, pwagePolicyNew, passwordHashSync, oneAdmin, roleOverlap, selfServicePasswordReset, signinRiskPolicy, userRiskPolicy, verifyAppPublisher, privateLinkForAAD, appRoleAssignmentsGroups, appRoleAssignmentsUsers, managedIdentity, overprivilegedApps, unknownFutureValue, longLivedCredentials, aadConnectDeprecated, adalToMsalMigration, ownerlessApps, inactiveGuests. Also, please note that you must use the Prefer: include-unknown-enum-members request header to get the following value(s) in this evolvable enum: longLivedCredentials, aadConnectDeprecated, adalToMsalMigration, ownerlessApps, inactiveGuests.
     * @return a RecommendationType
     */
    @jakarta.annotation.Nullable
    public RecommendationType getRecommendationType() {
        return this.backingStore.get("recommendationType");
    }
    /**
     * Gets the releaseType property value. The current release type of the recommendation. The possible values are: preview, generallyAvailable, unknownFutureValue.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getReleaseType() {
        return this.backingStore.get("releaseType");
    }
    /**
     * Gets the remediationImpact property value. Description of the impact on users of the remediation. Only applies to recommendations with category set to identitySecureScore.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getRemediationImpact() {
        return this.backingStore.get("remediationImpact");
    }
    /**
     * Gets the status property value. The status property
     * @return a RecommendationStatus
     */
    @jakarta.annotation.Nullable
    public RecommendationStatus getStatus() {
        return this.backingStore.get("status");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("actionSteps", this.getActionSteps());
        writer.writeStringValue("benefits", this.getBenefits());
        writer.writeEnumValue("category", this.getCategory());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeDoubleValue("currentScore", this.getCurrentScore());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeCollectionOfEnumValues("featureAreas", this.getFeatureAreas());
        writer.writeCollectionOfObjectValues("impactedResources", this.getImpactedResources());
        writer.writeOffsetDateTimeValue("impactStartDateTime", this.getImpactStartDateTime());
        writer.writeStringValue("impactType", this.getImpactType());
        writer.writeStringValue("insights", this.getInsights());
        writer.writeOffsetDateTimeValue("lastCheckedDateTime", this.getLastCheckedDateTime());
        writer.writeStringValue("lastModifiedBy", this.getLastModifiedBy());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeDoubleValue("maxScore", this.getMaxScore());
        writer.writeOffsetDateTimeValue("postponeUntilDateTime", this.getPostponeUntilDateTime());
        writer.writeEnumValue("priority", this.getPriority());
        writer.writeEnumValue("recommendationType", this.getRecommendationType());
        writer.writeStringValue("releaseType", this.getReleaseType());
        writer.writeStringValue("remediationImpact", this.getRemediationImpact());
        writer.writeEnumValue("status", this.getStatus());
    }
    /**
     * Sets the actionSteps property value. List of actions to take to complete a recommendation.
     * @param value Value to set for the actionSteps property.
     */
    public void setActionSteps(@jakarta.annotation.Nullable final java.util.List<ActionStep> value) {
        this.backingStore.set("actionSteps", value);
    }
    /**
     * Sets the benefits property value. An explanation of why completing the recommendation will benefit you. Corresponds to the Value section of a recommendation shown in the Microsoft Entra admin center.
     * @param value Value to set for the benefits property.
     */
    public void setBenefits(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("benefits", value);
    }
    /**
     * Sets the category property value. The category property
     * @param value Value to set for the category property.
     */
    public void setCategory(@jakarta.annotation.Nullable final RecommendationCategory value) {
        this.backingStore.set("category", value);
    }
    /**
     * Sets the createdDateTime property value. The date and time when the recommendation was detected as applicable to your directory.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the currentScore property value. The number of points the tenant has attained. Only applies to recommendations with category set to identitySecureScore.
     * @param value Value to set for the currentScore property.
     */
    public void setCurrentScore(@jakarta.annotation.Nullable final Double value) {
        this.backingStore.set("currentScore", value);
    }
    /**
     * Sets the displayName property value. The title of the recommendation.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the featureAreas property value. The directory feature that the recommendation is related to.
     * @param value Value to set for the featureAreas property.
     */
    public void setFeatureAreas(@jakarta.annotation.Nullable final java.util.List<RecommendationFeatureAreas> value) {
        this.backingStore.set("featureAreas", value);
    }
    /**
     * Sets the impactedResources property value. The list of directory objects associated with the recommendation.
     * @param value Value to set for the impactedResources property.
     */
    public void setImpactedResources(@jakarta.annotation.Nullable final java.util.List<ImpactedResource> value) {
        this.backingStore.set("impactedResources", value);
    }
    /**
     * Sets the impactStartDateTime property value. The future date and time when a recommendation should be completed.
     * @param value Value to set for the impactStartDateTime property.
     */
    public void setImpactStartDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("impactStartDateTime", value);
    }
    /**
     * Sets the impactType property value. Indicates the scope of impact of a recommendation. Tenant level indicates that the recommendation impacts the whole tenant. Other possible values include users, applications.
     * @param value Value to set for the impactType property.
     */
    public void setImpactType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("impactType", value);
    }
    /**
     * Sets the insights property value. Describes why a recommendation uniquely applies to your directory. Corresponds to the Description section of a recommendation shown in the Microsoft Entra admin center.
     * @param value Value to set for the insights property.
     */
    public void setInsights(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("insights", value);
    }
    /**
     * Sets the lastCheckedDateTime property value. The most recent date and time a recommendation was deemed applicable to your directory.
     * @param value Value to set for the lastCheckedDateTime property.
     */
    public void setLastCheckedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastCheckedDateTime", value);
    }
    /**
     * Sets the lastModifiedBy property value. Name of the user who last updated the status of the recommendation.
     * @param value Value to set for the lastModifiedBy property.
     */
    public void setLastModifiedBy(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("lastModifiedBy", value);
    }
    /**
     * Sets the lastModifiedDateTime property value. The date and time the status of a recommendation was last updated.
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastModifiedDateTime", value);
    }
    /**
     * Sets the maxScore property value. The maximum number of points attainable. Only applies to recommendations with category set to identitySecureScore.
     * @param value Value to set for the maxScore property.
     */
    public void setMaxScore(@jakarta.annotation.Nullable final Double value) {
        this.backingStore.set("maxScore", value);
    }
    /**
     * Sets the postponeUntilDateTime property value. The future date and time when the status of a postponed recommendation will be active again.
     * @param value Value to set for the postponeUntilDateTime property.
     */
    public void setPostponeUntilDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("postponeUntilDateTime", value);
    }
    /**
     * Sets the priority property value. The priority property
     * @param value Value to set for the priority property.
     */
    public void setPriority(@jakarta.annotation.Nullable final RecommendationPriority value) {
        this.backingStore.set("priority", value);
    }
    /**
     * Sets the recommendationType property value. Friendly shortname to identify the recommendation. The possible values are: adfsAppsMigration, enableDesktopSSO, enablePHS, enableProvisioning, switchFromPerUserMFA, tenantMFA, thirdPartyApps, turnOffPerUserMFA, useAuthenticatorApp, useMyApps, staleApps, staleAppCreds, applicationCredentialExpiry, servicePrincipalKeyExpiry, adminMFAV2, blockLegacyAuthentication, integratedApps, mfaRegistrationV2, pwagePolicyNew, passwordHashSync, oneAdmin, roleOverlap, selfServicePasswordReset, signinRiskPolicy, userRiskPolicy, verifyAppPublisher, privateLinkForAAD, appRoleAssignmentsGroups, appRoleAssignmentsUsers, managedIdentity, overprivilegedApps, unknownFutureValue, longLivedCredentials, aadConnectDeprecated, adalToMsalMigration, ownerlessApps, inactiveGuests. Also, please note that you must use the Prefer: include-unknown-enum-members request header to get the following value(s) in this evolvable enum: longLivedCredentials, aadConnectDeprecated, adalToMsalMigration, ownerlessApps, inactiveGuests.
     * @param value Value to set for the recommendationType property.
     */
    public void setRecommendationType(@jakarta.annotation.Nullable final RecommendationType value) {
        this.backingStore.set("recommendationType", value);
    }
    /**
     * Sets the releaseType property value. The current release type of the recommendation. The possible values are: preview, generallyAvailable, unknownFutureValue.
     * @param value Value to set for the releaseType property.
     */
    public void setReleaseType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("releaseType", value);
    }
    /**
     * Sets the remediationImpact property value. Description of the impact on users of the remediation. Only applies to recommendations with category set to identitySecureScore.
     * @param value Value to set for the remediationImpact property.
     */
    public void setRemediationImpact(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("remediationImpact", value);
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final RecommendationStatus value) {
        this.backingStore.set("status", value);
    }
}
