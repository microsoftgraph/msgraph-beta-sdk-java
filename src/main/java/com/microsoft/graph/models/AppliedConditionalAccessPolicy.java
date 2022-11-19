package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AppliedConditionalAccessPolicy implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The custom authentication strength enforced in a Conditional Access policy. */
    private AuthenticationStrength _authenticationStrength;
    /** Refers to the conditional access policy conditions that are not satisfied. The possible values are: none, application, users, devicePlatform, location, clientType, signInRisk, userRisk, time, deviceState, client,ipAddressSeenByAzureAD,ipAddressSeenByResourceProvider,unknownFutureValue,servicePrincipals,servicePrincipalRisk. Note that you must use the Prefer: include-unknown-enum-members request header to get the following values in this evolvable enum: servicePrincipals,servicePrincipalRisk. */
    private ConditionalAccessConditions _conditionsNotSatisfied;
    /** Refers to the conditional access policy conditions that are satisfied. The possible values are: none, application, users, devicePlatform, location, clientType, signInRisk, userRisk, time, deviceState, client,ipAddressSeenByAzureAD,ipAddressSeenByResourceProvider,unknownFutureValue,servicePrincipals,servicePrincipalRisk. Note that you must use the Prefer: include-unknown-enum-members request header to get the following values in this evolvable enum: servicePrincipals,servicePrincipalRisk. */
    private ConditionalAccessConditions _conditionsSatisfied;
    /** Name of the conditional access policy. */
    private String _displayName;
    /** Refers to the grant controls enforced by the conditional access policy (example: 'Require multi-factor authentication'). */
    private java.util.List<String> _enforcedGrantControls;
    /** Refers to the session controls enforced by the conditional access policy (example: 'Require app enforced controls'). */
    private java.util.List<String> _enforcedSessionControls;
    /** List of key-value pairs containing each matched exclude condition in the conditional access policy. Example: [{'devicePlatform' : 'DevicePlatform'}] means the policy didnt apply, because the DevicePlatform condition was a match. */
    private java.util.List<ConditionalAccessRuleSatisfied> _excludeRulesSatisfied;
    /** Identifier of the conditional access policy. */
    private String _id;
    /** List of key-value pairs containing each matched include condition in the conditional access policy. Example: [{ 'application' : 'AllApps'}, {'users': 'Group'}], meaning Application condition was a match because AllApps are included and Users condition was a match because the user was part of the included Group rule. */
    private java.util.List<ConditionalAccessRuleSatisfied> _includeRulesSatisfied;
    /** The OdataType property */
    private String _odataType;
    /** Indicates the result of the CA policy that was triggered. Possible values are: success, failure, notApplied (Policy isn't applied because policy conditions were not met),notEnabled (This is due to the policy in disabled state), unknown, unknownFutureValue, reportOnlySuccess, reportOnlyFailure, reportOnlyNotApplied, reportOnlyInterrupted. Note that you must use the Prefer: include-unknown-enum-members request header to get the following values in this evolvable enum: reportOnlySuccess, reportOnlyFailure, reportOnlyNotApplied, reportOnlyInterrupted. */
    private AppliedConditionalAccessPolicyResult _result;
    /** Refers to the session controls that a sign-in activity did not satisfy. (Example: Application enforced Restrictions). */
    private java.util.List<String> _sessionControlsNotSatisfied;
    /**
     * Instantiates a new appliedConditionalAccessPolicy and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AppliedConditionalAccessPolicy() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.appliedConditionalAccessPolicy");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a appliedConditionalAccessPolicy
     */
    @javax.annotation.Nonnull
    public static AppliedConditionalAccessPolicy createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AppliedConditionalAccessPolicy();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * Gets the authenticationStrength property value. The custom authentication strength enforced in a Conditional Access policy.
     * @return a authenticationStrength
     */
    @javax.annotation.Nullable
    public AuthenticationStrength getAuthenticationStrength() {
        return this._authenticationStrength;
    }
    /**
     * Gets the conditionsNotSatisfied property value. Refers to the conditional access policy conditions that are not satisfied. The possible values are: none, application, users, devicePlatform, location, clientType, signInRisk, userRisk, time, deviceState, client,ipAddressSeenByAzureAD,ipAddressSeenByResourceProvider,unknownFutureValue,servicePrincipals,servicePrincipalRisk. Note that you must use the Prefer: include-unknown-enum-members request header to get the following values in this evolvable enum: servicePrincipals,servicePrincipalRisk.
     * @return a conditionalAccessConditions
     */
    @javax.annotation.Nullable
    public ConditionalAccessConditions getConditionsNotSatisfied() {
        return this._conditionsNotSatisfied;
    }
    /**
     * Gets the conditionsSatisfied property value. Refers to the conditional access policy conditions that are satisfied. The possible values are: none, application, users, devicePlatform, location, clientType, signInRisk, userRisk, time, deviceState, client,ipAddressSeenByAzureAD,ipAddressSeenByResourceProvider,unknownFutureValue,servicePrincipals,servicePrincipalRisk. Note that you must use the Prefer: include-unknown-enum-members request header to get the following values in this evolvable enum: servicePrincipals,servicePrincipalRisk.
     * @return a conditionalAccessConditions
     */
    @javax.annotation.Nullable
    public ConditionalAccessConditions getConditionsSatisfied() {
        return this._conditionsSatisfied;
    }
    /**
     * Gets the displayName property value. Name of the conditional access policy.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * Gets the enforcedGrantControls property value. Refers to the grant controls enforced by the conditional access policy (example: 'Require multi-factor authentication').
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getEnforcedGrantControls() {
        return this._enforcedGrantControls;
    }
    /**
     * Gets the enforcedSessionControls property value. Refers to the session controls enforced by the conditional access policy (example: 'Require app enforced controls').
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getEnforcedSessionControls() {
        return this._enforcedSessionControls;
    }
    /**
     * Gets the excludeRulesSatisfied property value. List of key-value pairs containing each matched exclude condition in the conditional access policy. Example: [{'devicePlatform' : 'DevicePlatform'}] means the policy didnt apply, because the DevicePlatform condition was a match.
     * @return a conditionalAccessRuleSatisfied
     */
    @javax.annotation.Nullable
    public java.util.List<ConditionalAccessRuleSatisfied> getExcludeRulesSatisfied() {
        return this._excludeRulesSatisfied;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AppliedConditionalAccessPolicy currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(12);
        deserializerMap.put("authenticationStrength", (n) -> { currentObject.setAuthenticationStrength(n.getObjectValue(AuthenticationStrength::createFromDiscriminatorValue)); });
        deserializerMap.put("conditionsNotSatisfied", (n) -> { currentObject.setConditionsNotSatisfied(n.getEnumValue(ConditionalAccessConditions.class)); });
        deserializerMap.put("conditionsSatisfied", (n) -> { currentObject.setConditionsSatisfied(n.getEnumValue(ConditionalAccessConditions.class)); });
        deserializerMap.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
        deserializerMap.put("enforcedGrantControls", (n) -> { currentObject.setEnforcedGrantControls(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("enforcedSessionControls", (n) -> { currentObject.setEnforcedSessionControls(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("excludeRulesSatisfied", (n) -> { currentObject.setExcludeRulesSatisfied(n.getCollectionOfObjectValues(ConditionalAccessRuleSatisfied::createFromDiscriminatorValue)); });
        deserializerMap.put("id", (n) -> { currentObject.setId(n.getStringValue()); });
        deserializerMap.put("includeRulesSatisfied", (n) -> { currentObject.setIncludeRulesSatisfied(n.getCollectionOfObjectValues(ConditionalAccessRuleSatisfied::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
        deserializerMap.put("result", (n) -> { currentObject.setResult(n.getEnumValue(AppliedConditionalAccessPolicyResult.class)); });
        deserializerMap.put("sessionControlsNotSatisfied", (n) -> { currentObject.setSessionControlsNotSatisfied(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the id property value. Identifier of the conditional access policy.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getId() {
        return this._id;
    }
    /**
     * Gets the includeRulesSatisfied property value. List of key-value pairs containing each matched include condition in the conditional access policy. Example: [{ 'application' : 'AllApps'}, {'users': 'Group'}], meaning Application condition was a match because AllApps are included and Users condition was a match because the user was part of the included Group rule.
     * @return a conditionalAccessRuleSatisfied
     */
    @javax.annotation.Nullable
    public java.util.List<ConditionalAccessRuleSatisfied> getIncludeRulesSatisfied() {
        return this._includeRulesSatisfied;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this._odataType;
    }
    /**
     * Gets the result property value. Indicates the result of the CA policy that was triggered. Possible values are: success, failure, notApplied (Policy isn't applied because policy conditions were not met),notEnabled (This is due to the policy in disabled state), unknown, unknownFutureValue, reportOnlySuccess, reportOnlyFailure, reportOnlyNotApplied, reportOnlyInterrupted. Note that you must use the Prefer: include-unknown-enum-members request header to get the following values in this evolvable enum: reportOnlySuccess, reportOnlyFailure, reportOnlyNotApplied, reportOnlyInterrupted.
     * @return a appliedConditionalAccessPolicyResult
     */
    @javax.annotation.Nullable
    public AppliedConditionalAccessPolicyResult getResult() {
        return this._result;
    }
    /**
     * Gets the sessionControlsNotSatisfied property value. Refers to the session controls that a sign-in activity did not satisfy. (Example: Application enforced Restrictions).
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getSessionControlsNotSatisfied() {
        return this._sessionControlsNotSatisfied;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("authenticationStrength", this.getAuthenticationStrength());
        writer.writeEnumValue("conditionsNotSatisfied", this.getConditionsNotSatisfied());
        writer.writeEnumValue("conditionsSatisfied", this.getConditionsSatisfied());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeCollectionOfPrimitiveValues("enforcedGrantControls", this.getEnforcedGrantControls());
        writer.writeCollectionOfPrimitiveValues("enforcedSessionControls", this.getEnforcedSessionControls());
        writer.writeCollectionOfObjectValues("excludeRulesSatisfied", this.getExcludeRulesSatisfied());
        writer.writeStringValue("id", this.getId());
        writer.writeCollectionOfObjectValues("includeRulesSatisfied", this.getIncludeRulesSatisfied());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeEnumValue("result", this.getResult());
        writer.writeCollectionOfPrimitiveValues("sessionControlsNotSatisfied", this.getSessionControlsNotSatisfied());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the authenticationStrength property value. The custom authentication strength enforced in a Conditional Access policy.
     * @param value Value to set for the authenticationStrength property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAuthenticationStrength(@javax.annotation.Nullable final AuthenticationStrength value) {
        this._authenticationStrength = value;
    }
    /**
     * Sets the conditionsNotSatisfied property value. Refers to the conditional access policy conditions that are not satisfied. The possible values are: none, application, users, devicePlatform, location, clientType, signInRisk, userRisk, time, deviceState, client,ipAddressSeenByAzureAD,ipAddressSeenByResourceProvider,unknownFutureValue,servicePrincipals,servicePrincipalRisk. Note that you must use the Prefer: include-unknown-enum-members request header to get the following values in this evolvable enum: servicePrincipals,servicePrincipalRisk.
     * @param value Value to set for the conditionsNotSatisfied property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setConditionsNotSatisfied(@javax.annotation.Nullable final ConditionalAccessConditions value) {
        this._conditionsNotSatisfied = value;
    }
    /**
     * Sets the conditionsSatisfied property value. Refers to the conditional access policy conditions that are satisfied. The possible values are: none, application, users, devicePlatform, location, clientType, signInRisk, userRisk, time, deviceState, client,ipAddressSeenByAzureAD,ipAddressSeenByResourceProvider,unknownFutureValue,servicePrincipals,servicePrincipalRisk. Note that you must use the Prefer: include-unknown-enum-members request header to get the following values in this evolvable enum: servicePrincipals,servicePrincipalRisk.
     * @param value Value to set for the conditionsSatisfied property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setConditionsSatisfied(@javax.annotation.Nullable final ConditionalAccessConditions value) {
        this._conditionsSatisfied = value;
    }
    /**
     * Sets the displayName property value. Name of the conditional access policy.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the enforcedGrantControls property value. Refers to the grant controls enforced by the conditional access policy (example: 'Require multi-factor authentication').
     * @param value Value to set for the enforcedGrantControls property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEnforcedGrantControls(@javax.annotation.Nullable final java.util.List<String> value) {
        this._enforcedGrantControls = value;
    }
    /**
     * Sets the enforcedSessionControls property value. Refers to the session controls enforced by the conditional access policy (example: 'Require app enforced controls').
     * @param value Value to set for the enforcedSessionControls property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEnforcedSessionControls(@javax.annotation.Nullable final java.util.List<String> value) {
        this._enforcedSessionControls = value;
    }
    /**
     * Sets the excludeRulesSatisfied property value. List of key-value pairs containing each matched exclude condition in the conditional access policy. Example: [{'devicePlatform' : 'DevicePlatform'}] means the policy didnt apply, because the DevicePlatform condition was a match.
     * @param value Value to set for the excludeRulesSatisfied property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExcludeRulesSatisfied(@javax.annotation.Nullable final java.util.List<ConditionalAccessRuleSatisfied> value) {
        this._excludeRulesSatisfied = value;
    }
    /**
     * Sets the id property value. Identifier of the conditional access policy.
     * @param value Value to set for the id property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setId(@javax.annotation.Nullable final String value) {
        this._id = value;
    }
    /**
     * Sets the includeRulesSatisfied property value. List of key-value pairs containing each matched include condition in the conditional access policy. Example: [{ 'application' : 'AllApps'}, {'users': 'Group'}], meaning Application condition was a match because AllApps are included and Users condition was a match because the user was part of the included Group rule.
     * @param value Value to set for the includeRulesSatisfied property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIncludeRulesSatisfied(@javax.annotation.Nullable final java.util.List<ConditionalAccessRuleSatisfied> value) {
        this._includeRulesSatisfied = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the result property value. Indicates the result of the CA policy that was triggered. Possible values are: success, failure, notApplied (Policy isn't applied because policy conditions were not met),notEnabled (This is due to the policy in disabled state), unknown, unknownFutureValue, reportOnlySuccess, reportOnlyFailure, reportOnlyNotApplied, reportOnlyInterrupted. Note that you must use the Prefer: include-unknown-enum-members request header to get the following values in this evolvable enum: reportOnlySuccess, reportOnlyFailure, reportOnlyNotApplied, reportOnlyInterrupted.
     * @param value Value to set for the result property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setResult(@javax.annotation.Nullable final AppliedConditionalAccessPolicyResult value) {
        this._result = value;
    }
    /**
     * Sets the sessionControlsNotSatisfied property value. Refers to the session controls that a sign-in activity did not satisfy. (Example: Application enforced Restrictions).
     * @param value Value to set for the sessionControlsNotSatisfied property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSessionControlsNotSatisfied(@javax.annotation.Nullable final java.util.List<String> value) {
        this._sessionControlsNotSatisfied = value;
    }
}
