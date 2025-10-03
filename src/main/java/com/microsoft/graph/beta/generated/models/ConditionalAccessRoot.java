package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ConditionalAccessRoot extends Entity implements Parsable {
    /**
     * Instantiates a new {@link ConditionalAccessRoot} and sets the default values.
     */
    public ConditionalAccessRoot() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ConditionalAccessRoot}
     */
    @jakarta.annotation.Nonnull
    public static ConditionalAccessRoot createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ConditionalAccessRoot();
    }
    /**
     * Gets the authenticationContextClassReferences property value. Read-only. Nullable. Returns a collection of the specified authentication context class references.
     * @return a {@link java.util.List<AuthenticationContextClassReference>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AuthenticationContextClassReference> getAuthenticationContextClassReferences() {
        return this.backingStore.get("authenticationContextClassReferences");
    }
    /**
     * Gets the authenticationStrength property value. Defines the authentication strength policies, valid authentication method combinations, and authentication method mode details that can be required by a conditional access policy.
     * @return a {@link AuthenticationStrengthRoot}
     */
    @jakarta.annotation.Nullable
    public AuthenticationStrengthRoot getAuthenticationStrength() {
        return this.backingStore.get("authenticationStrength");
    }
    /**
     * Gets the authenticationStrengths property value. DEPRECATED. See the authenticationStrength relationship instead.
     * @return a {@link AuthenticationStrengthRoot}
     */
    @jakarta.annotation.Nullable
    public AuthenticationStrengthRoot getAuthenticationStrengths() {
        return this.backingStore.get("authenticationStrengths");
    }
    /**
     * Gets the deletedItems property value. Read-only. Nullable. Returns a collection of the deleted Conditional Access objects.
     * @return a {@link CaPoliciesDeletableRoot}
     */
    @jakarta.annotation.Nullable
    public CaPoliciesDeletableRoot getDeletedItems() {
        return this.backingStore.get("deletedItems");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("authenticationContextClassReferences", (n) -> { this.setAuthenticationContextClassReferences(n.getCollectionOfObjectValues(AuthenticationContextClassReference::createFromDiscriminatorValue)); });
        deserializerMap.put("authenticationStrength", (n) -> { this.setAuthenticationStrength(n.getObjectValue(AuthenticationStrengthRoot::createFromDiscriminatorValue)); });
        deserializerMap.put("authenticationStrengths", (n) -> { this.setAuthenticationStrengths(n.getObjectValue(AuthenticationStrengthRoot::createFromDiscriminatorValue)); });
        deserializerMap.put("deletedItems", (n) -> { this.setDeletedItems(n.getObjectValue(CaPoliciesDeletableRoot::createFromDiscriminatorValue)); });
        deserializerMap.put("namedLocations", (n) -> { this.setNamedLocations(n.getCollectionOfObjectValues(NamedLocation::createFromDiscriminatorValue)); });
        deserializerMap.put("policies", (n) -> { this.setPolicies(n.getCollectionOfObjectValues(ConditionalAccessPolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("templates", (n) -> { this.setTemplates(n.getCollectionOfObjectValues(ConditionalAccessTemplate::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the namedLocations property value. Read-only. Nullable. Returns a collection of the specified named locations.
     * @return a {@link java.util.List<NamedLocation>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<NamedLocation> getNamedLocations() {
        return this.backingStore.get("namedLocations");
    }
    /**
     * Gets the policies property value. Read-only. Nullable. Returns a collection of the specified Conditional Access policies.
     * @return a {@link java.util.List<ConditionalAccessPolicy>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ConditionalAccessPolicy> getPolicies() {
        return this.backingStore.get("policies");
    }
    /**
     * Gets the templates property value. Read-only. Nullable. Returns a collection of the specified Conditional Access templates.
     * @return a {@link java.util.List<ConditionalAccessTemplate>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ConditionalAccessTemplate> getTemplates() {
        return this.backingStore.get("templates");
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
        writer.writeObjectValue("deletedItems", this.getDeletedItems());
        writer.writeCollectionOfObjectValues("namedLocations", this.getNamedLocations());
        writer.writeCollectionOfObjectValues("policies", this.getPolicies());
        writer.writeCollectionOfObjectValues("templates", this.getTemplates());
    }
    /**
     * Sets the authenticationContextClassReferences property value. Read-only. Nullable. Returns a collection of the specified authentication context class references.
     * @param value Value to set for the authenticationContextClassReferences property.
     */
    public void setAuthenticationContextClassReferences(@jakarta.annotation.Nullable final java.util.List<AuthenticationContextClassReference> value) {
        this.backingStore.set("authenticationContextClassReferences", value);
    }
    /**
     * Sets the authenticationStrength property value. Defines the authentication strength policies, valid authentication method combinations, and authentication method mode details that can be required by a conditional access policy.
     * @param value Value to set for the authenticationStrength property.
     */
    public void setAuthenticationStrength(@jakarta.annotation.Nullable final AuthenticationStrengthRoot value) {
        this.backingStore.set("authenticationStrength", value);
    }
    /**
     * Sets the authenticationStrengths property value. DEPRECATED. See the authenticationStrength relationship instead.
     * @param value Value to set for the authenticationStrengths property.
     */
    public void setAuthenticationStrengths(@jakarta.annotation.Nullable final AuthenticationStrengthRoot value) {
        this.backingStore.set("authenticationStrengths", value);
    }
    /**
     * Sets the deletedItems property value. Read-only. Nullable. Returns a collection of the deleted Conditional Access objects.
     * @param value Value to set for the deletedItems property.
     */
    public void setDeletedItems(@jakarta.annotation.Nullable final CaPoliciesDeletableRoot value) {
        this.backingStore.set("deletedItems", value);
    }
    /**
     * Sets the namedLocations property value. Read-only. Nullable. Returns a collection of the specified named locations.
     * @param value Value to set for the namedLocations property.
     */
    public void setNamedLocations(@jakarta.annotation.Nullable final java.util.List<NamedLocation> value) {
        this.backingStore.set("namedLocations", value);
    }
    /**
     * Sets the policies property value. Read-only. Nullable. Returns a collection of the specified Conditional Access policies.
     * @param value Value to set for the policies property.
     */
    public void setPolicies(@jakarta.annotation.Nullable final java.util.List<ConditionalAccessPolicy> value) {
        this.backingStore.set("policies", value);
    }
    /**
     * Sets the templates property value. Read-only. Nullable. Returns a collection of the specified Conditional Access templates.
     * @param value Value to set for the templates property.
     */
    public void setTemplates(@jakarta.annotation.Nullable final java.util.List<ConditionalAccessTemplate> value) {
        this.backingStore.set("templates", value);
    }
}
