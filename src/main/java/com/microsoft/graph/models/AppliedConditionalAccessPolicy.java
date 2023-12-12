package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AppliedConditionalAccessPolicy implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new AppliedConditionalAccessPolicy and sets the default values.
     */
    public AppliedConditionalAccessPolicy() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AppliedConditionalAccessPolicy
     */
    @jakarta.annotation.Nonnull
    public static AppliedConditionalAccessPolicy createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AppliedConditionalAccessPolicy();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.backingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the authenticationStrength property value. The custom authentication strength enforced in a Conditional Access policy.
     * @return a AuthenticationStrength
     */
    @jakarta.annotation.Nullable
    public AuthenticationStrength getAuthenticationStrength() {
        return this.backingStore.get("authenticationStrength");
    }
    /**
     * Gets the backingStore property value. Stores model information.
     * @return a BackingStore
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * Gets the conditionsNotSatisfied property value. Refers to the conditional access policy conditions that aren't satisfied. The possible values are: none, application, users, devicePlatform, location, clientType, signInRisk, userRisk, time, deviceState, client,ipAddressSeenByAzureAD,ipAddressSeenByResourceProvider,unknownFutureValue,servicePrincipals,servicePrincipalRisk, authenticationFlows, insiderRisk . You must use the Prefer: include-unknown-enum-members request header to get the following values in this evolvable enum: servicePrincipals,servicePrincipalRisk, authenticationFlows, insiderRisk. conditionalAccessConditions is a multi-valued enumeration and the property can contain multiple values in a comma-separated list.
     * @return a EnumSet<ConditionalAccessConditions>
     */
    @jakarta.annotation.Nullable
    public EnumSet<ConditionalAccessConditions> getConditionsNotSatisfied() {
        return this.backingStore.get("conditionsNotSatisfied");
    }
    /**
     * Gets the conditionsSatisfied property value. Refers to the conditional access policy conditions that are satisfied. The possible values are: none, application, users, devicePlatform, location, clientType, signInRisk, userRisk, time, deviceState, client,ipAddressSeenByAzureAD,ipAddressSeenByResourceProvider,unknownFutureValue,servicePrincipals,servicePrincipalRisk, authenticationFlows, insiderRisk. You must use the Prefer: include-unknown-enum-members request header to get the following values in this evolvable enum: servicePrincipals,servicePrincipalRisk, authenticationFlows, insiderRisk. conditionalAccessConditions is a multi-valued enumeration and the property can contain multiple values in a comma-separated list.
     * @return a EnumSet<ConditionalAccessConditions>
     */
    @jakarta.annotation.Nullable
    public EnumSet<ConditionalAccessConditions> getConditionsSatisfied() {
        return this.backingStore.get("conditionsSatisfied");
    }
    /**
     * Gets the displayName property value. Name of the conditional access policy.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * Gets the enforcedGrantControls property value. Refers to the grant controls enforced by the conditional access policy (example: 'Require multi-factor authentication').
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getEnforcedGrantControls() {
        return this.backingStore.get("enforcedGrantControls");
    }
    /**
     * Gets the enforcedSessionControls property value. Refers to the session controls enforced by the conditional access policy (example: 'Require app enforced controls').
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getEnforcedSessionControls() {
        return this.backingStore.get("enforcedSessionControls");
    }
    /**
     * Gets the excludeRulesSatisfied property value. List of key-value pairs containing each matched exclude condition in the conditional access policy. Example: [{'devicePlatform' : 'DevicePlatform'}] means the policy didn't apply, because the DevicePlatform condition was a match.
     * @return a java.util.List<ConditionalAccessRuleSatisfied>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ConditionalAccessRuleSatisfied> getExcludeRulesSatisfied() {
        return this.backingStore.get("excludeRulesSatisfied");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(12);
        deserializerMap.put("authenticationStrength", (n) -> { this.setAuthenticationStrength(n.getObjectValue(AuthenticationStrength::createFromDiscriminatorValue)); });
        deserializerMap.put("conditionsNotSatisfied", (n) -> { this.setConditionsNotSatisfied(n.getEnumSetValue(ConditionalAccessConditions::forValue)); });
        deserializerMap.put("conditionsSatisfied", (n) -> { this.setConditionsSatisfied(n.getEnumSetValue(ConditionalAccessConditions::forValue)); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("enforcedGrantControls", (n) -> { this.setEnforcedGrantControls(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("enforcedSessionControls", (n) -> { this.setEnforcedSessionControls(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("excludeRulesSatisfied", (n) -> { this.setExcludeRulesSatisfied(n.getCollectionOfObjectValues(ConditionalAccessRuleSatisfied::createFromDiscriminatorValue)); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("includeRulesSatisfied", (n) -> { this.setIncludeRulesSatisfied(n.getCollectionOfObjectValues(ConditionalAccessRuleSatisfied::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("result", (n) -> { this.setResult(n.getEnumValue(AppliedConditionalAccessPolicyResult::forValue)); });
        deserializerMap.put("sessionControlsNotSatisfied", (n) -> { this.setSessionControlsNotSatisfied(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the id property value. Identifier of the conditional access policy.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getId() {
        return this.backingStore.get("id");
    }
    /**
     * Gets the includeRulesSatisfied property value. List of key-value pairs containing each matched include condition in the conditional access policy. Example: [{ 'application' : 'AllApps'}, {'users': 'Group'}], meaning Application condition was a match because AllApps are included and Users condition was a match because the user was part of the included Group rule.
     * @return a java.util.List<ConditionalAccessRuleSatisfied>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ConditionalAccessRuleSatisfied> getIncludeRulesSatisfied() {
        return this.backingStore.get("includeRulesSatisfied");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Gets the result property value. Indicates the result of the CA policy that was triggered. Possible values are: success, failure, notApplied (Policy isn't applied because policy conditions weren't met),notEnabled (This is due to the policy in disabled state), unknown, unknownFutureValue, reportOnlySuccess, reportOnlyFailure, reportOnlyNotApplied, reportOnlyInterrupted. You must use the Prefer: include-unknown-enum-members request header to get the following values in this evolvable enum: reportOnlySuccess, reportOnlyFailure, reportOnlyNotApplied, reportOnlyInterrupted.
     * @return a AppliedConditionalAccessPolicyResult
     */
    @jakarta.annotation.Nullable
    public AppliedConditionalAccessPolicyResult getResult() {
        return this.backingStore.get("result");
    }
    /**
     * Gets the sessionControlsNotSatisfied property value. Refers to the session controls that a sign-in activity didn't satisfy. (Example: Application enforced Restrictions).
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getSessionControlsNotSatisfied() {
        return this.backingStore.get("sessionControlsNotSatisfied");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("authenticationStrength", this.getAuthenticationStrength());
        writer.writeEnumSetValue("conditionsNotSatisfied", this.getConditionsNotSatisfied());
        writer.writeEnumSetValue("conditionsSatisfied", this.getConditionsSatisfied());
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
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
    }
    /**
     * Sets the authenticationStrength property value. The custom authentication strength enforced in a Conditional Access policy.
     * @param value Value to set for the authenticationStrength property.
     */
    public void setAuthenticationStrength(@jakarta.annotation.Nullable final AuthenticationStrength value) {
        this.backingStore.set("authenticationStrength", value);
    }
    /**
     * Sets the backingStore property value. Stores model information.
     * @param value Value to set for the backingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.backingStore = value;
    }
    /**
     * Sets the conditionsNotSatisfied property value. Refers to the conditional access policy conditions that aren't satisfied. The possible values are: none, application, users, devicePlatform, location, clientType, signInRisk, userRisk, time, deviceState, client,ipAddressSeenByAzureAD,ipAddressSeenByResourceProvider,unknownFutureValue,servicePrincipals,servicePrincipalRisk, authenticationFlows, insiderRisk . You must use the Prefer: include-unknown-enum-members request header to get the following values in this evolvable enum: servicePrincipals,servicePrincipalRisk, authenticationFlows, insiderRisk. conditionalAccessConditions is a multi-valued enumeration and the property can contain multiple values in a comma-separated list.
     * @param value Value to set for the conditionsNotSatisfied property.
     */
    public void setConditionsNotSatisfied(@jakarta.annotation.Nullable final EnumSet<ConditionalAccessConditions> value) {
        this.backingStore.set("conditionsNotSatisfied", value);
    }
    /**
     * Sets the conditionsSatisfied property value. Refers to the conditional access policy conditions that are satisfied. The possible values are: none, application, users, devicePlatform, location, clientType, signInRisk, userRisk, time, deviceState, client,ipAddressSeenByAzureAD,ipAddressSeenByResourceProvider,unknownFutureValue,servicePrincipals,servicePrincipalRisk, authenticationFlows, insiderRisk. You must use the Prefer: include-unknown-enum-members request header to get the following values in this evolvable enum: servicePrincipals,servicePrincipalRisk, authenticationFlows, insiderRisk. conditionalAccessConditions is a multi-valued enumeration and the property can contain multiple values in a comma-separated list.
     * @param value Value to set for the conditionsSatisfied property.
     */
    public void setConditionsSatisfied(@jakarta.annotation.Nullable final EnumSet<ConditionalAccessConditions> value) {
        this.backingStore.set("conditionsSatisfied", value);
    }
    /**
     * Sets the displayName property value. Name of the conditional access policy.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the enforcedGrantControls property value. Refers to the grant controls enforced by the conditional access policy (example: 'Require multi-factor authentication').
     * @param value Value to set for the enforcedGrantControls property.
     */
    public void setEnforcedGrantControls(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("enforcedGrantControls", value);
    }
    /**
     * Sets the enforcedSessionControls property value. Refers to the session controls enforced by the conditional access policy (example: 'Require app enforced controls').
     * @param value Value to set for the enforcedSessionControls property.
     */
    public void setEnforcedSessionControls(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("enforcedSessionControls", value);
    }
    /**
     * Sets the excludeRulesSatisfied property value. List of key-value pairs containing each matched exclude condition in the conditional access policy. Example: [{'devicePlatform' : 'DevicePlatform'}] means the policy didn't apply, because the DevicePlatform condition was a match.
     * @param value Value to set for the excludeRulesSatisfied property.
     */
    public void setExcludeRulesSatisfied(@jakarta.annotation.Nullable final java.util.List<ConditionalAccessRuleSatisfied> value) {
        this.backingStore.set("excludeRulesSatisfied", value);
    }
    /**
     * Sets the id property value. Identifier of the conditional access policy.
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("id", value);
    }
    /**
     * Sets the includeRulesSatisfied property value. List of key-value pairs containing each matched include condition in the conditional access policy. Example: [{ 'application' : 'AllApps'}, {'users': 'Group'}], meaning Application condition was a match because AllApps are included and Users condition was a match because the user was part of the included Group rule.
     * @param value Value to set for the includeRulesSatisfied property.
     */
    public void setIncludeRulesSatisfied(@jakarta.annotation.Nullable final java.util.List<ConditionalAccessRuleSatisfied> value) {
        this.backingStore.set("includeRulesSatisfied", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the result property value. Indicates the result of the CA policy that was triggered. Possible values are: success, failure, notApplied (Policy isn't applied because policy conditions weren't met),notEnabled (This is due to the policy in disabled state), unknown, unknownFutureValue, reportOnlySuccess, reportOnlyFailure, reportOnlyNotApplied, reportOnlyInterrupted. You must use the Prefer: include-unknown-enum-members request header to get the following values in this evolvable enum: reportOnlySuccess, reportOnlyFailure, reportOnlyNotApplied, reportOnlyInterrupted.
     * @param value Value to set for the result property.
     */
    public void setResult(@jakarta.annotation.Nullable final AppliedConditionalAccessPolicyResult value) {
        this.backingStore.set("result", value);
    }
    /**
     * Sets the sessionControlsNotSatisfied property value. Refers to the session controls that a sign-in activity didn't satisfy. (Example: Application enforced Restrictions).
     * @param value Value to set for the sessionControlsNotSatisfied property.
     */
    public void setSessionControlsNotSatisfied(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("sessionControlsNotSatisfied", value);
    }
}
