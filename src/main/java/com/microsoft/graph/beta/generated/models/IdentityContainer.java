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
public class IdentityContainer implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link IdentityContainer} and sets the default values.
     */
    public IdentityContainer() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link IdentityContainer}
     */
    @jakarta.annotation.Nonnull
    public static IdentityContainer createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IdentityContainer();
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
     * Gets the apiConnectors property value. Represents entry point for API connectors.
     * @return a {@link java.util.List<IdentityApiConnector>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<IdentityApiConnector> getApiConnectors() {
        return this.backingStore.get("apiConnectors");
    }
    /**
     * Gets the authenticationEventListeners property value. The authenticationEventListeners property
     * @return a {@link java.util.List<AuthenticationEventListener>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AuthenticationEventListener> getAuthenticationEventListeners() {
        return this.backingStore.get("authenticationEventListeners");
    }
    /**
     * Gets the authenticationEventsFlows property value. Represents the entry point for self-service sign-up and sign-in user flows in both Microsoft Entra workforce and external tenants.
     * @return a {@link java.util.List<AuthenticationEventsFlow>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AuthenticationEventsFlow> getAuthenticationEventsFlows() {
        return this.backingStore.get("authenticationEventsFlows");
    }
    /**
     * Gets the b2cUserFlows property value. Represents entry point for B2C identity userflows.
     * @return a {@link java.util.List<B2cIdentityUserFlow>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<B2cIdentityUserFlow> getB2cUserFlows() {
        return this.backingStore.get("b2cUserFlows");
    }
    /**
     * Gets the b2xUserFlows property value. Represents entry point for B2X and self-service sign-up identity userflows.
     * @return a {@link java.util.List<B2xIdentityUserFlow>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<B2xIdentityUserFlow> getB2xUserFlows() {
        return this.backingStore.get("b2xUserFlows");
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
     * Gets the conditionalAccess property value. the entry point for the Conditional Access (CA) object model.
     * @return a {@link ConditionalAccessRoot}
     */
    @jakarta.annotation.Nullable
    public ConditionalAccessRoot getConditionalAccess() {
        return this.backingStore.get("conditionalAccess");
    }
    /**
     * Gets the continuousAccessEvaluationPolicy property value. Represents entry point for continuous access evaluation policy.
     * @return a {@link ContinuousAccessEvaluationPolicy}
     */
    @jakarta.annotation.Nullable
    public ContinuousAccessEvaluationPolicy getContinuousAccessEvaluationPolicy() {
        return this.backingStore.get("continuousAccessEvaluationPolicy");
    }
    /**
     * Gets the customAuthenticationExtensions property value. The customAuthenticationExtensions property
     * @return a {@link java.util.List<CustomAuthenticationExtension>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<CustomAuthenticationExtension> getCustomAuthenticationExtensions() {
        return this.backingStore.get("customAuthenticationExtensions");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(13);
        deserializerMap.put("apiConnectors", (n) -> { this.setApiConnectors(n.getCollectionOfObjectValues(IdentityApiConnector::createFromDiscriminatorValue)); });
        deserializerMap.put("authenticationEventListeners", (n) -> { this.setAuthenticationEventListeners(n.getCollectionOfObjectValues(AuthenticationEventListener::createFromDiscriminatorValue)); });
        deserializerMap.put("authenticationEventsFlows", (n) -> { this.setAuthenticationEventsFlows(n.getCollectionOfObjectValues(AuthenticationEventsFlow::createFromDiscriminatorValue)); });
        deserializerMap.put("b2cUserFlows", (n) -> { this.setB2cUserFlows(n.getCollectionOfObjectValues(B2cIdentityUserFlow::createFromDiscriminatorValue)); });
        deserializerMap.put("b2xUserFlows", (n) -> { this.setB2xUserFlows(n.getCollectionOfObjectValues(B2xIdentityUserFlow::createFromDiscriminatorValue)); });
        deserializerMap.put("conditionalAccess", (n) -> { this.setConditionalAccess(n.getObjectValue(ConditionalAccessRoot::createFromDiscriminatorValue)); });
        deserializerMap.put("continuousAccessEvaluationPolicy", (n) -> { this.setContinuousAccessEvaluationPolicy(n.getObjectValue(ContinuousAccessEvaluationPolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("customAuthenticationExtensions", (n) -> { this.setCustomAuthenticationExtensions(n.getCollectionOfObjectValues(CustomAuthenticationExtension::createFromDiscriminatorValue)); });
        deserializerMap.put("identityProviders", (n) -> { this.setIdentityProviders(n.getCollectionOfObjectValues(IdentityProviderBase::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("riskPrevention", (n) -> { this.setRiskPrevention(n.getObjectValue(RiskPreventionContainer::createFromDiscriminatorValue)); });
        deserializerMap.put("userFlowAttributes", (n) -> { this.setUserFlowAttributes(n.getCollectionOfObjectValues(IdentityUserFlowAttribute::createFromDiscriminatorValue)); });
        deserializerMap.put("userFlows", (n) -> { this.setUserFlows(n.getCollectionOfObjectValues(IdentityUserFlow::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the identityProviders property value. Represents entry point for identity provider base.
     * @return a {@link java.util.List<IdentityProviderBase>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<IdentityProviderBase> getIdentityProviders() {
        return this.backingStore.get("identityProviders");
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
     * Gets the riskPrevention property value. The riskPrevention property
     * @return a {@link RiskPreventionContainer}
     */
    @jakarta.annotation.Nullable
    public RiskPreventionContainer getRiskPrevention() {
        return this.backingStore.get("riskPrevention");
    }
    /**
     * Gets the userFlowAttributes property value. Represents entry point for identity userflow attributes.
     * @return a {@link java.util.List<IdentityUserFlowAttribute>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<IdentityUserFlowAttribute> getUserFlowAttributes() {
        return this.backingStore.get("userFlowAttributes");
    }
    /**
     * Gets the userFlows property value. The userFlows property
     * @return a {@link java.util.List<IdentityUserFlow>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<IdentityUserFlow> getUserFlows() {
        return this.backingStore.get("userFlows");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("apiConnectors", this.getApiConnectors());
        writer.writeCollectionOfObjectValues("authenticationEventListeners", this.getAuthenticationEventListeners());
        writer.writeCollectionOfObjectValues("authenticationEventsFlows", this.getAuthenticationEventsFlows());
        writer.writeCollectionOfObjectValues("b2cUserFlows", this.getB2cUserFlows());
        writer.writeCollectionOfObjectValues("b2xUserFlows", this.getB2xUserFlows());
        writer.writeObjectValue("conditionalAccess", this.getConditionalAccess());
        writer.writeObjectValue("continuousAccessEvaluationPolicy", this.getContinuousAccessEvaluationPolicy());
        writer.writeCollectionOfObjectValues("customAuthenticationExtensions", this.getCustomAuthenticationExtensions());
        writer.writeCollectionOfObjectValues("identityProviders", this.getIdentityProviders());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeObjectValue("riskPrevention", this.getRiskPrevention());
        writer.writeCollectionOfObjectValues("userFlowAttributes", this.getUserFlowAttributes());
        writer.writeCollectionOfObjectValues("userFlows", this.getUserFlows());
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
     * Sets the apiConnectors property value. Represents entry point for API connectors.
     * @param value Value to set for the apiConnectors property.
     */
    public void setApiConnectors(@jakarta.annotation.Nullable final java.util.List<IdentityApiConnector> value) {
        this.backingStore.set("apiConnectors", value);
    }
    /**
     * Sets the authenticationEventListeners property value. The authenticationEventListeners property
     * @param value Value to set for the authenticationEventListeners property.
     */
    public void setAuthenticationEventListeners(@jakarta.annotation.Nullable final java.util.List<AuthenticationEventListener> value) {
        this.backingStore.set("authenticationEventListeners", value);
    }
    /**
     * Sets the authenticationEventsFlows property value. Represents the entry point for self-service sign-up and sign-in user flows in both Microsoft Entra workforce and external tenants.
     * @param value Value to set for the authenticationEventsFlows property.
     */
    public void setAuthenticationEventsFlows(@jakarta.annotation.Nullable final java.util.List<AuthenticationEventsFlow> value) {
        this.backingStore.set("authenticationEventsFlows", value);
    }
    /**
     * Sets the b2cUserFlows property value. Represents entry point for B2C identity userflows.
     * @param value Value to set for the b2cUserFlows property.
     */
    public void setB2cUserFlows(@jakarta.annotation.Nullable final java.util.List<B2cIdentityUserFlow> value) {
        this.backingStore.set("b2cUserFlows", value);
    }
    /**
     * Sets the b2xUserFlows property value. Represents entry point for B2X and self-service sign-up identity userflows.
     * @param value Value to set for the b2xUserFlows property.
     */
    public void setB2xUserFlows(@jakarta.annotation.Nullable final java.util.List<B2xIdentityUserFlow> value) {
        this.backingStore.set("b2xUserFlows", value);
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
     * Sets the conditionalAccess property value. the entry point for the Conditional Access (CA) object model.
     * @param value Value to set for the conditionalAccess property.
     */
    public void setConditionalAccess(@jakarta.annotation.Nullable final ConditionalAccessRoot value) {
        this.backingStore.set("conditionalAccess", value);
    }
    /**
     * Sets the continuousAccessEvaluationPolicy property value. Represents entry point for continuous access evaluation policy.
     * @param value Value to set for the continuousAccessEvaluationPolicy property.
     */
    public void setContinuousAccessEvaluationPolicy(@jakarta.annotation.Nullable final ContinuousAccessEvaluationPolicy value) {
        this.backingStore.set("continuousAccessEvaluationPolicy", value);
    }
    /**
     * Sets the customAuthenticationExtensions property value. The customAuthenticationExtensions property
     * @param value Value to set for the customAuthenticationExtensions property.
     */
    public void setCustomAuthenticationExtensions(@jakarta.annotation.Nullable final java.util.List<CustomAuthenticationExtension> value) {
        this.backingStore.set("customAuthenticationExtensions", value);
    }
    /**
     * Sets the identityProviders property value. Represents entry point for identity provider base.
     * @param value Value to set for the identityProviders property.
     */
    public void setIdentityProviders(@jakarta.annotation.Nullable final java.util.List<IdentityProviderBase> value) {
        this.backingStore.set("identityProviders", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the riskPrevention property value. The riskPrevention property
     * @param value Value to set for the riskPrevention property.
     */
    public void setRiskPrevention(@jakarta.annotation.Nullable final RiskPreventionContainer value) {
        this.backingStore.set("riskPrevention", value);
    }
    /**
     * Sets the userFlowAttributes property value. Represents entry point for identity userflow attributes.
     * @param value Value to set for the userFlowAttributes property.
     */
    public void setUserFlowAttributes(@jakarta.annotation.Nullable final java.util.List<IdentityUserFlowAttribute> value) {
        this.backingStore.set("userFlowAttributes", value);
    }
    /**
     * Sets the userFlows property value. The userFlows property
     * @param value Value to set for the userFlows property.
     */
    public void setUserFlows(@jakarta.annotation.Nullable final java.util.List<IdentityUserFlow> value) {
        this.backingStore.set("userFlows", value);
    }
}
