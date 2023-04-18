package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AccessPackageResource extends Entity implements Parsable {
    /** Contains the environment information for the resource. This can be set using either the @odata.bind annotation or the environment's originId.Supports $expand. */
    private AccessPackageResourceEnvironment accessPackageResourceEnvironment;
    /** Read-only. Nullable. Supports $expand. */
    private java.util.List<AccessPackageResourceRole> accessPackageResourceRoles;
    /** Read-only. Nullable. Supports $expand. */
    private java.util.List<AccessPackageResourceScope> accessPackageResourceScopes;
    /** The name of the user or application that first added this resource. Read-only. */
    private String addedBy;
    /** The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only. */
    private OffsetDateTime addedOn;
    /** Contains information about the attributes to be collected from the requestor and sent to the resource application. */
    private java.util.List<AccessPackageResourceAttribute> attributes;
    /** A description for the resource. */
    private String description;
    /** The display name of the resource, such as the application name, group name or site name. */
    private String displayName;
    /** True if the resource is not yet available for assignment. Read-only. */
    private Boolean isPendingOnboarding;
    /** The unique identifier of the resource in the origin system. In the case of an Azure AD group, this is the identifier of the group. */
    private String originId;
    /** The type of the resource in the origin system, such as SharePointOnline, AadApplication or AadGroup. */
    private String originSystem;
    /** The type of the resource, such as Application if it is an Azure AD connected application, or SharePoint Online Site for a SharePoint Online site. */
    private String resourceType;
    /** A unique resource locator for the resource, such as the URL for signing a user into an application. */
    private String url;
    /**
     * Instantiates a new accessPackageResource and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AccessPackageResource() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a accessPackageResource
     */
    @javax.annotation.Nonnull
    public static AccessPackageResource createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccessPackageResource();
    }
    /**
     * Gets the accessPackageResourceEnvironment property value. Contains the environment information for the resource. This can be set using either the @odata.bind annotation or the environment's originId.Supports $expand.
     * @return a accessPackageResourceEnvironment
     */
    @javax.annotation.Nullable
    public AccessPackageResourceEnvironment getAccessPackageResourceEnvironment() {
        return this.accessPackageResourceEnvironment;
    }
    /**
     * Gets the accessPackageResourceRoles property value. Read-only. Nullable. Supports $expand.
     * @return a accessPackageResourceRole
     */
    @javax.annotation.Nullable
    public java.util.List<AccessPackageResourceRole> getAccessPackageResourceRoles() {
        return this.accessPackageResourceRoles;
    }
    /**
     * Gets the accessPackageResourceScopes property value. Read-only. Nullable. Supports $expand.
     * @return a accessPackageResourceScope
     */
    @javax.annotation.Nullable
    public java.util.List<AccessPackageResourceScope> getAccessPackageResourceScopes() {
        return this.accessPackageResourceScopes;
    }
    /**
     * Gets the addedBy property value. The name of the user or application that first added this resource. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAddedBy() {
        return this.addedBy;
    }
    /**
     * Gets the addedOn property value. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getAddedOn() {
        return this.addedOn;
    }
    /**
     * Gets the attributes property value. Contains information about the attributes to be collected from the requestor and sent to the resource application.
     * @return a accessPackageResourceAttribute
     */
    @javax.annotation.Nullable
    public java.util.List<AccessPackageResourceAttribute> getAttributes() {
        return this.attributes;
    }
    /**
     * Gets the description property value. A description for the resource.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * Gets the displayName property value. The display name of the resource, such as the application name, group name or site name.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("accessPackageResourceEnvironment", (n) -> { this.setAccessPackageResourceEnvironment(n.getObjectValue(AccessPackageResourceEnvironment::createFromDiscriminatorValue)); });
        deserializerMap.put("accessPackageResourceRoles", (n) -> { this.setAccessPackageResourceRoles(n.getCollectionOfObjectValues(AccessPackageResourceRole::createFromDiscriminatorValue)); });
        deserializerMap.put("accessPackageResourceScopes", (n) -> { this.setAccessPackageResourceScopes(n.getCollectionOfObjectValues(AccessPackageResourceScope::createFromDiscriminatorValue)); });
        deserializerMap.put("addedBy", (n) -> { this.setAddedBy(n.getStringValue()); });
        deserializerMap.put("addedOn", (n) -> { this.setAddedOn(n.getOffsetDateTimeValue()); });
        deserializerMap.put("attributes", (n) -> { this.setAttributes(n.getCollectionOfObjectValues(AccessPackageResourceAttribute::createFromDiscriminatorValue)); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("isPendingOnboarding", (n) -> { this.setIsPendingOnboarding(n.getBooleanValue()); });
        deserializerMap.put("originId", (n) -> { this.setOriginId(n.getStringValue()); });
        deserializerMap.put("originSystem", (n) -> { this.setOriginSystem(n.getStringValue()); });
        deserializerMap.put("resourceType", (n) -> { this.setResourceType(n.getStringValue()); });
        deserializerMap.put("url", (n) -> { this.setUrl(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isPendingOnboarding property value. True if the resource is not yet available for assignment. Read-only.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsPendingOnboarding() {
        return this.isPendingOnboarding;
    }
    /**
     * Gets the originId property value. The unique identifier of the resource in the origin system. In the case of an Azure AD group, this is the identifier of the group.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOriginId() {
        return this.originId;
    }
    /**
     * Gets the originSystem property value. The type of the resource in the origin system, such as SharePointOnline, AadApplication or AadGroup.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOriginSystem() {
        return this.originSystem;
    }
    /**
     * Gets the resourceType property value. The type of the resource, such as Application if it is an Azure AD connected application, or SharePoint Online Site for a SharePoint Online site.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getResourceType() {
        return this.resourceType;
    }
    /**
     * Gets the url property value. A unique resource locator for the resource, such as the URL for signing a user into an application.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUrl() {
        return this.url;
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
        writer.writeObjectValue("accessPackageResourceEnvironment", this.getAccessPackageResourceEnvironment());
        writer.writeCollectionOfObjectValues("accessPackageResourceRoles", this.getAccessPackageResourceRoles());
        writer.writeCollectionOfObjectValues("accessPackageResourceScopes", this.getAccessPackageResourceScopes());
        writer.writeStringValue("addedBy", this.getAddedBy());
        writer.writeOffsetDateTimeValue("addedOn", this.getAddedOn());
        writer.writeCollectionOfObjectValues("attributes", this.getAttributes());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeBooleanValue("isPendingOnboarding", this.getIsPendingOnboarding());
        writer.writeStringValue("originId", this.getOriginId());
        writer.writeStringValue("originSystem", this.getOriginSystem());
        writer.writeStringValue("resourceType", this.getResourceType());
        writer.writeStringValue("url", this.getUrl());
    }
    /**
     * Sets the accessPackageResourceEnvironment property value. Contains the environment information for the resource. This can be set using either the @odata.bind annotation or the environment's originId.Supports $expand.
     * @param value Value to set for the accessPackageResourceEnvironment property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAccessPackageResourceEnvironment(@javax.annotation.Nullable final AccessPackageResourceEnvironment value) {
        this.accessPackageResourceEnvironment = value;
    }
    /**
     * Sets the accessPackageResourceRoles property value. Read-only. Nullable. Supports $expand.
     * @param value Value to set for the accessPackageResourceRoles property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAccessPackageResourceRoles(@javax.annotation.Nullable final java.util.List<AccessPackageResourceRole> value) {
        this.accessPackageResourceRoles = value;
    }
    /**
     * Sets the accessPackageResourceScopes property value. Read-only. Nullable. Supports $expand.
     * @param value Value to set for the accessPackageResourceScopes property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAccessPackageResourceScopes(@javax.annotation.Nullable final java.util.List<AccessPackageResourceScope> value) {
        this.accessPackageResourceScopes = value;
    }
    /**
     * Sets the addedBy property value. The name of the user or application that first added this resource. Read-only.
     * @param value Value to set for the addedBy property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAddedBy(@javax.annotation.Nullable final String value) {
        this.addedBy = value;
    }
    /**
     * Sets the addedOn property value. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     * @param value Value to set for the addedOn property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAddedOn(@javax.annotation.Nullable final OffsetDateTime value) {
        this.addedOn = value;
    }
    /**
     * Sets the attributes property value. Contains information about the attributes to be collected from the requestor and sent to the resource application.
     * @param value Value to set for the attributes property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAttributes(@javax.annotation.Nullable final java.util.List<AccessPackageResourceAttribute> value) {
        this.attributes = value;
    }
    /**
     * Sets the description property value. A description for the resource.
     * @param value Value to set for the description property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDescription(@javax.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the displayName property value. The display name of the resource, such as the application name, group name or site name.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the isPendingOnboarding property value. True if the resource is not yet available for assignment. Read-only.
     * @param value Value to set for the isPendingOnboarding property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsPendingOnboarding(@javax.annotation.Nullable final Boolean value) {
        this.isPendingOnboarding = value;
    }
    /**
     * Sets the originId property value. The unique identifier of the resource in the origin system. In the case of an Azure AD group, this is the identifier of the group.
     * @param value Value to set for the originId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOriginId(@javax.annotation.Nullable final String value) {
        this.originId = value;
    }
    /**
     * Sets the originSystem property value. The type of the resource in the origin system, such as SharePointOnline, AadApplication or AadGroup.
     * @param value Value to set for the originSystem property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOriginSystem(@javax.annotation.Nullable final String value) {
        this.originSystem = value;
    }
    /**
     * Sets the resourceType property value. The type of the resource, such as Application if it is an Azure AD connected application, or SharePoint Online Site for a SharePoint Online site.
     * @param value Value to set for the resourceType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setResourceType(@javax.annotation.Nullable final String value) {
        this.resourceType = value;
    }
    /**
     * Sets the url property value. A unique resource locator for the resource, such as the URL for signing a user into an application.
     * @param value Value to set for the url property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUrl(@javax.annotation.Nullable final String value) {
        this.url = value;
    }
}
