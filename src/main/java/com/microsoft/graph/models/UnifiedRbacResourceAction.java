package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class UnifiedRbacResourceAction extends Entity implements Parsable {
    /** HTTP method for the action, such as DELETE, GET, PATCH, POST, PUT, or null. Supports $filter (eq) but not for null values. */
    private String actionVerb;
    /** The authenticationContext property */
    private AuthenticationContextClassReference authenticationContext;
    /** The authenticationContextId property */
    private String authenticationContextId;
    /** Description for the action. Supports $filter (eq). */
    private String description;
    /** The isAuthenticationContextSettable property */
    private Boolean isAuthenticationContextSettable;
    /** Name for the action within the resource namespace, such as microsoft.insights/programs/update. Can include slash character (/). Case insensitive. Required. Supports $filter (eq). */
    private String name;
    /** The resourceScope property */
    private UnifiedRbacResourceScope resourceScope;
    /** Not implemented. */
    private String resourceScopeId;
    /**
     * Instantiates a new unifiedRbacResourceAction and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public UnifiedRbacResourceAction() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a unifiedRbacResourceAction
     */
    @javax.annotation.Nonnull
    public static UnifiedRbacResourceAction createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UnifiedRbacResourceAction();
    }
    /**
     * Gets the actionVerb property value. HTTP method for the action, such as DELETE, GET, PATCH, POST, PUT, or null. Supports $filter (eq) but not for null values.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getActionVerb() {
        return this.actionVerb;
    }
    /**
     * Gets the authenticationContext property value. The authenticationContext property
     * @return a authenticationContextClassReference
     */
    @javax.annotation.Nullable
    public AuthenticationContextClassReference getAuthenticationContext() {
        return this.authenticationContext;
    }
    /**
     * Gets the authenticationContextId property value. The authenticationContextId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAuthenticationContextId() {
        return this.authenticationContextId;
    }
    /**
     * Gets the description property value. Description for the action. Supports $filter (eq).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("actionVerb", (n) -> { this.setActionVerb(n.getStringValue()); });
        deserializerMap.put("authenticationContext", (n) -> { this.setAuthenticationContext(n.getObjectValue(AuthenticationContextClassReference::createFromDiscriminatorValue)); });
        deserializerMap.put("authenticationContextId", (n) -> { this.setAuthenticationContextId(n.getStringValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("isAuthenticationContextSettable", (n) -> { this.setIsAuthenticationContextSettable(n.getBooleanValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("resourceScope", (n) -> { this.setResourceScope(n.getObjectValue(UnifiedRbacResourceScope::createFromDiscriminatorValue)); });
        deserializerMap.put("resourceScopeId", (n) -> { this.setResourceScopeId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isAuthenticationContextSettable property value. The isAuthenticationContextSettable property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsAuthenticationContextSettable() {
        return this.isAuthenticationContextSettable;
    }
    /**
     * Gets the name property value. Name for the action within the resource namespace, such as microsoft.insights/programs/update. Can include slash character (/). Case insensitive. Required. Supports $filter (eq).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the resourceScope property value. The resourceScope property
     * @return a unifiedRbacResourceScope
     */
    @javax.annotation.Nullable
    public UnifiedRbacResourceScope getResourceScope() {
        return this.resourceScope;
    }
    /**
     * Gets the resourceScopeId property value. Not implemented.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getResourceScopeId() {
        return this.resourceScopeId;
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
        writer.writeStringValue("actionVerb", this.getActionVerb());
        writer.writeObjectValue("authenticationContext", this.getAuthenticationContext());
        writer.writeStringValue("authenticationContextId", this.getAuthenticationContextId());
        writer.writeStringValue("description", this.getDescription());
        writer.writeBooleanValue("isAuthenticationContextSettable", this.getIsAuthenticationContextSettable());
        writer.writeStringValue("name", this.getName());
        writer.writeObjectValue("resourceScope", this.getResourceScope());
        writer.writeStringValue("resourceScopeId", this.getResourceScopeId());
    }
    /**
     * Sets the actionVerb property value. HTTP method for the action, such as DELETE, GET, PATCH, POST, PUT, or null. Supports $filter (eq) but not for null values.
     * @param value Value to set for the actionVerb property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setActionVerb(@javax.annotation.Nullable final String value) {
        this.actionVerb = value;
    }
    /**
     * Sets the authenticationContext property value. The authenticationContext property
     * @param value Value to set for the authenticationContext property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAuthenticationContext(@javax.annotation.Nullable final AuthenticationContextClassReference value) {
        this.authenticationContext = value;
    }
    /**
     * Sets the authenticationContextId property value. The authenticationContextId property
     * @param value Value to set for the authenticationContextId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAuthenticationContextId(@javax.annotation.Nullable final String value) {
        this.authenticationContextId = value;
    }
    /**
     * Sets the description property value. Description for the action. Supports $filter (eq).
     * @param value Value to set for the description property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDescription(@javax.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the isAuthenticationContextSettable property value. The isAuthenticationContextSettable property
     * @param value Value to set for the isAuthenticationContextSettable property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsAuthenticationContextSettable(@javax.annotation.Nullable final Boolean value) {
        this.isAuthenticationContextSettable = value;
    }
    /**
     * Sets the name property value. Name for the action within the resource namespace, such as microsoft.insights/programs/update. Can include slash character (/). Case insensitive. Required. Supports $filter (eq).
     * @param value Value to set for the name property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setName(@javax.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the resourceScope property value. The resourceScope property
     * @param value Value to set for the resourceScope property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setResourceScope(@javax.annotation.Nullable final UnifiedRbacResourceScope value) {
        this.resourceScope = value;
    }
    /**
     * Sets the resourceScopeId property value. Not implemented.
     * @param value Value to set for the resourceScopeId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setResourceScopeId(@javax.annotation.Nullable final String value) {
        this.resourceScopeId = value;
    }
}
