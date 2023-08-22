package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class IdentityContainer implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Represents entry point for API connectors.
     */
    private java.util.List<IdentityApiConnector> apiConnectors;
    /**
     * The authenticationEventListeners property
     */
    private java.util.List<AuthenticationEventListener> authenticationEventListeners;
    /**
     * Represents the entry point for self-service sign up and sign in user flows in both Azure AD workforce and customer tenants.
     */
    private java.util.List<AuthenticationEventsFlow> authenticationEventsFlows;
    /**
     * Represents entry point for B2C identity userflows.
     */
    private java.util.List<B2cIdentityUserFlow> b2cUserFlows;
    /**
     * Represents entry point for B2X and self-service sign-up identity userflows.
     */
    private java.util.List<B2xIdentityUserFlow> b2xUserFlows;
    /**
     * the entry point for the Conditional Access (CA) object model.
     */
    private ConditionalAccessRoot conditionalAccess;
    /**
     * Represents entry point for continuous access evaluation policy.
     */
    private ContinuousAccessEvaluationPolicy continuousAccessEvaluationPolicy;
    /**
     * The customAuthenticationExtensions property
     */
    private java.util.List<CustomAuthenticationExtension> customAuthenticationExtensions;
    /**
     * Represents entry point for identity provider base.
     */
    private java.util.List<IdentityProviderBase> identityProviders;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Represents entry point for identity userflow attributes.
     */
    private java.util.List<IdentityUserFlowAttribute> userFlowAttributes;
    /**
     * The userFlows property
     */
    private java.util.List<IdentityUserFlow> userFlows;
    /**
     * Instantiates a new identityContainer and sets the default values.
     */
    public IdentityContainer() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a identityContainer
     */
    @jakarta.annotation.Nonnull
    public static IdentityContainer createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IdentityContainer();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the apiConnectors property value. Represents entry point for API connectors.
     * @return a identityApiConnector
     */
    @jakarta.annotation.Nullable
    public java.util.List<IdentityApiConnector> getApiConnectors() {
        return this.apiConnectors;
    }
    /**
     * Gets the authenticationEventListeners property value. The authenticationEventListeners property
     * @return a authenticationEventListener
     */
    @jakarta.annotation.Nullable
    public java.util.List<AuthenticationEventListener> getAuthenticationEventListeners() {
        return this.authenticationEventListeners;
    }
    /**
     * Gets the authenticationEventsFlows property value. Represents the entry point for self-service sign up and sign in user flows in both Azure AD workforce and customer tenants.
     * @return a authenticationEventsFlow
     */
    @jakarta.annotation.Nullable
    public java.util.List<AuthenticationEventsFlow> getAuthenticationEventsFlows() {
        return this.authenticationEventsFlows;
    }
    /**
     * Gets the b2cUserFlows property value. Represents entry point for B2C identity userflows.
     * @return a b2cIdentityUserFlow
     */
    @jakarta.annotation.Nullable
    public java.util.List<B2cIdentityUserFlow> getB2cUserFlows() {
        return this.b2cUserFlows;
    }
    /**
     * Gets the b2xUserFlows property value. Represents entry point for B2X and self-service sign-up identity userflows.
     * @return a b2xIdentityUserFlow
     */
    @jakarta.annotation.Nullable
    public java.util.List<B2xIdentityUserFlow> getB2xUserFlows() {
        return this.b2xUserFlows;
    }
    /**
     * Gets the conditionalAccess property value. the entry point for the Conditional Access (CA) object model.
     * @return a conditionalAccessRoot
     */
    @jakarta.annotation.Nullable
    public ConditionalAccessRoot getConditionalAccess() {
        return this.conditionalAccess;
    }
    /**
     * Gets the continuousAccessEvaluationPolicy property value. Represents entry point for continuous access evaluation policy.
     * @return a continuousAccessEvaluationPolicy
     */
    @jakarta.annotation.Nullable
    public ContinuousAccessEvaluationPolicy getContinuousAccessEvaluationPolicy() {
        return this.continuousAccessEvaluationPolicy;
    }
    /**
     * Gets the customAuthenticationExtensions property value. The customAuthenticationExtensions property
     * @return a customAuthenticationExtension
     */
    @jakarta.annotation.Nullable
    public java.util.List<CustomAuthenticationExtension> getCustomAuthenticationExtensions() {
        return this.customAuthenticationExtensions;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(12);
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
        deserializerMap.put("userFlowAttributes", (n) -> { this.setUserFlowAttributes(n.getCollectionOfObjectValues(IdentityUserFlowAttribute::createFromDiscriminatorValue)); });
        deserializerMap.put("userFlows", (n) -> { this.setUserFlows(n.getCollectionOfObjectValues(IdentityUserFlow::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the identityProviders property value. Represents entry point for identity provider base.
     * @return a identityProviderBase
     */
    @jakarta.annotation.Nullable
    public java.util.List<IdentityProviderBase> getIdentityProviders() {
        return this.identityProviders;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the userFlowAttributes property value. Represents entry point for identity userflow attributes.
     * @return a identityUserFlowAttribute
     */
    @jakarta.annotation.Nullable
    public java.util.List<IdentityUserFlowAttribute> getUserFlowAttributes() {
        return this.userFlowAttributes;
    }
    /**
     * Gets the userFlows property value. The userFlows property
     * @return a identityUserFlow
     */
    @jakarta.annotation.Nullable
    public java.util.List<IdentityUserFlow> getUserFlows() {
        return this.userFlows;
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
        writer.writeCollectionOfObjectValues("userFlowAttributes", this.getUserFlowAttributes());
        writer.writeCollectionOfObjectValues("userFlows", this.getUserFlows());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the apiConnectors property value. Represents entry point for API connectors.
     * @param value Value to set for the apiConnectors property.
     */
    public void setApiConnectors(@jakarta.annotation.Nullable final java.util.List<IdentityApiConnector> value) {
        this.apiConnectors = value;
    }
    /**
     * Sets the authenticationEventListeners property value. The authenticationEventListeners property
     * @param value Value to set for the authenticationEventListeners property.
     */
    public void setAuthenticationEventListeners(@jakarta.annotation.Nullable final java.util.List<AuthenticationEventListener> value) {
        this.authenticationEventListeners = value;
    }
    /**
     * Sets the authenticationEventsFlows property value. Represents the entry point for self-service sign up and sign in user flows in both Azure AD workforce and customer tenants.
     * @param value Value to set for the authenticationEventsFlows property.
     */
    public void setAuthenticationEventsFlows(@jakarta.annotation.Nullable final java.util.List<AuthenticationEventsFlow> value) {
        this.authenticationEventsFlows = value;
    }
    /**
     * Sets the b2cUserFlows property value. Represents entry point for B2C identity userflows.
     * @param value Value to set for the b2cUserFlows property.
     */
    public void setB2cUserFlows(@jakarta.annotation.Nullable final java.util.List<B2cIdentityUserFlow> value) {
        this.b2cUserFlows = value;
    }
    /**
     * Sets the b2xUserFlows property value. Represents entry point for B2X and self-service sign-up identity userflows.
     * @param value Value to set for the b2xUserFlows property.
     */
    public void setB2xUserFlows(@jakarta.annotation.Nullable final java.util.List<B2xIdentityUserFlow> value) {
        this.b2xUserFlows = value;
    }
    /**
     * Sets the conditionalAccess property value. the entry point for the Conditional Access (CA) object model.
     * @param value Value to set for the conditionalAccess property.
     */
    public void setConditionalAccess(@jakarta.annotation.Nullable final ConditionalAccessRoot value) {
        this.conditionalAccess = value;
    }
    /**
     * Sets the continuousAccessEvaluationPolicy property value. Represents entry point for continuous access evaluation policy.
     * @param value Value to set for the continuousAccessEvaluationPolicy property.
     */
    public void setContinuousAccessEvaluationPolicy(@jakarta.annotation.Nullable final ContinuousAccessEvaluationPolicy value) {
        this.continuousAccessEvaluationPolicy = value;
    }
    /**
     * Sets the customAuthenticationExtensions property value. The customAuthenticationExtensions property
     * @param value Value to set for the customAuthenticationExtensions property.
     */
    public void setCustomAuthenticationExtensions(@jakarta.annotation.Nullable final java.util.List<CustomAuthenticationExtension> value) {
        this.customAuthenticationExtensions = value;
    }
    /**
     * Sets the identityProviders property value. Represents entry point for identity provider base.
     * @param value Value to set for the identityProviders property.
     */
    public void setIdentityProviders(@jakarta.annotation.Nullable final java.util.List<IdentityProviderBase> value) {
        this.identityProviders = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the userFlowAttributes property value. Represents entry point for identity userflow attributes.
     * @param value Value to set for the userFlowAttributes property.
     */
    public void setUserFlowAttributes(@jakarta.annotation.Nullable final java.util.List<IdentityUserFlowAttribute> value) {
        this.userFlowAttributes = value;
    }
    /**
     * Sets the userFlows property value. The userFlows property
     * @param value Value to set for the userFlows property.
     */
    public void setUserFlows(@jakarta.annotation.Nullable final java.util.List<IdentityUserFlow> value) {
        this.userFlows = value;
    }
}
