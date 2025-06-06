package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UnifiedRoleEligibilityScheduleRequest extends Request implements Parsable {
    /**
     * Instantiates a new {@link UnifiedRoleEligibilityScheduleRequest} and sets the default values.
     */
    public UnifiedRoleEligibilityScheduleRequest() {
        super();
        this.setOdataType("#microsoft.graph.unifiedRoleEligibilityScheduleRequest");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link UnifiedRoleEligibilityScheduleRequest}
     */
    @jakarta.annotation.Nonnull
    public static UnifiedRoleEligibilityScheduleRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UnifiedRoleEligibilityScheduleRequest();
    }
    /**
     * Gets the action property value. Represents the type of operation on the role eligibility request. The possible values are: AdminAssign: For administrators to assign eligible roles to principals.AdminRemove: For administrators to remove eligible roles from principals. AdminUpdate: For administrators to change existing role eligibilities.AdminExtend: For administrators to extend expiring role eligibilities.AdminRenew: For administrators to renew expired eligibilities.UserAdd: For users to activate their eligible assignments.UserRemove: For users to deactivate their active eligible assignments.UserExtend: For users to request to extend their expiring eligible assignments.UserRenew: For users to request to renew their expired eligible assignments.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAction() {
        return this.backingStore.get("action");
    }
    /**
     * Gets the appScope property value. Read-only property with details of the app-specific scope when the role eligibility is scoped to an app. Nullable. Supports $expand.
     * @return a {@link AppScope}
     */
    @jakarta.annotation.Nullable
    public AppScope getAppScope() {
        return this.backingStore.get("appScope");
    }
    /**
     * Gets the appScopeId property value. Identifier of the app-specific scope when the role eligibility is scoped to an app. The scope of a role eligibility determines the set of resources for which the principal is eligible to access. App scopes are scopes that are defined and understood by this application only. Use / for tenant-wide app scopes. Use directoryScopeId to limit the scope to particular directory objects, for example, administrative units. Supports $filter (eq, ne, and on null values).
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAppScopeId() {
        return this.backingStore.get("appScopeId");
    }
    /**
     * Gets the directoryScope property value. The directory object that is the scope of the role eligibility. Read-only. Supports $expand.
     * @return a {@link DirectoryObject}
     */
    @jakarta.annotation.Nullable
    public DirectoryObject getDirectoryScope() {
        return this.backingStore.get("directoryScope");
    }
    /**
     * Gets the directoryScopeId property value. Identifier of the directory object representing the scope of the role eligibility. The scope of a role eligibility determines the set of resources for which the principal has been granted access. Directory scopes are shared scopes stored in the directory that are understood by multiple applications. Use / for tenant-wide scope. Use appScopeId to limit the scope to an application only. Supports $filter (eq, ne, and on null values).
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDirectoryScopeId() {
        return this.backingStore.get("directoryScopeId");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("action", (n) -> { this.setAction(n.getStringValue()); });
        deserializerMap.put("appScope", (n) -> { this.setAppScope(n.getObjectValue(AppScope::createFromDiscriminatorValue)); });
        deserializerMap.put("appScopeId", (n) -> { this.setAppScopeId(n.getStringValue()); });
        deserializerMap.put("directoryScope", (n) -> { this.setDirectoryScope(n.getObjectValue(DirectoryObject::createFromDiscriminatorValue)); });
        deserializerMap.put("directoryScopeId", (n) -> { this.setDirectoryScopeId(n.getStringValue()); });
        deserializerMap.put("isValidationOnly", (n) -> { this.setIsValidationOnly(n.getBooleanValue()); });
        deserializerMap.put("justification", (n) -> { this.setJustification(n.getStringValue()); });
        deserializerMap.put("principal", (n) -> { this.setPrincipal(n.getObjectValue(DirectoryObject::createFromDiscriminatorValue)); });
        deserializerMap.put("principalId", (n) -> { this.setPrincipalId(n.getStringValue()); });
        deserializerMap.put("roleDefinition", (n) -> { this.setRoleDefinition(n.getObjectValue(UnifiedRoleDefinition::createFromDiscriminatorValue)); });
        deserializerMap.put("roleDefinitionId", (n) -> { this.setRoleDefinitionId(n.getStringValue()); });
        deserializerMap.put("scheduleInfo", (n) -> { this.setScheduleInfo(n.getObjectValue(RequestSchedule::createFromDiscriminatorValue)); });
        deserializerMap.put("targetSchedule", (n) -> { this.setTargetSchedule(n.getObjectValue(UnifiedRoleEligibilitySchedule::createFromDiscriminatorValue)); });
        deserializerMap.put("targetScheduleId", (n) -> { this.setTargetScheduleId(n.getStringValue()); });
        deserializerMap.put("ticketInfo", (n) -> { this.setTicketInfo(n.getObjectValue(TicketInfo::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the isValidationOnly property value. Determines whether the call is a validation or an actual call. Only set this property if you want to check whether an activation is subject to additional rules like MFA before actually submitting the request.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsValidationOnly() {
        return this.backingStore.get("isValidationOnly");
    }
    /**
     * Gets the justification property value. A message provided by users and administrators when create they create the unifiedRoleEligibilityScheduleRequest object.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getJustification() {
        return this.backingStore.get("justification");
    }
    /**
     * Gets the principal property value. The principal that&apos;s getting a role eligibility through the request. Supports $expand.
     * @return a {@link DirectoryObject}
     */
    @jakarta.annotation.Nullable
    public DirectoryObject getPrincipal() {
        return this.backingStore.get("principal");
    }
    /**
     * Gets the principalId property value. Identifier of the principal that has been granted the role eligibility. Can be a user or a role-assignable group. You can grant only active assignments service principals. Supports $filter (eq, ne).
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPrincipalId() {
        return this.backingStore.get("principalId");
    }
    /**
     * Gets the roleDefinition property value. Detailed information for the unifiedRoleDefinition object that is referenced through the roleDefinitionId property. Supports $expand.
     * @return a {@link UnifiedRoleDefinition}
     */
    @jakarta.annotation.Nullable
    public UnifiedRoleDefinition getRoleDefinition() {
        return this.backingStore.get("roleDefinition");
    }
    /**
     * Gets the roleDefinitionId property value. Identifier of the unifiedRoleDefinition object that is being assigned to the principal. Supports $filter (eq, ne).
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRoleDefinitionId() {
        return this.backingStore.get("roleDefinitionId");
    }
    /**
     * Gets the scheduleInfo property value. The period of the role eligibility. Recurring schedules are currently unsupported.
     * @return a {@link RequestSchedule}
     */
    @jakarta.annotation.Nullable
    public RequestSchedule getScheduleInfo() {
        return this.backingStore.get("scheduleInfo");
    }
    /**
     * Gets the targetSchedule property value. The schedule for a role eligibility that is referenced through the targetScheduleId property. Supports $expand.
     * @return a {@link UnifiedRoleEligibilitySchedule}
     */
    @jakarta.annotation.Nullable
    public UnifiedRoleEligibilitySchedule getTargetSchedule() {
        return this.backingStore.get("targetSchedule");
    }
    /**
     * Gets the targetScheduleId property value. Identifier of the schedule object that&apos;s linked to the eligibility request. Supports $filter (eq, ne).
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTargetScheduleId() {
        return this.backingStore.get("targetScheduleId");
    }
    /**
     * Gets the ticketInfo property value. Ticket details linked to the role eligibility request including details of the ticket number and ticket system. Optional.
     * @return a {@link TicketInfo}
     */
    @jakarta.annotation.Nullable
    public TicketInfo getTicketInfo() {
        return this.backingStore.get("ticketInfo");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("action", this.getAction());
        writer.writeObjectValue("appScope", this.getAppScope());
        writer.writeStringValue("appScopeId", this.getAppScopeId());
        writer.writeObjectValue("directoryScope", this.getDirectoryScope());
        writer.writeStringValue("directoryScopeId", this.getDirectoryScopeId());
        writer.writeBooleanValue("isValidationOnly", this.getIsValidationOnly());
        writer.writeStringValue("justification", this.getJustification());
        writer.writeObjectValue("principal", this.getPrincipal());
        writer.writeStringValue("principalId", this.getPrincipalId());
        writer.writeObjectValue("roleDefinition", this.getRoleDefinition());
        writer.writeStringValue("roleDefinitionId", this.getRoleDefinitionId());
        writer.writeObjectValue("scheduleInfo", this.getScheduleInfo());
        writer.writeObjectValue("targetSchedule", this.getTargetSchedule());
        writer.writeStringValue("targetScheduleId", this.getTargetScheduleId());
        writer.writeObjectValue("ticketInfo", this.getTicketInfo());
    }
    /**
     * Sets the action property value. Represents the type of operation on the role eligibility request. The possible values are: AdminAssign: For administrators to assign eligible roles to principals.AdminRemove: For administrators to remove eligible roles from principals. AdminUpdate: For administrators to change existing role eligibilities.AdminExtend: For administrators to extend expiring role eligibilities.AdminRenew: For administrators to renew expired eligibilities.UserAdd: For users to activate their eligible assignments.UserRemove: For users to deactivate their active eligible assignments.UserExtend: For users to request to extend their expiring eligible assignments.UserRenew: For users to request to renew their expired eligible assignments.
     * @param value Value to set for the action property.
     */
    public void setAction(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("action", value);
    }
    /**
     * Sets the appScope property value. Read-only property with details of the app-specific scope when the role eligibility is scoped to an app. Nullable. Supports $expand.
     * @param value Value to set for the appScope property.
     */
    public void setAppScope(@jakarta.annotation.Nullable final AppScope value) {
        this.backingStore.set("appScope", value);
    }
    /**
     * Sets the appScopeId property value. Identifier of the app-specific scope when the role eligibility is scoped to an app. The scope of a role eligibility determines the set of resources for which the principal is eligible to access. App scopes are scopes that are defined and understood by this application only. Use / for tenant-wide app scopes. Use directoryScopeId to limit the scope to particular directory objects, for example, administrative units. Supports $filter (eq, ne, and on null values).
     * @param value Value to set for the appScopeId property.
     */
    public void setAppScopeId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("appScopeId", value);
    }
    /**
     * Sets the directoryScope property value. The directory object that is the scope of the role eligibility. Read-only. Supports $expand.
     * @param value Value to set for the directoryScope property.
     */
    public void setDirectoryScope(@jakarta.annotation.Nullable final DirectoryObject value) {
        this.backingStore.set("directoryScope", value);
    }
    /**
     * Sets the directoryScopeId property value. Identifier of the directory object representing the scope of the role eligibility. The scope of a role eligibility determines the set of resources for which the principal has been granted access. Directory scopes are shared scopes stored in the directory that are understood by multiple applications. Use / for tenant-wide scope. Use appScopeId to limit the scope to an application only. Supports $filter (eq, ne, and on null values).
     * @param value Value to set for the directoryScopeId property.
     */
    public void setDirectoryScopeId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("directoryScopeId", value);
    }
    /**
     * Sets the isValidationOnly property value. Determines whether the call is a validation or an actual call. Only set this property if you want to check whether an activation is subject to additional rules like MFA before actually submitting the request.
     * @param value Value to set for the isValidationOnly property.
     */
    public void setIsValidationOnly(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isValidationOnly", value);
    }
    /**
     * Sets the justification property value. A message provided by users and administrators when create they create the unifiedRoleEligibilityScheduleRequest object.
     * @param value Value to set for the justification property.
     */
    public void setJustification(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("justification", value);
    }
    /**
     * Sets the principal property value. The principal that&apos;s getting a role eligibility through the request. Supports $expand.
     * @param value Value to set for the principal property.
     */
    public void setPrincipal(@jakarta.annotation.Nullable final DirectoryObject value) {
        this.backingStore.set("principal", value);
    }
    /**
     * Sets the principalId property value. Identifier of the principal that has been granted the role eligibility. Can be a user or a role-assignable group. You can grant only active assignments service principals. Supports $filter (eq, ne).
     * @param value Value to set for the principalId property.
     */
    public void setPrincipalId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("principalId", value);
    }
    /**
     * Sets the roleDefinition property value. Detailed information for the unifiedRoleDefinition object that is referenced through the roleDefinitionId property. Supports $expand.
     * @param value Value to set for the roleDefinition property.
     */
    public void setRoleDefinition(@jakarta.annotation.Nullable final UnifiedRoleDefinition value) {
        this.backingStore.set("roleDefinition", value);
    }
    /**
     * Sets the roleDefinitionId property value. Identifier of the unifiedRoleDefinition object that is being assigned to the principal. Supports $filter (eq, ne).
     * @param value Value to set for the roleDefinitionId property.
     */
    public void setRoleDefinitionId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("roleDefinitionId", value);
    }
    /**
     * Sets the scheduleInfo property value. The period of the role eligibility. Recurring schedules are currently unsupported.
     * @param value Value to set for the scheduleInfo property.
     */
    public void setScheduleInfo(@jakarta.annotation.Nullable final RequestSchedule value) {
        this.backingStore.set("scheduleInfo", value);
    }
    /**
     * Sets the targetSchedule property value. The schedule for a role eligibility that is referenced through the targetScheduleId property. Supports $expand.
     * @param value Value to set for the targetSchedule property.
     */
    public void setTargetSchedule(@jakarta.annotation.Nullable final UnifiedRoleEligibilitySchedule value) {
        this.backingStore.set("targetSchedule", value);
    }
    /**
     * Sets the targetScheduleId property value. Identifier of the schedule object that&apos;s linked to the eligibility request. Supports $filter (eq, ne).
     * @param value Value to set for the targetScheduleId property.
     */
    public void setTargetScheduleId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("targetScheduleId", value);
    }
    /**
     * Sets the ticketInfo property value. Ticket details linked to the role eligibility request including details of the ticket number and ticket system. Optional.
     * @param value Value to set for the ticketInfo property.
     */
    public void setTicketInfo(@jakarta.annotation.Nullable final TicketInfo value) {
        this.backingStore.set("ticketInfo", value);
    }
}
