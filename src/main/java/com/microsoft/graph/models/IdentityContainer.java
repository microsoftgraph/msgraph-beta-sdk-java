package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class IdentityContainer implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Represents entry point for API connectors. */
    private java.util.List<IdentityApiConnector> _apiConnectors;
    /** Represents entry point for B2C identity userflows. */
    private java.util.List<B2cIdentityUserFlow> _b2cUserFlows;
    /** Represents entry point for B2X and self-service sign-up identity userflows. */
    private java.util.List<B2xIdentityUserFlow> _b2xUserFlows;
    /** the entry point for the Conditional Access (CA) object model. */
    private ConditionalAccessRoot _conditionalAccess;
    /** Represents entry point for continuous access evaluation policy. */
    private ContinuousAccessEvaluationPolicy _continuousAccessEvaluationPolicy;
    /** Represents entry point for identity provider base. */
    private java.util.List<IdentityProviderBase> _identityProviders;
    /** The OdataType property */
    private String _odataType;
    /** Represents entry point for identity userflow attributes. */
    private java.util.List<IdentityUserFlowAttribute> _userFlowAttributes;
    /** The userFlows property */
    private java.util.List<IdentityUserFlow> _userFlows;
    /**
     * Instantiates a new IdentityContainer and sets the default values.
     * @return a void
     */
    public IdentityContainer() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.identityContainer");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a IdentityContainer
     */
    @javax.annotation.Nonnull
    public static IdentityContainer createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IdentityContainer();
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
     * Gets the apiConnectors property value. Represents entry point for API connectors.
     * @return a identityApiConnector
     */
    @javax.annotation.Nullable
    public java.util.List<IdentityApiConnector> getApiConnectors() {
        return this._apiConnectors;
    }
    /**
     * Gets the b2cUserFlows property value. Represents entry point for B2C identity userflows.
     * @return a b2cIdentityUserFlow
     */
    @javax.annotation.Nullable
    public java.util.List<B2cIdentityUserFlow> getB2cUserFlows() {
        return this._b2cUserFlows;
    }
    /**
     * Gets the b2xUserFlows property value. Represents entry point for B2X and self-service sign-up identity userflows.
     * @return a b2xIdentityUserFlow
     */
    @javax.annotation.Nullable
    public java.util.List<B2xIdentityUserFlow> getB2xUserFlows() {
        return this._b2xUserFlows;
    }
    /**
     * Gets the conditionalAccess property value. the entry point for the Conditional Access (CA) object model.
     * @return a conditionalAccessRoot
     */
    @javax.annotation.Nullable
    public ConditionalAccessRoot getConditionalAccess() {
        return this._conditionalAccess;
    }
    /**
     * Gets the continuousAccessEvaluationPolicy property value. Represents entry point for continuous access evaluation policy.
     * @return a continuousAccessEvaluationPolicy
     */
    @javax.annotation.Nullable
    public ContinuousAccessEvaluationPolicy getContinuousAccessEvaluationPolicy() {
        return this._continuousAccessEvaluationPolicy;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final IdentityContainer currentObject = this;
        return new HashMap<>(9) {{
            this.put("apiConnectors", (n) -> { currentObject.setApiConnectors(n.getCollectionOfObjectValues(IdentityApiConnector::createFromDiscriminatorValue)); });
            this.put("b2cUserFlows", (n) -> { currentObject.setB2cUserFlows(n.getCollectionOfObjectValues(B2cIdentityUserFlow::createFromDiscriminatorValue)); });
            this.put("b2xUserFlows", (n) -> { currentObject.setB2xUserFlows(n.getCollectionOfObjectValues(B2xIdentityUserFlow::createFromDiscriminatorValue)); });
            this.put("conditionalAccess", (n) -> { currentObject.setConditionalAccess(n.getObjectValue(ConditionalAccessRoot::createFromDiscriminatorValue)); });
            this.put("continuousAccessEvaluationPolicy", (n) -> { currentObject.setContinuousAccessEvaluationPolicy(n.getObjectValue(ContinuousAccessEvaluationPolicy::createFromDiscriminatorValue)); });
            this.put("identityProviders", (n) -> { currentObject.setIdentityProviders(n.getCollectionOfObjectValues(IdentityProviderBase::createFromDiscriminatorValue)); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("userFlowAttributes", (n) -> { currentObject.setUserFlowAttributes(n.getCollectionOfObjectValues(IdentityUserFlowAttribute::createFromDiscriminatorValue)); });
            this.put("userFlows", (n) -> { currentObject.setUserFlows(n.getCollectionOfObjectValues(IdentityUserFlow::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the identityProviders property value. Represents entry point for identity provider base.
     * @return a identityProviderBase
     */
    @javax.annotation.Nullable
    public java.util.List<IdentityProviderBase> getIdentityProviders() {
        return this._identityProviders;
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
     * Gets the userFlowAttributes property value. Represents entry point for identity userflow attributes.
     * @return a identityUserFlowAttribute
     */
    @javax.annotation.Nullable
    public java.util.List<IdentityUserFlowAttribute> getUserFlowAttributes() {
        return this._userFlowAttributes;
    }
    /**
     * Gets the userFlows property value. The userFlows property
     * @return a identityUserFlow
     */
    @javax.annotation.Nullable
    public java.util.List<IdentityUserFlow> getUserFlows() {
        return this._userFlows;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("apiConnectors", this.getApiConnectors());
        writer.writeCollectionOfObjectValues("b2cUserFlows", this.getB2cUserFlows());
        writer.writeCollectionOfObjectValues("b2xUserFlows", this.getB2xUserFlows());
        writer.writeObjectValue("conditionalAccess", this.getConditionalAccess());
        writer.writeObjectValue("continuousAccessEvaluationPolicy", this.getContinuousAccessEvaluationPolicy());
        writer.writeCollectionOfObjectValues("identityProviders", this.getIdentityProviders());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeCollectionOfObjectValues("userFlowAttributes", this.getUserFlowAttributes());
        writer.writeCollectionOfObjectValues("userFlows", this.getUserFlows());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the apiConnectors property value. Represents entry point for API connectors.
     * @param value Value to set for the apiConnectors property.
     * @return a void
     */
    public void setApiConnectors(@javax.annotation.Nullable final java.util.List<IdentityApiConnector> value) {
        this._apiConnectors = value;
    }
    /**
     * Sets the b2cUserFlows property value. Represents entry point for B2C identity userflows.
     * @param value Value to set for the b2cUserFlows property.
     * @return a void
     */
    public void setB2cUserFlows(@javax.annotation.Nullable final java.util.List<B2cIdentityUserFlow> value) {
        this._b2cUserFlows = value;
    }
    /**
     * Sets the b2xUserFlows property value. Represents entry point for B2X and self-service sign-up identity userflows.
     * @param value Value to set for the b2xUserFlows property.
     * @return a void
     */
    public void setB2xUserFlows(@javax.annotation.Nullable final java.util.List<B2xIdentityUserFlow> value) {
        this._b2xUserFlows = value;
    }
    /**
     * Sets the conditionalAccess property value. the entry point for the Conditional Access (CA) object model.
     * @param value Value to set for the conditionalAccess property.
     * @return a void
     */
    public void setConditionalAccess(@javax.annotation.Nullable final ConditionalAccessRoot value) {
        this._conditionalAccess = value;
    }
    /**
     * Sets the continuousAccessEvaluationPolicy property value. Represents entry point for continuous access evaluation policy.
     * @param value Value to set for the continuousAccessEvaluationPolicy property.
     * @return a void
     */
    public void setContinuousAccessEvaluationPolicy(@javax.annotation.Nullable final ContinuousAccessEvaluationPolicy value) {
        this._continuousAccessEvaluationPolicy = value;
    }
    /**
     * Sets the identityProviders property value. Represents entry point for identity provider base.
     * @param value Value to set for the identityProviders property.
     * @return a void
     */
    public void setIdentityProviders(@javax.annotation.Nullable final java.util.List<IdentityProviderBase> value) {
        this._identityProviders = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the userFlowAttributes property value. Represents entry point for identity userflow attributes.
     * @param value Value to set for the userFlowAttributes property.
     * @return a void
     */
    public void setUserFlowAttributes(@javax.annotation.Nullable final java.util.List<IdentityUserFlowAttribute> value) {
        this._userFlowAttributes = value;
    }
    /**
     * Sets the userFlows property value. The userFlows property
     * @param value Value to set for the userFlows property.
     * @return a void
     */
    public void setUserFlows(@javax.annotation.Nullable final java.util.List<IdentityUserFlow> value) {
        this._userFlows = value;
    }
}
