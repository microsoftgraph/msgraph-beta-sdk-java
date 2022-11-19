package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class B2cIdentityUserFlow extends IdentityUserFlow implements Parsable {
    /** Configuration for enabling an API connector for use as part of the user flow. You can only obtain the value of this object using Get userFlowApiConnectorConfiguration. */
    private UserFlowApiConnectorConfiguration _apiConnectorConfiguration;
    /** Indicates the default language of the b2cIdentityUserFlow that is used when no ui_locale tag is specified in the request. This field is RFC 5646 compliant. */
    private String _defaultLanguageTag;
    /** The identityProviders property */
    private java.util.List<IdentityProvider> _identityProviders;
    /** The property that determines whether language customization is enabled within the B2C user flow. Language customization is not enabled by default for B2C user flows. */
    private Boolean _isLanguageCustomizationEnabled;
    /** The languages supported for customization within the user flow. Language customization is not enabled by default in B2C user flows. */
    private java.util.List<UserFlowLanguageConfiguration> _languages;
    /** The user attribute assignments included in the user flow. */
    private java.util.List<IdentityUserFlowAttributeAssignment> _userAttributeAssignments;
    /** The userFlowIdentityProviders property */
    private java.util.List<IdentityProviderBase> _userFlowIdentityProviders;
    /**
     * Instantiates a new B2cIdentityUserFlow and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public B2cIdentityUserFlow() {
        super();
        this.setOdataType("#microsoft.graph.b2cIdentityUserFlow");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a B2cIdentityUserFlow
     */
    @javax.annotation.Nonnull
    public static B2cIdentityUserFlow createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new B2cIdentityUserFlow();
    }
    /**
     * Gets the apiConnectorConfiguration property value. Configuration for enabling an API connector for use as part of the user flow. You can only obtain the value of this object using Get userFlowApiConnectorConfiguration.
     * @return a userFlowApiConnectorConfiguration
     */
    @javax.annotation.Nullable
    public UserFlowApiConnectorConfiguration getApiConnectorConfiguration() {
        return this._apiConnectorConfiguration;
    }
    /**
     * Gets the defaultLanguageTag property value. Indicates the default language of the b2cIdentityUserFlow that is used when no ui_locale tag is specified in the request. This field is RFC 5646 compliant.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDefaultLanguageTag() {
        return this._defaultLanguageTag;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final B2cIdentityUserFlow currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("apiConnectorConfiguration", (n) -> { currentObject.setApiConnectorConfiguration(n.getObjectValue(UserFlowApiConnectorConfiguration::createFromDiscriminatorValue)); });
        deserializerMap.put("defaultLanguageTag", (n) -> { currentObject.setDefaultLanguageTag(n.getStringValue()); });
        deserializerMap.put("identityProviders", (n) -> { currentObject.setIdentityProviders(n.getCollectionOfObjectValues(IdentityProvider::createFromDiscriminatorValue)); });
        deserializerMap.put("isLanguageCustomizationEnabled", (n) -> { currentObject.setIsLanguageCustomizationEnabled(n.getBooleanValue()); });
        deserializerMap.put("languages", (n) -> { currentObject.setLanguages(n.getCollectionOfObjectValues(UserFlowLanguageConfiguration::createFromDiscriminatorValue)); });
        deserializerMap.put("userAttributeAssignments", (n) -> { currentObject.setUserAttributeAssignments(n.getCollectionOfObjectValues(IdentityUserFlowAttributeAssignment::createFromDiscriminatorValue)); });
        deserializerMap.put("userFlowIdentityProviders", (n) -> { currentObject.setUserFlowIdentityProviders(n.getCollectionOfObjectValues(IdentityProviderBase::createFromDiscriminatorValue)); });
        return deserializerMap
    }
    /**
     * Gets the identityProviders property value. The identityProviders property
     * @return a identityProvider
     */
    @javax.annotation.Nullable
    public java.util.List<IdentityProvider> getIdentityProviders() {
        return this._identityProviders;
    }
    /**
     * Gets the isLanguageCustomizationEnabled property value. The property that determines whether language customization is enabled within the B2C user flow. Language customization is not enabled by default for B2C user flows.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsLanguageCustomizationEnabled() {
        return this._isLanguageCustomizationEnabled;
    }
    /**
     * Gets the languages property value. The languages supported for customization within the user flow. Language customization is not enabled by default in B2C user flows.
     * @return a userFlowLanguageConfiguration
     */
    @javax.annotation.Nullable
    public java.util.List<UserFlowLanguageConfiguration> getLanguages() {
        return this._languages;
    }
    /**
     * Gets the userAttributeAssignments property value. The user attribute assignments included in the user flow.
     * @return a identityUserFlowAttributeAssignment
     */
    @javax.annotation.Nullable
    public java.util.List<IdentityUserFlowAttributeAssignment> getUserAttributeAssignments() {
        return this._userAttributeAssignments;
    }
    /**
     * Gets the userFlowIdentityProviders property value. The userFlowIdentityProviders property
     * @return a identityProviderBase
     */
    @javax.annotation.Nullable
    public java.util.List<IdentityProviderBase> getUserFlowIdentityProviders() {
        return this._userFlowIdentityProviders;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("apiConnectorConfiguration", this.getApiConnectorConfiguration());
        writer.writeStringValue("defaultLanguageTag", this.getDefaultLanguageTag());
        writer.writeCollectionOfObjectValues("identityProviders", this.getIdentityProviders());
        writer.writeBooleanValue("isLanguageCustomizationEnabled", this.getIsLanguageCustomizationEnabled());
        writer.writeCollectionOfObjectValues("languages", this.getLanguages());
        writer.writeCollectionOfObjectValues("userAttributeAssignments", this.getUserAttributeAssignments());
        writer.writeCollectionOfObjectValues("userFlowIdentityProviders", this.getUserFlowIdentityProviders());
    }
    /**
     * Sets the apiConnectorConfiguration property value. Configuration for enabling an API connector for use as part of the user flow. You can only obtain the value of this object using Get userFlowApiConnectorConfiguration.
     * @param value Value to set for the apiConnectorConfiguration property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setApiConnectorConfiguration(@javax.annotation.Nullable final UserFlowApiConnectorConfiguration value) {
        this._apiConnectorConfiguration = value;
    }
    /**
     * Sets the defaultLanguageTag property value. Indicates the default language of the b2cIdentityUserFlow that is used when no ui_locale tag is specified in the request. This field is RFC 5646 compliant.
     * @param value Value to set for the defaultLanguageTag property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefaultLanguageTag(@javax.annotation.Nullable final String value) {
        this._defaultLanguageTag = value;
    }
    /**
     * Sets the identityProviders property value. The identityProviders property
     * @param value Value to set for the identityProviders property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIdentityProviders(@javax.annotation.Nullable final java.util.List<IdentityProvider> value) {
        this._identityProviders = value;
    }
    /**
     * Sets the isLanguageCustomizationEnabled property value. The property that determines whether language customization is enabled within the B2C user flow. Language customization is not enabled by default for B2C user flows.
     * @param value Value to set for the isLanguageCustomizationEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsLanguageCustomizationEnabled(@javax.annotation.Nullable final Boolean value) {
        this._isLanguageCustomizationEnabled = value;
    }
    /**
     * Sets the languages property value. The languages supported for customization within the user flow. Language customization is not enabled by default in B2C user flows.
     * @param value Value to set for the languages property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLanguages(@javax.annotation.Nullable final java.util.List<UserFlowLanguageConfiguration> value) {
        this._languages = value;
    }
    /**
     * Sets the userAttributeAssignments property value. The user attribute assignments included in the user flow.
     * @param value Value to set for the userAttributeAssignments property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserAttributeAssignments(@javax.annotation.Nullable final java.util.List<IdentityUserFlowAttributeAssignment> value) {
        this._userAttributeAssignments = value;
    }
    /**
     * Sets the userFlowIdentityProviders property value. The userFlowIdentityProviders property
     * @param value Value to set for the userFlowIdentityProviders property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserFlowIdentityProviders(@javax.annotation.Nullable final java.util.List<IdentityProviderBase> value) {
        this._userFlowIdentityProviders = value;
    }
}
