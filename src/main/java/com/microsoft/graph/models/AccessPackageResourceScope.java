package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the collection of accessReviewDecision entities. */
public class AccessPackageResourceScope extends Entity implements Parsable {
    /** The accessPackageResource property */
    private AccessPackageResource _accessPackageResource;
    /** The description of the scope. */
    private String _description;
    /** The display name of the scope. */
    private String _displayName;
    /** True if the scopes are arranged in a hierarchy and this is the top or root scope of the resource. */
    private Boolean _isRootScope;
    /** The unique identifier for the scope in the resource as defined in the origin system. */
    private String _originId;
    /** The origin system for the scope. */
    private String _originSystem;
    /** The origin system for the role, if different. */
    private String _roleOriginId;
    /** A resource locator for the scope. */
    private String _url;
    /**
     * Instantiates a new accessPackageResourceScope and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AccessPackageResourceScope() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a accessPackageResourceScope
     */
    @javax.annotation.Nonnull
    public static AccessPackageResourceScope createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccessPackageResourceScope();
    }
    /**
     * Gets the accessPackageResource property value. The accessPackageResource property
     * @return a accessPackageResource
     */
    @javax.annotation.Nullable
    public AccessPackageResource getAccessPackageResource() {
        return this._accessPackageResource;
    }
    /**
     * Gets the description property value. The description of the scope.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * Gets the displayName property value. The display name of the scope.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("accessPackageResource", (n) -> { this.setAccessPackageResource(n.getObjectValue(AccessPackageResource::createFromDiscriminatorValue)); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("isRootScope", (n) -> { this.setIsRootScope(n.getBooleanValue()); });
        deserializerMap.put("originId", (n) -> { this.setOriginId(n.getStringValue()); });
        deserializerMap.put("originSystem", (n) -> { this.setOriginSystem(n.getStringValue()); });
        deserializerMap.put("roleOriginId", (n) -> { this.setRoleOriginId(n.getStringValue()); });
        deserializerMap.put("url", (n) -> { this.setUrl(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isRootScope property value. True if the scopes are arranged in a hierarchy and this is the top or root scope of the resource.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsRootScope() {
        return this._isRootScope;
    }
    /**
     * Gets the originId property value. The unique identifier for the scope in the resource as defined in the origin system.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOriginId() {
        return this._originId;
    }
    /**
     * Gets the originSystem property value. The origin system for the scope.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOriginSystem() {
        return this._originSystem;
    }
    /**
     * Gets the roleOriginId property value. The origin system for the role, if different.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRoleOriginId() {
        return this._roleOriginId;
    }
    /**
     * Gets the url property value. A resource locator for the scope.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUrl() {
        return this._url;
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
        writer.writeObjectValue("accessPackageResource", this.getAccessPackageResource());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeBooleanValue("isRootScope", this.getIsRootScope());
        writer.writeStringValue("originId", this.getOriginId());
        writer.writeStringValue("originSystem", this.getOriginSystem());
        writer.writeStringValue("roleOriginId", this.getRoleOriginId());
        writer.writeStringValue("url", this.getUrl());
    }
    /**
     * Sets the accessPackageResource property value. The accessPackageResource property
     * @param value Value to set for the accessPackageResource property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAccessPackageResource(@javax.annotation.Nullable final AccessPackageResource value) {
        this._accessPackageResource = value;
    }
    /**
     * Sets the description property value. The description of the scope.
     * @param value Value to set for the description property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the displayName property value. The display name of the scope.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the isRootScope property value. True if the scopes are arranged in a hierarchy and this is the top or root scope of the resource.
     * @param value Value to set for the isRootScope property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsRootScope(@javax.annotation.Nullable final Boolean value) {
        this._isRootScope = value;
    }
    /**
     * Sets the originId property value. The unique identifier for the scope in the resource as defined in the origin system.
     * @param value Value to set for the originId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOriginId(@javax.annotation.Nullable final String value) {
        this._originId = value;
    }
    /**
     * Sets the originSystem property value. The origin system for the scope.
     * @param value Value to set for the originSystem property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOriginSystem(@javax.annotation.Nullable final String value) {
        this._originSystem = value;
    }
    /**
     * Sets the roleOriginId property value. The origin system for the role, if different.
     * @param value Value to set for the roleOriginId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRoleOriginId(@javax.annotation.Nullable final String value) {
        this._roleOriginId = value;
    }
    /**
     * Sets the url property value. A resource locator for the scope.
     * @param value Value to set for the url property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUrl(@javax.annotation.Nullable final String value) {
        this._url = value;
    }
}
