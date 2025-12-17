package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EntitlementManagement extends Entity implements Parsable {
    /**
     * Instantiates a new {@link EntitlementManagement} and sets the default values.
     */
    public EntitlementManagement() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link EntitlementManagement}
     */
    @jakarta.annotation.Nonnull
    public static EntitlementManagement createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EntitlementManagement();
    }
    /**
     * Gets the accessPackageAssignmentApprovals property value. The accessPackageAssignmentApprovals property
     * @return a {@link java.util.List<Approval>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Approval> getAccessPackageAssignmentApprovals() {
        return this.backingStore.get("accessPackageAssignmentApprovals");
    }
    /**
     * Gets the accessPackageAssignmentPolicies property value. Represents the policy that governs which subjects can request or be assigned an access package via an access package assignment.
     * @return a {@link java.util.List<AccessPackageAssignmentPolicy>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AccessPackageAssignmentPolicy> getAccessPackageAssignmentPolicies() {
        return this.backingStore.get("accessPackageAssignmentPolicies");
    }
    /**
     * Gets the accessPackageAssignmentRequests property value. Represents access package assignment requests created by or on behalf of a user. DO NOT USE. TO BE RETIRED SOON. Use the assignmentRequests relationship instead.
     * @return a {@link java.util.List<AccessPackageAssignmentRequest>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AccessPackageAssignmentRequest> getAccessPackageAssignmentRequests() {
        return this.backingStore.get("accessPackageAssignmentRequests");
    }
    /**
     * Gets the accessPackageAssignmentResourceRoles property value. Represents the resource-specific role which a subject has been assigned through an access package assignment.
     * @return a {@link java.util.List<AccessPackageAssignmentResourceRole>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AccessPackageAssignmentResourceRole> getAccessPackageAssignmentResourceRoles() {
        return this.backingStore.get("accessPackageAssignmentResourceRoles");
    }
    /**
     * Gets the accessPackageAssignments property value. The assignment of an access package to a subject for a period of time.
     * @return a {@link java.util.List<AccessPackageAssignment>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AccessPackageAssignment> getAccessPackageAssignments() {
        return this.backingStore.get("accessPackageAssignments");
    }
    /**
     * Gets the accessPackageCatalogs property value. A container of access packages.
     * @return a {@link java.util.List<AccessPackageCatalog>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AccessPackageCatalog> getAccessPackageCatalogs() {
        return this.backingStore.get("accessPackageCatalogs");
    }
    /**
     * Gets the accessPackageResourceEnvironments property value. A reference to the geolocation environment in which a resource is located.
     * @return a {@link java.util.List<AccessPackageResourceEnvironment>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AccessPackageResourceEnvironment> getAccessPackageResourceEnvironments() {
        return this.backingStore.get("accessPackageResourceEnvironments");
    }
    /**
     * Gets the accessPackageResourceRequests property value. Represents a request to add or remove a resource to or from a catalog respectively.
     * @return a {@link java.util.List<AccessPackageResourceRequest>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AccessPackageResourceRequest> getAccessPackageResourceRequests() {
        return this.backingStore.get("accessPackageResourceRequests");
    }
    /**
     * Gets the accessPackageResourceRoleScopes property value. A reference to both a scope within a resource, and a role in that resource for that scope.
     * @return a {@link java.util.List<AccessPackageResourceRoleScope>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AccessPackageResourceRoleScope> getAccessPackageResourceRoleScopes() {
        return this.backingStore.get("accessPackageResourceRoleScopes");
    }
    /**
     * Gets the accessPackageResources property value. A reference to a resource associated with an access package catalog.
     * @return a {@link java.util.List<AccessPackageResource>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AccessPackageResource> getAccessPackageResources() {
        return this.backingStore.get("accessPackageResources");
    }
    /**
     * Gets the accessPackages property value. Represents access package objects.
     * @return a {@link java.util.List<AccessPackage>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AccessPackage> getAccessPackages() {
        return this.backingStore.get("accessPackages");
    }
    /**
     * Gets the accessPackageSuggestions property value. The accessPackageSuggestions property
     * @return a {@link java.util.List<AccessPackageSuggestion>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AccessPackageSuggestion> getAccessPackageSuggestions() {
        return this.backingStore.get("accessPackageSuggestions");
    }
    /**
     * Gets the assignmentRequests property value. Represents access package assignment requests created by or on behalf of a user.
     * @return a {@link java.util.List<AccessPackageAssignmentRequest>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AccessPackageAssignmentRequest> getAssignmentRequests() {
        return this.backingStore.get("assignmentRequests");
    }
    /**
     * Gets the availableAccessPackages property value. The availableAccessPackages property
     * @return a {@link java.util.List<AvailableAccessPackage>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AvailableAccessPackage> getAvailableAccessPackages() {
        return this.backingStore.get("availableAccessPackages");
    }
    /**
     * Gets the connectedOrganizations property value. Represents references to a directory or domain of another organization whose users can request access.
     * @return a {@link java.util.List<ConnectedOrganization>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ConnectedOrganization> getConnectedOrganizations() {
        return this.backingStore.get("connectedOrganizations");
    }
    /**
     * Gets the controlConfigurations property value. Represents the policies that control lifecycle and access to access packages across the organization.
     * @return a {@link java.util.List<ControlConfiguration>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ControlConfiguration> getControlConfigurations() {
        return this.backingStore.get("controlConfigurations");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("accessPackageAssignmentApprovals", (n) -> { this.setAccessPackageAssignmentApprovals(n.getCollectionOfObjectValues(Approval::createFromDiscriminatorValue)); });
        deserializerMap.put("accessPackageAssignmentPolicies", (n) -> { this.setAccessPackageAssignmentPolicies(n.getCollectionOfObjectValues(AccessPackageAssignmentPolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("accessPackageAssignmentRequests", (n) -> { this.setAccessPackageAssignmentRequests(n.getCollectionOfObjectValues(AccessPackageAssignmentRequest::createFromDiscriminatorValue)); });
        deserializerMap.put("accessPackageAssignmentResourceRoles", (n) -> { this.setAccessPackageAssignmentResourceRoles(n.getCollectionOfObjectValues(AccessPackageAssignmentResourceRole::createFromDiscriminatorValue)); });
        deserializerMap.put("accessPackageAssignments", (n) -> { this.setAccessPackageAssignments(n.getCollectionOfObjectValues(AccessPackageAssignment::createFromDiscriminatorValue)); });
        deserializerMap.put("accessPackageCatalogs", (n) -> { this.setAccessPackageCatalogs(n.getCollectionOfObjectValues(AccessPackageCatalog::createFromDiscriminatorValue)); });
        deserializerMap.put("accessPackageResourceEnvironments", (n) -> { this.setAccessPackageResourceEnvironments(n.getCollectionOfObjectValues(AccessPackageResourceEnvironment::createFromDiscriminatorValue)); });
        deserializerMap.put("accessPackageResourceRequests", (n) -> { this.setAccessPackageResourceRequests(n.getCollectionOfObjectValues(AccessPackageResourceRequest::createFromDiscriminatorValue)); });
        deserializerMap.put("accessPackageResourceRoleScopes", (n) -> { this.setAccessPackageResourceRoleScopes(n.getCollectionOfObjectValues(AccessPackageResourceRoleScope::createFromDiscriminatorValue)); });
        deserializerMap.put("accessPackageResources", (n) -> { this.setAccessPackageResources(n.getCollectionOfObjectValues(AccessPackageResource::createFromDiscriminatorValue)); });
        deserializerMap.put("accessPackages", (n) -> { this.setAccessPackages(n.getCollectionOfObjectValues(AccessPackage::createFromDiscriminatorValue)); });
        deserializerMap.put("accessPackageSuggestions", (n) -> { this.setAccessPackageSuggestions(n.getCollectionOfObjectValues(AccessPackageSuggestion::createFromDiscriminatorValue)); });
        deserializerMap.put("assignmentRequests", (n) -> { this.setAssignmentRequests(n.getCollectionOfObjectValues(AccessPackageAssignmentRequest::createFromDiscriminatorValue)); });
        deserializerMap.put("availableAccessPackages", (n) -> { this.setAvailableAccessPackages(n.getCollectionOfObjectValues(AvailableAccessPackage::createFromDiscriminatorValue)); });
        deserializerMap.put("connectedOrganizations", (n) -> { this.setConnectedOrganizations(n.getCollectionOfObjectValues(ConnectedOrganization::createFromDiscriminatorValue)); });
        deserializerMap.put("controlConfigurations", (n) -> { this.setControlConfigurations(n.getCollectionOfObjectValues(ControlConfiguration::createFromDiscriminatorValue)); });
        deserializerMap.put("settings", (n) -> { this.setSettings(n.getObjectValue(EntitlementManagementSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("subjects", (n) -> { this.setSubjects(n.getCollectionOfObjectValues(AccessPackageSubject::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the settings property value. Represents the settings that control the behavior of Microsoft Entra entitlement management.
     * @return a {@link EntitlementManagementSettings}
     */
    @jakarta.annotation.Nullable
    public EntitlementManagementSettings getSettings() {
        return this.backingStore.get("settings");
    }
    /**
     * Gets the subjects property value. Represents the subjects within entitlement management.
     * @return a {@link java.util.List<AccessPackageSubject>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AccessPackageSubject> getSubjects() {
        return this.backingStore.get("subjects");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("accessPackageAssignmentApprovals", this.getAccessPackageAssignmentApprovals());
        writer.writeCollectionOfObjectValues("accessPackageAssignmentPolicies", this.getAccessPackageAssignmentPolicies());
        writer.writeCollectionOfObjectValues("accessPackageAssignmentRequests", this.getAccessPackageAssignmentRequests());
        writer.writeCollectionOfObjectValues("accessPackageAssignmentResourceRoles", this.getAccessPackageAssignmentResourceRoles());
        writer.writeCollectionOfObjectValues("accessPackageAssignments", this.getAccessPackageAssignments());
        writer.writeCollectionOfObjectValues("accessPackageCatalogs", this.getAccessPackageCatalogs());
        writer.writeCollectionOfObjectValues("accessPackageResourceEnvironments", this.getAccessPackageResourceEnvironments());
        writer.writeCollectionOfObjectValues("accessPackageResourceRequests", this.getAccessPackageResourceRequests());
        writer.writeCollectionOfObjectValues("accessPackageResourceRoleScopes", this.getAccessPackageResourceRoleScopes());
        writer.writeCollectionOfObjectValues("accessPackageResources", this.getAccessPackageResources());
        writer.writeCollectionOfObjectValues("accessPackages", this.getAccessPackages());
        writer.writeCollectionOfObjectValues("accessPackageSuggestions", this.getAccessPackageSuggestions());
        writer.writeCollectionOfObjectValues("assignmentRequests", this.getAssignmentRequests());
        writer.writeCollectionOfObjectValues("availableAccessPackages", this.getAvailableAccessPackages());
        writer.writeCollectionOfObjectValues("connectedOrganizations", this.getConnectedOrganizations());
        writer.writeCollectionOfObjectValues("controlConfigurations", this.getControlConfigurations());
        writer.writeObjectValue("settings", this.getSettings());
        writer.writeCollectionOfObjectValues("subjects", this.getSubjects());
    }
    /**
     * Sets the accessPackageAssignmentApprovals property value. The accessPackageAssignmentApprovals property
     * @param value Value to set for the accessPackageAssignmentApprovals property.
     */
    public void setAccessPackageAssignmentApprovals(@jakarta.annotation.Nullable final java.util.List<Approval> value) {
        this.backingStore.set("accessPackageAssignmentApprovals", value);
    }
    /**
     * Sets the accessPackageAssignmentPolicies property value. Represents the policy that governs which subjects can request or be assigned an access package via an access package assignment.
     * @param value Value to set for the accessPackageAssignmentPolicies property.
     */
    public void setAccessPackageAssignmentPolicies(@jakarta.annotation.Nullable final java.util.List<AccessPackageAssignmentPolicy> value) {
        this.backingStore.set("accessPackageAssignmentPolicies", value);
    }
    /**
     * Sets the accessPackageAssignmentRequests property value. Represents access package assignment requests created by or on behalf of a user. DO NOT USE. TO BE RETIRED SOON. Use the assignmentRequests relationship instead.
     * @param value Value to set for the accessPackageAssignmentRequests property.
     */
    public void setAccessPackageAssignmentRequests(@jakarta.annotation.Nullable final java.util.List<AccessPackageAssignmentRequest> value) {
        this.backingStore.set("accessPackageAssignmentRequests", value);
    }
    /**
     * Sets the accessPackageAssignmentResourceRoles property value. Represents the resource-specific role which a subject has been assigned through an access package assignment.
     * @param value Value to set for the accessPackageAssignmentResourceRoles property.
     */
    public void setAccessPackageAssignmentResourceRoles(@jakarta.annotation.Nullable final java.util.List<AccessPackageAssignmentResourceRole> value) {
        this.backingStore.set("accessPackageAssignmentResourceRoles", value);
    }
    /**
     * Sets the accessPackageAssignments property value. The assignment of an access package to a subject for a period of time.
     * @param value Value to set for the accessPackageAssignments property.
     */
    public void setAccessPackageAssignments(@jakarta.annotation.Nullable final java.util.List<AccessPackageAssignment> value) {
        this.backingStore.set("accessPackageAssignments", value);
    }
    /**
     * Sets the accessPackageCatalogs property value. A container of access packages.
     * @param value Value to set for the accessPackageCatalogs property.
     */
    public void setAccessPackageCatalogs(@jakarta.annotation.Nullable final java.util.List<AccessPackageCatalog> value) {
        this.backingStore.set("accessPackageCatalogs", value);
    }
    /**
     * Sets the accessPackageResourceEnvironments property value. A reference to the geolocation environment in which a resource is located.
     * @param value Value to set for the accessPackageResourceEnvironments property.
     */
    public void setAccessPackageResourceEnvironments(@jakarta.annotation.Nullable final java.util.List<AccessPackageResourceEnvironment> value) {
        this.backingStore.set("accessPackageResourceEnvironments", value);
    }
    /**
     * Sets the accessPackageResourceRequests property value. Represents a request to add or remove a resource to or from a catalog respectively.
     * @param value Value to set for the accessPackageResourceRequests property.
     */
    public void setAccessPackageResourceRequests(@jakarta.annotation.Nullable final java.util.List<AccessPackageResourceRequest> value) {
        this.backingStore.set("accessPackageResourceRequests", value);
    }
    /**
     * Sets the accessPackageResourceRoleScopes property value. A reference to both a scope within a resource, and a role in that resource for that scope.
     * @param value Value to set for the accessPackageResourceRoleScopes property.
     */
    public void setAccessPackageResourceRoleScopes(@jakarta.annotation.Nullable final java.util.List<AccessPackageResourceRoleScope> value) {
        this.backingStore.set("accessPackageResourceRoleScopes", value);
    }
    /**
     * Sets the accessPackageResources property value. A reference to a resource associated with an access package catalog.
     * @param value Value to set for the accessPackageResources property.
     */
    public void setAccessPackageResources(@jakarta.annotation.Nullable final java.util.List<AccessPackageResource> value) {
        this.backingStore.set("accessPackageResources", value);
    }
    /**
     * Sets the accessPackages property value. Represents access package objects.
     * @param value Value to set for the accessPackages property.
     */
    public void setAccessPackages(@jakarta.annotation.Nullable final java.util.List<AccessPackage> value) {
        this.backingStore.set("accessPackages", value);
    }
    /**
     * Sets the accessPackageSuggestions property value. The accessPackageSuggestions property
     * @param value Value to set for the accessPackageSuggestions property.
     */
    public void setAccessPackageSuggestions(@jakarta.annotation.Nullable final java.util.List<AccessPackageSuggestion> value) {
        this.backingStore.set("accessPackageSuggestions", value);
    }
    /**
     * Sets the assignmentRequests property value. Represents access package assignment requests created by or on behalf of a user.
     * @param value Value to set for the assignmentRequests property.
     */
    public void setAssignmentRequests(@jakarta.annotation.Nullable final java.util.List<AccessPackageAssignmentRequest> value) {
        this.backingStore.set("assignmentRequests", value);
    }
    /**
     * Sets the availableAccessPackages property value. The availableAccessPackages property
     * @param value Value to set for the availableAccessPackages property.
     */
    public void setAvailableAccessPackages(@jakarta.annotation.Nullable final java.util.List<AvailableAccessPackage> value) {
        this.backingStore.set("availableAccessPackages", value);
    }
    /**
     * Sets the connectedOrganizations property value. Represents references to a directory or domain of another organization whose users can request access.
     * @param value Value to set for the connectedOrganizations property.
     */
    public void setConnectedOrganizations(@jakarta.annotation.Nullable final java.util.List<ConnectedOrganization> value) {
        this.backingStore.set("connectedOrganizations", value);
    }
    /**
     * Sets the controlConfigurations property value. Represents the policies that control lifecycle and access to access packages across the organization.
     * @param value Value to set for the controlConfigurations property.
     */
    public void setControlConfigurations(@jakarta.annotation.Nullable final java.util.List<ControlConfiguration> value) {
        this.backingStore.set("controlConfigurations", value);
    }
    /**
     * Sets the settings property value. Represents the settings that control the behavior of Microsoft Entra entitlement management.
     * @param value Value to set for the settings property.
     */
    public void setSettings(@jakarta.annotation.Nullable final EntitlementManagementSettings value) {
        this.backingStore.set("settings", value);
    }
    /**
     * Sets the subjects property value. Represents the subjects within entitlement management.
     * @param value Value to set for the subjects property.
     */
    public void setSubjects(@jakarta.annotation.Nullable final java.util.List<AccessPackageSubject> value) {
        this.backingStore.set("subjects", value);
    }
}
