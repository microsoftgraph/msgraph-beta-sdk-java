package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AccessPackageResource extends Entity implements Parsable {
    /**
     * Instantiates a new AccessPackageResource and sets the default values.
     */
    public AccessPackageResource() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AccessPackageResource
     */
    @jakarta.annotation.Nonnull
    public static AccessPackageResource createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccessPackageResource();
    }
    /**
     * Gets the accessPackageResourceEnvironment property value. Contains the environment information for the resource. This can be set using either the @odata.bind annotation or the environment's originId.Supports $expand.
     * @return a AccessPackageResourceEnvironment
     */
    @jakarta.annotation.Nullable
    public AccessPackageResourceEnvironment getAccessPackageResourceEnvironment() {
        return this.backingStore.get("accessPackageResourceEnvironment");
    }
    /**
     * Gets the accessPackageResourceRoles property value. Read-only. Nullable. Supports $expand.
     * @return a java.util.List<AccessPackageResourceRole>
     */
    @jakarta.annotation.Nullable
    public java.util.List<AccessPackageResourceRole> getAccessPackageResourceRoles() {
        return this.backingStore.get("accessPackageResourceRoles");
    }
    /**
     * Gets the accessPackageResourceScopes property value. Read-only. Nullable. Supports $expand.
     * @return a java.util.List<AccessPackageResourceScope>
     */
    @jakarta.annotation.Nullable
    public java.util.List<AccessPackageResourceScope> getAccessPackageResourceScopes() {
        return this.backingStore.get("accessPackageResourceScopes");
    }
    /**
     * Gets the addedBy property value. The name of the user or application that first added this resource. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAddedBy() {
        return this.backingStore.get("addedBy");
    }
    /**
     * Gets the addedOn property value. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getAddedOn() {
        return this.backingStore.get("addedOn");
    }
    /**
     * Gets the attributes property value. Contains information about the attributes to be collected from the requestor and sent to the resource application.
     * @return a java.util.List<AccessPackageResourceAttribute>
     */
    @jakarta.annotation.Nullable
    public java.util.List<AccessPackageResourceAttribute> getAttributes() {
        return this.backingStore.get("attributes");
    }
    /**
     * Gets the description property value. A description for the resource.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * Gets the displayName property value. The display name of the resource, such as the application name, group name or site name.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
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
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsPendingOnboarding() {
        return this.backingStore.get("isPendingOnboarding");
    }
    /**
     * Gets the originId property value. The unique identifier of the resource in the origin system. In the case of a Microsoft Entra group, this is the identifier of the group.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOriginId() {
        return this.backingStore.get("originId");
    }
    /**
     * Gets the originSystem property value. The type of the resource in the origin system, such as SharePointOnline, AadApplication or AadGroup.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOriginSystem() {
        return this.backingStore.get("originSystem");
    }
    /**
     * Gets the resourceType property value. The type of the resource, such as Application if it is a Microsoft Entra connected application, or SharePoint Online Site for a SharePoint Online site.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getResourceType() {
        return this.backingStore.get("resourceType");
    }
    /**
     * Gets the url property value. A unique resource locator for the resource, such as the URL for signing a user into an application.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getUrl() {
        return this.backingStore.get("url");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     */
    public void setAccessPackageResourceEnvironment(@jakarta.annotation.Nullable final AccessPackageResourceEnvironment value) {
        this.backingStore.set("accessPackageResourceEnvironment", value);
    }
    /**
     * Sets the accessPackageResourceRoles property value. Read-only. Nullable. Supports $expand.
     * @param value Value to set for the accessPackageResourceRoles property.
     */
    public void setAccessPackageResourceRoles(@jakarta.annotation.Nullable final java.util.List<AccessPackageResourceRole> value) {
        this.backingStore.set("accessPackageResourceRoles", value);
    }
    /**
     * Sets the accessPackageResourceScopes property value. Read-only. Nullable. Supports $expand.
     * @param value Value to set for the accessPackageResourceScopes property.
     */
    public void setAccessPackageResourceScopes(@jakarta.annotation.Nullable final java.util.List<AccessPackageResourceScope> value) {
        this.backingStore.set("accessPackageResourceScopes", value);
    }
    /**
     * Sets the addedBy property value. The name of the user or application that first added this resource. Read-only.
     * @param value Value to set for the addedBy property.
     */
    public void setAddedBy(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("addedBy", value);
    }
    /**
     * Sets the addedOn property value. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     * @param value Value to set for the addedOn property.
     */
    public void setAddedOn(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("addedOn", value);
    }
    /**
     * Sets the attributes property value. Contains information about the attributes to be collected from the requestor and sent to the resource application.
     * @param value Value to set for the attributes property.
     */
    public void setAttributes(@jakarta.annotation.Nullable final java.util.List<AccessPackageResourceAttribute> value) {
        this.backingStore.set("attributes", value);
    }
    /**
     * Sets the description property value. A description for the resource.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the displayName property value. The display name of the resource, such as the application name, group name or site name.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the isPendingOnboarding property value. True if the resource is not yet available for assignment. Read-only.
     * @param value Value to set for the isPendingOnboarding property.
     */
    public void setIsPendingOnboarding(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isPendingOnboarding", value);
    }
    /**
     * Sets the originId property value. The unique identifier of the resource in the origin system. In the case of a Microsoft Entra group, this is the identifier of the group.
     * @param value Value to set for the originId property.
     */
    public void setOriginId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("originId", value);
    }
    /**
     * Sets the originSystem property value. The type of the resource in the origin system, such as SharePointOnline, AadApplication or AadGroup.
     * @param value Value to set for the originSystem property.
     */
    public void setOriginSystem(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("originSystem", value);
    }
    /**
     * Sets the resourceType property value. The type of the resource, such as Application if it is a Microsoft Entra connected application, or SharePoint Online Site for a SharePoint Online site.
     * @param value Value to set for the resourceType property.
     */
    public void setResourceType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("resourceType", value);
    }
    /**
     * Sets the url property value. A unique resource locator for the resource, such as the URL for signing a user into an application.
     * @param value Value to set for the url property.
     */
    public void setUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("url", value);
    }
}
