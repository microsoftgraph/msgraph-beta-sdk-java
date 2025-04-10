package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AuthenticationAppPolicyDetails implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link AuthenticationAppPolicyDetails} and sets the default values.
     */
    public AuthenticationAppPolicyDetails() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AuthenticationAppPolicyDetails}
     */
    @jakarta.annotation.Nonnull
    public static AuthenticationAppPolicyDetails createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AuthenticationAppPolicyDetails();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a {@link Map<String, Object>}
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
     * Gets the adminConfiguration property value. The admin configuration of the policy on the user&apos;s authentication app. For a policy that does not impact the success/failure of the authentication, the evaluation defaults to notApplicable. The possible values are: notApplicable, enabled, disabled, unknownFutureValue.
     * @return a {@link AuthenticationAppAdminConfiguration}
     */
    @jakarta.annotation.Nullable
    public AuthenticationAppAdminConfiguration getAdminConfiguration() {
        return this.backingStore.get("adminConfiguration");
    }
    /**
     * Gets the authenticationEvaluation property value. Evaluates the success/failure of the authentication based on the admin configuration of the policy on the user&apos;s client authentication app. The possible values are: success, failure, unknownFutureValue.
     * @return a {@link AuthenticationAppEvaluation}
     */
    @jakarta.annotation.Nullable
    public AuthenticationAppEvaluation getAuthenticationEvaluation() {
        return this.backingStore.get("authenticationEvaluation");
    }
    /**
     * Gets the backingStore property value. Stores model information.
     * @return a {@link BackingStore}
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("adminConfiguration", (n) -> { this.setAdminConfiguration(n.getEnumValue(AuthenticationAppAdminConfiguration::forValue)); });
        deserializerMap.put("authenticationEvaluation", (n) -> { this.setAuthenticationEvaluation(n.getEnumValue(AuthenticationAppEvaluation::forValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("policyName", (n) -> { this.setPolicyName(n.getStringValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(AuthenticationAppPolicyStatus::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Gets the policyName property value. The name of the policy enforced on the user&apos;s authentication app.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPolicyName() {
        return this.backingStore.get("policyName");
    }
    /**
     * Gets the status property value. Refers to whether the policy executed as expected on the user&apos;s client authentication app. The possible values are: unknown, appLockOutOfDate, appLockEnabled, appLockDisabled, appContextOutOfDate, appContextShown, appContextNotShown, locationContextOutOfDate, locationContextShown, locationContextNotShown, numberMatchOutOfDate, numberMatchCorrectNumberEntered, numberMatchIncorrectNumberEntered, numberMatchDeny, tamperResistantHardwareOutOfDate, tamperResistantHardwareUsed, tamperResistantHardwareNotUsed, unknownFutureValue.
     * @return a {@link AuthenticationAppPolicyStatus}
     */
    @jakarta.annotation.Nullable
    public AuthenticationAppPolicyStatus getStatus() {
        return this.backingStore.get("status");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("adminConfiguration", this.getAdminConfiguration());
        writer.writeEnumValue("authenticationEvaluation", this.getAuthenticationEvaluation());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("policyName", this.getPolicyName());
        writer.writeEnumValue("status", this.getStatus());
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
     * Sets the adminConfiguration property value. The admin configuration of the policy on the user&apos;s authentication app. For a policy that does not impact the success/failure of the authentication, the evaluation defaults to notApplicable. The possible values are: notApplicable, enabled, disabled, unknownFutureValue.
     * @param value Value to set for the adminConfiguration property.
     */
    public void setAdminConfiguration(@jakarta.annotation.Nullable final AuthenticationAppAdminConfiguration value) {
        this.backingStore.set("adminConfiguration", value);
    }
    /**
     * Sets the authenticationEvaluation property value. Evaluates the success/failure of the authentication based on the admin configuration of the policy on the user&apos;s client authentication app. The possible values are: success, failure, unknownFutureValue.
     * @param value Value to set for the authenticationEvaluation property.
     */
    public void setAuthenticationEvaluation(@jakarta.annotation.Nullable final AuthenticationAppEvaluation value) {
        this.backingStore.set("authenticationEvaluation", value);
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
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the policyName property value. The name of the policy enforced on the user&apos;s authentication app.
     * @param value Value to set for the policyName property.
     */
    public void setPolicyName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("policyName", value);
    }
    /**
     * Sets the status property value. Refers to whether the policy executed as expected on the user&apos;s client authentication app. The possible values are: unknown, appLockOutOfDate, appLockEnabled, appLockDisabled, appContextOutOfDate, appContextShown, appContextNotShown, locationContextOutOfDate, locationContextShown, locationContextNotShown, numberMatchOutOfDate, numberMatchCorrectNumberEntered, numberMatchIncorrectNumberEntered, numberMatchDeny, tamperResistantHardwareOutOfDate, tamperResistantHardwareUsed, tamperResistantHardwareNotUsed, unknownFutureValue.
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final AuthenticationAppPolicyStatus value) {
        this.backingStore.set("status", value);
    }
}
