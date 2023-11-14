package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ConditionalAccessRoot extends Entity implements Parsable {
    /**
     * Read-only. Nullable. Returns a collection of the specified authentication context class references.
     */
    private java.util.List<AuthenticationContextClassReference> authenticationContextClassReferences;
    /**
     * Defines the authentication strength policies, valid authentication method combinations, and authentication method mode details that can be required by a conditional access policy.
     */
    private AuthenticationStrengthRoot authenticationStrength;
    /**
     * The authenticationStrengths property
     */
    private AuthenticationStrengthRoot authenticationStrengths;
    /**
     * Read-only. Nullable. Returns a collection of the specified named locations.
     */
    private java.util.List<NamedLocation> namedLocations;
    /**
     * Read-only. Nullable. Returns a collection of the specified Conditional Access policies.
     */
    private java.util.List<ConditionalAccessPolicy> policies;
    /**
     * Read-only. Nullable. Returns a collection of the specified Conditional Access templates.
     */
    private java.util.List<ConditionalAccessTemplate> templates;
    /**
     * Instantiates a new ConditionalAccessRoot and sets the default values.
     */
    public ConditionalAccessRoot() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ConditionalAccessRoot
     */
    @jakarta.annotation.Nonnull
    public static ConditionalAccessRoot createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ConditionalAccessRoot();
    }
    /**
     * Gets the authenticationContextClassReferences property value. Read-only. Nullable. Returns a collection of the specified authentication context class references.
     * @return a java.util.List<AuthenticationContextClassReference>
     */
    @jakarta.annotation.Nullable
    public java.util.List<AuthenticationContextClassReference> getAuthenticationContextClassReferences() {
        return this.authenticationContextClassReferences;
    }
    /**
     * Gets the authenticationStrength property value. Defines the authentication strength policies, valid authentication method combinations, and authentication method mode details that can be required by a conditional access policy.
     * @return a AuthenticationStrengthRoot
     */
    @jakarta.annotation.Nullable
    public AuthenticationStrengthRoot getAuthenticationStrength() {
        return this.authenticationStrength;
    }
    /**
     * Gets the authenticationStrengths property value. The authenticationStrengths property
     * @return a AuthenticationStrengthRoot
     */
    @jakarta.annotation.Nullable
    public AuthenticationStrengthRoot getAuthenticationStrengths() {
        return this.authenticationStrengths;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("authenticationContextClassReferences", (n) -> { this.setAuthenticationContextClassReferences(n.getCollectionOfObjectValues(AuthenticationContextClassReference::createFromDiscriminatorValue)); });
        deserializerMap.put("authenticationStrength", (n) -> { this.setAuthenticationStrength(n.getObjectValue(AuthenticationStrengthRoot::createFromDiscriminatorValue)); });
        deserializerMap.put("authenticationStrengths", (n) -> { this.setAuthenticationStrengths(n.getObjectValue(AuthenticationStrengthRoot::createFromDiscriminatorValue)); });
        deserializerMap.put("namedLocations", (n) -> { this.setNamedLocations(n.getCollectionOfObjectValues(NamedLocation::createFromDiscriminatorValue)); });
        deserializerMap.put("policies", (n) -> { this.setPolicies(n.getCollectionOfObjectValues(ConditionalAccessPolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("templates", (n) -> { this.setTemplates(n.getCollectionOfObjectValues(ConditionalAccessTemplate::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the namedLocations property value. Read-only. Nullable. Returns a collection of the specified named locations.
     * @return a java.util.List<NamedLocation>
     */
    @jakarta.annotation.Nullable
    public java.util.List<NamedLocation> getNamedLocations() {
        return this.namedLocations;
    }
    /**
     * Gets the policies property value. Read-only. Nullable. Returns a collection of the specified Conditional Access policies.
     * @return a java.util.List<ConditionalAccessPolicy>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ConditionalAccessPolicy> getPolicies() {
        return this.policies;
    }
    /**
     * Gets the templates property value. Read-only. Nullable. Returns a collection of the specified Conditional Access templates.
     * @return a java.util.List<ConditionalAccessTemplate>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ConditionalAccessTemplate> getTemplates() {
        return this.templates;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("authenticationContextClassReferences", this.getAuthenticationContextClassReferences());
        writer.writeObjectValue("authenticationStrength", this.getAuthenticationStrength());
        writer.writeObjectValue("authenticationStrengths", this.getAuthenticationStrengths());
        writer.writeCollectionOfObjectValues("namedLocations", this.getNamedLocations());
        writer.writeCollectionOfObjectValues("policies", this.getPolicies());
        writer.writeCollectionOfObjectValues("templates", this.getTemplates());
    }
    /**
     * Sets the authenticationContextClassReferences property value. Read-only. Nullable. Returns a collection of the specified authentication context class references.
     * @param value Value to set for the authenticationContextClassReferences property.
     */
    public void setAuthenticationContextClassReferences(@jakarta.annotation.Nullable final java.util.List<AuthenticationContextClassReference> value) {
        this.authenticationContextClassReferences = value;
    }
    /**
     * Sets the authenticationStrength property value. Defines the authentication strength policies, valid authentication method combinations, and authentication method mode details that can be required by a conditional access policy.
     * @param value Value to set for the authenticationStrength property.
     */
    public void setAuthenticationStrength(@jakarta.annotation.Nullable final AuthenticationStrengthRoot value) {
        this.authenticationStrength = value;
    }
    /**
     * Sets the authenticationStrengths property value. The authenticationStrengths property
     * @param value Value to set for the authenticationStrengths property.
     */
    public void setAuthenticationStrengths(@jakarta.annotation.Nullable final AuthenticationStrengthRoot value) {
        this.authenticationStrengths = value;
    }
    /**
     * Sets the namedLocations property value. Read-only. Nullable. Returns a collection of the specified named locations.
     * @param value Value to set for the namedLocations property.
     */
    public void setNamedLocations(@jakarta.annotation.Nullable final java.util.List<NamedLocation> value) {
        this.namedLocations = value;
    }
    /**
     * Sets the policies property value. Read-only. Nullable. Returns a collection of the specified Conditional Access policies.
     * @param value Value to set for the policies property.
     */
    public void setPolicies(@jakarta.annotation.Nullable final java.util.List<ConditionalAccessPolicy> value) {
        this.policies = value;
    }
    /**
     * Sets the templates property value. Read-only. Nullable. Returns a collection of the specified Conditional Access templates.
     * @param value Value to set for the templates property.
     */
    public void setTemplates(@jakarta.annotation.Nullable final java.util.List<ConditionalAccessTemplate> value) {
        this.templates = value;
    }
}
