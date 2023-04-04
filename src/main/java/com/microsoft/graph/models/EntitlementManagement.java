package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class EntitlementManagement extends Entity implements Parsable {
    /** The accessPackageAssignmentApprovals property */
    private java.util.List<Approval> accessPackageAssignmentApprovals;
    /** Represents the policy that governs which subjects can request or be assigned an access package via an access package assignment. */
    private java.util.List<AccessPackageAssignmentPolicy> accessPackageAssignmentPolicies;
    /** Represents access package assignment requests created by or on behalf of a user. */
    private java.util.List<AccessPackageAssignmentRequest> accessPackageAssignmentRequests;
    /** Represents the resource-specific role which a subject has been assigned through an access package assignment. */
    private java.util.List<AccessPackageAssignmentResourceRole> accessPackageAssignmentResourceRoles;
    /** The assignment of an access package to a subject for a period of time. */
    private java.util.List<AccessPackageAssignment> accessPackageAssignments;
    /** A container of access packages. */
    private java.util.List<AccessPackageCatalog> accessPackageCatalogs;
    /** A reference to the geolocation environment in which a resource is located. */
    private java.util.List<AccessPackageResourceEnvironment> accessPackageResourceEnvironments;
    /** Represents a request to add or remove a resource to or from a catalog respectively. */
    private java.util.List<AccessPackageResourceRequest> accessPackageResourceRequests;
    /** A reference to both a scope within a resource, and a role in that resource for that scope. */
    private java.util.List<AccessPackageResourceRoleScope> accessPackageResourceRoleScopes;
    /** A reference to a resource associated with an access package catalog. */
    private java.util.List<AccessPackageResource> accessPackageResources;
    /** Represents access package objects. */
    private java.util.List<AccessPackage> accessPackages;
    /** Represents references to a directory or domain of another organization whose users can request access. */
    private java.util.List<ConnectedOrganization> connectedOrganizations;
    /** Represents the settings that control the behavior of Azure AD entitlement management. */
    private EntitlementManagementSettings settings;
    /** The subjects property */
    private java.util.List<AccessPackageSubject> subjects;
    /**
     * Instantiates a new EntitlementManagement and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public EntitlementManagement() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a EntitlementManagement
     */
    @javax.annotation.Nonnull
    public static EntitlementManagement createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EntitlementManagement();
    }
    /**
     * Gets the accessPackageAssignmentApprovals property value. The accessPackageAssignmentApprovals property
     * @return a approval
     */
    @javax.annotation.Nullable
    public java.util.List<Approval> getAccessPackageAssignmentApprovals() {
        return this.accessPackageAssignmentApprovals;
    }
    /**
     * Gets the accessPackageAssignmentPolicies property value. Represents the policy that governs which subjects can request or be assigned an access package via an access package assignment.
     * @return a accessPackageAssignmentPolicy
     */
    @javax.annotation.Nullable
    public java.util.List<AccessPackageAssignmentPolicy> getAccessPackageAssignmentPolicies() {
        return this.accessPackageAssignmentPolicies;
    }
    /**
     * Gets the accessPackageAssignmentRequests property value. Represents access package assignment requests created by or on behalf of a user.
     * @return a accessPackageAssignmentRequest
     */
    @javax.annotation.Nullable
    public java.util.List<AccessPackageAssignmentRequest> getAccessPackageAssignmentRequests() {
        return this.accessPackageAssignmentRequests;
    }
    /**
     * Gets the accessPackageAssignmentResourceRoles property value. Represents the resource-specific role which a subject has been assigned through an access package assignment.
     * @return a accessPackageAssignmentResourceRole
     */
    @javax.annotation.Nullable
    public java.util.List<AccessPackageAssignmentResourceRole> getAccessPackageAssignmentResourceRoles() {
        return this.accessPackageAssignmentResourceRoles;
    }
    /**
     * Gets the accessPackageAssignments property value. The assignment of an access package to a subject for a period of time.
     * @return a accessPackageAssignment
     */
    @javax.annotation.Nullable
    public java.util.List<AccessPackageAssignment> getAccessPackageAssignments() {
        return this.accessPackageAssignments;
    }
    /**
     * Gets the accessPackageCatalogs property value. A container of access packages.
     * @return a accessPackageCatalog
     */
    @javax.annotation.Nullable
    public java.util.List<AccessPackageCatalog> getAccessPackageCatalogs() {
        return this.accessPackageCatalogs;
    }
    /**
     * Gets the accessPackageResourceEnvironments property value. A reference to the geolocation environment in which a resource is located.
     * @return a accessPackageResourceEnvironment
     */
    @javax.annotation.Nullable
    public java.util.List<AccessPackageResourceEnvironment> getAccessPackageResourceEnvironments() {
        return this.accessPackageResourceEnvironments;
    }
    /**
     * Gets the accessPackageResourceRequests property value. Represents a request to add or remove a resource to or from a catalog respectively.
     * @return a accessPackageResourceRequest
     */
    @javax.annotation.Nullable
    public java.util.List<AccessPackageResourceRequest> getAccessPackageResourceRequests() {
        return this.accessPackageResourceRequests;
    }
    /**
     * Gets the accessPackageResourceRoleScopes property value. A reference to both a scope within a resource, and a role in that resource for that scope.
     * @return a accessPackageResourceRoleScope
     */
    @javax.annotation.Nullable
    public java.util.List<AccessPackageResourceRoleScope> getAccessPackageResourceRoleScopes() {
        return this.accessPackageResourceRoleScopes;
    }
    /**
     * Gets the accessPackageResources property value. A reference to a resource associated with an access package catalog.
     * @return a accessPackageResource
     */
    @javax.annotation.Nullable
    public java.util.List<AccessPackageResource> getAccessPackageResources() {
        return this.accessPackageResources;
    }
    /**
     * Gets the accessPackages property value. Represents access package objects.
     * @return a accessPackage
     */
    @javax.annotation.Nullable
    public java.util.List<AccessPackage> getAccessPackages() {
        return this.accessPackages;
    }
    /**
     * Gets the connectedOrganizations property value. Represents references to a directory or domain of another organization whose users can request access.
     * @return a connectedOrganization
     */
    @javax.annotation.Nullable
    public java.util.List<ConnectedOrganization> getConnectedOrganizations() {
        return this.connectedOrganizations;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
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
        deserializerMap.put("connectedOrganizations", (n) -> { this.setConnectedOrganizations(n.getCollectionOfObjectValues(ConnectedOrganization::createFromDiscriminatorValue)); });
        deserializerMap.put("settings", (n) -> { this.setSettings(n.getObjectValue(EntitlementManagementSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("subjects", (n) -> { this.setSubjects(n.getCollectionOfObjectValues(AccessPackageSubject::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the settings property value. Represents the settings that control the behavior of Azure AD entitlement management.
     * @return a entitlementManagementSettings
     */
    @javax.annotation.Nullable
    public EntitlementManagementSettings getSettings() {
        return this.settings;
    }
    /**
     * Gets the subjects property value. The subjects property
     * @return a accessPackageSubject
     */
    @javax.annotation.Nullable
    public java.util.List<AccessPackageSubject> getSubjects() {
        return this.subjects;
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
        writer.writeCollectionOfObjectValues("connectedOrganizations", this.getConnectedOrganizations());
        writer.writeObjectValue("settings", this.getSettings());
        writer.writeCollectionOfObjectValues("subjects", this.getSubjects());
    }
    /**
     * Sets the accessPackageAssignmentApprovals property value. The accessPackageAssignmentApprovals property
     * @param value Value to set for the accessPackageAssignmentApprovals property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAccessPackageAssignmentApprovals(@javax.annotation.Nullable final java.util.List<Approval> value) {
        this.accessPackageAssignmentApprovals = value;
    }
    /**
     * Sets the accessPackageAssignmentPolicies property value. Represents the policy that governs which subjects can request or be assigned an access package via an access package assignment.
     * @param value Value to set for the accessPackageAssignmentPolicies property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAccessPackageAssignmentPolicies(@javax.annotation.Nullable final java.util.List<AccessPackageAssignmentPolicy> value) {
        this.accessPackageAssignmentPolicies = value;
    }
    /**
     * Sets the accessPackageAssignmentRequests property value. Represents access package assignment requests created by or on behalf of a user.
     * @param value Value to set for the accessPackageAssignmentRequests property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAccessPackageAssignmentRequests(@javax.annotation.Nullable final java.util.List<AccessPackageAssignmentRequest> value) {
        this.accessPackageAssignmentRequests = value;
    }
    /**
     * Sets the accessPackageAssignmentResourceRoles property value. Represents the resource-specific role which a subject has been assigned through an access package assignment.
     * @param value Value to set for the accessPackageAssignmentResourceRoles property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAccessPackageAssignmentResourceRoles(@javax.annotation.Nullable final java.util.List<AccessPackageAssignmentResourceRole> value) {
        this.accessPackageAssignmentResourceRoles = value;
    }
    /**
     * Sets the accessPackageAssignments property value. The assignment of an access package to a subject for a period of time.
     * @param value Value to set for the accessPackageAssignments property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAccessPackageAssignments(@javax.annotation.Nullable final java.util.List<AccessPackageAssignment> value) {
        this.accessPackageAssignments = value;
    }
    /**
     * Sets the accessPackageCatalogs property value. A container of access packages.
     * @param value Value to set for the accessPackageCatalogs property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAccessPackageCatalogs(@javax.annotation.Nullable final java.util.List<AccessPackageCatalog> value) {
        this.accessPackageCatalogs = value;
    }
    /**
     * Sets the accessPackageResourceEnvironments property value. A reference to the geolocation environment in which a resource is located.
     * @param value Value to set for the accessPackageResourceEnvironments property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAccessPackageResourceEnvironments(@javax.annotation.Nullable final java.util.List<AccessPackageResourceEnvironment> value) {
        this.accessPackageResourceEnvironments = value;
    }
    /**
     * Sets the accessPackageResourceRequests property value. Represents a request to add or remove a resource to or from a catalog respectively.
     * @param value Value to set for the accessPackageResourceRequests property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAccessPackageResourceRequests(@javax.annotation.Nullable final java.util.List<AccessPackageResourceRequest> value) {
        this.accessPackageResourceRequests = value;
    }
    /**
     * Sets the accessPackageResourceRoleScopes property value. A reference to both a scope within a resource, and a role in that resource for that scope.
     * @param value Value to set for the accessPackageResourceRoleScopes property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAccessPackageResourceRoleScopes(@javax.annotation.Nullable final java.util.List<AccessPackageResourceRoleScope> value) {
        this.accessPackageResourceRoleScopes = value;
    }
    /**
     * Sets the accessPackageResources property value. A reference to a resource associated with an access package catalog.
     * @param value Value to set for the accessPackageResources property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAccessPackageResources(@javax.annotation.Nullable final java.util.List<AccessPackageResource> value) {
        this.accessPackageResources = value;
    }
    /**
     * Sets the accessPackages property value. Represents access package objects.
     * @param value Value to set for the accessPackages property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAccessPackages(@javax.annotation.Nullable final java.util.List<AccessPackage> value) {
        this.accessPackages = value;
    }
    /**
     * Sets the connectedOrganizations property value. Represents references to a directory or domain of another organization whose users can request access.
     * @param value Value to set for the connectedOrganizations property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setConnectedOrganizations(@javax.annotation.Nullable final java.util.List<ConnectedOrganization> value) {
        this.connectedOrganizations = value;
    }
    /**
     * Sets the settings property value. Represents the settings that control the behavior of Azure AD entitlement management.
     * @param value Value to set for the settings property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSettings(@javax.annotation.Nullable final EntitlementManagementSettings value) {
        this.settings = value;
    }
    /**
     * Sets the subjects property value. The subjects property
     * @param value Value to set for the subjects property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSubjects(@javax.annotation.Nullable final java.util.List<AccessPackageSubject> value) {
        this.subjects = value;
    }
}
