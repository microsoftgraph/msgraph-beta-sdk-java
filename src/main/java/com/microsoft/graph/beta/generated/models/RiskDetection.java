package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RiskDetection extends Entity implements Parsable {
    /**
     * Instantiates a new RiskDetection and sets the default values.
     */
    public RiskDetection() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a RiskDetection
     */
    @jakarta.annotation.Nonnull
    public static RiskDetection createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RiskDetection();
    }
    /**
     * Gets the activity property value. Indicates the activity type the detected risk is linked to. The possible values are signin, user, unknownFutureValue.
     * @return a RiskDetectionActivity
     */
    @jakarta.annotation.Nullable
    public RiskDetectionActivity getActivity() {
        return this.backingStore.get("activity");
    }
    /**
     * Gets the activityDateTime property value. Date and time that the risky activity occurred. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getActivityDateTime() {
        return this.backingStore.get("activityDateTime");
    }
    /**
     * Gets the additionalInfo property value. Additional information associated with the risk detection in JSON format.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAdditionalInfo() {
        return this.backingStore.get("additionalInfo");
    }
    /**
     * Gets the correlationId property value. Correlation ID of the sign-in associated with the risk detection. This property is null if the risk detection is not associated with a sign-in.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCorrelationId() {
        return this.backingStore.get("correlationId");
    }
    /**
     * Gets the detectedDateTime property value. Date and time that the risk was detected. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getDetectedDateTime() {
        return this.backingStore.get("detectedDateTime");
    }
    /**
     * Gets the detectionTimingType property value. Timing of the detected risk (real-time/offline). The possible values are notDefined, realtime, nearRealtime, offline, unknownFutureValue.
     * @return a RiskDetectionDetectionTimingType
     */
    @jakarta.annotation.Nullable
    public RiskDetectionDetectionTimingType getDetectionTimingType() {
        return this.backingStore.get("detectionTimingType");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("activity", (n) -> { this.setActivity(n.getEnumValue(RiskDetectionActivity::forValue)); });
        deserializerMap.put("activityDateTime", (n) -> { this.setActivityDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("additionalInfo", (n) -> { this.setAdditionalInfo(n.getStringValue()); });
        deserializerMap.put("correlationId", (n) -> { this.setCorrelationId(n.getStringValue()); });
        deserializerMap.put("detectedDateTime", (n) -> { this.setDetectedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("detectionTimingType", (n) -> { this.setDetectionTimingType(n.getEnumValue(RiskDetectionDetectionTimingType::forValue)); });
        deserializerMap.put("ipAddress", (n) -> { this.setIpAddress(n.getStringValue()); });
        deserializerMap.put("lastUpdatedDateTime", (n) -> { this.setLastUpdatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("location", (n) -> { this.setLocation(n.getObjectValue(SignInLocation::createFromDiscriminatorValue)); });
        deserializerMap.put("mitreTechniqueId", (n) -> { this.setMitreTechniqueId(n.getStringValue()); });
        deserializerMap.put("requestId", (n) -> { this.setRequestId(n.getStringValue()); });
        deserializerMap.put("riskDetail", (n) -> { this.setRiskDetail(n.getEnumValue(RiskDetectionRiskDetail::forValue)); });
        deserializerMap.put("riskEventType", (n) -> { this.setRiskEventType(n.getStringValue()); });
        deserializerMap.put("riskLevel", (n) -> { this.setRiskLevel(n.getEnumValue(RiskDetectionRiskLevel::forValue)); });
        deserializerMap.put("riskState", (n) -> { this.setRiskState(n.getEnumValue(RiskDetectionRiskState::forValue)); });
        deserializerMap.put("riskType", (n) -> { this.setRiskType(n.getEnumValue(RiskDetectionRiskType::forValue)); });
        deserializerMap.put("source", (n) -> { this.setSource(n.getStringValue()); });
        deserializerMap.put("tokenIssuerType", (n) -> { this.setTokenIssuerType(n.getEnumValue(RiskDetectionTokenIssuerType::forValue)); });
        deserializerMap.put("userDisplayName", (n) -> { this.setUserDisplayName(n.getStringValue()); });
        deserializerMap.put("userId", (n) -> { this.setUserId(n.getStringValue()); });
        deserializerMap.put("userPrincipalName", (n) -> { this.setUserPrincipalName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the ipAddress property value. Provides the IP address of the client from where the risk occurred.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getIpAddress() {
        return this.backingStore.get("ipAddress");
    }
    /**
     * Gets the lastUpdatedDateTime property value. Date and time that the risk detection was last updated.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastUpdatedDateTime() {
        return this.backingStore.get("lastUpdatedDateTime");
    }
    /**
     * Gets the location property value. Location of the sign-in.
     * @return a SignInLocation
     */
    @jakarta.annotation.Nullable
    public SignInLocation getLocation() {
        return this.backingStore.get("location");
    }
    /**
     * Gets the mitreTechniqueId property value. The mitreTechniqueId property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getMitreTechniqueId() {
        return this.backingStore.get("mitreTechniqueId");
    }
    /**
     * Gets the requestId property value. Request ID of the sign-in associated with the risk detection. This property is null if the risk detection is not associated with a sign-in.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getRequestId() {
        return this.backingStore.get("requestId");
    }
    /**
     * Gets the riskDetail property value. Details of the detected risk. The possible values are: none, adminGeneratedTemporaryPassword, userPerformedSecuredPasswordChange, userPerformedSecuredPasswordReset, adminConfirmedSigninSafe, aiConfirmedSigninSafe, userPassedMFADrivenByRiskBasedPolicy, adminDismissedAllRiskForUser, adminConfirmedSigninCompromised, hidden, adminConfirmedUserCompromised, unknownFutureValue, adminConfirmedServicePrincipalCompromised, adminDismissedAllRiskForServicePrincipal, m365DAdminDismissedDetection. Note that you must use the Prefer: include - unknown -enum-members request header to get the following value(s) in this evolvable enum: adminConfirmedServicePrincipalCompromised , adminDismissedAllRiskForServicePrincipal , m365DAdminDismissedDetection. Note: Details for this property are only available for Microsoft Entra ID P2 customers. P1 customers will be returned hidden.
     * @return a RiskDetectionRiskDetail
     */
    @jakarta.annotation.Nullable
    public RiskDetectionRiskDetail getRiskDetail() {
        return this.backingStore.get("riskDetail");
    }
    /**
     * Gets the riskEventType property value. The type of risk event detected. The possible values are unlikelyTravel, anonymizedIPAddress, maliciousIPAddress, unfamiliarFeatures, malwareInfectedIPAddress, suspiciousIPAddress, leakedCredentials, investigationsThreatIntelligence, generic,adminConfirmedUserCompromised, mcasImpossibleTravel, mcasSuspiciousInboxManipulationRules, investigationsThreatIntelligenceSigninLinked, maliciousIPAddressValidCredentialsBlockedIP, anomalousUserActivity, userReportedSuspiciousActivity.  For more information about each value, see riskEventType values.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getRiskEventType() {
        return this.backingStore.get("riskEventType");
    }
    /**
     * Gets the riskLevel property value. Level of the detected risk. The possible values are low, medium, high, hidden, none, unknownFutureValue. Note: Details for this property are only available for Microsoft Entra ID P2 customers. P1 customers will be returned hidden.
     * @return a RiskDetectionRiskLevel
     */
    @jakarta.annotation.Nullable
    public RiskDetectionRiskLevel getRiskLevel() {
        return this.backingStore.get("riskLevel");
    }
    /**
     * Gets the riskState property value. The state of a detected risky user or sign-in. The possible values are none, confirmedSafe, remediated, dismissed, atRisk, confirmedCompromised, and unknownFutureValue.
     * @return a RiskDetectionRiskState
     */
    @jakarta.annotation.Nullable
    public RiskDetectionRiskState getRiskState() {
        return this.backingStore.get("riskState");
    }
    /**
     * Gets the riskType property value. The riskType property
     * @return a RiskDetectionRiskType
     */
    @jakarta.annotation.Nullable
    public RiskDetectionRiskType getRiskType() {
        return this.backingStore.get("riskType");
    }
    /**
     * Gets the source property value. Source of the risk detection. For example, activeDirectory.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSource() {
        return this.backingStore.get("source");
    }
    /**
     * Gets the tokenIssuerType property value. Indicates the type of token issuer for the detected sign-in risk. The possible values are AzureAD, ADFederationServices, and unknownFutureValue.
     * @return a RiskDetectionTokenIssuerType
     */
    @jakarta.annotation.Nullable
    public RiskDetectionTokenIssuerType getTokenIssuerType() {
        return this.backingStore.get("tokenIssuerType");
    }
    /**
     * Gets the userDisplayName property value. Name of the user.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getUserDisplayName() {
        return this.backingStore.get("userDisplayName");
    }
    /**
     * Gets the userId property value. Unique ID of the user.  The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getUserId() {
        return this.backingStore.get("userId");
    }
    /**
     * Gets the userPrincipalName property value. The user principal name (UPN) of the user.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getUserPrincipalName() {
        return this.backingStore.get("userPrincipalName");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("activity", this.getActivity());
        writer.writeOffsetDateTimeValue("activityDateTime", this.getActivityDateTime());
        writer.writeStringValue("additionalInfo", this.getAdditionalInfo());
        writer.writeStringValue("correlationId", this.getCorrelationId());
        writer.writeOffsetDateTimeValue("detectedDateTime", this.getDetectedDateTime());
        writer.writeEnumValue("detectionTimingType", this.getDetectionTimingType());
        writer.writeStringValue("ipAddress", this.getIpAddress());
        writer.writeOffsetDateTimeValue("lastUpdatedDateTime", this.getLastUpdatedDateTime());
        writer.writeObjectValue("location", this.getLocation());
        writer.writeStringValue("mitreTechniqueId", this.getMitreTechniqueId());
        writer.writeStringValue("requestId", this.getRequestId());
        writer.writeEnumValue("riskDetail", this.getRiskDetail());
        writer.writeStringValue("riskEventType", this.getRiskEventType());
        writer.writeEnumValue("riskLevel", this.getRiskLevel());
        writer.writeEnumValue("riskState", this.getRiskState());
        writer.writeEnumValue("riskType", this.getRiskType());
        writer.writeStringValue("source", this.getSource());
        writer.writeEnumValue("tokenIssuerType", this.getTokenIssuerType());
        writer.writeStringValue("userDisplayName", this.getUserDisplayName());
        writer.writeStringValue("userId", this.getUserId());
        writer.writeStringValue("userPrincipalName", this.getUserPrincipalName());
    }
    /**
     * Sets the activity property value. Indicates the activity type the detected risk is linked to. The possible values are signin, user, unknownFutureValue.
     * @param value Value to set for the activity property.
     */
    public void setActivity(@jakarta.annotation.Nullable final RiskDetectionActivity value) {
        this.backingStore.set("activity", value);
    }
    /**
     * Sets the activityDateTime property value. Date and time that the risky activity occurred. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @param value Value to set for the activityDateTime property.
     */
    public void setActivityDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("activityDateTime", value);
    }
    /**
     * Sets the additionalInfo property value. Additional information associated with the risk detection in JSON format.
     * @param value Value to set for the additionalInfo property.
     */
    public void setAdditionalInfo(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("additionalInfo", value);
    }
    /**
     * Sets the correlationId property value. Correlation ID of the sign-in associated with the risk detection. This property is null if the risk detection is not associated with a sign-in.
     * @param value Value to set for the correlationId property.
     */
    public void setCorrelationId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("correlationId", value);
    }
    /**
     * Sets the detectedDateTime property value. Date and time that the risk was detected. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @param value Value to set for the detectedDateTime property.
     */
    public void setDetectedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("detectedDateTime", value);
    }
    /**
     * Sets the detectionTimingType property value. Timing of the detected risk (real-time/offline). The possible values are notDefined, realtime, nearRealtime, offline, unknownFutureValue.
     * @param value Value to set for the detectionTimingType property.
     */
    public void setDetectionTimingType(@jakarta.annotation.Nullable final RiskDetectionDetectionTimingType value) {
        this.backingStore.set("detectionTimingType", value);
    }
    /**
     * Sets the ipAddress property value. Provides the IP address of the client from where the risk occurred.
     * @param value Value to set for the ipAddress property.
     */
    public void setIpAddress(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("ipAddress", value);
    }
    /**
     * Sets the lastUpdatedDateTime property value. Date and time that the risk detection was last updated.
     * @param value Value to set for the lastUpdatedDateTime property.
     */
    public void setLastUpdatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastUpdatedDateTime", value);
    }
    /**
     * Sets the location property value. Location of the sign-in.
     * @param value Value to set for the location property.
     */
    public void setLocation(@jakarta.annotation.Nullable final SignInLocation value) {
        this.backingStore.set("location", value);
    }
    /**
     * Sets the mitreTechniqueId property value. The mitreTechniqueId property
     * @param value Value to set for the mitreTechniqueId property.
     */
    public void setMitreTechniqueId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("mitreTechniqueId", value);
    }
    /**
     * Sets the requestId property value. Request ID of the sign-in associated with the risk detection. This property is null if the risk detection is not associated with a sign-in.
     * @param value Value to set for the requestId property.
     */
    public void setRequestId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("requestId", value);
    }
    /**
     * Sets the riskDetail property value. Details of the detected risk. The possible values are: none, adminGeneratedTemporaryPassword, userPerformedSecuredPasswordChange, userPerformedSecuredPasswordReset, adminConfirmedSigninSafe, aiConfirmedSigninSafe, userPassedMFADrivenByRiskBasedPolicy, adminDismissedAllRiskForUser, adminConfirmedSigninCompromised, hidden, adminConfirmedUserCompromised, unknownFutureValue, adminConfirmedServicePrincipalCompromised, adminDismissedAllRiskForServicePrincipal, m365DAdminDismissedDetection. Note that you must use the Prefer: include - unknown -enum-members request header to get the following value(s) in this evolvable enum: adminConfirmedServicePrincipalCompromised , adminDismissedAllRiskForServicePrincipal , m365DAdminDismissedDetection. Note: Details for this property are only available for Microsoft Entra ID P2 customers. P1 customers will be returned hidden.
     * @param value Value to set for the riskDetail property.
     */
    public void setRiskDetail(@jakarta.annotation.Nullable final RiskDetectionRiskDetail value) {
        this.backingStore.set("riskDetail", value);
    }
    /**
     * Sets the riskEventType property value. The type of risk event detected. The possible values are unlikelyTravel, anonymizedIPAddress, maliciousIPAddress, unfamiliarFeatures, malwareInfectedIPAddress, suspiciousIPAddress, leakedCredentials, investigationsThreatIntelligence, generic,adminConfirmedUserCompromised, mcasImpossibleTravel, mcasSuspiciousInboxManipulationRules, investigationsThreatIntelligenceSigninLinked, maliciousIPAddressValidCredentialsBlockedIP, anomalousUserActivity, userReportedSuspiciousActivity.  For more information about each value, see riskEventType values.
     * @param value Value to set for the riskEventType property.
     */
    public void setRiskEventType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("riskEventType", value);
    }
    /**
     * Sets the riskLevel property value. Level of the detected risk. The possible values are low, medium, high, hidden, none, unknownFutureValue. Note: Details for this property are only available for Microsoft Entra ID P2 customers. P1 customers will be returned hidden.
     * @param value Value to set for the riskLevel property.
     */
    public void setRiskLevel(@jakarta.annotation.Nullable final RiskDetectionRiskLevel value) {
        this.backingStore.set("riskLevel", value);
    }
    /**
     * Sets the riskState property value. The state of a detected risky user or sign-in. The possible values are none, confirmedSafe, remediated, dismissed, atRisk, confirmedCompromised, and unknownFutureValue.
     * @param value Value to set for the riskState property.
     */
    public void setRiskState(@jakarta.annotation.Nullable final RiskDetectionRiskState value) {
        this.backingStore.set("riskState", value);
    }
    /**
     * Sets the riskType property value. The riskType property
     * @param value Value to set for the riskType property.
     */
    public void setRiskType(@jakarta.annotation.Nullable final RiskDetectionRiskType value) {
        this.backingStore.set("riskType", value);
    }
    /**
     * Sets the source property value. Source of the risk detection. For example, activeDirectory.
     * @param value Value to set for the source property.
     */
    public void setSource(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("source", value);
    }
    /**
     * Sets the tokenIssuerType property value. Indicates the type of token issuer for the detected sign-in risk. The possible values are AzureAD, ADFederationServices, and unknownFutureValue.
     * @param value Value to set for the tokenIssuerType property.
     */
    public void setTokenIssuerType(@jakarta.annotation.Nullable final RiskDetectionTokenIssuerType value) {
        this.backingStore.set("tokenIssuerType", value);
    }
    /**
     * Sets the userDisplayName property value. Name of the user.
     * @param value Value to set for the userDisplayName property.
     */
    public void setUserDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("userDisplayName", value);
    }
    /**
     * Sets the userId property value. Unique ID of the user.  The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @param value Value to set for the userId property.
     */
    public void setUserId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("userId", value);
    }
    /**
     * Sets the userPrincipalName property value. The user principal name (UPN) of the user.
     * @param value Value to set for the userPrincipalName property.
     */
    public void setUserPrincipalName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("userPrincipalName", value);
    }
}
