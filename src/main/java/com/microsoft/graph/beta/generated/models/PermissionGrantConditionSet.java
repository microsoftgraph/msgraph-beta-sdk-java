package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PermissionGrantConditionSet extends Entity implements Parsable {
    /**
     * Instantiates a new {@link PermissionGrantConditionSet} and sets the default values.
     */
    public PermissionGrantConditionSet() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PermissionGrantConditionSet}
     */
    @jakarta.annotation.Nonnull
    public static PermissionGrantConditionSet createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PermissionGrantConditionSet();
    }
    /**
     * Gets the certifiedClientApplicationsOnly property value. Set to true to only match on client applications that are Microsoft 365 certified. Set to false to match on any other client app. Default is false.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getCertifiedClientApplicationsOnly() {
        return this.backingStore.get("certifiedClientApplicationsOnly");
    }
    /**
     * Gets the clientApplicationIds property value. A list of appId values for the client applications to match with, or a list with the single value all to match any client application. Default is the single value all.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getClientApplicationIds() {
        return this.backingStore.get("clientApplicationIds");
    }
    /**
     * Gets the clientApplicationPublisherIds property value. A list of Microsoft Partner Network (MPN) IDs for verified publishers of the client application, or a list with the single value all to match with client apps from any publisher. Default is the single value all.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getClientApplicationPublisherIds() {
        return this.backingStore.get("clientApplicationPublisherIds");
    }
    /**
     * Gets the clientApplicationsFromVerifiedPublisherOnly property value. Set to true to only match on client applications with a verified publisher. Set to false to match on any client app, even if it does not have a verified publisher. Default is false.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getClientApplicationsFromVerifiedPublisherOnly() {
        return this.backingStore.get("clientApplicationsFromVerifiedPublisherOnly");
    }
    /**
     * Gets the clientApplicationTenantIds property value. A list of Microsoft Entra tenant IDs in which the client application is registered, or a list with the single value all to match with client apps registered in any tenant. Default is the single value all.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getClientApplicationTenantIds() {
        return this.backingStore.get("clientApplicationTenantIds");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("certifiedClientApplicationsOnly", (n) -> { this.setCertifiedClientApplicationsOnly(n.getBooleanValue()); });
        deserializerMap.put("clientApplicationIds", (n) -> { this.setClientApplicationIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("clientApplicationPublisherIds", (n) -> { this.setClientApplicationPublisherIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("clientApplicationsFromVerifiedPublisherOnly", (n) -> { this.setClientApplicationsFromVerifiedPublisherOnly(n.getBooleanValue()); });
        deserializerMap.put("clientApplicationTenantIds", (n) -> { this.setClientApplicationTenantIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("permissionClassification", (n) -> { this.setPermissionClassification(n.getStringValue()); });
        deserializerMap.put("permissions", (n) -> { this.setPermissions(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("permissionType", (n) -> { this.setPermissionType(n.getEnumValue(PermissionType::forValue)); });
        deserializerMap.put("resourceApplication", (n) -> { this.setResourceApplication(n.getStringValue()); });
        deserializerMap.put("scopeSensitivityLabels", (n) -> { this.setScopeSensitivityLabels(n.getObjectValue(ScopeSensitivityLabels::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the permissionClassification property value. The permission classification for the permission being granted, or all to match with any permission classification (including permissions which are not classified). Default is all.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPermissionClassification() {
        return this.backingStore.get("permissionClassification");
    }
    /**
     * Gets the permissions property value. The list of id values for the specific permissions to match with, or a list with the single value all to match with any permission. The id of delegated permissions can be found in the publishedPermissionScopes property of the API&apos;s servicePrincipal object. The id of application permissions can be found in the appRoles property of the API&apos;s servicePrincipal object. The id of resource-specific application permissions can be found in the resourceSpecificApplicationPermissions property of the API&apos;s servicePrincipal object. Default is the single value all.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getPermissions() {
        return this.backingStore.get("permissions");
    }
    /**
     * Gets the permissionType property value. The permission type of the permission being granted. Possible values: application for application permissions (e.g. app roles), or delegated for delegated permissions. The value delegatedUserConsentable indicates delegated permissions which have not been configured by the API publisher to require admin consentthis value may be used in built-in permission grant policies, but cannot be used in custom permission grant policies. Required.
     * @return a {@link PermissionType}
     */
    @jakarta.annotation.Nullable
    public PermissionType getPermissionType() {
        return this.backingStore.get("permissionType");
    }
    /**
     * Gets the resourceApplication property value. The appId of the resource application (e.g. the API) for which a permission is being granted, or any to match with any resource application or API. Default is any.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getResourceApplication() {
        return this.backingStore.get("resourceApplication");
    }
    /**
     * Gets the scopeSensitivityLabels property value. The scopeSensitivityLabels property
     * @return a {@link ScopeSensitivityLabels}
     */
    @jakarta.annotation.Nullable
    public ScopeSensitivityLabels getScopeSensitivityLabels() {
        return this.backingStore.get("scopeSensitivityLabels");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("certifiedClientApplicationsOnly", this.getCertifiedClientApplicationsOnly());
        writer.writeCollectionOfPrimitiveValues("clientApplicationIds", this.getClientApplicationIds());
        writer.writeCollectionOfPrimitiveValues("clientApplicationPublisherIds", this.getClientApplicationPublisherIds());
        writer.writeBooleanValue("clientApplicationsFromVerifiedPublisherOnly", this.getClientApplicationsFromVerifiedPublisherOnly());
        writer.writeCollectionOfPrimitiveValues("clientApplicationTenantIds", this.getClientApplicationTenantIds());
        writer.writeStringValue("permissionClassification", this.getPermissionClassification());
        writer.writeCollectionOfPrimitiveValues("permissions", this.getPermissions());
        writer.writeEnumValue("permissionType", this.getPermissionType());
        writer.writeStringValue("resourceApplication", this.getResourceApplication());
        writer.writeObjectValue("scopeSensitivityLabels", this.getScopeSensitivityLabels());
    }
    /**
     * Sets the certifiedClientApplicationsOnly property value. Set to true to only match on client applications that are Microsoft 365 certified. Set to false to match on any other client app. Default is false.
     * @param value Value to set for the certifiedClientApplicationsOnly property.
     */
    public void setCertifiedClientApplicationsOnly(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("certifiedClientApplicationsOnly", value);
    }
    /**
     * Sets the clientApplicationIds property value. A list of appId values for the client applications to match with, or a list with the single value all to match any client application. Default is the single value all.
     * @param value Value to set for the clientApplicationIds property.
     */
    public void setClientApplicationIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("clientApplicationIds", value);
    }
    /**
     * Sets the clientApplicationPublisherIds property value. A list of Microsoft Partner Network (MPN) IDs for verified publishers of the client application, or a list with the single value all to match with client apps from any publisher. Default is the single value all.
     * @param value Value to set for the clientApplicationPublisherIds property.
     */
    public void setClientApplicationPublisherIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("clientApplicationPublisherIds", value);
    }
    /**
     * Sets the clientApplicationsFromVerifiedPublisherOnly property value. Set to true to only match on client applications with a verified publisher. Set to false to match on any client app, even if it does not have a verified publisher. Default is false.
     * @param value Value to set for the clientApplicationsFromVerifiedPublisherOnly property.
     */
    public void setClientApplicationsFromVerifiedPublisherOnly(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("clientApplicationsFromVerifiedPublisherOnly", value);
    }
    /**
     * Sets the clientApplicationTenantIds property value. A list of Microsoft Entra tenant IDs in which the client application is registered, or a list with the single value all to match with client apps registered in any tenant. Default is the single value all.
     * @param value Value to set for the clientApplicationTenantIds property.
     */
    public void setClientApplicationTenantIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("clientApplicationTenantIds", value);
    }
    /**
     * Sets the permissionClassification property value. The permission classification for the permission being granted, or all to match with any permission classification (including permissions which are not classified). Default is all.
     * @param value Value to set for the permissionClassification property.
     */
    public void setPermissionClassification(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("permissionClassification", value);
    }
    /**
     * Sets the permissions property value. The list of id values for the specific permissions to match with, or a list with the single value all to match with any permission. The id of delegated permissions can be found in the publishedPermissionScopes property of the API&apos;s servicePrincipal object. The id of application permissions can be found in the appRoles property of the API&apos;s servicePrincipal object. The id of resource-specific application permissions can be found in the resourceSpecificApplicationPermissions property of the API&apos;s servicePrincipal object. Default is the single value all.
     * @param value Value to set for the permissions property.
     */
    public void setPermissions(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("permissions", value);
    }
    /**
     * Sets the permissionType property value. The permission type of the permission being granted. Possible values: application for application permissions (e.g. app roles), or delegated for delegated permissions. The value delegatedUserConsentable indicates delegated permissions which have not been configured by the API publisher to require admin consentthis value may be used in built-in permission grant policies, but cannot be used in custom permission grant policies. Required.
     * @param value Value to set for the permissionType property.
     */
    public void setPermissionType(@jakarta.annotation.Nullable final PermissionType value) {
        this.backingStore.set("permissionType", value);
    }
    /**
     * Sets the resourceApplication property value. The appId of the resource application (e.g. the API) for which a permission is being granted, or any to match with any resource application or API. Default is any.
     * @param value Value to set for the resourceApplication property.
     */
    public void setResourceApplication(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("resourceApplication", value);
    }
    /**
     * Sets the scopeSensitivityLabels property value. The scopeSensitivityLabels property
     * @param value Value to set for the scopeSensitivityLabels property.
     */
    public void setScopeSensitivityLabels(@jakarta.annotation.Nullable final ScopeSensitivityLabels value) {
        this.backingStore.set("scopeSensitivityLabels", value);
    }
}
