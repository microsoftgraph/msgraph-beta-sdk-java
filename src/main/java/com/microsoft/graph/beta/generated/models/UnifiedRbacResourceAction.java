package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UnifiedRbacResourceAction extends Entity implements Parsable {
    /**
     * Instantiates a new {@link UnifiedRbacResourceAction} and sets the default values.
     */
    public UnifiedRbacResourceAction() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link UnifiedRbacResourceAction}
     */
    @jakarta.annotation.Nonnull
    public static UnifiedRbacResourceAction createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UnifiedRbacResourceAction();
    }
    /**
     * Gets the actionVerb property value. HTTP method for the action, such as DELETE, GET, PATCH, POST, PUT, or null. Supports $filter (eq) but not for null values.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getActionVerb() {
        return this.backingStore.get("actionVerb");
    }
    /**
     * Gets the authenticationContext property value. The authenticationContext property
     * @return a {@link AuthenticationContextClassReference}
     */
    @jakarta.annotation.Nullable
    public AuthenticationContextClassReference getAuthenticationContext() {
        return this.backingStore.get("authenticationContext");
    }
    /**
     * Gets the authenticationContextId property value. The authenticationContextId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAuthenticationContextId() {
        return this.backingStore.get("authenticationContextId");
    }
    /**
     * Gets the description property value. Description for the action. Supports $filter (eq).
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("actionVerb", (n) -> { this.setActionVerb(n.getStringValue()); });
        deserializerMap.put("authenticationContext", (n) -> { this.setAuthenticationContext(n.getObjectValue(AuthenticationContextClassReference::createFromDiscriminatorValue)); });
        deserializerMap.put("authenticationContextId", (n) -> { this.setAuthenticationContextId(n.getStringValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("isAuthenticationContextSettable", (n) -> { this.setIsAuthenticationContextSettable(n.getBooleanValue()); });
        deserializerMap.put("isPrivileged", (n) -> { this.setIsPrivileged(n.getBooleanValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("resourceScope", (n) -> { this.setResourceScope(n.getObjectValue(UnifiedRbacResourceScope::createFromDiscriminatorValue)); });
        deserializerMap.put("resourceScopeId", (n) -> { this.setResourceScopeId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isAuthenticationContextSettable property value. The isAuthenticationContextSettable property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsAuthenticationContextSettable() {
        return this.backingStore.get("isAuthenticationContextSettable");
    }
    /**
     * Gets the isPrivileged property value. Flag indicating if the action is a sensitive resource action. Applies only for actions in the microsoft.directory resource namespace. Read-only. Supports $filter (eq).
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsPrivileged() {
        return this.backingStore.get("isPrivileged");
    }
    /**
     * Gets the name property value. Name for the action within the resource namespace, such as microsoft.insights/programs/update. Can include slash character (/). Case insensitive. Required. Supports $filter (eq).
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.backingStore.get("name");
    }
    /**
     * Gets the resourceScope property value. The resourceScope property
     * @return a {@link UnifiedRbacResourceScope}
     */
    @jakarta.annotation.Nullable
    public UnifiedRbacResourceScope getResourceScope() {
        return this.backingStore.get("resourceScope");
    }
    /**
     * Gets the resourceScopeId property value. Not implemented.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getResourceScopeId() {
        return this.backingStore.get("resourceScopeId");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("actionVerb", this.getActionVerb());
        writer.writeObjectValue("authenticationContext", this.getAuthenticationContext());
        writer.writeStringValue("authenticationContextId", this.getAuthenticationContextId());
        writer.writeStringValue("description", this.getDescription());
        writer.writeBooleanValue("isAuthenticationContextSettable", this.getIsAuthenticationContextSettable());
        writer.writeBooleanValue("isPrivileged", this.getIsPrivileged());
        writer.writeStringValue("name", this.getName());
        writer.writeObjectValue("resourceScope", this.getResourceScope());
        writer.writeStringValue("resourceScopeId", this.getResourceScopeId());
    }
    /**
     * Sets the actionVerb property value. HTTP method for the action, such as DELETE, GET, PATCH, POST, PUT, or null. Supports $filter (eq) but not for null values.
     * @param value Value to set for the actionVerb property.
     */
    public void setActionVerb(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("actionVerb", value);
    }
    /**
     * Sets the authenticationContext property value. The authenticationContext property
     * @param value Value to set for the authenticationContext property.
     */
    public void setAuthenticationContext(@jakarta.annotation.Nullable final AuthenticationContextClassReference value) {
        this.backingStore.set("authenticationContext", value);
    }
    /**
     * Sets the authenticationContextId property value. The authenticationContextId property
     * @param value Value to set for the authenticationContextId property.
     */
    public void setAuthenticationContextId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("authenticationContextId", value);
    }
    /**
     * Sets the description property value. Description for the action. Supports $filter (eq).
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the isAuthenticationContextSettable property value. The isAuthenticationContextSettable property
     * @param value Value to set for the isAuthenticationContextSettable property.
     */
    public void setIsAuthenticationContextSettable(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isAuthenticationContextSettable", value);
    }
    /**
     * Sets the isPrivileged property value. Flag indicating if the action is a sensitive resource action. Applies only for actions in the microsoft.directory resource namespace. Read-only. Supports $filter (eq).
     * @param value Value to set for the isPrivileged property.
     */
    public void setIsPrivileged(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isPrivileged", value);
    }
    /**
     * Sets the name property value. Name for the action within the resource namespace, such as microsoft.insights/programs/update. Can include slash character (/). Case insensitive. Required. Supports $filter (eq).
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("name", value);
    }
    /**
     * Sets the resourceScope property value. The resourceScope property
     * @param value Value to set for the resourceScope property.
     */
    public void setResourceScope(@jakarta.annotation.Nullable final UnifiedRbacResourceScope value) {
        this.backingStore.set("resourceScope", value);
    }
    /**
     * Sets the resourceScopeId property value. Not implemented.
     * @param value Value to set for the resourceScopeId property.
     */
    public void setResourceScopeId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("resourceScopeId", value);
    }
}
