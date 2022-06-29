package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the collection of governanceRoleAssignment entities. */
public class GovernanceResource extends Entity implements Parsable {
    /** The display name of the resource. */
    private String _displayName;
    /** The external id of the resource, representing its original id in the external system. For example, a subscription resource's external id can be '/subscriptions/c14ae696-5e0c-4e5d-88cc-bef6637737ac'. */
    private String _externalId;
    /** Read-only. The parent resource. for pimforazurerbac scenario, it can represent the subscription the resource belongs to. */
    private GovernanceResource _parent;
    /** Represents the date time when the resource is registered in PIM. */
    private OffsetDateTime _registeredDateTime;
    /** The externalId of the resource's root scope that is registered in PIM. The root scope can be the parent, grandparent, or higher ancestor resources. */
    private String _registeredRoot;
    /** The collection of role assignment requests for the resource. */
    private java.util.List<GovernanceRoleAssignmentRequest> _roleAssignmentRequests;
    /** The collection of role assignments for the resource. */
    private java.util.List<GovernanceRoleAssignment> _roleAssignments;
    /** The collection of role defintions for the resource. */
    private java.util.List<GovernanceRoleDefinition> _roleDefinitions;
    /** The collection of role settings for the resource. */
    private java.util.List<GovernanceRoleSetting> _roleSettings;
    /** The status of a given resource. For example, it could represent whether the resource is locked or not (values: Active/Locked). Note: This property may be extended in the future to support more scenarios. */
    private String _status;
    /** Required. Resource type. For example, for Azure resources, the type could be 'Subscription', 'ResourceGroup', 'Microsoft.Sql/server', etc. */
    private String _type;
    /**
     * Instantiates a new governanceResource and sets the default values.
     * @return a void
     */
    public GovernanceResource() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a governanceResource
     */
    @javax.annotation.Nonnull
    public static GovernanceResource createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GovernanceResource();
    }
    /**
     * Gets the displayName property value. The display name of the resource.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * Gets the externalId property value. The external id of the resource, representing its original id in the external system. For example, a subscription resource's external id can be '/subscriptions/c14ae696-5e0c-4e5d-88cc-bef6637737ac'.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getExternalId() {
        return this._externalId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final GovernanceResource currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("externalId", (n) -> { currentObject.setExternalId(n.getStringValue()); });
            this.put("parent", (n) -> { currentObject.setParent(n.getObjectValue(GovernanceResource::createFromDiscriminatorValue)); });
            this.put("registeredDateTime", (n) -> { currentObject.setRegisteredDateTime(n.getOffsetDateTimeValue()); });
            this.put("registeredRoot", (n) -> { currentObject.setRegisteredRoot(n.getStringValue()); });
            this.put("roleAssignmentRequests", (n) -> { currentObject.setRoleAssignmentRequests(n.getCollectionOfObjectValues(GovernanceRoleAssignmentRequest::createFromDiscriminatorValue)); });
            this.put("roleAssignments", (n) -> { currentObject.setRoleAssignments(n.getCollectionOfObjectValues(GovernanceRoleAssignment::createFromDiscriminatorValue)); });
            this.put("roleDefinitions", (n) -> { currentObject.setRoleDefinitions(n.getCollectionOfObjectValues(GovernanceRoleDefinition::createFromDiscriminatorValue)); });
            this.put("roleSettings", (n) -> { currentObject.setRoleSettings(n.getCollectionOfObjectValues(GovernanceRoleSetting::createFromDiscriminatorValue)); });
            this.put("status", (n) -> { currentObject.setStatus(n.getStringValue()); });
            this.put("type", (n) -> { currentObject.setType(n.getStringValue()); });
        }};
    }
    /**
     * Gets the parent property value. Read-only. The parent resource. for pimforazurerbac scenario, it can represent the subscription the resource belongs to.
     * @return a governanceResource
     */
    @javax.annotation.Nullable
    public GovernanceResource getParent() {
        return this._parent;
    }
    /**
     * Gets the registeredDateTime property value. Represents the date time when the resource is registered in PIM.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getRegisteredDateTime() {
        return this._registeredDateTime;
    }
    /**
     * Gets the registeredRoot property value. The externalId of the resource's root scope that is registered in PIM. The root scope can be the parent, grandparent, or higher ancestor resources.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRegisteredRoot() {
        return this._registeredRoot;
    }
    /**
     * Gets the roleAssignmentRequests property value. The collection of role assignment requests for the resource.
     * @return a governanceRoleAssignmentRequest
     */
    @javax.annotation.Nullable
    public java.util.List<GovernanceRoleAssignmentRequest> getRoleAssignmentRequests() {
        return this._roleAssignmentRequests;
    }
    /**
     * Gets the roleAssignments property value. The collection of role assignments for the resource.
     * @return a governanceRoleAssignment
     */
    @javax.annotation.Nullable
    public java.util.List<GovernanceRoleAssignment> getRoleAssignments() {
        return this._roleAssignments;
    }
    /**
     * Gets the roleDefinitions property value. The collection of role defintions for the resource.
     * @return a governanceRoleDefinition
     */
    @javax.annotation.Nullable
    public java.util.List<GovernanceRoleDefinition> getRoleDefinitions() {
        return this._roleDefinitions;
    }
    /**
     * Gets the roleSettings property value. The collection of role settings for the resource.
     * @return a governanceRoleSetting
     */
    @javax.annotation.Nullable
    public java.util.List<GovernanceRoleSetting> getRoleSettings() {
        return this._roleSettings;
    }
    /**
     * Gets the status property value. The status of a given resource. For example, it could represent whether the resource is locked or not (values: Active/Locked). Note: This property may be extended in the future to support more scenarios.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getStatus() {
        return this._status;
    }
    /**
     * Gets the type property value. Required. Resource type. For example, for Azure resources, the type could be 'Subscription', 'ResourceGroup', 'Microsoft.Sql/server', etc.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getType() {
        return this._type;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("externalId", this.getExternalId());
        writer.writeObjectValue("parent", this.getParent());
        writer.writeOffsetDateTimeValue("registeredDateTime", this.getRegisteredDateTime());
        writer.writeStringValue("registeredRoot", this.getRegisteredRoot());
        writer.writeCollectionOfObjectValues("roleAssignmentRequests", this.getRoleAssignmentRequests());
        writer.writeCollectionOfObjectValues("roleAssignments", this.getRoleAssignments());
        writer.writeCollectionOfObjectValues("roleDefinitions", this.getRoleDefinitions());
        writer.writeCollectionOfObjectValues("roleSettings", this.getRoleSettings());
        writer.writeStringValue("status", this.getStatus());
        writer.writeStringValue("type", this.getType());
    }
    /**
     * Sets the displayName property value. The display name of the resource.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the externalId property value. The external id of the resource, representing its original id in the external system. For example, a subscription resource's external id can be '/subscriptions/c14ae696-5e0c-4e5d-88cc-bef6637737ac'.
     * @param value Value to set for the externalId property.
     * @return a void
     */
    public void setExternalId(@javax.annotation.Nullable final String value) {
        this._externalId = value;
    }
    /**
     * Sets the parent property value. Read-only. The parent resource. for pimforazurerbac scenario, it can represent the subscription the resource belongs to.
     * @param value Value to set for the parent property.
     * @return a void
     */
    public void setParent(@javax.annotation.Nullable final GovernanceResource value) {
        this._parent = value;
    }
    /**
     * Sets the registeredDateTime property value. Represents the date time when the resource is registered in PIM.
     * @param value Value to set for the registeredDateTime property.
     * @return a void
     */
    public void setRegisteredDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._registeredDateTime = value;
    }
    /**
     * Sets the registeredRoot property value. The externalId of the resource's root scope that is registered in PIM. The root scope can be the parent, grandparent, or higher ancestor resources.
     * @param value Value to set for the registeredRoot property.
     * @return a void
     */
    public void setRegisteredRoot(@javax.annotation.Nullable final String value) {
        this._registeredRoot = value;
    }
    /**
     * Sets the roleAssignmentRequests property value. The collection of role assignment requests for the resource.
     * @param value Value to set for the roleAssignmentRequests property.
     * @return a void
     */
    public void setRoleAssignmentRequests(@javax.annotation.Nullable final java.util.List<GovernanceRoleAssignmentRequest> value) {
        this._roleAssignmentRequests = value;
    }
    /**
     * Sets the roleAssignments property value. The collection of role assignments for the resource.
     * @param value Value to set for the roleAssignments property.
     * @return a void
     */
    public void setRoleAssignments(@javax.annotation.Nullable final java.util.List<GovernanceRoleAssignment> value) {
        this._roleAssignments = value;
    }
    /**
     * Sets the roleDefinitions property value. The collection of role defintions for the resource.
     * @param value Value to set for the roleDefinitions property.
     * @return a void
     */
    public void setRoleDefinitions(@javax.annotation.Nullable final java.util.List<GovernanceRoleDefinition> value) {
        this._roleDefinitions = value;
    }
    /**
     * Sets the roleSettings property value. The collection of role settings for the resource.
     * @param value Value to set for the roleSettings property.
     * @return a void
     */
    public void setRoleSettings(@javax.annotation.Nullable final java.util.List<GovernanceRoleSetting> value) {
        this._roleSettings = value;
    }
    /**
     * Sets the status property value. The status of a given resource. For example, it could represent whether the resource is locked or not (values: Active/Locked). Note: This property may be extended in the future to support more scenarios.
     * @param value Value to set for the status property.
     * @return a void
     */
    public void setStatus(@javax.annotation.Nullable final String value) {
        this._status = value;
    }
    /**
     * Sets the type property value. Required. Resource type. For example, for Azure resources, the type could be 'Subscription', 'ResourceGroup', 'Microsoft.Sql/server', etc.
     * @param value Value to set for the type property.
     * @return a void
     */
    public void setType(@javax.annotation.Nullable final String value) {
        this._type = value;
    }
}
